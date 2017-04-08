package org.wink.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.wink.service.model.TokenPayload;

@Path("/landing")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON, MediaType.WILDCARD})
public interface LandingService {
	
	@GET
	public TokenPayload getAccess(@QueryParam("state") String state, @QueryParam("code") String code);
}
