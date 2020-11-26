package com.emrey.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.emrey.issuemanagement.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long>{

}
