package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.pragma.ui.CaracteristicasCamaraPage.*;
import static com.pragma.ui.CaracteristicasPortatilHp.BOTON_CALENDARIO;
import static com.pragma.ui.CaracteristicasPortatilHp.BOTON_DIA;

public class CaracteristicasPortatilHp implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CALENDARIO),
                SelectFromOptions.byValue("16").from(BOTON_DIA),
                Enter.theValue("1").into(CAMPO_CANTIDAD),
                Click.on(CAMPO_ADD_CARRITO)

        );
    }


    public static CaracteristicasPortatilHp caracteristicasPortatilHp() {
        return new CaracteristicasPortatilHp();
    }

}
