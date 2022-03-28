package org.example.test;

import org.example.driver.BaseTest;
import org.example.page.LoginPage;
import org.example.page.ProductPase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.jar.Attributes;
import java.util.logging.Logger;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        LoginPage loginPage =new LoginPage();
        ProductPase productPase = new ProductPase();

        loginPage.login();
        productPase.selectProduct();


    }
@Test
    public void getAttributeTest(){
    ProductPase productPase =new ProductPase();
    productPase.attributeTest();
}
@Test
    public void getTextTest(){
        LoginPage loginPage =new LoginPage();

        ProductPase productPase = new ProductPase();
        loginPage.login();
        productPase.textControl();
}





}

