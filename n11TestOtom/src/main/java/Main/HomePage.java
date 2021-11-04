package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void homePageMethod(){

        logger.info("--------TEST BASLADİ--------");
        assertCont("https://www.n11.com/");
        logger.info("Anasayfa Acildi");
        clickTo(By.xpath("//*[@id='dengage-push-perm-slide']/div/div[2]/div/button[2]"));
        clickTo(By.xpath("//*[@id='cookieUsagePopIn']/span"));


    }
}
