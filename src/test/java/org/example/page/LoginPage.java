package org.example.page;

import org.example.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage() {
        methods = new Methods();

    }

    public void login() {
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-email"), "alperg257@gmail.com");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-password"), "040921Aa");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".ky-form-buttons>button"));
        methods.waitBySeconds(15);
        Assert.assertTrue(methods.İsElementVisible(By.cssSelector("h4[class='common-sprite']")));
        methods.waitBySeconds(2);

    }


}

