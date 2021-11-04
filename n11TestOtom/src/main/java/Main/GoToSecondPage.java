package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToSecondPage extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public GoToSecondPage(WebDriver driver) {
        super(driver);
    }

    public void secondPage() throws InterruptedException {

        scrollDown();
        clickTo(By.xpath("//*[@id='contentListing']/div/div/div[2]/div[5]/a[2]"));
        assertCont("https://www.n11.com/arama?q=bilgisayar&pg=2");
        logger.info("2.Sayfaya Gidildi");
        randomSelect(By.cssSelector("h3[class='productName ']"));
        logger.info("Rastgele Bir Ürün Seçildi");
        Thread.sleep(1500);
        scrollDownOne();

    }
}
