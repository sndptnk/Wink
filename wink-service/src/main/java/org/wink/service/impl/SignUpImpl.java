package org.wink.service.impl;

import org.wink.service.Signup;

public class SignUpImpl implements Signup {

	public SignUpImpl() {
		System.out.println("SignUpImpl created");
	}
	@Override
	public String signIn() {
		return "PLUMBING";
	}

}
