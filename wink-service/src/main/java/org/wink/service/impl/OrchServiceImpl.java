package org.wink.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.wink.api.LandingService;
import org.wink.api.OrchService;
import org.wink.contract.UserDetailsService;
import org.wink.contract.model.WinkUser;

@Component("orchestrationService")
public class OrchServiceImpl implements OrchService {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrchServiceImpl.class);
	
	@Autowired
	LandingService landingService;
	
	@Value("${clientid}")
	String client_id;

	@Value("${clientSecret}")
	String client_secret;

	@Autowired
	@Qualifier("userDetailService")
	UserDetailsService userDetailService;

	@Override
	public void orchestrate(String refreshToken) {
		String accessToken = landingService.getAccess(null, null, refreshToken, null, null);
		WinkUser winkUser =  userDetailService.getUser("Bearer "+accessToken, client_id, client_secret);
		
	}
}
