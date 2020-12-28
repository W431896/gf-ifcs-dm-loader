package nz.co.dm.soap.ws;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import nz.co.dm.schemas.dto.ObjectFactory;
import nz.co.dm.schemas.dto.UploadSubscription;
import nz.co.dm.schemas.dto.UploadSubscriptionResponse;

@Service
public class SubscriptionClient {
	
	@Value("${ifcs.service.delegate.url}")
	private String ifcsUrl;
	
	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;
	
	public UploadSubscriptionResponse uploadSubscription(UploadSubscription request) {
		ObjectFactory objectFactory = new ObjectFactory();		 
		JAXBElement<UploadSubscription> jaxbUploadSubscription = objectFactory.createUploadSubscription(request);
		template = new WebServiceTemplate(marshaller);
		template.marshalSendAndReceive(ifcsUrl, jaxbUploadSubscription);
		UploadSubscriptionResponse uploadSubscriptionResponse = objectFactory.createUploadSubscriptionResponse();
		return uploadSubscriptionResponse;
	}
}
