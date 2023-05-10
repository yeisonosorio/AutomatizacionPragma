package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pragma.ui.AgregarPortatilPage.BOTON_ADD_PRODUCTO;
import static com.pragma.ui.BuscarProductoPage.BOTON_SEARCH;
import static com.pragma.ui.BuscarProductoPage.CAMPO_SEARCH;

public class BuscarProducto8  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Product 8").into(CAMPO_SEARCH),
                Click.on(BOTON_SEARCH),
                Click.on(BOTON_ADD_PRODUCTO)

        );
    }


    public static BuscarProducto8 buscarProducto8() {
        return new BuscarProducto8();
    }

}
