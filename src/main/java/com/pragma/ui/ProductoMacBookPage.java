package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductoMacBookPage extends PageObject {


    public static final Target BOTON_MAC = Target.the("Boton elegir una pc mac")
            .located(By.cssSelector("div[class='image'] img[title='MacBook']"));


    public static final Target BOTON_ADD_CARRITO = Target.the("Boton elegir una pc mac")
            .located(By.xpath("//button[@id='button-cart']"));





}
