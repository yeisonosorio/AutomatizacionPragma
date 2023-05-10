package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarPortatilPage extends PageObject {


    public static final Target BOTON_ADD_PRODUCTO = Target.the("Boton agregar portatil hp")
            .located(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'][normalize-space()='Add to Cart'])[1]"));

}
