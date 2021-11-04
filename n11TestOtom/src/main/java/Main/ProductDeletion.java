package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDeletion extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public ProductDeletion(WebDriver driver) {
        super(driver);
    }

    public void deletionPage() throws InterruptedException {

        logger.info("Ürün Sepetten Silindi");
        Thread.sleep(1500);
        assertTotal("Sepetiniz Boş" , By.xpath("//*[contains(text(),'Sepetiniz Boş')]"));
        logger.info("Sepet Boşaltıldı");
        logger.info("--------TEST BİTTİ--------");
    }
}
