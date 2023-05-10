package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CaracteristicasPortatilHp extends PageObject {

    public static final Target BOTON_CALENDARIO = Target.the("Boton elegir fecha")
            .located(By.cssSelector("//div[@class='input-group date']//button[@type='button']"));


    public static final Target BOTON_DIA = Target.the("Boton elegir fecha")
            .located(By.cssSelector(" //td[normalize-space()='27']"));


}
