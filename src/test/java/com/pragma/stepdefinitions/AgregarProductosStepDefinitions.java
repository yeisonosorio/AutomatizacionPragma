package com.pragma.stepdefinitions;

import com.pragma.setup.Configuracion;
import com.pragma.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.pragma.questions.ValidarPrecio.validarPrecio;
import static com.pragma.tasks.AgregarComponents.agregarComponents;
import static com.pragma.tasks.AgregarDosMacBook.agregarDosMacBook;
import static com.pragma.tasks.AgregarMP3.agregarMP3;
import static com.pragma.tasks.AgregarPhones.agregarPhones;
import static com.pragma.tasks.AgregarTablet.agregarTablet;
import static com.pragma.tasks.ProductoMacBook.productoMacBook;
import static com.pragma.tasks.SeccionLaptops.seccionLaptops;
import static com.pragma.tasks.VerCarrito.verCarrito;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AgregarProductosStepDefinitions extends Configuracion {


    public static Logger LOGGER = Logger.getLogger(AgregarProductosStepDefinitions.class);


    @Given("que el usuario ingresa a la pagina yourstore")
    public void queElUsuarioIngresaALaPaginaYourstore() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        } catch (Exception e) {
            LOGGER.info("fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }


    @Given("el usuario esta en la seccion laptops de la pagina")
    public void elUsuarioEstaEnLaSeccionLaptopsDeLaPagina() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    seccionLaptops()
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de seccion laptops");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }


    @When("agregar una laptop al carrito")
    public void agregarUnaLaptopAlCarrito() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    productoMacBook(),
                    verCarrito()
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de agregar producto al carrito");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }

    }

    @Then("el usuario debe ver el valor del producto {string}")
    public void elUsuarioDebeVerElValorDelProducto(String mensaje) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(validarPrecio(), equalTo(mensaje))
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de validacion del precio del producto");
            LOGGER.warn(e.getMessage());
        } finally {
            quitarDriver();
        }
    }


    @Given("el usuario esta en la seccion laptops de la pagina yourstore")
    public void elUsuarioEstaEnLaSeccionLaptopsDeLaPaginaYourstore() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    seccionLaptops()
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de seccion laptops");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }

    @When("agregar dos laptop al carrito de compras")
    public void agregarDosLaptopAlCarritoDeCompras() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    agregarDosMacBook(),
                    verCarrito()
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de agregar producto al carrito");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }

    @Then("el usuario debe ver el valor de los dos producto {string}")
    public void elUsuarioDebeVerElValorDeLosDosProducto(String mensaje) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(validarPrecio(), equalTo(mensaje))
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de validacion del precio del producto");
            LOGGER.warn(e.getMessage());
        } finally {
            quitarDriver();
        }
    }


    @Given("el usuario esta en la pagina yourstore")
    public void elUsuarioEstaEnLaPaginaYourstore() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        } catch (Exception e) {
            LOGGER.info("fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }

    @When("el usuario agregar varios productos al carrito de compras")
    public void elUsuarioAgregarVariosProductosAlCarritoDeCompras() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    agregarComponents(),
                    agregarTablet(),
                    agregarPhones(),
                    agregarMP3(),
                    verCarrito()
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de agregar producto al carrito");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }

    @Then("el usuario debe ver el valor de todos los producto {string}")
    public void elUsuarioDebeVerElValorDeTodosLosProducto(String mensaje) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(validarPrecio(), equalTo(mensaje))
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de validacion del precio del producto");
            LOGGER.warn(e.getMessage());
        } finally {
            quitarDriver();
        }
    }


}