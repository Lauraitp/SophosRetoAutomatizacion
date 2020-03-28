package com.sophos.challenge.interations;


import static net.serenitybdd.rest.SerenityRest.lastResponse;


import java.util.Map;

import com.google.gson.Gson;
import com.sophos.challenge.model.User;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class SaveInformationUser implements Interaction {

	protected SaveInformationUser() {
	
	}
	
	/**
	 * La Interaction guarda la información del response en un atributo del objeto User
	 */

	@SuppressWarnings("unchecked")
	@Step("{0} save the information of user")
	@Override
	public <T extends Actor> void performAs(T actor) {
		User user = new User();
        Gson gson = new Gson();
        Map<String, Object> mapResponse =  gson.fromJson(lastResponse().asString(), Map.class);
		Map<String,Object> result=  (Map<String,Object>) mapResponse.get("result");
        user.setName(result.get("first_name").toString());
        Serenity.setSessionVariable("userModel").to(user);
	}
	
	public static SaveInformationUser sinceService() {
		return Tasks.instrumented(SaveInformationUser.class);
	}

	

}
