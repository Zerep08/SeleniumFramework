package com.tutorial.section8.test;


import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.tutorial.cleartrip.pages.CleartripHomePage;

import util.Browser;
import util.CreateDriver;

class ClearTripTest {
	public static WebDriver driver = null; 
	
	@BeforeEach
	void setUp() throws Exception {
		driver = CreateDriver.getDriver(Browser.FIREFOX);
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		CleartripHomePage clearTrip = new CleartripHomePage(driver);
		
		clearTrip.openCalendar();
		clearTrip.selectCurrentDate();
		clearTrip.selectAdults();
		clearTrip.selectChildrens();
		clearTrip.selectInfants();
		clearTrip.clickMoreOptions();
		clearTrip.enterPreferedAirline();
		clearTrip.clickSearchFlightBtn();
		clearTrip.showErrorMessage();
	}

}
