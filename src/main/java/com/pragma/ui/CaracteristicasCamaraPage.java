package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CaracteristicasCamaraPage extends PageObject {


    public static final Target BOTON_COLOR_CAMARA = Target.the("Boton elegir color de la camara")
            .located(By.xpath("//*[@id='input-option226']"));

//input-option226


    public static final Target CAMPO_CANTIDAD = Target.the("Boton elegir cantidad de unidades camara")
            .located(By.xpath("//*[@id='input-quantity']"));


    public static final Target CAMPO_ADD_CARRITO = Target.the("Boton elegir cantidad de unidades camara")
            .located(By.xpath("//*[@id='button-cart']"));


}
