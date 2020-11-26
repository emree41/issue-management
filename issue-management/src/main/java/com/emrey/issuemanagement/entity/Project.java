package com.emrey.issuemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="PROJECT_CODE",unique = true,length = 200)
	private String projectCode;
	
	@Column(name="PROJECT_NAME",length = 200)
	private String projectName;
	
	@JoinColumn(name = "MANAGER_USER_ID")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private User manager;
	
}
