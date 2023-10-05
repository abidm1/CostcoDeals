import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElectronicsDealsTest extends BaseClass{
    ElectronicsDeals electronicsDeals;


    @BeforeMethod
    void openBrowser() {
        setup("https://www.costco.com/electronics.html?keyword=OFF&sortBy=item_page_views+desc");
        electronicsDeals = PageFactory.initElements(BaseClass.driver, ElectronicsDeals.class);}

    @AfterMethod
    void closeBrowser() {
        driver.close();
    }


    @Test
    void perform77(){ electronicsDeals.Case77();
        String actualurl77 = BaseClass.driver.getCurrentUrl();
        String expectedurl77 = "https://www.costco.com/xbox-series-x-forza-horizon-5-bundle-with-additional-controller.product.4000117720.html";
        Assert.assertEquals(actualurl77,expectedurl77);
    }
    @Test
    void perform78(){ electronicsDeals.Case78();
        String actualurl78 = BaseClass.driver.getCurrentUrl();
        String expectedurl78 = "hhttps://www.costco.com/belkin-3-in-1-wireless-charger-with-magsafe-charging-15w%2c-black.product.4000154369.html";
        Assert.assertEquals(actualurl78,expectedurl78);
    }
    @Test
    void perform79(){ electronicsDeals.Case79();
        String actualurl79 = BaseClass.driver.getCurrentUrl();
        String expectedurl79 = "https://www.costco.com/defender-sentinel-4k-ultra-hd-poe-wired-2tb-nvr-security-system-with-16-metal-cameras%2c-smart-human-detection%2c-color-night-vision-%2526-mobile-app.product.4000189583.html";
        Assert.assertEquals(actualurl79,expectedurl79);
    }
    @Test
    void perform80(){ electronicsDeals.Case80();
        String actualurl80 = BaseClass.driver.getCurrentUrl();
        String expectedurl80 = "https://www.costco.com/samsung-hw-s80cbza-3.1.2-channel-soundbar-with-dolby-atmos-and-dts-virtual%3a-x.product.4000195133.html";
        Assert.assertEquals(actualurl80,expectedurl80);
    }

@Test
    void perform83(){ electronicsDeals.Case83();
        String actualurl83 = BaseClass.driver.getCurrentUrl();
        Assert.assertTrue(actualurl83.contains("CompareProducts"));

}

}
