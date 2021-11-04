package Main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver , 30);

    }
    public WebElement findTo(By locator){
        return driver.findElement(locator);
    }

    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        findTo(locator).click();
    }
    public void sendKeys(By locator , String text){
        findTo(locator).sendKeys(text);
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5500)");
    }
    public void scrollDownOne(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
    }
    public List<WebElement> findToAll(By locator){
        return driver.findElements(locator);
    }

    public void randomSelect(By locator){
        Random rand = new Random();
        findToAll(locator).get(rand.nextInt(findToAll(locator).size())).click();
    }
    public void assertCont(String url){
        Assert.assertEquals(url , driver.getCurrentUrl());
    }

    public void assertTotal(String text ,By locator) {
        Assert.assertEquals(text , findToText(locator));
    }

    public String findToText(By locator){
        return driver.findElement(locator).getText();
    }

    public String priceOne(By locator){
       return driver.findElement(locator).getText();
    }

    public String priceTwo(By locator){
        return driver.findElement(locator).getText();
    }

    public void assertPrice(String text , String text2){
        Assert.assertEquals(text , text2);
    }



}
