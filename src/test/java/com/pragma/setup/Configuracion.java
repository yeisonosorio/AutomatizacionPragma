package com.pragma.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.pragma.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Configuracion {
    private static final String SWITCHES = "--remote-allow-origins=*";
    private static final String ACTOR = "User";

    @Managed()
    protected WebDriver webDriver;


    private void setupUser( WebDriver webDriver) {
        configurarDriver();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(webDriver));
        maximizar(webDriver);
    }

    private void configurarDriver() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments(SWITCHES);
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(co);
    }

    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitarDriver() {
        webDriver.quit();
    }

    protected void configurarNavegador() {
        setupUser(webDriver);
        setUplog4j();
    }



    private void setUpWebdriver(String SeleccionNavegador) {


        switch (SeleccionNavegador) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                co.addArguments("--incognito");
                // co.addArguments("--disable-notifications");
                co.addArguments("--disable-popup-blocking");
                webDriver = new ChromeDriver(co);
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptionso = new EdgeOptions();
                webDriver = new EdgeDriver(edgeOptionso);
                break;
            default:
                System.out.println("  Este navegador no existe :C");

        }


    }


    protected void generalSetup(String seleccionNavegador) {
        setUplog4j();
        setUpWebdriver(seleccionNavegador);
        setupUser(webDriver);
    }


    private void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }



}
