package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pragma.ui.AgregarMonitorPage.BOTO_ADD_MONITOR;
import static com.pragma.ui.SeccionComponentesPage.BOTON_COMPONENTS;
import static com.pragma.ui.SeccionComponentesPage.BOTON_MONITOR;

public class AgregarComponents implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_COMPONENTS),
                Click.on(BOTON_MONITOR),
                Click.on(BOTO_ADD_MONITOR)

        );
    }


    public static AgregarComponents agregarComponents() {
        return new AgregarComponents();
    }


}
