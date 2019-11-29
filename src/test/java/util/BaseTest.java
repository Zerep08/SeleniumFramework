package util;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.out.println("<<<<<<<Setup executing >>>>>>>");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("<<<<<<<Finishing the test>>>>>>>");
	}
}
