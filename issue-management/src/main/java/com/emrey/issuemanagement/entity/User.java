package com.emrey.issuemanagement.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="UNAME",length = 100, unique = true)
	private String userName;
	
	@Column(name="PWD",length = 200)
	private String password;
	
	@Column(name="NAME_SURNAME",length = 200)
	private String nameSurname;
	
	@Column(name="EMAIL",length = 100)
	private String email;
	
	@JoinColumn(name = "ASSIGNEE_USER_ID")
	@OneToMany(fetch = FetchType.LAZY)
	private List<Issue> issues;
}
