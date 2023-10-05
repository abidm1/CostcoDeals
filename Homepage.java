import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.sql.Driver;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Set;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Homepage {
    BaseClass baseClass;
    @FindBy(xpath = "//div[@class=\"nav-item\"][3]")
    WebElement Dealsbuttonnavbarbutton;

    @FindBy(xpath = "//div[@class=\"nav-item\"][3]/a/div/div[2]/div/div/div/div[3]/div/a")
    WebElement Shopalldealsbutton;

    void Case1() {
        Dealsbuttonnavbarbutton.isDisplayed();
        Dealsbuttonnavbarbutton.isEnabled();
        Actions actions = new Actions(BaseClass.driver);
        actions.moveToElement(Dealsbuttonnavbarbutton).click().perform();
            }
    void Case2(){
    Dealsbuttonnavbarbutton.isDisplayed();
    Dealsbuttonnavbarbutton.isEnabled();
    Actions actions = new Actions(BaseClass.driver);
    actions.moveToElement(Dealsbuttonnavbarbutton).build().perform();
    BaseClass.driver.manage().timeouts().implicitlyWait(Duration.of(5,ChronoUnit.SECONDS));
    Shopalldealsbutton.click();}



}