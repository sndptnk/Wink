package org.wink.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "accessTokenRequest", namespace = "org.wink.api.model")
@XmlAccessorType(XmlAccessType.NONE)
public class AccessTokenRequest {
	
	@XmlElement(name = "client_secret")
	private String client_secret;

	@XmlElement(name = "grant_type")
	private String grant_type;

	@XmlElement(name = "code")
	private String code;

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getGrant_type() {
		return grant_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
