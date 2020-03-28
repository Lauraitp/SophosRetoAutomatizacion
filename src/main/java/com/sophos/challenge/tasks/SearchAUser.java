package com.sophos.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;

import static com.sophos.challenge.utils.enums.ApiRest.ENDPOINT;
import static com.sophos.challenge.exceptions.GetApiRestException.*;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.challenge.exceptions.GetApiRestException;
import com.sophos.challenge.interations.SaveInformationUser;

public class SearchAUser implements Task {

	private final int userID;

	SearchAUser(int userID) {
		this.userID = userID;
	}

	@Step("{0} find the user with id #userID and save that in a Object")
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Get.resource(ENDPOINT.getGetRest()).with(request -> request.pathParam("id", userID)));

			if (lastResponse().getStatusCode()!=200) {
				throw new GetApiRestException(NOT_FOUND_RESPONSE_USER_ID_EXCEPTION);
			}
			actor.attemptsTo(SaveInformationUser.sinceService());

		} catch (Exception ex) {
			throw new GetApiRestException(API_RESPONSE_ERROR_EXCEPTION, ex.getCause());
		}
	}

	/**
	 * la tarea encuentra la información del servicio con el id del usuario
	 * 
	 * @param userID es el id del usuario que se encuentra en el servicio
	 * @return la taks
	 */

	public static Performable by(int userID) {
		return instrumented(SearchAUser.class, userID);
	}
}
