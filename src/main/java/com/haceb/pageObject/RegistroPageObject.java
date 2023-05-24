package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.haceb.com/")
public class RegistroPageObject extends PageObject {

    By btnIngresarH= By.id("vtexIdUI-custom-oaut");
    By btnRegistrar= By.xpath("//a[@class='cdc-fire cdc-register']");
    By txtCorreo= By.xpath("//*[@id=\"gigya-loginID-51216659851706440\"]");
    By txtNombre= By.xpath("//*[@id=\"gigya-textbox-72173553995486780\"]");
    By txtApellido= By.xpath("//*[@id=\"gigya-textbox-146410824335495100\"]");
    By txtClave= By.xpath("//*[@id=\"gigya-password-54061940132406190\"]");
    By txtClaveConf= By.xpath("//*[@id=\"gigya-password-142670944012194750\"]");
    By btnCondicion= By.id("gigya-register-form");
    By btnAutoriza= By.id("vtexIdUI-custom-oaut");
    By btnregistrofin= By.id("__gig_template_element_57_1684911423089");
    By btnperfil= By.xpath("/html/body/header/div[2]/div[6]/div[2]/a/p");

    public By getTxtCorreo(){
        return txtCorreo;
    }
    public By getTxtNombre(){
        return txtNombre;
    }
    public By getBtnIngresarH(){
        return btnIngresarH;
    }
    public By getBtnRegistrar(){
        return btnRegistrar;
    }
    public By getTxtApellido(){
        return txtApellido;
    }
    public By getTxtClave(){
        return txtClave;
    }
    public By getTxtClaveconf(){
        return txtClaveConf;
    }
    public By getBtnCondicion(){
        return btnCondicion;
    }
    public By getBtnAutoriza(){
        return btnAutoriza;
    }
    public By getBtnregistrofin(){
        return btnregistrofin;
    }
    public By getBtnperfil(){
        return btnperfil;
    }



}
