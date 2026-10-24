
package Page;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Home_Page {

    private WebDriver driver;
    private WebDriverWait wait;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Home page navigation
    private By newArrivalsLink =
            By.xpath("//a[contains(normalize-space(.), 'New Arrivals')]");

    private By bestSellersLink =
            By.xpath("//a[contains(normalize-space(.), 'Best Sellers')]");

    private By fineSilverLink =
            By.xpath("//a[contains(normalize-space(.), 'Fine Silver')]");

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isHomepageLoaded() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(newArrivalsLink)
        ).isDisplayed();
    }

    public void clickNewArrivals() {
        wait.until(
                ExpectedConditions.elementToBeClickable(newArrivalsLink)
        ).click();
    }

    public void clickBestSellers() {
        wait.until(
                ExpectedConditions.elementToBeClickable(bestSellersLink)
        ).click();
    }

    public void clickFineSilver() {
        wait.until(
                ExpectedConditions.elementToBeClickable(fineSilverLink)
        ).click();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}
