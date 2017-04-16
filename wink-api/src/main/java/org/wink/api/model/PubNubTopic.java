package org.wink.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pubNubTopic", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.NONE)
public class PubNubTopic {

	@XmlElement(name = "topics")
	private List<String> topics;

	@XmlElement(name = "subscriberKey")
	private String subscriberKey;

	public List<String> getTopics() {
		return topics;
	}

	public void setTopic(List<String> topics) {
		this.topics = topics;
	}

	public String getSubscriberKey() {
		return subscriberKey;
	}

	public void setSubscriberKey(String subscriberKey) {
		this.subscriberKey = subscriberKey;
	}
}
