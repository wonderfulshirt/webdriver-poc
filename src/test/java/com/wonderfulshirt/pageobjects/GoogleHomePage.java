package com.wonderfulshirt.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePage {

  private static String URL = "http://www.google.co.uk";

  @FindBy(name = "q")
  private WebElement searchBox;


  public GoogleHomePage(WebDriver driver) {
    super(driver);
    driver.get(URL);
    PageFactory.initElements(driver, this);
  }

  public GoogleSearchResultsPage searchFor(String text) {
    searchBox.sendKeys(text);
    searchBox.submit();

    return new GoogleSearchResultsPage(driver);
  }

}
