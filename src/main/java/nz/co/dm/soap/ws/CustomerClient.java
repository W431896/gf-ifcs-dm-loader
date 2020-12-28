package nz.co.dm.soap.ws;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import nz.co.dm.schemas.dto.ObjectFactory;
import nz.co.dm.schemas.dto.UploadApprovedApplication;
import nz.co.dm.schemas.dto.UploadApprovedApplicationResponse;

@Service
public class CustomerClient {
	
	@Value("${ifcs.service.delegate.url}")
	private String ifcsUrl;
	
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	public UploadApprovedApplicationResponse uploadApprovedApplication(UploadApprovedApplication request) {
		ObjectFactory objectFactory = new ObjectFactory();		 
		JAXBElement<UploadApprovedApplication> jaxbUploadApplication = objectFactory.createUploadApprovedApplication(request);
		template = new WebServiceTemplate(marshaller);
		@SuppressWarnings("unchecked")
		JAXBElement<UploadApprovedApplicationResponse> jAXBElementResponse = (JAXBElement<UploadApprovedApplicationResponse>) template.marshalSendAndReceive(ifcsUrl, jaxbUploadApplication);
		return jAXBElementResponse.getValue();
	}
}
