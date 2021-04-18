package com.ottbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ottbackend.config.JwtUtil;
import com.ottbackend.exception.ResourceNotFoundException;
import com.ottbackend.model.User;
import com.ottbackend.service.UserService;
import com.ottbackend.vm.AuthenticationRequest;
import com.ottbackend.vm.AuthenticationResponse;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	JwtUtil jwtUtil;

	@ApiOperation(value = "API to login user", response = AuthenticationResponse.class, tags = "loginUser")
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> loginUser(@RequestBody AuthenticationRequest request)
			throws ResourceNotFoundException {

		User user = userService.loginUser(request);
		final String jwt = jwtUtil.generateToken(user);
		AuthenticationResponse response = new AuthenticationResponse();
		response.setUser(user);
		response.setJwt(jwt);
		return ResponseEntity.ok(response);
	}

	@ApiOperation(value = "API to register user", response = User.class, tags = "registerUser")
	@PostMapping("/register")
	public void registerUser(@RequestBody User user) {
		userService.registerUser(user);
	}

	// Subscribe to a plan method

}
