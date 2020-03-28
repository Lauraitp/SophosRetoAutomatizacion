package com.sophos.challenge.interations;

import static com.sophos.challenge.utils.enums.Product.NAME;
import static com.sophos.challenge.utils.enums.Product.PRICE;
import static com.sophos.challenge.utils.enums.Product.UNITS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class RememberInformationProduct implements Interaction {
	
	private Target productName;
	private Target productPrice;
	private Target productUnits;
	
/**
 * Constructor de la iteracción
 * @param productName es el target que trae la información del nombre del producto selccionado
 * @param productPrice es el target que trae la información del precio del producto selccionado
 * @param productUnits es el target que trae la información de las unidades del producto selccionado
 */
	protected RememberInformationProduct(Target productName, Target productPrice, Target productUnits) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productUnits = productUnits;
	}

	/**
	 * La iteración consiste en recordar en unas llaves que van a ser String, las caracteristicas
	 * como nombre, precio y unidades del producto comprado
	 */

	@Step("{0} remembers the features of product like '#productName' '#productPrice' and '#productUnits'")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(NAME.getProductToBuy(), productName.resolveFor(actor).getTextValue());
		actor.remember(PRICE.getProductToBuy(), productPrice.resolveFor(actor).getTextValue());
		actor.remember(UNITS.getProductToBuy(), productUnits.resolveFor(actor).getTextValue());
		
	}
	
	public static RememberInformationProduct to(Target productName, Target productPrice, Target productUnits) {
		return Tasks.instrumented(RememberInformationProduct.class, productName,productPrice,productUnits);
	}

	

}
