package com.sophos.challenge.tasks;

import com.sophos.challenge.interations.RememberInformationProduct;
import com.sophos.challenge.interations.Wait;
import com.sophos.challenge.interations.WaitUntilClick;

import static com.sophos.challenge.userinterfaces.FeaturesProduct.*;
import static com.sophos.challenge.userinterfaces.DeliveryType.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.thucydides.core.annotations.Step;

public class AddProductInCar implements Task{
	
	public AddProductInCar() {} 
	
	/**
	 * Task usada para comprar el productos con la elección del usuarios de tipo de entrega,
	 * el carro de compras también
	 */

	@Step("{0} buys the product with a delivery type, she opens the car too ")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(RememberInformationProduct.to(PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_UNIT),
				Wait.theTime(1000),
				Click.on(ADD_PRODUCT),
				JavaScriptClick.on(BUTTON_GO_STORE),
				WaitUntilClick.theItem(CHECK_VIVANDA_LIBERTADORES),
				JavaScriptClick.on(CONFIRM),
				Wait.theTime(1000),
				JavaScriptClick.on(CONTINUE_BUTTON),
				Wait.theTime(10000),
				WaitUntilClick.theItem(OPEN_SHOPPING_CAR),
				Wait.theTime(1000)
				
				);
		
	}
	
	public static AddProductInCar shop() {
		return instrumented(AddProductInCar.class);
	}
	
	

}
