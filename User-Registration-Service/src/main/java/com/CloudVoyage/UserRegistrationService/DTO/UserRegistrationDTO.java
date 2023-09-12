package com.CloudVoyage.UserRegistrationService.DTO;

public class UserRegistrationDTO {
	private String message;
	
	public UserRegistrationDTO(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
