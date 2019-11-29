package com.herbalife.exercise.tests;


import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.herbalife.mystore.pages.DressesPage;
import com.herbalife.mystore.pages.HomePage;
import com.herbalife.mystore.pages.LandingPage;

import util.Browser;
import util.CreateDriver;

class SeleniumExercise {
	public static WebDriver driver = null; 
	
	static String URL = "";
	static String email = "";
	static String password = "";

	@BeforeClass
	 static void setUp() throws Exception {
		URL = "http://automationpractice.com/index.php";
		email = "testautomationherb@gmail.com";
		password="12345678";
		
		driver = CreateDriver.getDriver(Browser.FIREFOX);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	static void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void testCase1() {
		HomePage home = new HomePage(driver);
		home.clickSignInTab();
		home.typeEmail(email);
		home.typePassword(password);
		home.clickSignInButton();
		String userName = home.getDisplayedUsrName();
		assertTrue(userName.equals("Automation Test"));
	}
	
	@Test
	void testCase2() {
		LandingPage land = new LandingPage(driver);
		land.clickOnWomenTab();
		land.clickOnDresses();
		String subCategory = land.getDisplayedSubCtegoryName();
		assertTrue(subCategory.equals("Dresses"));
	}
	
	@Test
	void testCase3() {
		DressesPage dress = new DressesPage(driver);
		dress.moveToFirstItem();
		dress.addItemToCart();
		String message = dress.getSuccesfullMessage();
		assertTrue(message.equals("Product successfully added to your shopping cart"));
	}
	
	
	

}
