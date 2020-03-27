package com.sophos.challenge.questions;

import static com.sophos.challenge.model.enums.Product.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ProductExists implements Question<Boolean>{

	private Target nameProductCar;
	private Target priceProductCar;
	private Target unitProdctCar;
	
	public ProductExists (Target nameProductCar,Target priceProductCar,Target unitProdctCar) {
		this.nameProductCar=nameProductCar;
		this.priceProductCar=priceProductCar;
		this.unitProdctCar=unitProdctCar;
	}
	
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
	
	public static ProductExists inShoppingCarWith(Target nameProductCar,Target priceProductCar,Target unitProdctCar) {
		return new ProductExists(nameProductCar,priceProductCar,unitProdctCar);
	}

}
