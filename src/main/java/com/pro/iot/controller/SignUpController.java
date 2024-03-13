package com.pro.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.iot.model.SignUp;
import com.pro.iot.repo.SignUpRepo;

@RestController
@RequestMapping("/signup")



public class SignUpController {

@Autowired	

private SignUpRepo signupRepo;

@PostMapping("/add")
public ResponseEntity<?> addSignUp(@RequestBody SignUp signup){
	
	SignUp  savedEntity = signupRepo.saveAndFlush(signup);
	return ResponseEntity
			.status(HttpStatus.OK)
			.body(savedEntity);
	
}

	
}
