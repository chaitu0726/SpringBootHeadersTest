package com.simplyfy.SpringBootHeadersTest.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/ping")
	public String ping() {
		return "Service Available";
	}
	
	@GetMapping("/no-doubt")
	public String checkHeader(
			@RequestHeader(value = "scope") String scope) {
		return "Header Added";
	}
	
}
