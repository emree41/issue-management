package com.emrey.issuemanagement.dto;

import java.util.Date;

import com.emrey.issuemanagement.entity.IssueStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Issue History Data Transfer Object")
public class IssueHistoryDto {
	@ApiModelProperty(required = true, value = "Project ID")
	private Long id;
	@ApiModelProperty(required = true, value = "Issue")
	private IssueDto issue;
	@ApiModelProperty(required = true, value = "Description")
	private String description;
	@ApiModelProperty(required = true, value = "Date")
	private Date date;
	@ApiModelProperty(required = true, value = "Issue Status")
	private IssueStatus issueStatus;
	@ApiModelProperty(required = true, value = "Details")
	private String details;
	@ApiModelProperty(required = true, value = "Assignee")
	private UserDto assignee;
}
