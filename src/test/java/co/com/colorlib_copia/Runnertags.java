package co.com.colorlib_copia;

import cucumber.api.SnippetType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;


public class Runnertags {

    @Before

    public void test() {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
            case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();

                break;

        }

    }


    @Test
    public void testRunner() {
        JUnitCore.runClasses(CRunnerPedido.class);
    }
    @RunWith(CucumberWithSerenity.class)

    //Se modifica el nombre por el feature que se va a ejecutar, por cada feature se debe tener un runner
    @CucumberOptions(features = "src/test/resources/features/administrar_hospital.feature",
            tags = {"@registrarDoctor"},
            glue = "co.com.colorlib_copia.definitions",
            snippets = SnippetType.CAMELCASE)

    public class CRunnerPedido {

    }

}