import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IssueComponent } from './issue.component';
import { IssueRoutingModule } from './issue.routing.module';
import { IssueService } from '../../services/shared/issue.service';
@NgModule({
  declarations: [IssueComponent],
  providers: [IssueService],
  imports: [
    CommonModule,
	IssueRoutingModule
  ]
})
export class IssueModule { }
