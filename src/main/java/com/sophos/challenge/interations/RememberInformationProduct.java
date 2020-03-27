package com.sophos.challenge.interations;

import static com.sophos.challenge.model.enums.Product.NAME;
import static com.sophos.challenge.model.enums.Product.PRICE;
import static com.sophos.challenge.model.enums.Product.UNITS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class RememberInformationProduct implements Interaction {
	
	private Target productName;
	private Target productPrice;
	private Target productUnits;
	

	public RememberInformationProduct(Target productName, Target productPrice, Target productUnits) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productUnits = productUnits;
	}



	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(NAME.getProductToBuy(), productName.resolveFor(actor).getValue());
		actor.remember(PRICE.getProductToBuy(), productPrice.resolveFor(actor).getValue());
		actor.remember(UNITS.getProductToBuy(), productUnits.resolveFor(actor).getValue());
		
	}
	
	public static RememberInformationProduct to(Target productName, Target productPrice, Target productUnits) {
		return Tasks.instrumented(RememberInformationProduct.class, productName,productPrice,productUnits);
	}

	

}
