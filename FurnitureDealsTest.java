import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FurnitureDealsTest extends BaseClass{
    FurnitureDeals furnitureDeals;
    @BeforeMethod
    void openBrowser() {
        setup("https://www.costco.com/furniture.html?keyword=OFF&sortBy=item_page_views+desc");
        furnitureDeals = PageFactory.initElements(BaseClass.driver, FurnitureDeals.class);}

    @AfterMethod
    void closeBrowser() {
        driver.close();
    }


    @Test
    void perform100(){ furnitureDeals.Case100();
       String actualname100 = furnitureDeals.ProductHeadingName.getText();
       String expectedname100 = "Tresanti Geller 47” Adjustable Height Desk";
        Assert.assertEquals(actualname100,expectedname100); }

    @Test
    void perform76(){ furnitureDeals.Case76();
        String actualurl76 = BaseClass.driver.getCurrentUrl();
        String expectedurl76 = "https://www.costco.com/luna-72%22-quartz-dining-table.product.4000202432.html";
        Assert.assertEquals(actualurl76,expectedurl76);
    }



}
