package org.wink.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "refreshAccessTokenRequest", namespace = "org.wink.api.model")
@XmlAccessorType(XmlAccessType.NONE)
public class RefreshAccessTokenRequest {
	
	@XmlElement(name = "client_id")
	private String client_id;

	@XmlElement(name = "client_secret")
	private String client_secret;

	@XmlElement(name = "grant_type")
	private String grant_type;

	@XmlElement(name = "refresh_token")
	private String refresh_token;

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

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

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
}
