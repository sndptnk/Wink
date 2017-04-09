package org.wink.service.impl;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.wink.api.LandingService;
import org.wink.contract.OAuthService;
import org.wink.contract.model.Credentials;
import org.wink.contract.model.TokenPayload;


@Component("landingService")
public class LandingServiceImpl implements LandingService {
	
	private final String clientid = "UhCsjmP07RFYoerznyEVjag3rPUr6ThP";
	private final String clientSecret = "fFZBCaTw9AYOPblgLa-tv4fXhB0Lo5IE";
	
	@Autowired
	@Qualifier("oAuthService")
	OAuthService oAuthService;

	@Override
	public String getAccess(String state, String code, String refreshToken, String userName, String password) {
		try {
			Credentials credentials = new Credentials();
			credentials.setClientSecret(clientSecret);
			if(StringUtils.isNotEmpty(code)) {
				credentials.setCode(code);
				credentials.setGrantType("authorization_code");
			} else if(StringUtils.isNotEmpty(refreshToken)) {
				credentials.setRefreshToken(refreshToken);
				credentials.setGrantType("refresh_token");
			} else if(StringUtils.isNotEmpty(userName) && StringUtils.isNotEmpty(password)) {
				credentials.setUserName(userName);
				credentials.setPassword(password);
				credentials.setGrantType("password");
			}
			TokenPayload payload = oAuthService.getToken(credentials);
			return payload.getData().getAccessToken();
		} catch(WebApplicationException ex) {
		  Response r = ex.getResponse();
		  String message = ex.getMessage();
		}
		return null;
	}
}
