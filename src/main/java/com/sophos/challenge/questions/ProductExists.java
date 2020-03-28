package com.sophos.challenge.questions;

import static com.sophos.challenge.utils.enums.Product.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class ProductExists implements Question<Boolean>{

	private Target nameProductCar;
	private Target priceProductCar;
	private Target unitProdctCar;
	
	public ProductExists (Target nameProductCar,Target priceProductCar,Target unitProdctCar) {
		this.nameProductCar=nameProductCar;
		this.priceProductCar=priceProductCar;
		this.unitProdctCar=unitProdctCar;
	}
	
	@Step("{0} verify that the product selected is in the shopping car")
	@Override
	public Boolean answeredBy(Actor actor) {
		boolean isTheProduct=false;
		
	
		if(nameProductCar.resolveFor(actor).getText().equals(actor.recall(NAME.getProductToBuy()))
				&&priceProductCar.resolveFor(actor).getText().equals(actor.recall(PRICE.getProductToBuy()))
				&&unitProdctCar.resolveFor(actor).getText().equals("x"+actor.recall(UNITS.getProductToBuy()))) {
			isTheProduct=true;
		}
		
		return isTheProduct;
	}
	
	/**
	 * Question para revisar si en el carro está el producto sleccionado
	 * @param nameProductCar ingresar el elemento que contiene el nombre del producto del carro
	 * @param priceProductCar ingresar el elemento que contiene el precio del producto del carro
	 * @param unitProdctCar ingresar el elemento que contiene las unidades del producto del carro
	 * @return respuesta de la questions
	 */
	
	public static ProductExists inShoppingCarWith(Target nameProductCar,Target priceProductCar,Target unitProdctCar) {
		return new ProductExists(nameProductCar,priceProductCar,unitProdctCar);
	}

}
