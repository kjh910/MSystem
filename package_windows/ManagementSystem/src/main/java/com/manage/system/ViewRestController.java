package com.manage.system;

import static com.manage.system.util.DateTimeUtils.dateTimeOf;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manage.result.ViewResult;
import com.manage.system.service.RegistrationsService;

/**
 * @개요: 각 Service에서 처리한 결과값을 View에 전달하기 위한 Controller클래스
 * @처리내용: 각 Service에서 처리한 수치연산 결과값을 ViewResult 생성자의 인자로 넣음
 * 			-> ResponseEntity<List<ViewResult>>에 ViewResult를 추가
 * @Method Name : 
 * return : ResponseEntity<List<ViewResult>>
 */

@RestController
public class ViewRestController {

	private final RegistrationsService registrationsService;

	public ViewRestController(RegistrationsService registrationsService) {
		this.registrationsService = registrationsService;
	}
	
	@RequestMapping(value = "/dateTime", method = RequestMethod.GET)
	public ResponseEntity<List<ViewResult>> input() {
		
		ResponseEntity<List<ViewResult>> resEntity = null;
		
		Long count = registrationsService.countCreatedAt();
		List<Timestamp> createdAtList = registrationsService.createdAtList();
		List<ViewResult> viewResultList = new ArrayList<>();
		
		for(int i=0; i<count; i++) {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDateTime convertFromTimestamp = dateTimeOf(createdAtList.get(i));
			String createdAtConvertToString = convertFromTimestamp.format(dateTimeFormatter);
			
			Long countByCreatedAt = registrationsService.countByCreatedAt(createdAtConvertToString);
			
			ViewResult viewResult = new ViewResult(createdAtConvertToString,countByCreatedAt);
			viewResultList.add(viewResult);
		}
		try {
			resEntity = new ResponseEntity<List<ViewResult>>(viewResultList, HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			resEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resEntity;

	}

}
