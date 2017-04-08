package org.wink.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.wink.api.model.TokenPayload;
import org.wink.service.model.Credentials;

@Path("/oauth2")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON})
public interface OAuthService {

	@Path("/token")
	@POST
	TokenPayload getToken(Credentials credentials);
}
