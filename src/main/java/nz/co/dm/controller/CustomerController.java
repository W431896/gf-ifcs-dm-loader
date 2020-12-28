package nz.co.dm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nz.co.dm.convert.ApplicationConverter;
import nz.co.dm.model.customer.Customer;
import nz.co.dm.repository.customer.CustomerRepository;
import nz.co.dm.schemas.dto.ApplicationStatus;
import nz.co.dm.schemas.dto.ApplicationWithAdditionalInfo;
import nz.co.dm.schemas.dto.UploadApprovedApplication;
import nz.co.dm.schemas.dto.UploadApprovedApplicationResponse;
import nz.co.dm.soap.ws.CustomerClient;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerClient soapCustomerClient;
	
	@PostMapping("/approvedApplication")
	public UploadApprovedApplicationResponse invokeSoapCustomerClient(@RequestBody UploadApprovedApplication request) {
		return soapCustomerClient.uploadApprovedApplication(request);
	}
	
	List<String> loadingSucceededCustomerList = new ArrayList<>();
	Map<String, String> loadingFailedCustomerMap = new HashMap<>();

	@GetMapping(path = "/customers",  produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<Customer>> getAllCustomers(@RequestParam(required = false) String name) {
		try {
			List<Customer> customers = new ArrayList<>();

			if (name == null)
				customerRepository.findAll().forEach(customers::add);
			else
				customerRepository.findCustomersByName(name).forEach(customers::add);

			if (customers.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			for (Customer customer : customers) {
				UploadApprovedApplication uploadApprovedApplication = new UploadApprovedApplication();
				ApplicationWithAdditionalInfo application = ApplicationConverter.convertToApplication(customer);
				uploadApprovedApplication.setApplication(application);
				UploadApprovedApplicationResponse uploadApprovedApplicationResponse = soapCustomerClient.uploadApprovedApplication(uploadApprovedApplication);
				auditTheRequest(uploadApprovedApplicationResponse);
			}

			return new ResponseEntity<>(customers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	private void auditTheRequest(UploadApprovedApplicationResponse uploadApprovedApplicationResponse) {
		ApplicationWithAdditionalInfo applicationWithAdditionalInfo = uploadApprovedApplicationResponse.getReturn();
		ApplicationStatus applicationStatus = applicationWithAdditionalInfo.getApplicationStatus();
		String clientName = applicationWithAdditionalInfo.getClientName();
		Long clientMid = applicationWithAdditionalInfo.getClientMid();
		String cuctomerNumber = applicationWithAdditionalInfo.getCustomerNumber();
		String customerKey = clientName + " - " + clientMid + " - " + cuctomerNumber;
		if (applicationStatus.isIsErrorCode()) loadingFailedCustomerMap.put(customerKey, applicationStatus.getMessage());
		else loadingSucceededCustomerList.add(customerKey);
	}
}
