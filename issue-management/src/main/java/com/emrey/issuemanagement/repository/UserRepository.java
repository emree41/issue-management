package com.emrey.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emrey.issuemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String userName);
	
}
