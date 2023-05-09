package com.pragma.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeccionTablePage extends PageObject {



    public static final Target BOTON_TABLET= Target.the("Boton seleccionar tablets")
            .located(By.xpath("(//a[contains(text(), 'Tablets')])[1]"));


}
