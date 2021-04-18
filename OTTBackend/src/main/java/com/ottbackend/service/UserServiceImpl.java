package com.ottbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ottbackend.enums.UserRole;
import com.ottbackend.model.User;
import com.ottbackend.repository.UserRepository;
import com.ottbackend.vm.AuthenticationRequest;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@Autowired
	UserRepository userRepository;

	@Override
	public void registerUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRole(UserRole.ROLE_USER.toString());
		userRepository.save(user);
	}

	@Override
	public User loginUser(AuthenticationRequest request) {
		User user = userRepository.findByEmail(request.getEmail());
		if (user != null && passwordEncoder.matches(request.getPassword(), user.getPassword())) {
			return user;
		}
		return null;
	}

}
