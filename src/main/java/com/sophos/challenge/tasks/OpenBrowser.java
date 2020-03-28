package com.sophos.challenge.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenBrowser implements Task {
		
   
	private String app;

	public OpenBrowser(String app) {
		this.app=app;
	}	
	
	/**
	 * Task utilizada para que abra el browser ya en una pagina en especifo
	 * @param app es el link de la pagina a la que queremos ingresar
	 */

	@Step("{0} opens the browser on the '#app' ")
	@Override
	public <T extends Actor> void performAs(T actor) {
			
			actor.attemptsTo(Open.url(app));
	}
	
	public static OpenBrowser withUrl(String app) {
		return instrumented(OpenBrowser.class,app);
	}
}