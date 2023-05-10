package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarProductoPage extends PageObject {


    public static final Target CAMPO_SEARCH= Target.the("Boton elegir color de la camara")
            .located(By.cssSelector("input[placeholder='Search']"));



    public static final Target BOTON_SEARCH = Target.the("Boton elegir color de la camara")
            .located(By.xpath("//i[@class='fa fa-search']"));



}
