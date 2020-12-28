package nz.co.dm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DmConfig implements WebMvcConfigurer{

	@Override
	public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
		
	    configurer.defaultContentType(MediaType.APPLICATION_XML);
	}
	
	@Bean
	public Jaxb2Marshaller marshaller() {

		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("nz.co.dm.schemas.dto");
		return marshaller;
	}
}
