package com.emrey.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrey.issuemanagement.entity.Issue;
import com.emrey.issuemanagement.entity.User;

public interface UserService {
	
	User save(User user);
	
	User getById(Long id);
	
	Page<User> getAllPageable(Pageable pageable);
	
	User getByUserName(String userName);
}
