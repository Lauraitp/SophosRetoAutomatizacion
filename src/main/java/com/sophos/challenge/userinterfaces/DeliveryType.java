package com.sophos.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DeliveryType {
	
	public static final Target BUTTON_GO_STORE= Target.the("Button go to the store").
			locatedBy("/html/body/div[6]/div/div[2]/div[2]/div/button[2]/span");
	
	public static final Target CHECK_VIVANDA_LIBERTADORES= Target.the("Check box to select the store vivanda libertadores").
			locatedBy("//*[@id=\"listStores\"]/li[1]/label/p[1]");
	
	public static final Target CONFIRM= Target.the("Button to continue with the information").
			locatedBy("/html/body/div[6]/div/div[3]/div[2]/div[4]/button");
	
	public static final Target CONTINUE_BUTTON= Target.the("Button continue").
			locatedBy("/html/body/div[6]/div/div[4]/div[3]/button");

	
	private DeliveryType() {}
}
