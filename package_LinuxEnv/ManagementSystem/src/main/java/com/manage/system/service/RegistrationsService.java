package com.manage.system.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manage.system.repository.RegistrationsRepository;

/**
 * @개요: RegistrationsRepository에서 처리한 수치연산을 Service로 받는 클래스
 * @처리내용: RegistrationsRepository를 리턴값으로 받음
 * @Method Name : 
 */

@Service
public class RegistrationsService {
	
	private final RegistrationsRepository registrationsRepository;
	
	public RegistrationsService(RegistrationsRepository registrationsRepository) {
		this.registrationsRepository = registrationsRepository;
	}
	
	@Transactional
	public Long countCreatedAt() {
		return registrationsRepository.countCreatedAt();
	}
	
	@Transactional
	public List<Timestamp> createdAtList(){
		return registrationsRepository.createdAtList();
	}

	@Transactional
	public Long countByCreatedAt(String createdAt){
        return registrationsRepository.countByCreatedAt(createdAt);

    }

}
