package com.sophos.challenge.tasks;

import com.sophos.challenge.interations.RememberInformationProduct;
import com.sophos.challenge.interations.Wait;

import static com.sophos.challenge.userinterfaces.FeaturesProduct.*;
import static com.sophos.challenge.userinterfaces.DeliveryType.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class AddProductInCar implements Task{
	
	public AddProductInCar() {} 

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(RememberInformationProduct.to(PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_UNIT),
				Click.on(ADD_PRODUCT),
				JavaScriptClick.on(BUTTON_GO_STORE),
				Click.on(CHECK_VIVANDA_LIBERTADORES),
				JavaScriptClick.on(CONFIRM),
				JavaScriptClick.on(CONTINUE_BUTTON),
				Wait.theTime(5000),
				JavaScriptClick.on(OPEN_SHOPPING_CAR),
				Wait.theTime(1000)
				
				);
		
	}
	
	public static AddProductInCar shop() {
		return instrumented(AddProductInCar.class);
	}
	
	

}
