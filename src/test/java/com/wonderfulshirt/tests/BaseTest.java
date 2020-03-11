package com.wonderfulshirt.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
  private WebDriver driver;

  @Before
  public void setup() {
    driver = new ChromeDriver();
  }

  @After
  public void tearDown() {
    if(null != driver) {
      driver.close();
      driver.quit();
    }
  }

  WebDriver getDriver() {
    return driver;
  }

}
