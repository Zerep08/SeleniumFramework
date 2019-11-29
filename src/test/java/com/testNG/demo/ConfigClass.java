package com.testNG.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ConfigClass {
  @Test
  public void searchforAdmin() {
	  System.out.println("Searching admins");
  }
  @Test
  public void searchforproducts() {
	  System.out.println("Searching products");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Log out");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Open the app");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Close the app");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Open the browser");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close the browser");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Setting up Chrome browser");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Clear cookies");
  }

}
