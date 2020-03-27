package com.sophos.challenge.interations;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class ChangeTo implements Interaction{

	private WebDriver browser;

	public ChangeTo(WebDriver browser) {
		this.browser = browser;
	}
	
	@Override
	@Step("{0} selects the tab")
	public <T extends Actor> void performAs(T actor) {

		ArrayList<String> tabs = new ArrayList<String>(browser.getWindowHandles());
		browser.switchTo().window(tabs.get(1));
		
	}
	
	public static ChangeTo window(WebDriver browser) {
		return Tasks.instrumented(ChangeTo.class, browser);
	}

}
