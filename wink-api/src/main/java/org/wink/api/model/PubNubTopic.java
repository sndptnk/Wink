package org.wink.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pubNubTopic", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.NONE)
public class PubNubTopic {

	@XmlElement(name = "topic")
	private String topic;

	@XmlElement(name = "subscriberKey")
	private String subscriberKey;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getSubscriberKey() {
		return subscriberKey;
	}

	public void setSubscriberKey(String subscriberKey) {
		this.subscriberKey = subscriberKey;
	}
}
