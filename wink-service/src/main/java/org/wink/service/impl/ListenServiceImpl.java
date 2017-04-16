package org.wink.service.impl;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.wink.api.ListenService;
import org.wink.api.model.PubNubTopic;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;

@Component("listenService")
public class ListenServiceImpl implements ListenService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ListenServiceImpl.class);
	@Override
	public void listen(PubNubTopic topic) {
		PNConfiguration pnConfiguration = new PNConfiguration().setSubscribeKey(topic.getSubscriberKey());
		PubNub pubnub = new PubNub(pnConfiguration);
		pubnub.addListener(new SubscribeCallback() {
			@Override
			public void status(PubNub pubnub, PNStatus status) {
				LOGGER.info("PubNub "+pubnub.toString());
				LOGGER.info("PNStatus "+status.toString());
				if (status.getCategory() == PNStatusCategory.PNUnexpectedDisconnectCategory) {
				} else if (status.getCategory() == PNStatusCategory.PNConnectedCategory) {
					// Connect event. You can do stuff like publish, and know
					// you'll get it.
					// Or just use the connected event to confirm you are
					// subscribed for
					// UI / internal notifications, etc
				} else if (status.getCategory() == PNStatusCategory.PNReconnectedCategory) {
					// Happens as part of our regular operation. This event
					// happens when
					// radio / connectivity is lost, then regained.
				} else if (status.getCategory() == PNStatusCategory.PNDecryptionErrorCategory) {
					// Handle messsage decryption error. Probably client
					// configured to
					// encrypt messages and on live data feed it received plain
					// text.
				}
			}

			@Override
			public void message(PubNub pubnub, PNMessageResult message) {
				// Handle new message stored in message.message
				if (message.getChannel() != null) {
					// Message has been received on channel group stored in
					// message.getChannel()
				} else {
					// Message has been received on channel stored in
					// message.getSubscription()
				}

				/*
				 * log the following items with your favorite logger -
				 * message.getMessage() - message.getSubscription() -
				 * message.getTimetoken()
				 */
			}

			@Override
			public void presence(PubNub pubnub, PNPresenceEventResult presence) {

			}
		});

		pubnub.subscribe().channels(topic.getTopics()).execute();
	}
}
