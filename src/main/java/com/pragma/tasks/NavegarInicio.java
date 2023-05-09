package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pragma.ui.InicioSesionPage.BOTON_ICON_MYACCOUNT;
import static com.pragma.ui.InicioSesionPage.BOTON_LOGIN;

public class NavegarInicio implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ICON_MYACCOUNT),
                Click.on(BOTON_LOGIN)

        );
    }

    public static NavegarInicio navegarInicio() {
        return new NavegarInicio();
    }
}
