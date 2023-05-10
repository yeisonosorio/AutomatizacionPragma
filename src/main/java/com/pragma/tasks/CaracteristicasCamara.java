package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static com.pragma.ui.CaracteristicasCamaraPage.*;

public class CaracteristicasCamara  implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on()
                SelectFromOptions.byValue("16").from(BOTON_COLOR_CAMARA),
                Enter.theValue("10").into(CAMPO_CANTIDAD),
                Click.on(CAMPO_ADD_CARRITO)

        );
    }


    public static CaracteristicasCamara CaracteristicasCamara() {
        return new CaracteristicasCamara();
    }

}
