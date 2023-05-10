package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.pragma.ui.CaracteristicasCamaraPage.*;
import static com.pragma.ui.CaracteristicasProducto8Page.BOTON_SIZE;

public class CaracteristicasProducto8 implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue("13").from(BOTON_SIZE),
                Enter.theValue("1").into(CAMPO_CANTIDAD),
                Click.on(CAMPO_ADD_CARRITO)

        );
    }


    public static CaracteristicasProducto8 caracteristicasProducto8() {
        return new CaracteristicasProducto8();
    }

}
