package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import Page.Search_Page;

public class Search_tests extends BaseTest {

    @Test
    public void verifyProductSearchInput() {

        Search_Page searchPage = new Search_Page(driver);

        Assert.assertTrue(
                searchPage.isSearchFieldDisplayed(),
                "Search field is not displayed"
        );

        String product = "ring";

        searchPage.enterSearchText(product);

        Assert.assertEquals(
                searchPage.getSearchText(),
                product,
                "Search field did not accept the product name"
        );

        System.out.println("Search input test passed!");
        System.out.println("Search text: " + searchPage.getSearchText());
    }

    @Test
    public void verifyProductSearchSubmission() {

        Search_Page searchPage = new Search_Page(driver);

        searchPage.enterSearchText("ring");
        searchPage.submitSearch();

        System.out.println("URL after submitting search: "
                + searchPage.getCurrentURL());

        System.out.println("Search submission executed.");
    }
}
