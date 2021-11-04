package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void basketPageMethod() throws InterruptedException {

        Thread.sleep(1500);
        clickTo(By.xpath("//*[@id='userKvkkModal']/div/span[1]"));
        clickTo(By.cssSelector("span[class='spinnerUp spinnerArrow']"));
        Thread.sleep(1500);
        assertTotal("Toplam 2 ürün" , By.cssSelector("div[class='dtl header']"));
        logger.info("Adet Kontrol Edildi");
        clickTo(By.cssSelector("span[class='removeProd svgIcon svgIcon_trash']"));

    }
}
