package com.sophos.challenge.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class VivandaHomePage {
	
	
	public static final Target SEARCH_PRODUCT = Target.the("Search Bar in the page to find a product").
			locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[4]/form/input");
	
	public static final Target FIRST_PRODUCT_FOUND = Target.the("The first product found").
			locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[4]/div/div[2]/ul/li[1]/div/a");
	
	
	private VivandaHomePage() {}

}
