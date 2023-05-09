package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarDosMacPage extends PageObject {

    public static Target EQUIPO_MAC1 = Target.the("Seleccionar MackBook Air")
            .located(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'][normalize-space()='Add to Cart'])[3]"));


    public static Target EQUIPO_MAC2 = Target.the("Seleccionar MackBook Pro")
            .located(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'][normalize-space()='Add to Cart'])[4]"));


}
