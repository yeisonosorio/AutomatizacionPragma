package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.pragma.ui.AgregarTabletsPage.BOTON_ADD_TABLET;
import static com.pragma.ui.SeccionTablePage.BOTON_TABLET;

public class AgregarTablet implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_TABLET),
                Click.on(BOTON_ADD_TABLET)

        );
    }


    public static AgregarTablet agregarTablet() {
        return new AgregarTablet();
    }

}
