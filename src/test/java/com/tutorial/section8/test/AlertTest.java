package com.tutorial.section8.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Browser;
import util.CreateDriver;

class AlertTest {
	public static WebDriver driver = null; 

	
	@BeforeEach
	void setUp() throws Exception {
		driver = CreateDriver.getDriver(Browser.FIREFOX);
		driver.get("http://bootboxjs.com/examples.html");
	}


	@Test
	void test() throws InterruptedException {
		driver.findElement(By.xpath("//button[@data-bb-example-key='alert-default']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

}
