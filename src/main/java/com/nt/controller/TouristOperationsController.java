package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tour")
public class TouristOperationsController {

	
	@GetMapping("/{name}")
	public ResponseEntity<String> TouristDetails(@PathVariable String name){
		return new ResponseEntity<String>("Tourist Guide ;)",HttpStatus.OK);
	}
	
}
