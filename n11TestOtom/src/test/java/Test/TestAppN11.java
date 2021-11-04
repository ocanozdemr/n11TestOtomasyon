package Test;

import Main.*;
import org.jsoup.Connection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class TestAppN11 extends BaseTest {
HomePage homePage;
LoginPage loginPage;
SearchBox searchBox;
ProductPage productPage;
BasketPage basketPage;
GoToSecondPage goToSecondPage;
ProductDeletion productDeletion;

    @Test
    public void TestApp() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.homePageMethod();
    /*  loginPage = new LoginPage(driver);
        loginPage.loginPageMethod();  */
        searchBox = new SearchBox(driver);
        searchBox.searchBoxMethod();
        goToSecondPage = new GoToSecondPage(driver);
        goToSecondPage.secondPage();
        productPage = new ProductPage(driver);
        productPage.productPageMethod();
        basketPage = new BasketPage(driver);
        basketPage.basketPageMethod();
        productDeletion = new ProductDeletion(driver);
        productDeletion.deletionPage();




    }
}
