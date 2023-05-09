package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.pragma.ui.VerCarritoPage.VER_CARRITO;

public class VerCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VER_CARRITO)

        );
    }

    public static VerCarrito verCarrito() {
        return new VerCarrito();
    }
}
