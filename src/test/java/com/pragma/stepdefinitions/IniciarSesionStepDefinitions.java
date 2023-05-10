package com.pragma.stepdefinitions;

import com.pragma.setup.Configuracion;
import com.pragma.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.pragma.questions.MensajeInicioSesion.mensajeInicioSesion;
import static com.pragma.tasks.IniciarSesion.iniciarSesion;
import static com.pragma.tasks.NavegarInicio.navegarInicio;
import static com.pragma.tasks.SeccionLaptops.seccionLaptops;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class IniciarSesionStepDefinitions extends Configuracion {


    public static Logger LOGGER = Logger.getLogger(AgregarProductosStepDefinitions.class);


    @Given("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );

            theActorInTheSpotlight().wasAbleTo(
                    seccionLaptops()
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de seccion laptops");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }

    @When("navega hasta la opcion de iniciar sesion envia las credenciales")
    public void navegaHastaLaOpcionDeIniciarSesionEnviaLasCredenciales() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarInicio(),
                    iniciarSesion()
                            .conElUsuario("yeisonBuitrago@gmail.com")
                            .yConLaContrasenna("123456")
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso del inicio de sesion");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }

    @Then("el usuario debera ver un texto que ha iniciado sesion {string}")
    public void elUsuarioDeberaVerUnTextoQueHaIniciadoSesion(String mensaje) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeInicioSesion(), equalTo(mensaje))
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de validacion de inicio de sesion");
            LOGGER.warn(e.getMessage());
        } finally {
            quitarDriver();
        }
    }

}
