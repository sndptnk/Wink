package org.wink.contract.model;

public class Pubnub {
	private String subscribe_key;

	private String channel;

	public String getSubscribe_key() {
		return subscribe_key;
	}

	public void setSubscribe_key(String subscribe_key) {
		this.subscribe_key = subscribe_key;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
}