import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import static java.time.temporal.ChronoUnit.SECONDS;

public class GiftcardDeals {

    @FindBy(xpath = "//div[@class=\"row swatches-v2\"]/div/span[2]/button/label")
    WebElement OOSbutton;
    @FindBy(xpath = "//select[@name=\"sortBy\"]")
    WebElement Sortby;
    @FindBy(xpath = "//div[@class=\"product-list grid\"]/div[1]/div")
    WebElement Testfirstgiftcarddeal;
    @FindBy(xpath = "//div[@id=\"accordion-filter_collapse-2\"]/div/div[2]/a[1]")
    WebElement Restaurantsubcat;
    @FindBy(xpath = "//div[@class=\"product-quick-buy\"][1]/div/div[2]/button[1]")
    WebElement addfirstdeal;

    void Case67() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(OOSbutton)).isSelected();
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(OOSbutton).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname2 = new Select(Sortby);
        objname2.selectByIndex(1);
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Testfirstgiftcarddeal)).click(); }
    void Case73(){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Restaurantsubcat)).click();
    }
    @FindBy(xpath = "//div[@class=\"buttonSection\"]/div/div/form/div/div/div/div[2]/div[1]")
    WebElement addoneverify;
    void Case74(){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(OOSbutton)).isSelected();
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(OOSbutton).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname2 = new Select(Sortby);
        objname2.selectByVisibleText("Most Viewed");
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Testfirstgiftcarddeal)).isDisplayed();
        addfirstdeal.click();
    }

    @FindBy(xpath = "//label[@title=\"Delivery\"]/span[2]")
    WebElement products99count;
    @FindBy(xpath = "//div[@class=\"col-xs-6 col-lg-4 col-xl-3 product\"]")
    List<WebElement> DealsProducts;
    void Case99() {
        String deliverycount = products99count.getText();
        int actualcount = DealsProducts.size();
        if (deliverycount.equals(String.valueOf(actualcount))) {
            System.out.println("True");}
    }





}