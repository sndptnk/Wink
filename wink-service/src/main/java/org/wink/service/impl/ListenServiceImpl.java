package org.wink.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.wink.api.ListenService;
import org.wink.api.model.PubNubTopic;
import org.wink.service.util.PNManager;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;

@Component("listenService")
public class ListenServiceImpl implements ListenService {
	
	@Autowired
	PNManager pnManager;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ListenServiceImpl.class);
	@Override
	public void listen(PubNubTopic topic) {
//		PNConfiguration pnConfiguration = new PNConfiguration().setSubscribeKey(topic.getSubscriberKey());
//		PubNub pubnub = new PubNub(pnConfiguration);
//		pubnub.addListener();
//		pubnub.subscribe().channels(topic.getTopics()).execute();
		pnManager.add(topic);
	}
}
