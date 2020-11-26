package com.emrey.issuemanagement.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.core.sym.Name;

import lombok.Data;
@Data // Data annotation u fieldların getter ve setterlarını oomatik oluşturur.
@MappedSuperclass // Bu class diğer classlarda extend edilebilir hale geliyor.
public abstract class BaseEntity implements Serializable{
	
	@Column(name = "CREATED_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name = "CREATED_BY", length = 100)
	private String createdBy;
	
	@Column(name = "UPDATED_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@Column(name = "UPDATED_BY", length = 100)
	private String updatedBy;
	
	@Column(name = "STATUS")
	private Boolean status;
}
