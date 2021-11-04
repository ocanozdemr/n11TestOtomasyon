package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** N11.com sitesi login işlemini bildiğim tüm yöntemleri kullanarak denedim fakat hiçbir sonuç alamadım
* internette yaptığım araştırmalar doğrultusunda n11.com login işlemlerinde otomasyon önleyici kullandığını
* çeşitli yerlerde gördüm.O yüzden login işlemini yorum satırı içerisine alıyorum.Eğer ileride bu önleyici
* kalkarsa tüm yorum satırları kaldırılarsa test koşulabilir. **/

public class LoginPage extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginPageMethod() throws InterruptedException {

        clickTo(By.cssSelector("a[class='btnSignIn']"));
        scrollDown();
        assertCont("https://www.n11.com/giris-yap");
        sendKeys(By.id("email") , "ocanozdemr@icloud.com");
        sendKeys(By.id("password") , "onurcan15923");
        clickTo(By.cssSelector("div[class='showPass']"));
        logger.info("eMail ve Sifre Girildi");
        Thread.sleep(2000);
        clickTo(By.cssSelector("div[class='green_flat']"));



    }
}
