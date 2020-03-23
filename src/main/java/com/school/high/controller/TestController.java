package com.school.high.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.high.response.ResponseSchoolDetails;

@RestController
@RequestMapping("/test/School")
public class TestController {
	
	@GetMapping("/getSchoolName/{schoolId}")
	 ResponseSchoolDetails getSchoolName(@PathVariable String schoolId) {
		if(schoolId.equals("1"))
		{
			ResponseSchoolDetails responseSchoolDetails = new ResponseSchoolDetails();
			responseSchoolDetails.setSchoolName("St.Anns Hr Sec School");
			return responseSchoolDetails;
		}
		else {
			return null;
		}
		
		
	}

}
