package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pragma.ui.AgregarPhonesPage.BOTON_ADD_CELULAR;
import static com.pragma.ui.AgregarTabletsPage.BOTON_ADD_TABLET;
import static com.pragma.ui.SeccionPhonesPage.BOTON_PHONES;
import static com.pragma.ui.SeccionTablePage.BOTON_TABLET;

public class AgregarPhones implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PHONES),
                Click.on(BOTON_ADD_CELULAR)

        );
    }


    public static AgregarPhones agregarPhones() {
        return new AgregarPhones();
    }

}
