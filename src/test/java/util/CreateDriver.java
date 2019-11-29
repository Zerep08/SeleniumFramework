package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDriver {

	@SuppressWarnings("unchecked")
	public static <T extends WebDriver> T getDriver(Browser browser) {
		switch (browser) {
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			return (T) new FirefoxDriver();
		case CHROME:
			WebDriverManager.chromedriver().setup();
			return (T) new ChromeDriver();

		default:
			return (T)new FirefoxDriver();
		}

	}

}
