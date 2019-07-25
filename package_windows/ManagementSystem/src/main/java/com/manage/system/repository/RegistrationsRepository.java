package com.manage.system.repository;

import java.sql.Timestamp;
import java.util.List;

public interface RegistrationsRepository {
	
	Long countCreatedAt();
	
	List<Timestamp> createdAtList();
	
	Long countByCreatedAt(String createdAt);
	
}
