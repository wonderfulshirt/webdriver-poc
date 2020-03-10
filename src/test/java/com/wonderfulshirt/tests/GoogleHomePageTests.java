package com.wonderfulshirt.tests;

import com.wonderfulshirt.pageobjects.GoogleHomePage;
import org.junit.Test;

public class GoogleHomePageTests extends BaseTest {
  @Test
  public void homepageTests() {
    GoogleHomePage googleHomePage = new GoogleHomePage(getDriver());
  }
}
