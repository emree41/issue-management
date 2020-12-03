package com.emrey.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrey.issuemanagement.dto.IssueDto;
import com.emrey.issuemanagement.dto.ProjectDto;
import com.emrey.issuemanagement.entity.Issue;
import com.emrey.issuemanagement.utils.TPage;

public interface IssueService {
	
	IssueDto save(IssueDto issue);
	
	IssueDto getById(Long id);
	
	TPage<IssueDto> getAllPageable(Pageable pageable);
	
	Boolean delete(Long issueId);
	
	IssueDto update(Long id, IssueDto issue);
	
	
}
