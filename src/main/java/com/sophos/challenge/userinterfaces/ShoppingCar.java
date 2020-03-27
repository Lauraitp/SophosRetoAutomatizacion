package com.sophos.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCar {

	public static final Target NAME_PRODUCT_IN_CAR = Target.the("Text with name of product in the shopping car").
			locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[6]/div[4]/div[3]/div[3]/ul/li/div/div[2]/h4");
	
	public static final Target PRICE_PRODUCT_IN_CAR = Target.the("Text with price of product in the shopping car").
			locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[6]/div[4]/div[3]/div[3]/ul/li/div/div[3]/div[1]/span");

	public static final Target UNITS_OF_PRODUCT_IN_CAR = Target.the("Text with units of the product in the shopping car").
			locatedBy("	//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[6]/div[4]/div[3]/div[3]/ul/li/div/div[3]/div[2]/span/span");

	
}
