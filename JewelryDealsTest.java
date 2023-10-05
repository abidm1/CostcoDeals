import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JewelryDealsTest extends BaseClass{
    JewelryDeals jewelryDeals;

    @BeforeMethod
    void openBrowser() {
        setup("https://www.costco.com/jewelry.html?keyword=OFF&sortBy=item_page_views+desc");
        jewelryDeals = PageFactory.initElements(BaseClass.driver, JewelryDeals.class);}

    @AfterMethod
    void closeBrowser() {
        driver.close();
    }

    @Test
    void Perform75(){
        jewelryDeals.Case75();
        String actualurl75 = BaseClass.driver.getCurrentUrl();
        Assert.assertTrue(actualurl75.contains("earring"));
    }

    @Test
    void Perform81(){ jewelryDeals.Case81();}



}
