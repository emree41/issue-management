package com.emrey.issuemanagement.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emrey.issuemanagement.dto.IssueDto;
import com.emrey.issuemanagement.dto.ProjectDto;
import com.emrey.issuemanagement.service.impl.IssueServiceImpl;
import com.emrey.issuemanagement.utils.ApiPaths;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
@Api(value = ApiPaths.IssueCtrl.CTRL, description = "Issue APIs")
public class IssueController {
	
	private final IssueServiceImpl issueServiceImpl;
	
	public IssueController(IssueServiceImpl issueServiceImpl) {
		this.issueServiceImpl = issueServiceImpl;
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Get By Id Operation", response = IssueDto.class)
	public ResponseEntity<IssueDto> getById(@PathVariable(value = "id", required = true) Long id) {
		IssueDto issueDto = issueServiceImpl.getById(id);
		return ResponseEntity.ok(issueDto);
	}
	
	@PostMapping
	//project map ine POST yapıldığında bu metoda düşecek
	@ApiOperation(value = "Create Operation", response = IssueDto.class)
	public ResponseEntity<IssueDto> createIssue(@Valid @RequestBody IssueDto issue) {
		return ResponseEntity.ok(issueServiceImpl.save(issue));
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Update Operation", response = IssueDto.class)
	public ResponseEntity<IssueDto> updateIssue(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody IssueDto issue){
		return ResponseEntity.ok(issueServiceImpl.update(id, issue));
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Delete Operation", response = Boolean.class)
	public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
		return ResponseEntity.ok(issueServiceImpl.delete(id));
	}
	
}

