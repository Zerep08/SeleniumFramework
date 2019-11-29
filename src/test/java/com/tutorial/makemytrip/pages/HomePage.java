package com.tutorial.makemytrip.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	@FindBy(how=How.XPATH, using = "//label[@for='fromCity']")
	WebElement labelFrom;
	
	@FindBy(how=How.XPATH, using = "//input[@placeholder='From']")
	WebElement drpdwnFrom;
	
	@FindBy(how=How.XPATH, using = "//label[@for='toCity']")
	WebElement labelTo;
	
	
	@FindBy(how=How.XPATH, using = "//input[@placeholder='To']")
	WebElement drpdwnTo;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectFlights() throws InterruptedException {
		labelFrom.click();
		drpdwnFrom.sendKeys("mum");
		drpdwnFrom.sendKeys(Keys.ARROW_DOWN);
		drpdwnFrom.sendKeys(Keys.ENTER);
		//labelTo.click();
		Thread.sleep(1000);
		drpdwnTo.sendKeys("del");
		Thread.sleep(1000);
		drpdwnTo.sendKeys(Keys.ARROW_DOWN);
		drpdwnTo.sendKeys(Keys.ENTER);
	}
}
