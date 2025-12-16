package com.logilink.eureka.client.postapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PostController {
	@PostMapping
	public ResponseEntity<String> post() {
		return ResponseEntity.ok("Hello world");
	}
}
