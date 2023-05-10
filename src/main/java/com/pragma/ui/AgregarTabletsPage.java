package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarTabletsPage extends PageObject {

    public static final Target BOTON_ADD_TABLET = Target.the("Boton elegir una pc mac")
            .located(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'][normalize-space()='Add to Cart'])[1]"));

}
