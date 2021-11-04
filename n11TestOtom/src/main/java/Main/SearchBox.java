package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void searchBoxMethod() throws InterruptedException {
        Thread.sleep(1000);
        clickTo(By.id("searchData"));
        sendKeys(By.id("searchData") , "bilgisayar");
        logger.info("Arama Çubuğuna bilgisayar Yazıldı");
        clickTo(By.cssSelector("span[class='icon iconSearch']"));


    }
}
