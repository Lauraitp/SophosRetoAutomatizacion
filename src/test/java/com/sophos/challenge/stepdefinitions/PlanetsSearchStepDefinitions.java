package com.sophos.challenge.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static com.sophos.challenge.exceptions.PlanetInvalidResponse.INVALID_PLANET_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;

import com.sophos.challenge.exceptions.PlanetInvalidResponse;
import com.sophos.challenge.questions.ThePlanet;
import com.sophos.challenge.tasks.SearchAPlanet;

public class PlanetsSearchStepDefinitions {

    private Actor JENN = Actor.named("Jennifer");
    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;

    @Before
    public void prepareStage()  {
        theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl");
        JENN.can(CallAnApi.at(theRestApiBaseUrl));
    }

    @When("I ask for the number {int} planet")
    public void iAskForAPlanet(Integer planetID) {
        JENN.attemptsTo(SearchAPlanet.by(planetID));
    }

    @Then("I should see that the planet name is (.*)")
    public void iShouldSeeThatThePlanetName(String planetName) {
        JENN.should(seeThat("The planet name",
                ThePlanet.name(), is(planetName)).orComplainWith(PlanetInvalidResponse.class, INVALID_PLANET_NAME));
    }

}
