package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class VerCarritoPage extends PageObject {


    public static final Target VER_CARRITO = Target.the("Boton ver el carrito de compras")
            .located(By.id("cart-total"));


}
