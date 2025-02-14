package com.emrey.issuemanagement.dto;

import java.util.Date;

import com.emrey.issuemanagement.entity.IssueStatus;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Project Data Transfer Object")
public class ProjectDto {
	@ApiModelProperty(required = true, value = "Project ID")
	private Long id;
	@NotNull
	@ApiModelProperty(required = true, value = "Name Of Project")
	private String projectName;
	@NotNull
	@ApiModelProperty(required = true, value = "Code Of Project")
	private String projectCode;
}
