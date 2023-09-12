package com.CloudVoyage.UserRegistrationService.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.CloudVoyage.UserRegistrationService.DTO.UserRegistrationDTO;

@RestController
public class UserRegistrationController {
	@GetMapping("/api/hello")
	@ResponseBody
	public UserRegistrationDTO testApi(){
		
		HttpHeaders headers = new HttpHeaders();
	    headers.set("Content-Type", "application/text");
	    UserRegistrationDTO test = new UserRegistrationDTO("Hello From Spring!");

	    return test;
	}
}
