package com.sophos.challenge.stepdefinitions;


import static com.sophos.challenge.exceptions.UserInvalidResponse.INVALID_USER_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.sophos.challenge.exceptions.UserInvalidResponse;
import com.sophos.challenge.questions.TheUser;
import com.sophos.challenge.tasks.OpenBrowser;
import com.sophos.challenge.tasks.SearchAUser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class UsersSearchStepDefinitions {

	private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;
        
    @Given("I got the service")
    public void iGotTheService() {
    	theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl");
        theActorInTheSpotlight().can(CallAnApi.at(theRestApiBaseUrl));
    }


    @When("I ask for the user id {int}")
    public void iAskForTheUser(Integer userID) {
    	theActorInTheSpotlight().attemptsTo(SearchAUser.by(userID));
    }

    @Then("I should see that the first name is (.*)")
    public void iShouldSeeThatTheFirstName(String userName) {
    	theActorInTheSpotlight().should(seeThat(TheUser.name(), is(userName))
    			.orComplainWith(UserInvalidResponse.class, INVALID_USER_NAME));
    }

}
