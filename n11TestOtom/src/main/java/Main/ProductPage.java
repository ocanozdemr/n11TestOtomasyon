package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void productPageMethod() throws InterruptedException {

        String costOne = priceTwo(By.xpath("//*[@id='unf-p-id']/div/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/ins"));
        clickTo(By.cssSelector("span[class='icon-white-basket']"));
        logger.info("Sepete Ekledi");
        Thread.sleep(1500);
        clickTo(By.cssSelector("i[class='icon iconBasket']"));
        String costTwo = priceOne(By.cssSelector("div[class='priceArea']"));
        System.out.println("Ürün Fiyatı = " + costOne);
        System.out.println("Sepet Fiyatı = " + costTwo);
        assertPrice(costOne , costTwo);
        System.out.println("Ürün sayfasındaki fiyat ile Sepetteki fiyat aynı");
        logger.info("Ürün Sepete Eklendi");
        Thread.sleep(1000);

    }
}
