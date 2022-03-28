package org.example.page;

import org.example.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.example.driver.BaseTest.driver;

public class Katolog {

    Methods methods;

    public Katolog() {
        methods = new Methods();
    }

    public void selectRanking() {
        methods.click(By.xpath("(//*[@class='common-sprite'])[10]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='landing-button'])[2]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='sort'])"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select/option[6]"));
    }

    public void selectRandom() {
        methods.click(By.xpath("(//*[@class='mn-strong common-sprite'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='mn-icon icon-angleRight'])[49]"));
        methods.waitBySeconds(2);
        random();
        methods.waitBySeconds(2);
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(2);
    }

    public void random() {
        Random random = new Random();
        List<WebElement> links = driver.findElements(By.cssSelector(".pr-img-link"));
        int value = links.size();
        links.get(random.nextInt(value)).click();
        methods.waitBySeconds(2);
    }
}