package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionInicioPage extends PageObject {
    public static Target MENSAJE_INICIO_SESION = Target.the("mensaje My Account")
            .located(By.xpath("(//h2[normalize-space()='My Account'])[1]"));
}
