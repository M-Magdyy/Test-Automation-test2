package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Document {
    String selDoc="File a Lien";
    String itemX="//div[contains(@class,'panel-heading')]/div[@class='left' and contains(text(),'%s')]";
    String itemName=String.format(itemX,selDoc);
    String priceX="//div[@class='left' and contains(text(),'%s')]/parent::div/div[contains(@class,'right')]/span[@class='price-amount']";
    String price=String.format(priceX,selDoc);
    WebDriver driver;
    public Document(WebDriver driver) {
        this.driver = driver;
    }
    public String retSelDoc(){
        return selDoc;
    }
    public String assertSecPage(){
        String assertP= driver.findElement(By.xpath(itemName)).getText();
        return assertP;
    }
    public String docPrice(){
        //driver.findElement(By.xpath(itemName)).click();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(itemName))).click();
        String getP = driver.findElement(By.xpath(price)).getText();
        System.out.println(getP);
        return getP;



    }
}
