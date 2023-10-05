import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class JewelryDeals {

@FindBy(xpath = "//label[@automation-id=\"subCategoryLabel_Earrings\"]")
    WebElement Earringssubcat;
@FindBy(xpath = "//div[@class=\"product-list grid\"]/div[2]/div")
WebElement seconddeal;

void Case75(){
    WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, ChronoUnit.SECONDS));
    wait.until(ExpectedConditions.visibilityOf(Earringssubcat)).click();
    WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, ChronoUnit.SECONDS));
    wait2.until(ExpectedConditions.visibilityOf(seconddeal)).click();}

    @FindBy(xpath = "//label[@automation-id=\"compareProductCheckbox_0\"]/span")
    WebElement compare1;
@FindBy(xpath = "//label[@automation-id=\"compareProductCheckbox_1\"]/span")
WebElement compare2;
@FindBy(xpath = "//input[@onclick=\"COSTCO.compareProducts.compare();\"]")
WebElement comparebutton;

    void Case81(){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.visibilityOf(compare1)).click();
        WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, ChronoUnit.SECONDS));
        wait2.until(ExpectedConditions.visibilityOf(compare2)).click();
        comparebutton.click();
    }

}
