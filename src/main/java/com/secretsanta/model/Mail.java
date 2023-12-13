package com.secretsanta.model;

public class Mail {
	
	private String name;
	private String email;
	private String reciever;
	
	public Mail() {
		
	}

	/**
	 * @param name
	 * @param email
	 * @param reciever
	 */
	public Mail(String name, String email, String reciever) {
		super();
		this.name = name;
		this.email = email;
		this.reciever = reciever;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the reciever
	 */
	public String getReciever() {
		return reciever;
	}

	/**
	 * @param reciever the reciever to set
	 */
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

}
