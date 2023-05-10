package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pragma.ui.AgregarPortatilPage.BOTON_ADD_PRODUCTO;
import static com.pragma.ui.BuscarProductoPage.BOTON_SEARCH;
import static com.pragma.ui.BuscarProductoPage.CAMPO_SEARCH;

public class BuscarProductoPortatilHp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("HP").into(CAMPO_SEARCH),
                Click.on(BOTON_SEARCH),
                Click.on(BOTON_ADD_PRODUCTO)

        );
    }


    public static BuscarProductoPortatilHp buscarProductoPortatilHp() {
        return new BuscarProductoPortatilHp();
    }

}
