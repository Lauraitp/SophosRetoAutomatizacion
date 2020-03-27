package com.sophos.challenge.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class VivandaPage {
	
	
	public static final Target CORRESPONDENT_CB_MODULE = Target.the("Show Correspondent Cb Module Options").
			locatedBy("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[4]/form/input");
	
	private VivandaPage() {}

}
