package com.sophos.challenge.stepdefinitions;


import static com.sophos.challenge.exceptions.PlanetInvalidResponse.INVALID_PLANET_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.sophos.challenge.exceptions.PlanetInvalidResponse;
import com.sophos.challenge.questions.TheUser;
import com.sophos.challenge.tasks.OpenBrowser;
import com.sophos.challenge.tasks.SearchAUser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsersSearchStepDefinitions {

    
        
    @Given("I go to the page rest")
    public void iGoToThePageRest() {
        theActorInTheSpotlight().wasAbleTo(OpenBrowser.withUrl("https://gorest.co.in/"));
    }


    @When("I ask for the user id {int}")
    public void iAskForTheUser(Integer userID) {
    	theActorInTheSpotlight().attemptsTo(SearchAUser.by(userID));
    }

    @Then("I should see that the first name is (.*)")
    public void iShouldSeeThatTheFirstName(String planetName) {
    	theActorInTheSpotlight().should(seeThat(TheUser.name(), is(planetName))
    			.orComplainWith(PlanetInvalidResponse.class, INVALID_PLANET_NAME));
    }

}
