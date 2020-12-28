package nz.co.dm.controller;

import static nz.co.dm.utility.DateUtil.convertToXMLDate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.dm.model.subscription.Subscription;
import nz.co.dm.repository.customer.SubscriptionRepository;
import nz.co.dm.schemas.dto.UploadSubscription;
import nz.co.dm.soap.ws.SubscriptionClient;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
@RequestMapping("/api")
public class SubscriptionController {
	
	@Autowired
	private SubscriptionRepository subscriptionRepository;
	
	@Autowired
	private SubscriptionClient soapSubscriptionClient;

	@GetMapping(path = "/subscriptions",  produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<Subscription>> getAllSubscriptions() {
		try {
			List<Subscription> subscriptions = new ArrayList<>();

			subscriptionRepository.findAll().forEach(subscriptions::add);

			if (subscriptions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			for (Subscription subscription : subscriptions) {
				UploadSubscription uploadSubscription = new UploadSubscription();
				nz.co.dm.schemas.dto.Subscription subscriptionDto = new nz.co.dm.schemas.dto.Subscription();
				subscriptionDto.setClientMid(subscription.getClientMid());
				subscriptionDto.setDescriptionExternalCode(subscription.getExternalCode());
				subscriptionDto.setCustomerNumber(subscription.getCustomerNo());
				subscriptionDto.setEffectiveOn(convertToXMLDate(subscription.getEffectiveOn()));
				subscriptionDto.setExpiresOn(convertToXMLDate(subscription.getExpiresOn()));
				subscriptionDto.setIsOptIn(true);
				uploadSubscription.setSubscription(subscriptionDto);				
				soapSubscriptionClient.uploadSubscription(uploadSubscription);
			}
			return new ResponseEntity<>(subscriptions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
