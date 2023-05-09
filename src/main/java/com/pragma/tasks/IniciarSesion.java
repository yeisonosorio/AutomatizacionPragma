package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pragma.ui.InicioSesionPage.*;

public class IniciarSesion implements Task {


    private String email;
    private String password;

    public IniciarSesion conElUsuario(String email) {
        this.email = email;
        return this;
    }

    public IniciarSesion yConLaContrasenna(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(email).into(CAMPO_EMAIL),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IniciarSesion iniciarSesion() {
        return new IniciarSesion();
    }


}
