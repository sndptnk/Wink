package org.wink.service.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

@Configuration
public class UtilFactory {
	@Bean(name="jaxbJsonProvider")
	public static JacksonJaxbJsonProvider getJacksonJaxbJsonProvider() {
		JacksonJaxbJsonProvider jacksonJaxbJsonProvider = new JacksonJaxbJsonProvider();
		jacksonJaxbJsonProvider.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return jacksonJaxbJsonProvider;
	}
	
}
