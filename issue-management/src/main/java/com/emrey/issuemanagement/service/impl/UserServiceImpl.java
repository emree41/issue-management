package com.emrey.issuemanagement.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.emrey.issuemanagement.entity.User;
import com.emrey.issuemanagement.repository.UserRepository;
import com.emrey.issuemanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(User user) {
		if(user.getUserName() == null) {
			throw new IllegalArgumentException("User name can not be null!");
		}
		user = userRepository.save(user);
		return user;
	}

	@Override
	public User getById(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public Page<User> getAllPageable(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	public User getByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
	
	

}
