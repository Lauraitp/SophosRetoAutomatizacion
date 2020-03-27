package com.sophos.challenge.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophos.challenge.tasks.OpenBrowser;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddShoppingCarStepDefinitions {

	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

	
	@Given("I enter into vivanda page")
	public void iEnterIntoVivandaPage() {
		theActorCalled("Laura").attemptsTo(OpenBrowser.openningBrowser("https://www.vivanda.com.pe/"));
	}

	@When("I add a product (.*) into shopping car")
	public void iAddAProductIntoShoppingCar(String product) {
	   
	}

	@Then("I verify that the product selected is in the shopping car")
	public void iVerifyThatTheProductSelectedIsInTheShoppingCar() {
	    
	}

	
}
