import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.annotation.Repeatable;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class AllDealspageTest extends BaseClass {
    AllDealspage allDealspage;

    @BeforeMethod
    void openBrowser() {
        setup("https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_page_views+desc");
        allDealspage = PageFactory.initElements(BaseClass.driver, AllDealspage.class);
    }

    @AfterMethod
    void closeBrowser() {
        driver.close();
    }

    @Test
    void perform3() {
        allDealspage.Case3();
        String url3 = BaseClass.driver.getCurrentUrl();
        String expected3 = "https://www.costco.com/appliances.html?keyword=Price&sortBy=item_page_views+desc";
        Assert.assertEquals(url3, expected3);
    }

    @Test
    void perform4() {
        allDealspage.Case4();
        String url4 = BaseClass.driver.getCurrentUrl();
        String expected4 = "https://www.costco.com/baby-kids.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url4, expected4);
    }

    @Test
    void perform5() {
        allDealspage.Case5();
        String url5 = BaseClass.driver.getCurrentUrl();
        String expected5 = "https://www.costco.com/beauty.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url5, expected5);
    }

    @Test
    void perform6() {
        allDealspage.Case6();
        String url6 = BaseClass.driver.getCurrentUrl();
        String expected6 = "https://www.costco.com/clothing.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url6, expected6);
    }

    @Test
    void perform7() {
        allDealspage.Case7();
        String url7 = BaseClass.driver.getCurrentUrl();
        String expected7 = "https://www.costco.com/computers.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url7, expected7);
    }

    @Test
    void perform8() {
        allDealspage.Case8();
        String url8 = BaseClass.driver.getCurrentUrl();
        String expected8 = "https://www.costco.com/electronics.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url8, expected8);
    }

    @Test
    void perform9() {
        allDealspage.Case9();
        String url9 = BaseClass.driver.getCurrentUrl();
        String expected9 = "https://www.costco.com/televisions.html?keyword=Valid";
        Assert.assertEquals(url9, expected9);
    }

    @Test
    void perform10() {
        allDealspage.Case10();
        String url10 = BaseClass.driver.getCurrentUrl();
        String expected10 = "https://www.costco.com/holiday-gifts.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url10, expected10);
    }

    @Test
    void perform11() {
        allDealspage.Case11();
        String url11 = BaseClass.driver.getCurrentUrl();
        String expected11 = "https://www.costco.com/furniture.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url11, expected11);
    }

    @Test
    void perform12() {
        allDealspage.Case12();
        String url12 = BaseClass.driver.getCurrentUrl();
        String expected12 = "https://www.costco.com/gift-cards-tickets.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url12, expected12);
    }

    @Test
    void perform13() {
        allDealspage.Case13();
        String url13 = BaseClass.driver.getCurrentUrl();
        String expected13 = "https://www.costco.com/grocery-household.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url13, expected13);
    }

    @Test
    void perform14() {
        allDealspage.Case14();
        String url14 = BaseClass.driver.getCurrentUrl();
        String expected14 = "https://www.costco.com/health-beauty.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url14, expected14);
    }

    @Test
    void perform15() {
        allDealspage.Case15();
        String url15 = BaseClass.driver.getCurrentUrl();
        String expected15 = "https://www.costco.com/installed-products.html";
        Assert.assertEquals(url15, expected15);
    }

    @Test
    void perform16() {
        allDealspage.Case16();
        String url16 = BaseClass.driver.getCurrentUrl();
        String expected16 = "https://www.costco.com/home-and-decor.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url16, expected16);
    }

    @Test
    void perform17() {
        allDealspage.Case17();
        String url17 = BaseClass.driver.getCurrentUrl();
        String expected17 = "https://www.costco.com/hardware.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url17, expected17);
    }

    @Test
    void perform18() {
        allDealspage.Case18();
        String url18 = BaseClass.driver.getCurrentUrl();
        String expected18 = "https://www.costco.com/jewelry.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url18, expected18);
    }

    @Test
    void perform19() {
        allDealspage.Case19();
        String url19 = BaseClass.driver.getCurrentUrl();
        String expected19 = "https://www.costco.com/mattresses.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url19, expected19);
    }

    @Test
    void perform20() {
        allDealspage.Case20();
        String url20 = BaseClass.driver.getCurrentUrl();
        String expected20 = "https://www.costco.com/office-products.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url20, expected20);
    }

    @Test
    void perform21() {
        allDealspage.Case21();
        String url21 = BaseClass.driver.getCurrentUrl();
        String expected21 = "https://www.costco.com/patio-lawn-garden.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url21, expected21);
    }

    @Test
    void perform22() {
        allDealspage.Case22();
        String url22 = BaseClass.driver.getCurrentUrl();
        String expected22 = "https://www.costco.com/sports-fitness.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url22, expected22);
    }

    @Test
    void perform23() {
        allDealspage.Case23();
        String url23 = BaseClass.driver.getCurrentUrl();
        String expected23 = "https://www.costco.com/auto-tires.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url23, expected23);
    }

    @Test
    void perform24() {
        allDealspage.Case24();
        String url24 = BaseClass.driver.getCurrentUrl();
        String expected24 = "https://www.costco.com/toys.html?keyword=OFF&sortBy=item_page_views+desc";
        Assert.assertEquals(url24, expected24);
    }

    @Test
    void perform25() {
        allDealspage.Case25();
        String url25 = BaseClass.driver.getCurrentUrl();
        String expected25 = "https://www.costco.com/furniture.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url25, expected25);
    }

    @Test
    void perform26() {
        allDealspage.Case26();
        String url26 = BaseClass.driver.getCurrentUrl();
        String expected26 = "https://www.costco.com/hardware.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url26, expected26);
    }

    @Test
    void perform27() {
        allDealspage.Case27();
        String url27 = BaseClass.driver.getCurrentUrl();
        String expected27 = "https://www.costco.com/home-and-decor.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url27, expected27);
    }

    @Test
    void perform28() {
        allDealspage.Case28();
        String url28 = BaseClass.driver.getCurrentUrl();
        String expected28 = "https://www.costco.com/appliances.html?keyword=Price&refine=%7C%7Citem_program_eligibility-ShipIt%7C%7Citem_location_availability-in%2Bstock&deliveryFacetFlag=false&sortBy=item_page_views+desc";
        Assert.assertEquals(url28, expected28);
    }

    @Test
    void perform29() {
        allDealspage.Case29();
        String url29 = BaseClass.driver.getCurrentUrl();
        String expected29 = "https://www.costco.com/patio-lawn-garden.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url29, expected29);
    }

    @Test
    void perform30() {
        allDealspage.Case30();
        String url30 = BaseClass.driver.getCurrentUrl();
        String expected30 = "https://www.costco.com/grocery-household.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url30, expected30);
    }

    @Test
    void perform31() {
        allDealspage.Case31();
        String url31 = BaseClass.driver.getCurrentUrl();
        String expected31 = "https://www.costco.com/health-beauty.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url31, expected31);
    }

    @Test
    void perform32() {
        allDealspage.Case32();
        String url32 = BaseClass.driver.getCurrentUrl();
        String expected32 = "https://www.costco.com/computers.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url32, expected32);
    }

    @Test
    void perform33() {
        allDealspage.Case33();
        String url33 = BaseClass.driver.getCurrentUrl();
        String expected33 = "https://www.costco.com/electronics.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url33, expected33);
    }

    @Test
    void perform34() {
        allDealspage.Case34();
        String url34 = BaseClass.driver.getCurrentUrl();
        String expected34 = "https://www.costco.com/clothing.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url34, expected34);
    }

    @Test
    void perform35() {
        allDealspage.Case35();
        String url35 = BaseClass.driver.getCurrentUrl();
        String expected35 = "https://www.costco.com/mattresses.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url35, expected35);
    }

    @Test
    void perform36() {
        allDealspage.Case36();
        String url36 = BaseClass.driver.getCurrentUrl();
        String expected36 = "https://www.costco.com/sports-fitness.html?keyword=OFF&dept=All&sortBy=item_page_views+desc";
        Assert.assertEquals(url36, expected36);
    }

    @Test
    void perform37() {
        allDealspage.Case37();
        String url37 = BaseClass.driver.getCurrentUrl();
        String expected37 = "https://www.costco.com/appliances.html?keyword=OFF";
        Assert.assertEquals(url37, expected37);
    }

    @Test
    void perform38() {
        allDealspage.Case38();
        String url38 = BaseClass.driver.getCurrentUrl();
        String expected38 = "https://www.costco.com/baby-kids.html?keyword=OFF";
        Assert.assertEquals(url38, expected38);
    }

    @Test
    void perform39() {
        allDealspage.Case39();
        String url39 = BaseClass.driver.getCurrentUrl();
        String expected39 = "https://www.costco.com/beauty.html?keyword=OFF";
        Assert.assertEquals(url39, expected39);
    }

    @Test
    void perform40() {
        allDealspage.Case40();
        String url40 = BaseClass.driver.getCurrentUrl();
        String expected40 = "https://www.costco.com/clothing.html?keyword=OFF";
        Assert.assertEquals(url40, expected40);
    }

    @Test
    void perform41() {
        allDealspage.Case41();
        String url41 = BaseClass.driver.getCurrentUrl();
        String expected41 = "https://www.costco.com/computers.html?keyword=OFF";
        Assert.assertEquals(url41, expected41);
    }

    @Test
    void perform42() {
        allDealspage.Case42();
        String url42 = BaseClass.driver.getCurrentUrl();
        String expected42 = "https://www.costco.com/electronics.html?keyword=OFF";
        Assert.assertEquals(url42, expected42);
    }

    @Test
    void perform43() {
        allDealspage.Case43();
        String url43 = BaseClass.driver.getCurrentUrl();
        String expected43 = "https://www.costco.com/holiday-gifts.html?keyword=OFF";
        Assert.assertEquals(url43, expected43);
    }

    @Test
    void perform44() {
        allDealspage.Case44();
        String url44 = BaseClass.driver.getCurrentUrl();
        String expected44 = "https://www.costco.com/furniture.html?keyword=OFF";
        Assert.assertEquals(url44, expected44);
    }

    @Test
    void perform45() {
        allDealspage.Case45();
        String url45 = BaseClass.driver.getCurrentUrl();
        String expected45 = "https://www.costco.com/gift-cards-tickets.html?keyword=OFF";
        Assert.assertEquals(url45, expected45);
    }

    @Test
    void perform46() {
        allDealspage.Case46();
        String url46 = BaseClass.driver.getCurrentUrl();
        String expected46 = "https://www.costco.com/grocery-household.html?keyword=OFF";
        Assert.assertEquals(url46, expected46);
    }

    @Test
    void perform47() {
        allDealspage.Case47();
        String url47 = BaseClass.driver.getCurrentUrl();
        String expected47 = "https://www.costco.com/health-beauty.html?keyword=OFF";
        Assert.assertEquals(url47, expected47);
    }

    @Test
    void perform48() {
        allDealspage.Case48();
        String url48 = BaseClass.driver.getCurrentUrl();
        String expected48 = "https://www.costco.com/seasonal.html?keyword=OFF";
        Assert.assertEquals(url48, expected48);
    }

    @Test
    void perform49() {
        allDealspage.Case49();
        String url49 = BaseClass.driver.getCurrentUrl();
        String expected49 = "https://www.costco.com/home-and-decor.html?keyword=OFF";
        Assert.assertEquals(url49, expected49);
    }

    @Test
    void perform50() {
        allDealspage.Case50();
        String url50 = BaseClass.driver.getCurrentUrl();
        String expected50 = "https://www.costco.com/hardware.html?keyword=OFF";
        Assert.assertEquals(url50, expected50);
    }

    @Test
    void perform51() {
        allDealspage.Case51();
        String url51 = BaseClass.driver.getCurrentUrl();
        String expected51 = "https://www.costco.com/jewelry.html?keyword=OFF";
        Assert.assertEquals(url51, expected51);
    }

    @Test
    void perform52() {
        allDealspage.Case52();
        String url52 = BaseClass.driver.getCurrentUrl();
        String expected52 = "https://www.costco.com/mattresses.html?keyword=OFF";
        Assert.assertEquals(url52, expected52);
    }

    @Test
    void perform53() {
        allDealspage.Case53();
        String url53 = BaseClass.driver.getCurrentUrl();
        String expected53 = "https://www.costco.com/office-products.html?keyword=OFF";
        Assert.assertEquals(url53, expected53);
    }

    @Test
    void perform54() {
        allDealspage.Case54();
        String url54 = BaseClass.driver.getCurrentUrl();
        String expected54 = "https://www.costco.com/patio-lawn-garden.html?keyword=OFF";
        Assert.assertEquals(url54, expected54);
    }

    @Test
    void perform55() {
        allDealspage.Case55();
        String url55 = BaseClass.driver.getCurrentUrl();
        String expected55 = "https://www.costco.com/sports-fitness.html?keyword=OFF";
        Assert.assertEquals(url55, expected55);
    }

    @Test
    void perform56() {
        allDealspage.Case56();
        String url56 = BaseClass.driver.getCurrentUrl();
        String expected56 = "https://www.costco.com/auto-tires.html?keyword=OFF";
        Assert.assertEquals(url56, expected56);
    }

    @Test
    void perform57() {
        allDealspage.Case57();
        String url57 = BaseClass.driver.getCurrentUrl();
        String expected57 = "https://www.costco.com/toys.html?keyword=OFF";
        Assert.assertEquals(url57, expected57);
    }

    @Test
    void perform58() {
        allDealspage.Case58();
    }

    @Test
    void perform59() {
        allDealspage.Case59();
        String url59 = BaseClass.driver.getCurrentUrl();
        String expected59 = "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&hide-unavailable-items=in-stock&deliveryFacetFlag=true&refine=||item_program_eligibility-ShipIt||item_location_availability-in%2Bstock&sortBy=item_page_views+desc";
        Assert.assertEquals(url59, expected59);
    }

    @Test
    void perform60() {
        allDealspage.Case60();
        String url60 = BaseClass.driver.getCurrentUrl();
        String expected60 = "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=score+desc";
        Assert.assertEquals(url60, expected60);
    }

    @Test
    void perform61() {
        allDealspage.Case61();
        String url61 = BaseClass.driver.getCurrentUrl();
        String expected61 = "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_location_pricing_salePrice+desc";
        Assert.assertEquals(url61, expected61);
    }

    @Test
    void perform62() {
        allDealspage.Case62();
        String url62 = BaseClass.driver.getCurrentUrl();
        String expected62 = "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_location_pricing_salePrice+asc";
        Assert.assertEquals(url62, expected62);
    }

    @Test
    void perform63() {
        allDealspage.Case63();
        String url63 = BaseClass.driver.getCurrentUrl();
        String expected63 = "https://www.costco.com/clothing.html?keyword=OFF&sortBy=item_ratings+desc";
        Assert.assertEquals(url63, expected63);
    }

    @Test
    void perform64() {
        allDealspage.Case64();
        String url64 = BaseClass.driver.getCurrentUrl();
        String expected64 = "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_startDate+desc";
        Assert.assertEquals(url64, expected64);
    }

    @Test
    void perform65() {
        allDealspage.Case65();
        String text65 = allDealspage.Deliverylocationbutton.getText();
        String expected65 = "11427";
        Assert.assertEquals(text65, expected65);
    }

    @Test
    void perform66() {
        allDealspage.Case66();
    }


    @Test
    void perform68() {
        allDealspage.Case68();}
    @Test
    void perform69() {
        allDealspage.Case69();}
    @Test
    void perform70() {
        allDealspage.Case70();
        String case70text = allDealspage.quantityerror.getText();
        String expected70 = "Quantity must be 1 or more to add to cart.";
        Assert.assertEquals(case70text, expected70); }
    @Test
    void perform71() {
        allDealspage.Case71();
        Boolean verify71 = allDealspage.addoneverify.isDisplayed();
    }
    @Test
    void perform72() {
        allDealspage.Case72();
        Boolean verify72 = allDealspage.gamingsubcatverify.isDisplayed();

    }





}