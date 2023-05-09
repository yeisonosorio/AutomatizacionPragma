package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeccionMP3Page extends PageObject {


    public static final Target BOTON_MP3= Target.the("Boton seleccionar tablets")
            .located(By.xpath("(//a[contains(text(), 'MP3 Players')])[1]"));



    public static final Target BOTON_SHOW_ALL= Target.the("Boton seleccionar tablets")
            .located(By.xpath("(//a[contains(text(), 'Show All MP3 Players')])[1]"));



}
