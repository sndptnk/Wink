package org.wink.service.impl;

import org.wink.service.DummyService;

public class DummyServiceImpl implements DummyService {

	@Override
	public String get() {
		return "HELLO GET";
	}

	@Override
	public String put() {
		return "HELLO PUT";
	}

	@Override
	public String post() {
		return "HELLO POST";
	}

	@Override
	public String delete() {
		return "HELLO DELETE";
	}

}
