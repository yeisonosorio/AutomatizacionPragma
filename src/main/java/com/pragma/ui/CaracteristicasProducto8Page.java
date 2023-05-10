package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CaracteristicasProducto8Page extends PageObject {

    public static final Target BOTON_SIZE = Target.the("Boton elegir tamaño del producto8")
            .located(By.xpath("//*[@id='input-option224']"));


}
