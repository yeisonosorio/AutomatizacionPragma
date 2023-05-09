package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.pragma.ui.ProductoMacBookPage.BOTON_ADD_CARRITO;
import static com.pragma.ui.ProductoMacBookPage.BOTON_MAC;

public class ProductoMacBook implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_MAC),
                Click.on(BOTON_MAC),
                Click.on(BOTON_ADD_CARRITO)

        );
    }

    public static ProductoMacBook productoMacBook() {
        return new ProductoMacBook();
    }
}
