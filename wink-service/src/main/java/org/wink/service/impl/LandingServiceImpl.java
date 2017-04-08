package org.wink.service.impl;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.wink.api.LandingService;
import org.wink.api.model.TokenPayload;
import org.wink.service.OAuthService;
import org.wink.service.model.Credentials;

@Component("landingService")
public class LandingServiceImpl implements LandingService {
	
	private final String clientid = "UhCsjmP07RFYoerznyEVjag3rPUr6ThP";
	private final String clientSecret = "fFZBCaTw9AYOPblgLa-tv4fXhB0Lo5IE";
	
	@Autowired
	@Qualifier("oAuthService")
	OAuthService oAuthService;

	@Override
	public TokenPayload getAccess(String state, String code) {
		try {
			Credentials credentials = new Credentials();
			credentials.setClientSecret(clientSecret);
			credentials.setCode(code);
			credentials.setGrantType("authorization_code");
			TokenPayload payload = oAuthService.getToken(credentials);
			return payload;
		} catch(WebApplicationException ex) {
		  Response r = ex.getResponse();
		  String message = ex.getMessage();
		}
		return null;
	}

}
