package org.wink.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "accessTokenRequest", namespace = "org.wink.api.model")
@XmlAccessorType(XmlAccessType.NONE)
public class SignInRequest {
	
	@XmlElement(name = "client_id")
	private String client_id;

	@XmlElement(name = "client_secret")
	private String client_secret;

	@XmlElement(name = "username")
	private String username;

	@XmlElement(name = "password")
	private String password;

	@XmlElement(name = "grant_type")
	private String grant_type;
}
