import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;


public class HomepageTest extends BaseClass {
    Homepage homepage;

    @BeforeMethod
    void openBrowser() {
        setup("https://www.costco.com/");
        homepage = PageFactory.initElements(BaseClass.driver, Homepage.class);}

    @AfterMethod
    void closeBrowser() {
        driver.close();
    }

    @Test
    void perform1() {
        homepage.Case1();
        String currentwindow = BaseClass.driver.getWindowHandle();
        Set<String> Windows = BaseClass.driver.getWindowHandles();
        for(String a: Windows){
            if (currentwindow != a){BaseClass.driver.switchTo().window(a);}
        }
        String url1 = BaseClass.driver.getCurrentUrl();
        String expected1 = "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All";
        Assert.assertEquals(url1,expected1);}

@Test
    void perform2(){
        homepage.Case2();
        String expectedurl2 = "https://www.costco.com/CatalogSearch?keyword=OFF&dept=All&sortBy=item_page_views+desc";
                String currenturl2= BaseClass.driver.getCurrentUrl();
        Assert.assertEquals(currenturl2,expectedurl2);}

}