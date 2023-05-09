package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pragma.ui.SeccionLaptopsPage.BOTON_LAPTOPS;
import static com.pragma.ui.SeccionLaptopsPage.BOTON_OPCION_SHOW_ALL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeccionLaptops implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_LAPTOPS, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_LAPTOPS),
                Click.on(BOTON_OPCION_SHOW_ALL)
        );
    }

    public static SeccionLaptops seccionLaptops() {
        return new SeccionLaptops();
    }
}
