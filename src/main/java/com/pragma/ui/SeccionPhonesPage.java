package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeccionPhonesPage extends PageObject {

    public static final Target BOTON_PHONES = Target.the("Boton seleccionar tablets")
            .located(By.xpath("(//a[contains(text(), 'Phones & PDAs')])[1]"));


}
