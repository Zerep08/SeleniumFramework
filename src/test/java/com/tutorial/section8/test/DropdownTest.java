package com.tutorial.section8.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.tutorial.makemytrip.pages.HomePage;
import com.tutorial.spicejet.pages.BookPage;

import util.Browser;
import util.CreateDriver;

public class DropdownTest{
	public static WebDriver driver = null; 
	
	@BeforeEach
	void setUp() throws Exception {
		driver = CreateDriver.getDriver(Browser.FIREFOX);
		driver.get("https://www.makemytrip.com/");
	}

//	@Test
//	void selectStaticDropdownTest() {
//		BookPage book = new BookPage(driver);
//		book.selectAllCurrency();
//		book.selectFlights();
//		
//	}
	
	@Test
	void autoSuggestiveDropDownTest() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.selectFlights();
	}
	
	

}
