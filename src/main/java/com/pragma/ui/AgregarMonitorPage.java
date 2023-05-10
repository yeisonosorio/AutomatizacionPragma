package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarMonitorPage extends PageObject {

    public static final Target BOTO_ADD_MONITOR = Target.the("Boton elegir una pc mac")
            .located(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'][normalize-space()='Add to Cart'])[2]"));

}
