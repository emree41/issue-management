import { Component, OnInit } from '@angular/core';
import {ProjectService} from "../../services/shared/project.service";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Page} from "../../common/page";
import {Project} from "../../common/project.model";

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.scss']
})
export class ProjectComponent implements OnInit {
	
  page = new Page();
  cols = [
	{prop: 'id', name:'No'},
	{prop: 'projectName', name:'project Name', sortable:false},
	{prop: 'projectCode', name:'project Code', sortable:false}	
  ];
  rows = [];
	
  constructor( private projectService : ProjectService) {
  }

  ngOnInit() {
	this.setPage({ offset: 0});	
  }
  
  setPage(pageInfo) {
    this.page.number = pageInfo.offset;
	this.projectService.getAll(this.page).subscribe(pagedData =>{
		this.page.size = pagedData.size;
		this.page.totalElements = pagedData.totalElements;
		this.page.number = pagedData.number;
		this.rows = pagedData.content;	
	});
  }
}
