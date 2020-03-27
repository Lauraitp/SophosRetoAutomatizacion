package com.sophos.challenge.questions;

import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ThePlanet {

    public static Question<String> name() {
        return name -> lastResponse().body().path("name");
    }
}
