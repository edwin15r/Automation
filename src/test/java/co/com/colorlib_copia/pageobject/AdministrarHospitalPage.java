package co.com.colorlib_copia.pageobject;


import co.com.colorlib_copia.models.CrearUsuarioData;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/home")
public class AdministrarHospitalPage extends PageObject {

    @FindBy(xpath = "//a[@href='addDoctor']")
    WebElementFacade opcDoctor;

    //Datos del formulario***********
    @FindBy(id = "name")
    WebElementFacade Nombres;

    @FindBy(id = "last_name")
    WebElementFacade Apellidos;

    @FindBy(id = "telephone")
    WebElementFacade telefono;

    @FindBy(id = "identification_type")
    WebElementFacade tipoDoc;

    @FindBy(id = "identification")
    WebElementFacade Documento;

    @FindBy(xpath = "//a[@onclick='submitForm()']")
    WebElementFacade btnGuardar;

    @FindBy(xpath = "//div[@id='page-wrapper']//p")
    WebElementFacade mensaje;


    public void registrarDatosUsuario(List<CrearUsuarioData> crearUsuarioData) {
        opcDoctor.click();
        Nombres.sendKeys(crearUsuarioData.get(0).getNombres());
        Apellidos.sendKeys(crearUsuarioData.get(0).getApellidos());
        telefono.sendKeys(String.valueOf(crearUsuarioData.get(0).getTelefono()));
        tipoDoc.select().byVisibleText(crearUsuarioData.get(0).getTipodoc());
        Documento.sendKeys(String.valueOf(crearUsuarioData.get(0).getNrodoc()));
        btnGuardar.click();

    }

    public void usuarioCreadoExitoso(String msg) {
        MatcherAssert.assertThat(msg,containsText(mensaje.getText()));
    }
}
