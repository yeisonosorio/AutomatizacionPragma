package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarPrecioPage extends PageObject {


    public static final Target VALIDAR_PRECIO = Target.the("Boton ver el carrito de compras")
            .located(By.cssSelector("#cart > ul > li:nth-child(2) > div > table > tbody > tr:nth-child(4) > td:nth-child(2)"));

}
