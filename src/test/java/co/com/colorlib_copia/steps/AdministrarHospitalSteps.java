package co.com.colorlib_copia.steps;

import co.com.colorlib_copia.models.CrearUsuarioData;
import co.com.colorlib_copia.pageobject.AdministrarHospitalPage;
import net.thucydides.core.annotations.Step;
import java.util.List;

public class AdministrarHospitalSteps {
    AdministrarHospitalPage administrarHospitalPage;

    @Step
    public void abrirPagina() {
        administrarHospitalPage.open();
    }
    @Step
    public void agregarusuario(List<CrearUsuarioData> crearUsuarioData) {
        administrarHospitalPage.registrarDatosUsuario(crearUsuarioData);
    }

    @Step
    public void verificamsg(String msg) {
        administrarHospitalPage.usuarioCreadoExitoso(msg);
    }
}
