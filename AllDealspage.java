import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;

import static java.time.temporal.ChronoUnit.*;

public class AllDealspage {

    @FindBy(xpath = "//div[@class=\"nav-item\"][3]")
    WebElement Dealsbutton;
    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[1]/a[1]")
    WebElement Appliancedeptbutton;

    void Case3() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Appliancedeptbutton));
        actions.moveToElement(Appliancedeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[2]/a[1]")
    WebElement Babydeptbutton;

    void Case4() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Babydeptbutton));
        actions.moveToElement(Babydeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[3]/a[1]")
    WebElement Beautydeptbutton;

    void Case5() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Beautydeptbutton));
        actions.moveToElement(Beautydeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[4]/a[1]")
    WebElement Clothingdeptbutton;

    void Case6() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Clothingdeptbutton));
        actions.moveToElement(Clothingdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[5]/a[1]")
    WebElement Computersdeptbutton;

    void Case7() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Computersdeptbutton));
        actions.moveToElement(Computersdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[6]/a[1]")
    WebElement Electronicsdeptbutton;

    void Case8() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Electronicsdeptbutton));
        actions.moveToElement(Electronicsdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[7]/a[1]")
    WebElement Televisionsdeptbutton;

    void Case9() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Televisionsdeptbutton));
        actions.moveToElement(Televisionsdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[8]/a[1]")
    WebElement Holidaygiftsdeptbutton;

    void Case10() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Holidaygiftsdeptbutton));
        actions.moveToElement(Holidaygiftsdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[9]/a[1]")
    WebElement Furnituredeptbutton;

    void Case11() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Furnituredeptbutton));
        actions.moveToElement(Furnituredeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[10]/a[1]")
    WebElement Gifttixdeptbutton;

    void Case12() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Gifttixdeptbutton));
        actions.moveToElement(Gifttixdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[1]/ol/li[11]/a[1]")
    WebElement Grocerydeptbutton;

    void Case13() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Grocerydeptbutton));
        actions.moveToElement(Grocerydeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[1]/a[1]")
    WebElement Healthdeptbutton;

    void Case14() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Healthdeptbutton));
        actions.moveToElement(Healthdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[2]/a[1]")
    WebElement Homeinstallationbutton;

    void Case15() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Homeinstallationbutton));
        actions.moveToElement(Homeinstallationbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[3]/a[1]")
    WebElement Homekitchenbutton;

    void Case16() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Homekitchenbutton));
        actions.moveToElement(Homekitchenbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[4]/a[1]")
    WebElement Homeimprovebutton;

    void Case17() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Homeimprovebutton));
        actions.moveToElement(Homeimprovebutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[5]/a[1]")
    WebElement Jewelrydeptbutton;

    void Case18() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Jewelrydeptbutton));
        actions.moveToElement(Jewelrydeptbutton).click().perform();
    }


    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[6]/a[1]")
    WebElement Mattressesdeptbutton;

    void Case19() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Mattressesdeptbutton));
        actions.moveToElement(Mattressesdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[7]/a[1]")
    WebElement Officedeptbutton;

    void Case20() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Officedeptbutton));
        actions.moveToElement(Officedeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[8]/a[1]")
    WebElement Gardendeptbutton;

    void Case21() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Gardendeptbutton));
        actions.moveToElement(Gardendeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[9]/a[1]")
    WebElement Fitnessdeptbutton;

    void Case22() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Fitnessdeptbutton));
        actions.moveToElement(Fitnessdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[10]/a[1]")
    WebElement Autodeptbutton;

    void Case23() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Autodeptbutton));
        actions.moveToElement(Autodeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@id=\"Home_Ancillary_Popover_2-container\"]/div/div/div/div[2]/ol/li[11]/a[1]")
    WebElement Toybookdeptbutton;

    void Case24() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Dealsbutton));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbutton).build().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Toybookdeptbutton));
        actions.moveToElement(Toybookdeptbutton).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[1]/div")
    WebElement featuredcat1;

    void Case25() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat1));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat1).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[2]/div")
    WebElement featuredcat2;

    void Case26() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat2));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat2).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[3]/div")
    WebElement featuredcat3;

    void Case27() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat3));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat3).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[4]/div")
    WebElement featuredcat4;

    void Case28() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat4));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat4).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[5]/div")
    WebElement featuredcat5;

    void Case29() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat5));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat5).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[6]/div")
    WebElement featuredcat6;

    void Case30() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat6));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat6).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[7]/div")
    WebElement featuredcat7;

    void Case31() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat7));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat7).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[8]/div")
    WebElement featuredcat8;

    void Case32() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat8));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat8).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[9]/div")
    WebElement featuredcat9;

    void Case33() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat9));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat9).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[10]/div")
    WebElement featuredcat10;

    void Case34() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat10));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat10).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[11]/div")
    WebElement featuredcat11;

    void Case35() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat11));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat11).click().perform();
    }

    @FindBy(xpath = "//div[@class=\"row no-gutter \"]/a[12]/div")
    WebElement featuredcat12;

    void Case36() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(featuredcat12));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(featuredcat12).click().perform();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[1]/a/label[1]")
    WebElement Appliancesidebar;
    @FindBy(xpath = "//div[@class=\"style-check-v2 current selected\"]/a/span[3]")
    WebElement selecteddeptbutton;
    @FindBy(xpath = "//a[@onclick=\"COSTCO.Search.reveal_options.call(this);\"][1]")
    WebElement showmorebutton;

    void Case37() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Appliancesidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Appliancesidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[2]/a/label[1]")
    WebElement Babydeptsidebar;

    void Case38() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Babydeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Babydeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[3]/a/label[1]")
    WebElement Beautydeptsidebar;

    void Case39() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Beautydeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Beautydeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[4]/a/label[1]")
    WebElement Clothingdeptsidebar;

    void Case40() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Clothingdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Clothingdeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[5]/a/label[1]")
    WebElement Computersdeptsidebar;

    void Case41() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Computersdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Computersdeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[6]/a/label[1]")
    WebElement Electronicsdeptsidebar;

    void Case42() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Electronicsdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Electronicsdeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[7]/a/label[1]")
    WebElement Floralgiftdeptsidebar;

    void Case43() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Floralgiftdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Floralgiftdeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[8]/a/label[1]")
    WebElement Furnituredeptsidebar;

    void Case44() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Furnituredeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Furnituredeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[9]/a/label[1]")
    WebElement Giftcarddeptsidebar;

    void Case45() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Giftcarddeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Giftcarddeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[10]/a/label[1]")
    WebElement Grocerydeptsidebar;

    void Case46() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Grocerydeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Grocerydeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[11]/a/label[1]")
    WebElement Healthdeptsidebar;

    void Case47() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Healthdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Healthdeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[12]/a/label[1]")
    WebElement Holidaydeptsidebar;

    void Case48() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Holidaydeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Holidaydeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[13]/a/label[1]")
    WebElement Homekitchendeptsidebar;

    void Case49() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Homekitchendeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Homekitchendeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[14]/a/label[1]")
    WebElement Homeimprovedeptsidebar;

    void Case50() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Homeimprovedeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Homeimprovedeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[15]/a/label[1]")
    WebElement Jewelrydeptsidebar;

    void Case51() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Jewelrydeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Jewelrydeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[16]/a/label[1]")
    WebElement Mattressesdeptsidebar;

    void Case52() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Mattressesdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Mattressesdeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[17]/a/label[1]")
    WebElement Officedeptsidebar;

    void Case53() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Officedeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Officedeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[18]/a/label[1]")
    WebElement Gardendeptsidebar;

    void Case54() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Gardendeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Gardendeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[19]/a/label[1]")
    WebElement Fitnessdeptsidebar;

    void Case55() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Fitnessdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Fitnessdeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[20]/a/label[1]")
    WebElement Tiresdeptsidebar;

    void Case56() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Tiresdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Tiresdeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[21]/a/label[1]")
    WebElement Toysbooksdeptsidebar;

    void Case57() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Toysbooksdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Toysbooksdeptsidebar).click().perform();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
    }

    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[1]/a/label[1]/span[1] ")
    WebElement Appliancedeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[2]/a/label[1]/span[1] ")
    WebElement Babydeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[3]/a/label[1]/span[1] ")
    WebElement Beautydeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[4]/a/label[1]/span[1] ")
    WebElement Clothingdeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[5]/a/label[1]/span[1] ")
    WebElement Computersdeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[6]/a/label[1]/span[1] ")
    WebElement Electronicsdeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[7]/a/label[1]/span[1] ")
    WebElement Floralgiftdeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[8]/a/label[1]/span[1] ")
    WebElement Furnituredeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[9]/a/label[1]/span[1] ")
    WebElement Giftcarddeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[10]/a/label[1]/span[1] ")
    WebElement Grocerydeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[11]/a/label[1]/span[1] ")
    WebElement Healthdeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[12]/a/label[1]/span[1] ")
    WebElement Holidaydeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[13]/a/label[1]/span[1] ")
    WebElement Homekitchendeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[14]/a/label[1]/span[1] ")
    WebElement Homeimprovedeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[15]/a/label[1]/span[1] ")
    WebElement Jewelrydeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[16]/a/label[1]/span[1] ")
    WebElement Mattressesdeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[17]/a/label[1]/span[1] ")
    WebElement Officedeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[18]/a/label[1]/span[1] ")
    WebElement Gardendeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[19]/a/label[1]/span[1] ")
    WebElement Fitnessdeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[20]/a/label[1]/span[1] ")
    WebElement Autodeptcount;
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[21]/a/label[1]/span[1] ")
    WebElement Toysbooksdeptcount;
    @FindBy(xpath = "//label[@for=\"refinement_ShipIt_3-0\"]/span[2]")
    WebElement Totalcount;

    void Case58() {
        WebDriverWait wait2= new WebDriverWait(BaseClass.driver,Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(showmorebutton)).click();
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(3, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Appliancedeptcount));
        System.out.println("The Appliance dept has " + Appliancedeptcount.getText() + " deals");
        System.out.println("The Baby dept has " + Babydeptcount.getText() + " deals");
        System.out.println("The Beauty dept has " + Beautydeptcount.getText() + " deals");
        System.out.println("The Clothing dept has " + Clothingdeptcount.getText() + " deals");
        System.out.println("The Computers dept has " + Computersdeptcount.getText() + " deals");
        System.out.println("The Electronics dept has " + Electronicsdeptcount.getText() + " deals");
        System.out.println("The Floral & gift dept has " + Floralgiftdeptcount.getText() + " deals");
        System.out.println("The Furniture dept has " + Furnituredeptcount.getText() + " deals");
        System.out.println("The Gift cards & Tickets dept has " + Giftcarddeptcount.getText() + " deals");
        System.out.println("The Grocery dept has " + Grocerydeptcount.getText() + " deals");
        System.out.println("The Health & Personal Care dept has " + Healthdeptcount.getText() + " deals");
        System.out.println("The Holiday Seasonal dept has " + Holidaydeptcount.getText() + " deals");
        System.out.println("The Home Kitchen dept has " + Homekitchendeptcount.getText() + " deals");
        System.out.println("The Home Improvement dept has " + Homeimprovedeptcount.getText() + " deals");
        System.out.println("The Jewelry dept has " + Jewelrydeptcount.getText() + " deals");
        System.out.println("The Mattresses dept has " + Mattressesdeptcount.getText() + " deals");
        System.out.println("The Office dept has " + Officedeptcount.getText() + " deals");
        System.out.println("The Garden dept has " + Gardendeptcount.getText() + " deals");
        System.out.println("The Fitness dept has " + Fitnessdeptcount.getText() + " deals");
        System.out.println("The Auto dept has " + Autodeptcount.getText() + " deals");
        System.out.println("The Toys & Books dept has " + Toysbooksdeptcount.getText() + " deals");
        System.out.println("There is a total of " + Totalcount.getText() + " deals");
    }

    @FindBy(xpath = "//div[@class=\"row swatches-v2\"]/div/span[2]/button/label")
    WebElement OOSbutton;

    void Case59() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
       wait.until(ExpectedConditions.visibilityOf(OOSbutton)).isSelected();
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(OOSbutton).click().perform();
    }

    @FindBy(xpath = "//select[@name=\"sortBy\"]")
    WebElement Sortby;

    void Case60() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname = new Select(Sortby);
        objname.selectByIndex(0);
    }

    void Case61() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname2 = new Select(Sortby);
        objname2.selectByIndex(1);
    }

    void Case62() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname3 = new Select(Sortby);
        objname3.selectByIndex(2);
    }

    void Case63() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname4 = new Select(Sortby);
        objname4.selectByIndex(3);
    }

    void Case64() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Sortby));
        Select objname5 = new Select(Sortby);
        objname5.selectByVisibleText("Newest");
    }

    @FindBy(xpath = "//div[@class=\"MuiBox-root css-1jvjmvl\"]/button")
    WebElement Deliverylocationbutton;

    @FindBy(xpath = "//input[@id=\"zipCode\"]")
    WebElement Zipcodefield;

    void Case65() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(25, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Deliverylocationbutton)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(25, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Zipcodefield));
        Zipcodefield.sendKeys("11427", Keys.ENTER);
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(25, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(Deliverylocationbutton));
    }

    @FindBy(xpath = "//a[@automation-id=\"gridViewLink\"]")
    WebElement Gridicon;
    @FindBy(xpath = "//div[@class=\"table-cell list hidden-xs hidden-sm hidden-md\"]/a")
    WebElement Listicon;
    void Case66() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Listicon)).isSelected();
        Gridicon.click();}
    @FindBy(xpath = "//div[@class=\"col-xs-6 col-lg-4 col-xl-3 product\"]/div[1]/div[2]/div/a[1]")
    WebElement Testfirstdeal;

    void Case68() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Gridicon)).isSelected();
        Listicon.click();}
