package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeccionComponentesPage  extends PageObject {



    public static final Target BOTON_COMPONENTS = Target.the("Boton components")
            .located(By.xpath("//a[normalize-space()='Components']"));


    public static final Target BOTON_MONITOR = Target.the("Boton elegir una pc mac")
            .located(By.xpath("//a[normalize-space()='Monitors (2)']"));


}
