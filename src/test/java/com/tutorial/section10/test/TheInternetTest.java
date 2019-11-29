package com.tutorial.section10.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Browser;
import util.CreateDriver;

class TheInternetTest {
	public static WebDriver driver = null; 

	@BeforeEach
	void setUp() throws Exception {
		driver = CreateDriver.getDriver(Browser.FIREFOX);
		driver.get("http://the-internet.herokuapp.com/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		String parent = windows.get(0);
		String child = windows.get(1);
		
		
		driver.switchTo().window(child);
		String childText = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
		assertTrue(childText.contains("New Window"));
		System.out.println(childText);
		
		driver.switchTo().window(parent);
		String parentText = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
		assertTrue(parentText.contains("Opening a new window"));
		System.out.println(parentText);
		
	
	}

}
