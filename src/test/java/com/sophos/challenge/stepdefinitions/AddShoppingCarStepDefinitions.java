package com.sophos.challenge.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static com.sophos.challenge.userinterfaces.VivandaHomePage.FIRST_PRODUCT_FOUND;

import com.sophos.challenge.tasks.AddProductInCar;
import com.sophos.challenge.tasks.OpenBrowser;
import com.sophos.challenge.tasks.SearchInThePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddShoppingCarStepDefinitions {

	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Laura");
    }

	
	@Given("I enter into vivanda page")
	public void iEnterIntoVivandaPage() {
		theActorInTheSpotlight().wasAbleTo(OpenBrowser.openningBrowser("https://www.vivanda.com.pe/"));
	}

	@When("I add a product (.*) into shopping car")
	public void iAddAProductIntoShoppingCar(String product) {
	   theActorInTheSpotlight().attemptsTo(SearchInThePage.theProduct(product).andSelectThe(FIRST_PRODUCT_FOUND),
			   AddProductInCar.shop());
	}

	@Then("I verify that the product selected is in the shopping car")
	public void iVerifyThatTheProductSelectedIsInTheShoppingCar() {
	    
	}

	
}