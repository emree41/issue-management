package com.emrey.issuemanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emrey.issuemanagement.dto.ProjectDto;
import com.emrey.issuemanagement.service.impl.ProjectServiceImpl;
import com.emrey.issuemanagement.utils.ApiPaths;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/versioning")
@Api(value = ApiPaths.ProjectCtrl.CTRL, description = "Project APIs")
public class ProjectVersionedApi {
	@Autowired
	private ProjectServiceImpl projectServiceImpl;
	
	@GetMapping(value = "/{id}", params = "version=1")
	@ApiOperation(value = "Get By Id Operation V1", response = ProjectDto.class)
	public ResponseEntity<ProjectDto> getByIdV1(@PathVariable(value = "id", required = true) Long id) {
		ProjectDto projectDto = projectServiceImpl.getById(id);
		return ResponseEntity.ok(projectDto);
	}
	
	@GetMapping(value = "/{id}", params = "version=2")
	@ApiOperation(value = "Get By Id Operation V2", response = ProjectDto.class)
	public ResponseEntity<ProjectDto> getByIdV2(@PathVariable(value = "id", required = true) Long id) {
		ProjectDto projectDto = projectServiceImpl.getById(id);
		return ResponseEntity.ok(projectDto);
	}
}
