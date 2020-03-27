package com.sophos.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ApiRestHomePage {

	public static final Target REST_USER= Target.the("link to rest users").
			locatedBy("/html/body/div/div[2]/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[1]/a");

}
