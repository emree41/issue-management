package com.emrey.issuemanagement.dto;

import java.util.Date;

import com.emrey.issuemanagement.entity.IssueStatus;

import lombok.Data;
@Data

public class IssueDto {
	private Long id;
	private String descripion;
	private String details;
	private Date date;
	private IssueStatus issueStatus;
	private UserDto assignee;
	private ProjectDto project;
}
