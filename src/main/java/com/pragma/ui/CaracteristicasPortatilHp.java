package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CaracteristicasPortatilHp extends PageObject {

    public static final Target BOTON_CALENDARIO = Target.the("Boton elegir fecha")
            .located(By.cssSelector("#product > div.form-group.required > div > span > button > i"));


    public static final Target BOTON_DIA = Target.the("Boton elegir fecha")
            .located(By.xpath("//td[normalize-space()='27']"));


}
