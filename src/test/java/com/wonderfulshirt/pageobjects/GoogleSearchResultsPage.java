package com.wonderfulshirt.pageobjects;

import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultsPage extends BasePage {

  @FindBy(id = "search")
  private WebElement searchResults;

  @FindBy(className = "st")
  private WebElement resultItem;

  public GoogleSearchResultsPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public boolean firstResultTitleContainsSearchText(String searchText) {
    return Pattern.compile(Pattern.quote(searchText), Pattern.CASE_INSENSITIVE).matcher(resultItem.getText()).find();
  }
}
