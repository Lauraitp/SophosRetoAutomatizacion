package com.sophos.challenge.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;

import static com.sophos.challenge.endpoint.Users.USERS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SearchAUser implements Task {

    private final int userID;  
    

    SearchAUser(int userID) {
        this.userID = userID;
    }

    @Step("{0} fetches the user with id #userID")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(USERS).with(request -> request.pathParam("id", userID))
        );
    }

    public static Performable by(int planetID) {
        return instrumented(SearchAUser.class, planetID);
    }
}
