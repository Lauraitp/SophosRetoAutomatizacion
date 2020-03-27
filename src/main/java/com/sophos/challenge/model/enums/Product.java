package com.sophos.challenge.model.enums;

public enum Product {

	NAME("name"),PRICE("price"),UNITS("units");
	
	private String productToBuy;
	
	private Product(String productToBuy) {
		this.productToBuy=productToBuy;
	}

	public String getProductToBuy() {
		return productToBuy;
	}
	
	
}
