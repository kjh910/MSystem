package com.manage.system;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @개요: search.jsp url을 받아서 브라우저에서 여는 클래스
 * @처리내용: url= http://localhost:7779/ 를 브라우저에서 입력함 
 * @Method Name : 
 */

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
    public String showView() {
		
        return "main/search";
    }

}
