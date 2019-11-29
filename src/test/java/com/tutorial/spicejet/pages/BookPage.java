package com.tutorial.spicejet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class BookPage{
	
	@FindBy(how=How.ID, using = "ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")
	WebElement drpdwnCurrency;
	
	@FindBy(how=How.ID, using = "ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")
	WebElement drpdwnFrom;
	
	@FindBy(how=How.ID, using = "ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")
	WebElement drpdwnTo;
	
	@FindBy(how=How.XPATH, using = "//a[@Value='BLR']")
	WebElement fromCity;
	
	@FindBy(how=How.XPATH, using = "(//a[@Value='MAA'])[2]")
	WebElement toCity;
	
	
	
	
	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public void selectAllCurrency() {
		Select selectCurrency = new Select(drpdwnCurrency);
		selectCurrency.selectByValue("INR");
		selectCurrency.selectByValue("AED");
		selectCurrency.selectByValue("USD");
		
	}
	
	public void selectFlights() {
		drpdwnFrom.click();
		fromCity.click();
		drpdwnTo.click();
		toCity.click();
	}
	

}
