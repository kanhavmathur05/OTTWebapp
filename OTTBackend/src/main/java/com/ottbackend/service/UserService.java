package com.ottbackend.service;

import com.ottbackend.model.User;
import com.ottbackend.vm.AuthenticationRequest;

public interface UserService {
	public void registerUser(User user);
	public User loginUser(AuthenticationRequest request);
}
