package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    String url="https://www.levelset.com/";
    String getPaidX="//a[contains(text(),'Get paid')]";
    By getPaid= By.xpath(getPaidX);
    WebDriver driver;
    public HomePage(WebDriver driver){this.driver=driver;}
    public void OpenHomePage(){driver.get(url);}
    public String assertPage(){
        String assertP= driver.findElement(getPaid).getText();
        return assertP;
    }
    public void ClickOnPaid(){
       // driver.findElement(getPaid).click();
        //Duration timeout = Duration.ofSeconds(10); // 10 seconds timeout
       // WebDriverWait wait = new WebDriverWait(driver, timeout);
       // wait.until(ExpectedConditions.elementToBeClickable(getPaid)).click();
        WebElement paidElement = driver.findElement(getPaid);
        Actions actions = new Actions(driver);
        actions.doubleClick(paidElement).perform();

    }

}
