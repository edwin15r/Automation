package co.com.colorlib_copia.definitions;

import co.com.colorlib_copia.models.CrearUsuarioData;
import co.com.colorlib_copia.steps.AdministrarHospitalSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

import java.util.List;

public class AdministrarHopsital_definitions {
    @Steps
    AdministrarHospitalSteps administrarHospitalSteps;


    @Given("^que el Usuario quiere registar un doctor$")
    public void queElUsuarioQuiereRegistarUnDoctor() {
        administrarHospitalSteps.abrirPagina();

    }

    @When("^cuando el ingresa los datos solicitados$")
    public void cuandoElIngresaLosDatosSolicitados(List<CrearUsuarioData> crearUsuarioData) {
        administrarHospitalSteps.agregarusuario(crearUsuarioData);
    }

    @Then("^el verifica el mensaje (.*)$")
    public void elVerificaElMensajeDatosGuardadosCorrectamente(String msg) {
        administrarHospitalSteps.verificamsg(msg);

    }

}
