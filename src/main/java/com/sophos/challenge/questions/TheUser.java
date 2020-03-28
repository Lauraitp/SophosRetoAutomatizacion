package com.sophos.challenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.Serenity;

import com.sophos.challenge.model.User;

public class TheUser implements Question<String>{

    protected TheUser() {
	}

    @Step("{0} ask about the name of the user that have the response")
	@Override
	public String answeredBy(Actor actor) {
		User user = Serenity.sessionVariableCalled("userModel");
		String firstName=user.getName();
        return firstName;
	}
	/**
	 * Esta Question consulta el nombre del usuario
	 * @return la Question al final retorna el nombre del usuario que consultó en la petición
	 */
    
	public static TheUser name() {
		return new TheUser();
	}
}
