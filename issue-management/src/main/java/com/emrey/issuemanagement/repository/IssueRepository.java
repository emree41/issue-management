package com.emrey.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emrey.issuemanagement.entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long>{
	
}
