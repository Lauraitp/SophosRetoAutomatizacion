package com.sophos.challenge.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.core.Serenity;

import com.sophos.challenge.model.User;

public class TheUser{

    public static Question<String> name() {
    	User user = Serenity.sessionVariableCalled("userModel");
        return first_name -> user.getName();
    }
}
