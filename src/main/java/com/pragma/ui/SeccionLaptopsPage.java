package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeccionLaptopsPage  extends PageObject {


    public static final Target BOTON_OPCION_SHOW_ALL = Target.the("Boton elegir una pc mac")
            .located(By.xpath("//a[normalize-space()='Show All Laptops & Notebooks']"));


    public static final Target BOTON_LAPTOPS = Target.the("Boton elegir una pc mac")
            .located(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));


}
