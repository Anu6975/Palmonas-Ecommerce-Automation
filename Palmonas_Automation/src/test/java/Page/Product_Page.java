
package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Page {

    private WebDriver driver;
    private WebDriverWait wait;

    // Plus button on product cards
    private By quickAddButton =
            By.cssSelector("button[aria-label='Add to cart']");

    // Add to Cart button inside the Choose Options popup
    private By modalAddToCartButton =
            By.xpath("//button[@aria-label='Add to cart' and normalize-space()='Add to Cart']");

    public Product_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickQuickAdd() {
        wait.until(
                ExpectedConditions.elementToBeClickable(quickAddButton)
        ).click();
    }

    public void clickModalAddToCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(modalAddToCartButton)
        ).click();
    }

    public boolean isModalAddToCartDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        modalAddToCartButton
                )
        ).isDisplayed();
    }
}
