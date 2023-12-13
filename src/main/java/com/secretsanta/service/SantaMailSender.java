package com.secretsanta.service;

import java.util.List;

import com.secretsanta.model.Mail;
import com.secretsanta.model.User;

public interface SantaMailSender {

	boolean send(List<User> users);
	void sendSimpleMessage(String to, String subject, String text);
}
