import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ElectronicsDeals {

    @FindBy(xpath = "//div[@id=\"accordion-filter_collapse-2\"]/div/div[8]/a[1]")
    WebElement Videogamessubcat;

    void Case77(){
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Videogamessubcat)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname2 = new Select(Sortby);
        objname2.selectByIndex(1);
        WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait1.until(ExpectedConditions.visibilityOf(firstdeal)).click();

    }

    @FindBy(xpath = "//div[@id=\"accordion-filter_collapse-2\"]/div/div[4]/a[1]")
    WebElement Cellphonesubcat;
    @FindBy(xpath = "//label[@automation-id=\"compareProductCheckbox_0\"]")
    WebElement comparefirstproduct;
    @FindBy(xpath = "//label[@automation-id=\"compareProductCheckbox_1\"]")
    WebElement comparesecondproduct;
    @FindBy(xpath = "//div[@id=\"compare-box-container\"]/div/div[3]/div/input[1]")
    WebElement comparebutton;
    void Case78(){
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Cellphonesubcat)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname2 = new Select(Sortby);
        objname2.selectByIndex(1);
        WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait1.until(ExpectedConditions.visibilityOf(firstdeal)).click();
    }

    void Case83(){
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Cellphonesubcat)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(comparefirstproduct)).click();
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(comparesecondproduct)).click();
        WebDriverWait wait4 = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait4.until(ExpectedConditions.visibilityOf(comparebutton)).click();
    }


    @FindBy(xpath = "//div[@id=\"accordion-filter_collapse-2\"]/div/div[5]/a[1]")
    WebElement Homesecuritysubcat;
    @FindBy(xpath = "//select[@name=\"sortBy\"]")
    WebElement Sortby;
    @FindBy(xpath = "//div[@class=\"product-list grid\"]/div[1]/div")
    WebElement firstdeal;
    void Case79(){
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Homesecuritysubcat)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname2 = new Select(Sortby);
        objname2.selectByIndex(1);
        WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait1.until(ExpectedConditions.visibilityOf(firstdeal)).click();
    }
    void Case80(){
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname2 = new Select(Sortby);
        objname2.selectByIndex(3);
        WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait1.until(ExpectedConditions.visibilityOf(firstdeal)).click();
    }



}
