import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FurnitureDeals {

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[7]/a[1]")
    WebElement Officefurnituresubcat;
    @FindBy(xpath = "//div[@id=\"accordion-filter_collapse-2\"]/div/div[5]/a[1]")
    WebElement Kitchenfurnituresubcat;
    @FindBy(xpath = "//div[@id=\"accordion-filter_collapse-2\"]/div/div[6]/a")
    WebElement Kitchendiningtablecat;
    @FindBy(xpath = "//label[@for=\"refinement_1-1\"]/span[1]")
    WebElement Officepricefilter;
    @FindBy(xpath = "//label[@for=\"refinement_5-1\"]/span[2]")
    WebElement Officecustomerreview4;
    @FindBy(xpath = "//div[@class=\"product-list grid\"]/div[1]/div")
    WebElement Testfirstdeal;

    @FindBy(xpath = "//div[@class=\"product-h1-container-v2 visible-lg-block visible-xl-block\"]/h1")
    WebElement ProductHeadingName;

    void Case100() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Officefurnituresubcat)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Officepricefilter)).click();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Officecustomerreview4)).click();
        WebDriverWait wait4 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait4.until(ExpectedConditions.visibilityOf(Testfirstdeal)).click();
    }

    void Case76(){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Kitchenfurnituresubcat)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Kitchendiningtablecat)).click();
        WebDriverWait wait4 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait4.until(ExpectedConditions.visibilityOf(Testfirstdeal)).click();


    }


}