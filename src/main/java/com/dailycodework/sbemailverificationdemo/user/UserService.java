package com.dailycodework.sbemailverificationdemo.user;

import java.util.List;
import java.util.Optional;

import com.dailycodework.sbemailverificationdemo.registration.RegistrationRequest;

public class UserService implements IUserService {
	private UserRepository userRepository;
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User registerUser(RegistrationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
