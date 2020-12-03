package com.emrey.issuemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrey.issuemanagement.dto.ProjectDto;
import com.emrey.issuemanagement.entity.Issue;
import com.emrey.issuemanagement.entity.Project;
import com.emrey.issuemanagement.entity.User;
import com.emrey.issuemanagement.utils.TPage;

public interface ProjectService {
	
	ProjectDto save(ProjectDto project);
	
	ProjectDto getById(Long id);
	
	TPage<ProjectDto> getAllPageable(Pageable pageable);
	
	ProjectDto getByProjectCode(String projectCode);
	
	List<ProjectDto> getByProjectCodeContains(String projectCode);
	
	Boolean delete(ProjectDto project);
	
	ProjectDto update(Long id, ProjectDto project);
	
}
