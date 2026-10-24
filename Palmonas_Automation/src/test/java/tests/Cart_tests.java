
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.Search_Page;
import Page.Product_Page;
import Page.Cart_Page;

public class Cart_tests extends BaseTest {

    @Test
    public void verifyAddProductAndOpenCart() {

        Search_Page searchPage = new Search_Page(driver);
        Product_Page productPage = new Product_Page(driver);
        Cart_Page cartPage = new Cart_Page(driver);

        // Search for a product
        searchPage.enterSearchText("ring");
        searchPage.submitSearch();

        // Open the product options popup
        productPage.clickQuickAdd();

        Assert.assertTrue(
                productPage.isModalAddToCartDisplayed(),
                "Product options popup did not open"
        );

        // Add product with default-selected options
        productPage.clickModalAddToCart();

        // Open the shopping cart
        cartPage.openCart();

        Assert.assertTrue(
                cartPage.isCartPageOpened(),
                "Cart page did not open"
        );

        System.out.println("Cart page opened successfully!");
        System.out.println("Current URL: " + cartPage.getCurrentURL());
    }
}
