import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ToysDeals {
@FindBy(xpath = "//div[@id=\"accordion-filter_collapse-2\"]/div/div[2]/a[1]")
    WebElement Hobbysubcat;
    @FindBy(xpath = "//a[@automation-id=\"gridViewLink\"]")
    WebElement Gridicon;
    @FindBy(xpath = "//div[@class=\"table-cell list hidden-xs hidden-sm hidden-md\"]/a")
    WebElement Listicon;
@FindBy(xpath = "//div[@class=\"product col-xs-12 last\"]")
    WebElement firstdeal;

void Case82(){
    WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
    wait.until(ExpectedConditions.visibilityOf(Hobbysubcat)).click();
    WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, Duration.of(10, SECONDS));
    wait3.until(ExpectedConditions.visibilityOf(Gridicon)).isSelected();
    Listicon.click();
    WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, Duration.of(5, SECONDS));
    wait2.until(ExpectedConditions.visibilityOf(firstdeal)).click();
}


}
