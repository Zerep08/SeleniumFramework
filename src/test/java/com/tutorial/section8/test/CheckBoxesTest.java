package com.tutorial.section8.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Browser;
import util.CreateDriver;

class CheckBoxesTest {
public static WebDriver driver = null; 
private static final By CHCKBXOPTION1 = By.id("checkBoxOption1");
private static final By CHCKBXES = By.cssSelector("input[type='checkbox']");
	
	@BeforeEach
	void setUp() throws Exception {
		driver = CreateDriver.getDriver(Browser.FIREFOX);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	void test() {
		assertFalse(driver.findElement(CHCKBXOPTION1).isSelected());
		driver.findElement(CHCKBXOPTION1).click();
		assertTrue(driver.findElement(CHCKBXOPTION1).isSelected());
		List<WebElement> listChckbx = driver.findElements(CHCKBXES);
		System.out.println("There are : " + listChckbx.size() + " Checkboxes");
	}
	
	@AfterEach
	public void close() {
		driver.close();
	}

}
