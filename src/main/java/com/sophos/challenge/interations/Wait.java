package com.sophos.challenge.interations;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {
	
    private int var;

    protected Wait(int var) {
        this.var = var;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(var);
    }

 

    public static Wait theTime(int var) {
        return Tasks.instrumented(Wait.class, var);
    }
}
