package com.wonderfulshirt.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
  private static WebDriver driver;

  @BeforeClass
  public static void setup() {
    driver = new ChromeDriver();
  }

  @AfterClass
  public static void tearDown() {
    if(null != driver) {
      driver.close();
      driver.quit();
    }
  }

  public WebDriver getDriver() {
    return driver;
  }

}
