package com.pragma.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.pragma.ui.AgregarDosMacPage.EQUIPO_MAC1;
import static com.pragma.ui.AgregarMP3Page.BOTON_ADD_MP3;
import static com.pragma.ui.AgregarPhonesPage.BOTON_ADD_CELULAR;
import static com.pragma.ui.SeccionMP3Page.BOTON_MP3;
import static com.pragma.ui.SeccionMP3Page.BOTON_SHOW_ALL;
import static com.pragma.ui.SeccionPhonesPage.BOTON_PHONES;

public class AgregarMP3 implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MP3),
                Click.on(BOTON_SHOW_ALL),
                Scroll.to(BOTON_ADD_MP3),
                Click.on(BOTON_ADD_MP3)


        );
    }


    public static AgregarMP3 agregarMP3() {
        return new AgregarMP3();
    }
}
