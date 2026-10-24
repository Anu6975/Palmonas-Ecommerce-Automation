
package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart_Page {

    private WebDriver driver;
    private WebDriverWait wait;

    public Cart_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Header shopping bag icon
    private By cartIcon = By.cssSelector("a[href*='/cart'], button[aria-label*='cart' i]");

    // Cart page content - verify against the live page if the locator changes
    private By cartPageContent = By.xpath(
            "//*[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'shopping bag') or " +
            "contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'your bag')]"
    );

    public void openCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(cartIcon)
        ).click();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public boolean isCartPageOpened() {
        return wait.until(
                ExpectedConditions.urlContains("/cart")
        );
    }

    public boolean isCartContentVisible() {
        return !driver.findElements(cartPageContent).isEmpty();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
