package com.sophos.challenge.utils.enums;

public enum ApiRest {

	ENDPOINT("/{id}?_format=json&access-token=ohQGtFPdylJY4uhczzyTlG1DNdCD8vJCgNZI");
	
	private String getRest;
	

	private ApiRest(String getRest) {
		this.getRest = getRest;
	}

	public String getGetRest() {
		return getRest;
	}

	public void setGetRest(String getRest) {
		this.getRest = getRest;
	}
	
	
	
}
