package com.sophos.challenge.interations;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Wait implements Interaction {
	
    private int var;

    /**
     * Constructor de la iteration
     * @param var el número en milisegundos
     */
    protected Wait(int var) {
        this.var = var;
    }
    /**
     * Esta iteration tiene un lapso de tiempo de espera,
     * el parametro es el valor en milisegundos de espera
     */
    
    @Step("{0} waits this moment '#var' in miliseconds")
    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(var);
    }

 

    public static Wait theTime(int var) {
        return Tasks.instrumented(Wait.class, var);
    }
}
