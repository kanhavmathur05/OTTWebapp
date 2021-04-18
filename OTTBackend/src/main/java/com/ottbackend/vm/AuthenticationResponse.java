package com.ottbackend.vm;

import com.ottbackend.model.User;

public class AuthenticationResponse {

	private User user;

	private String jwt;

//	public AuthenticationResponse(String jwt) {
//		super();
//		this.jwt = jwt;
//	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

}
