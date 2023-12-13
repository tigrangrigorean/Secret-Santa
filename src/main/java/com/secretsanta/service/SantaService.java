package com.secretsanta.service;

import java.util.List;
import java.util.Random;

import com.secretsanta.model.Mail;
import com.secretsanta.model.User;

public interface SantaService {
	
	int generateRandomIndex(List<User> userList);
	List<Mail> calculate(List<User> userList);

}
