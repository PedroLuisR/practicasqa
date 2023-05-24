package com.haceb.steps;
import com.haceb.pageObject.RegistroPageObject;
import net.thucydides.core.annotations.Step;

public class RegistroSteps {
    RegistroPageObject registro= new RegistroPageObject();
    @Step("abrir la URL")
    public void abrirNavegador(){
        registro.open();
    }
    @Step("ingresar correo")
    public void correo(){
        registro.getDriver().findElement(registro.getTxtCorreo()).sendKeys("pedrowowlatim@gmail.com");
    }
    @Step("ingresar nombre")
    public void nombre(){
        registro.getDriver().findElement(registro.getTxtNombre()).sendKeys("admin");
    }
    @Step("ingresar apellido")
    public void apellido(){
        registro.getDriver().findElement(registro.getTxtApellido()).sendKeys("admin");
    }
    @Step("ingresar clave")
    public void clave(){
        registro.getDriver().findElement(registro.getTxtClave()).sendKeys("admin");
    }
    @Step("confirmar clave")
    public void claveconf(){
        registro.getDriver().findElement(registro.getTxtClaveconf())
                .sendKeys("admin");
    }
    @Step("dar click en el boton registrate")
    public void registrar(){
        registro.getDriver().findElement(registro.getBtnRegistrar()).click();
    }
    @Step("dar click en el boton autorizo")
    public void autorizar(){
        registro.getDriver().findElement(registro.getBtnAutoriza()).click();
    }
    @Step("dar click en el boton aceptar condicion")
    public void condicion(){
        registro.getDriver().findElement(registro.getBtnCondicion()).click();
    }
    @Step("dar click en el boton ingresar")
    public void ingresar(){
        registro.getDriver().findElement(registro.getBtnIngresarH()).click();
    }
    @Step("dar click en el boton registrar")
    public void registrofin(){
        registro.getDriver().findElement(registro.getBtnregistrofin()).click();
    }
    @Step("dar click en el boton perfil")
    public void perfil(){
        registro.getDriver().findElement(registro.getBtnperfil()).click();
    }
}
