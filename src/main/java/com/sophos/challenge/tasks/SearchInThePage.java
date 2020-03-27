package com.sophos.challenge.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.sophos.challenge.userinterfaces.VivandaHomePage.SEARCH_PRODUCT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SearchInThePage implements Task{
	
	private String nameProduct;
	private static Target productToSelect;
	
	
	@SuppressWarnings("static-access")
	public SearchInThePage(String nameProduct,Target productToSelect) {
		this.nameProduct=nameProduct;
		this.productToSelect=productToSelect;
	}

	@Step("{0} finds the product in vivanda ")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SEARCH_PRODUCT),
				Enter.theValue(nameProduct).into(SEARCH_PRODUCT),
				Click.on(productToSelect)
				);
		
		
		
	}
	
	@SuppressWarnings("static-access")
	public SearchInThePage andSelectThe(Target productToSelect) {
		this.productToSelect=productToSelect;
		return this;
	}
	
	public static SearchInThePage theProduct(String nameProduct) {
		return instrumented(SearchInThePage.class,nameProduct,productToSelect);
	}
	

}
