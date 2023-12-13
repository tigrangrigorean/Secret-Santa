package com.secretsanta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.secretsanta.model.Mail;
import com.secretsanta.model.User;
import com.secretsanta.service.SantaMailSender;
import com.secretsanta.service.SantaService;

@Service
public class SantaMailSenderImpl implements SantaMailSender{
	
	private final SantaService santaService;
	private JavaMailSender emailSender;
	
	@Autowired
	public SantaMailSenderImpl(SantaService santaService,JavaMailSender emailSender) {
		this.santaService = santaService;
		this.emailSender = emailSender;
	}

	@Override
	public boolean send(List<User> users) {
		
		List<Mail> mailsList = santaService.calculate(users);
		
		for(int i = 0; i<mailsList.size();i++) {
			sendSimpleMessage(mailsList.get(i).getEmail(),"Secret Santa",
					"Hey " + mailsList.get(i).getReciever() + "  Secret Santa is calling! Get ready to spread joy by gifting " +
							mailsList.get(i).getName() + " some holiday cheer!");
			
		}
		
		return true;
	}
	
	@Override
	public void sendSimpleMessage(String to, String subject, String text) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(to);
	        message.setSubject(subject);
	        message.setText(text);
	        emailSender.send(message);
	    }

}
