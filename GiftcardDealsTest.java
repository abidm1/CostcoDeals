import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftcardDealsTest extends BaseClass {
    GiftcardDeals giftcardDeals;

    @BeforeMethod
    void openBrowser() {
        setup("https://www.costco.com/gift-cards-tickets.html?keyword=OFF");
        giftcardDeals = PageFactory.initElements(BaseClass.driver, GiftcardDeals.class);
    }

    @AfterMethod
    void closeBrowser() {
        driver.close();
    }

    @Test
    void Perform67() {
        giftcardDeals.Case67();
    }

    @Test
    void Perform73() {giftcardDeals.Case73();
        String currenturl73 = BaseClass.driver.getCurrentUrl();
        String expected73 = "https://www.costco.com/restaurant-gift-cards.html?keyword=OFF";
        Assert.assertEquals(currenturl73, expected73);
    }

    @Test
    void Perform74() {giftcardDeals.Case74();
    Boolean test74 = giftcardDeals.addoneverify.isDisplayed();
    }
@Test
    void Perform99(){ giftcardDeals.Case99();
    }



}


