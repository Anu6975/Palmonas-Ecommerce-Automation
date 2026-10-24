package Page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_Page {

    private WebDriver driver;
    private WebDriverWait wait;

    // Verified from the actual Palmonas HTML
    private By searchField = By.id("header-search");

    public Search_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterSearchText(String productName) {
        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchField)
        );

        search.clear();
        search.sendKeys(productName);
    }

    public String getSearchText() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchField)
        ).getAttribute("value");
    }

    public void submitSearch() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchField)
        ).sendKeys(Keys.ENTER);
    }

    public boolean isSearchFieldDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchField)
        ).isDisplayed();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}
