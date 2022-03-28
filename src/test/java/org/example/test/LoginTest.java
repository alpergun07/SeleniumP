package org.example.test;

import org.example.driver.BaseTest;
import org.example.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        LoginPage loginPAge = new LoginPage();
        loginPAge.login();

    }

}
