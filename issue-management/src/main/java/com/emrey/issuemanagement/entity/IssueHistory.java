package com.emrey.issuemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "issue_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IssueHistory extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JoinColumn(name="ISSUE_ID")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Issue issue;
	
	@Column(name = "DESCRIPTION", length = 1000)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date")
	private Date date;
	
	@Column(name = "ISSUE_STATUS")
	@Enumerated(EnumType.STRING)
	private IssueStatus issueStatus;
	
	@Column(name = "DETAILS", length = 4000)
	private String details;
	
	@JoinColumn(name="ASSIGNEE_USER_ID")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private User assignee;
}
