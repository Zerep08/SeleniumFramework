package com.tutorial.section8.test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Browser;
import util.CreateDriver;

class ExplicitWaitTest {
	public static WebDriver driver = null; 

	@BeforeEach
	void setUp() throws Exception {
		driver = CreateDriver.getDriver(Browser.FIREFOX);
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		WebElement message;
		
		message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		String text = message.getText();
		
		System.out.println(text);
	}

	
	
	
	
	
	
	
}
