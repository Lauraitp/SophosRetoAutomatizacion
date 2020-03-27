package com.sophos.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FeaturesProduct {

	public static final Target PRODUCT_NAME = Target.the("Text that containsf the product name").
			locatedBy("//*[@id=\"ficha-detalle-producto \"]/div/div[1]/h1/div");
	
	public static final Target PRODUCT_PRICE = Target.the("Text that containsf the product price").
			locatedBy("//*[@id=\"ficha-detalle-producto \"]/div/div[2]/div[1]/div[1]/strong/div/div/p[1]/em[1]/strong");
	
	public static final Target PRODUCT_UNIT = Target.the("Text that containsf the product units").
			locatedBy("//*[@id=\"ficha-detalle-producto \"]/div/div[2]/div[1]/div[1]/div/div[3]");

	public static final Target ADD_PRODUCT = Target.the("The button that add product to shopping car").
			locatedBy("//*[@id=\"ficha-detalle-producto \"]/div/div[2]/div[1]/div[2]/a");
	
	public static final Target OPEN_SHOPPING_CAR = Target.the("The button open the shopping car to see details").
			locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[6]/div[4]/div[2]/div[2]/span");
	
	
	private FeaturesProduct() {}
	
	

	
}
