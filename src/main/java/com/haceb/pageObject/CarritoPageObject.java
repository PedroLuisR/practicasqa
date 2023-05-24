package com.haceb.pageObject;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



@DefaultUrl("https://www.haceb.com/")
public class CarritoPageObject {
    By btnCategoria = By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a/div/div[1]");
    By btnNevera = By.xpath("/html/body/div[4]/div[6]/div[2]/div[1]/ul/li[1]/div/div[3]/a[1]/div/span");
    By btnCompra = By.xpath("/html/body/div[5]/div[3]/div[2]/div[1]/div[4]/div[7]/a");
    By btnCarrito =By.xpath("//span[@class='icon-cart']");
    public By BtnCategoria(){
        return btnCategoria;
    }
    public By getBtnNevera(){
        return btnNevera;
    }
    public By getBtnCompra(){
        return btnCompra;
    }
    public By getBtnCarrito(){
        return btnCarrito;
    }
}
