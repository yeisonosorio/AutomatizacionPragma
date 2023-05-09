package com.pragma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.pragma.ui.ValidarPrecioPage.VALIDAR_PRECIO;

public class ValidarPrecio implements Question<String>  {


    @Override
    public String answeredBy(Actor actor) {
        return VALIDAR_PRECIO.resolveFor(actor).getText();
    }

    public static ValidarPrecio validarPrecio(){
        return new ValidarPrecio();
    }
}
