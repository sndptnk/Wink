package org.wink.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.wink.service.model.PubNubTopic;

@Path("/listen")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON, MediaType.WILDCARD})
public interface ListenService {
	
	@POST
	public void listen(PubNubTopic topic);
}
