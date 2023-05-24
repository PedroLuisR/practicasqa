package com.haceb.steps;
import com.haceb.pageObject.RegistroPageObject;
import net.thucydides.core.annotations.Step;


public class CarritoSteps {
    CarritoPageObject carrito = new CarritoPageObject();
    @Step("abrir la URL")
    public void abrirNavegador() {
        carrito.open();
    }
    @Step("dar click en la categoria de neveras")
    public void categoria(){

        carrito.getDriver().findElement(carrito.getBtnCategoria()).click();
    }
    @Step("seleccionar nevera")
    public void nevera(){
        carrito.getDriver().findElement(carrito.getBtnNevera()).click();
    }
}
