
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.Home_Page;

public class Home_tests extends BaseTest {

    @Test
    public void verifyHomepageLoads() {

        Home_Page home = new Home_Page(driver);

        Assert.assertTrue(
                home.isHomepageLoaded(),
                "Homepage navigation element was not visible"
        );

        Assert.assertTrue(
                home.getPageTitle().toLowerCase().contains("palmonas"),
                "Page title does not contain Palmonas"
        );

        System.out.println("Homepage loaded successfully!");
        System.out.println("Page title: " + home.getPageTitle());
        System.out.println("Current URL: " + home.getCurrentURL());
    }

    @Test
    public void verifyNewArrivalsNavigation() {

        Home_Page home = new Home_Page(driver);

        home.clickNewArrivals();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/collections/new-arrivals"),
                "New Arrivals collection did not open"
        );

        System.out.println("New Arrivals navigation successful!");
    }
}
