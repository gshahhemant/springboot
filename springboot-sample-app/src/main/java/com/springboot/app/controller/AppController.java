package com.springboot.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class AppController {

	@GetMapping(value = "/test")
	public  ResponseEntity<String> test() {

		String str = "<html> <body><center><b>SPRING BOOT  TEST MIRCROSERVICE  WORKING FINE   </b></center></body></html>";

		return new ResponseEntity<String>(str, HttpStatus.OK);

	}

}
