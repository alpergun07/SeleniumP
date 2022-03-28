package org.example.page;

import org.example.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoritePage {
    Methods methods;
    public FavoritePage(){
        methods = new Methods();

    }
    public void checkFavorite() {
        methods.scrollWithAction(By.xpath("(//*[@class='common-sprite'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.İsElementVisible(By.id("tag-0")));
        methods.click(By.xpath("//*[@class='logo-icon']"));

    }
}
