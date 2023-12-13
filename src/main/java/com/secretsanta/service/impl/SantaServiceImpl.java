package com.secretsanta.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.secretsanta.model.Mail;
import com.secretsanta.model.User;
import com.secretsanta.service.SantaService;

@Service
public class SantaServiceImpl implements SantaService{

	@Override
	public int generateRandomIndex(List<User> userList) {
		Random random = new Random();
		return random.nextInt(userList.size());
	}

	@Override
	public List<Mail> calculate(List<User> userList) {
		
		List<User> doubleUserList = new ArrayList<User>();
		doubleUserList.addAll(userList);
		List<Mail> mailsList = new ArrayList<Mail>();
		
		for(int i = 0; i<userList.size();i++) {
			int index = generateRandomIndex(doubleUserList);
			User user = doubleUserList.get(index);
			doubleUserList.remove(index);
			Mail mail = new Mail();
			mail.setReciever(userList.get(i).getName());
			mail.setName(user.getName());
			mail.setEmail(userList.get(i).getEmail());
			mailsList.add(mail);
		}
		
		return mailsList;
		
		
	}

	
	
	

}
