import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToysDealsTest extends BaseClass{
    ToysDeals toysDeals;
    @BeforeMethod
    void openBrowser() {
        setup("https://www.costco.com/toys.html?keyword=OFF&sortBy=item_page_views+desc");
        toysDeals = PageFactory.initElements(BaseClass.driver, ToysDeals.class);}

    @AfterMethod
    void closeBrowser() {
        driver.close();
    }

    @Test
    void perform82(){ toysDeals.Case82();
        String actualurl82 = BaseClass.driver.getCurrentUrl();
        String expectedurl82 = "https://www.costco.com/pokémon-halloween-trick-or-trade-booster-packs%2c-120-count.product.4000181428.html";
        Assert.assertEquals(actualurl82,expectedurl82);}



}
