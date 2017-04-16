package org.wink.contract;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.wink.contract.model.WinkUser;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON})
public interface UserDetailsService {

	@Path("/me")
	@POST
	WinkUser getUser(@HeaderParam("Authorization") String authCode);
}
