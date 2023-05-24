package com.haceb.stepDefinitions;

import com.haceb.steps.RegistroSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinition {
    @Steps
    RegistroSteps registroSteps;

    @Dado("^que el usuario abra el navegador en la URL$")
    public void queElUsuarioAbraElNavegadorEnLaURL() {
    registroSteps.abrirNavegador();
    }


    @Dado("^se pose sobre la opcion perfil$")
    public void sePoseSobreLaOpcionPerfil() {
    registroSteps.perfil();
    }

    @Dado("^de click en el boton Registrar$")
    public void deClickEnElBotonRegistrar() {
    registroSteps.registrar();
    }

    @Dado("^de click en la opcion ingresar a HACEB$")
    public void deClickEnLaOpcionIngresarAHACEB() {
    registroSteps.ingresar();
    }

    @Dado("^se debe llenar los campos$")
    public void seDebeLlenarLosCampos() {
    registroSteps.correo();
    registroSteps.nombre();
    registroSteps.apellido();
    registroSteps.clave();
    registroSteps.clave();
    }

    @Dado("^seleccionar el campo de terminos y condiciones$")
    public void seleccionarElCampoDeTerminosYCondiciones() {
    registroSteps.condicion();
    }

    @Dado("^seleccionar el campo de autorizacion de datos$")
    public void seleccionarElCampoDeAutorizacionDeDatos() {
    registroSteps.autorizar();
    }

    @Dado("^dar click en registrarme$")
    public void darClickEnRegistrarme() {
        registroSteps.registrofin();
    }

    @Cuando("^puede visualizar la pestaña de perfil$")
    public void puedeVisualizarLaPestañaDePerfil() {

    }
}
