package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pragma.ui.AgregarCamaraPage.BOTO_ADD_CAMARA;
import static com.pragma.ui.SeccionCamaraPage.BOTON_CAMERAS;

public class AgregarCamara implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CAMERAS),
                Click.on(BOTO_ADD_CAMARA)

        );
    }


    public static AgregarCamara agregarCamara() {
        return new AgregarCamara();
    }

}
