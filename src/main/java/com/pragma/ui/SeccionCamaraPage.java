package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeccionCamaraPage extends PageObject {


    public static final Target BOTON_CAMERAS = Target.the("Boton camaras")
            .located(By.xpath("(//a[normalize-space()='Cameras'])[1]"));



}