@FindBy(xpath = "//div[@class=\"product col-xs-12\"][2]")
WebElement Testseconddeal;
    void Case69() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Gridicon)).isSelected();
        Listicon.click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(Testseconddeal)).click();
    }
    @FindBy(xpath = "//button[@automation-id=\"decreaseButton_0\"]")
    WebElement decreasequant;
    @FindBy(xpath = "//span[@id=\"errordiv-0\"]")
    WebElement quantityerror;
    void Case70(){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Testfirstdeal));
        decreasequant.click();
    }
    @FindBy(xpath = "//div[@class=\"product-quick-buy\"][1]/div/div[2]/button[1]")
    WebElement addfirstdeal;
    @FindBy(xpath = "//div[@class=\"buttonSection\"]/div/div/form/div/div/div/div[2]/div[1]")
    WebElement addoneverify;
    void Case71(){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Testfirstdeal));
        addfirstdeal.click();
    }
    @FindBy(xpath = "//div[@aria-labelledby=\"accordion-filter_heading-2\"]/div/div[6]/a[1]")
    WebElement PCgamingsubcat;
    @FindBy(xpath = "//div[@class=\"style-check-v2 current selected\"]/a/span[3]")
    WebElement gamingsubcatverify;

    void Case72(){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait.until(ExpectedConditions.visibilityOf(Computersdeptsidebar));
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Computersdeptsidebar).click().perform();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(selecteddeptbutton)).isSelected();
        WebDriverWait wait3 = new WebDriverWait(BaseClass.driver,Duration.of(5, SECONDS));
        wait3.until(ExpectedConditions.visibilityOf(PCgamingsubcat)).click();

    }





    }















