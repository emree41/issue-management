package com.emrey.issuemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrey.issuemanagement.entity.Issue;
import com.emrey.issuemanagement.entity.Project;
import com.emrey.issuemanagement.entity.User;

public interface ProjectService {
	
	Project save(Project project);
	
	Project getById(Long id);
	
	Page<Project> getAllPageable(Pageable pageable);
	
	List<Project> getByProjectCode(String projectCode);
	
	List<Project> getByProjectCodeContains(String projectCode);
	
	Boolean delete(Project project);
	
}
