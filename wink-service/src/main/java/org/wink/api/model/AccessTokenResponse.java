package org.wink.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "accessTokenResponse", namespace = "org.wink.api.model")
@XmlAccessorType(XmlAccessType.NONE)
public class AccessTokenResponse {
	
	@XmlElement(name = "access_token")
	private String access_token;

	@XmlElement(name = "refresh_token")
	private String refresh_token;

	@XmlElement(name = "token_type")
	private String token_type;

	@XmlElement(name = "token_endpoint")
	private String token_endpoint;

	@XmlElement(name = "scopes")
	private String scopes;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getToken_endpoint() {
		return token_endpoint;
	}

	public void setToken_endpoint(String token_endpoint) {
		this.token_endpoint = token_endpoint;
	}

	public String getScopes() {
		return scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
	}
}
