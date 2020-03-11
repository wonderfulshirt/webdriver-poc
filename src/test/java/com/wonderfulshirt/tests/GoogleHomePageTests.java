package com.wonderfulshirt.tests;

import com.wonderfulshirt.pageobjects.GoogleHomePage;
import com.wonderfulshirt.pageobjects.GoogleSearchResultsPage;
import static org.junit.Assert.*;
import org.junit.Test;

public class GoogleHomePageTests extends BaseTest {

  @Test
  public void searchForCheese() {
    String searchText = "cheese";
    GoogleHomePage homePage = new GoogleHomePage(getDriver());
    GoogleSearchResultsPage searchResultsPage = homePage.searchFor(searchText);
    assertEquals(true, searchResultsPage.firstResultTitleContainsSearchText(searchText));
  }
}
