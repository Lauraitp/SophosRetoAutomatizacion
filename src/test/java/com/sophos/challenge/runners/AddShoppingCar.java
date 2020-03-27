package com.sophos.challenge.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/sophos/challenge/features/add_shopping_car.feature",
                 glue = {"com.sophos.challenge.stepdefinitions"},
                 snippets = CAMELCASE)
public class AddShoppingCar {

}
