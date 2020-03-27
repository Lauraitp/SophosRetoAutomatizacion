package com.sophos.challenge.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/sophos/challenge/features/users_search.feature",
                 glue = {"com.sophos.challenge.stepdefinitions"},
                 snippets = CAMELCASE)
public class UsersSearch {
}
