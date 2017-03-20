package org.wink.service.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "credentials", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.NONE)
public class Credentials {

	@XmlElement(name = "client_secret")
	private String clientSecret;

	@XmlElement(name = "grant_type")
	private String grantType;

	@XmlElement(name = "code")
	private String code;

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
