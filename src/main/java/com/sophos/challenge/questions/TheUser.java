package com.sophos.challenge.questions;

import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class TheUser{

    public static Question<String> name() {
    	System.out.println(lastResponse().body().path("result")+"");
        return first_name -> lastResponse().body().path("result");
    }
}
