package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.pragma.ui.AgregarDosMacPage.EQUIPO_MAC1;
import static com.pragma.ui.AgregarDosMacPage.EQUIPO_MAC2;
import static com.pragma.ui.ProductoMacBookPage.BOTON_MAC;

public class AgregarDosMacBook implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EQUIPO_MAC1),
                Click.on(EQUIPO_MAC1),
                Scroll.to(EQUIPO_MAC2),
                Click.on(EQUIPO_MAC2)

        );
    }


    public static AgregarDosMacBook agregarDosMacBook() {
        return new AgregarDosMacBook();
    }


}
