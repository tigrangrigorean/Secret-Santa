package com.secretsanta.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secretsanta.model.User;
import com.secretsanta.service.SantaMailSender;

@RestController
@RequestMapping("/santa")
public class SantaController {
	
	private final SantaMailSender santaSender;
	
	public SantaController(SantaMailSender santaSender) {
		this.santaSender = santaSender;
	}
	
	
	@PostMapping("/send")
	public ResponseEntity<String> santaSender(@RequestBody List<User> users) {
		santaSender.send(users);
		return ResponseEntity.ok().body("Emails already sent");
	}
	
	

}
