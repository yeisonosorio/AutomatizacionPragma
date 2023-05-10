package com.pragma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.pragma.ui.ConfirmacionInicioPage.MENSAJE_INICIO_SESION;

public class MensajeInicioSesion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_INICIO_SESION.resolveFor(actor).getText();
    }

    public static MensajeInicioSesion mensajeInicioSesion(){
        return new MensajeInicioSesion();
    }
}
