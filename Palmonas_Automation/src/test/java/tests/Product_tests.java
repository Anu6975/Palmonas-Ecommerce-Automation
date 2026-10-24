
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.Search_Page;
import Page.Product_Page;

public class Product_tests extends BaseTest {

    @Test
    public void verifyProductOptionsAndAddToCart() {

        Search_Page searchPage = new Search_Page(driver);
        Product_Page productPage = new Product_Page(driver);

        // Search for rings
        searchPage.enterSearchText("ring");
        searchPage.submitSearch();

        // Wait for the first product's quick-add button and click it
        productPage.clickQuickAdd();

        // Verify the options popup's Add to Cart button is visible
        Assert.assertTrue(
                productPage.isModalAddToCartDisplayed(),
                "Product options popup did not open"
        );

        // Add the product using the default-selected options
        productPage.clickModalAddToCart();

        System.out.println("Add to Cart action executed.");
    }
}
