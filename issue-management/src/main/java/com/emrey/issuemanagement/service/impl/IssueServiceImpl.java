package com.emrey.issuemanagement.service.impl;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.emrey.issuemanagement.dto.IssueDto;
import com.emrey.issuemanagement.dto.ProjectDto;
import com.emrey.issuemanagement.entity.Issue;
import com.emrey.issuemanagement.entity.Project;
import com.emrey.issuemanagement.repository.IssueRepository;
import com.emrey.issuemanagement.service.IssueService;
import com.emrey.issuemanagement.utils.TPage;

@Service
public class IssueServiceImpl implements IssueService{
	
	// final vererek runtime da issuereposiory nn değişmesini engelliyoruz.
	//nesne güvenli hale geliyor
	private final IssueRepository issueRepository;
	private final ModelMapper modelMapper;
	
	
	//constuctor injection: bu yontem sring tarafından oneriliyor(setter injecion a gore)
	public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
		this.issueRepository = issueRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public IssueDto save(IssueDto issue) {
		if(issue.getDate() == null) {
			throw new IllegalArgumentException("Issue Date can not be null!");
		}
		Issue issueDb = modelMapper.map(issue, Issue.class);
		issueDb =  issueRepository.save(issueDb);
		return modelMapper.map(issueDb, IssueDto.class);
		
	}

	@Override
	public IssueDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TPage<IssueDto> getAllPageable(Pageable pageable) {
		Page<Issue> data = issueRepository.findAll(pageable);
		TPage page = new TPage<IssueDto>();
		IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
		page.setStat(data, Arrays.asList(dtos));
		return page;
	}
	
	public Boolean delete(Long issueId) {
		issueRepository.deleteById(issueId);
		return true;
	}

	@Override
	public IssueDto update(Long id, IssueDto issue) {
		return null;
	}
	

}
