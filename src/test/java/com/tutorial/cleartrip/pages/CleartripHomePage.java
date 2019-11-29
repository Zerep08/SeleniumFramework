package com.tutorial.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CleartripHomePage {
	@FindBy(how=How.XPATH, using="//input[@id='DepartDate']")
	WebElement calendarIcon;
	
	@FindBy(how=How.CSS, using=".ui-state-highlight")	
	WebElement date;
	
	@FindBy(how=How.ID, using="Adults")
	WebElement dAdult;
	
	@FindBy(how=How.ID, using="Childrens")
	WebElement dChildren;
	
	@FindBy(how=How.ID, using="Infants")
	WebElement dInfant;

	@FindBy(how=How.ID, using="MoreOptionsLink")
	WebElement link;
	
	@FindBy(how=How.ID, using="AirlineAutocomplete")
	WebElement airlineField;
	
	@FindBy(how=How.ID, using="SearchBtn")
	WebElement searchFlight;
	
	@FindBy(how=How.ID, using="homeErrorMessage")
	WebElement homeErrorMessage;
	
	public CleartripHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openCalendar() {
		calendarIcon.click();
	}
	
	public void selectCurrentDate() {
		date.click();
	}
	
	public void selectAdults() {
		Select drpdwnAdults = new Select(dAdult);
		drpdwnAdults.selectByValue("3");
	}
	
	public void selectChildrens() {
		Select drpdwnChildrens = new Select(dChildren);
		drpdwnChildrens.selectByValue("2");
	}
	
	public void selectInfants() {
		Select drpdwnInfants = new Select(dInfant);
		drpdwnInfants.selectByValue("1");
	}
	
	public void clickMoreOptions() {
		link.click();
	}
	
	public void enterPreferedAirline() {
		airlineField.sendKeys("SpiceJet(SG)");
	}
	
	public void clickSearchFlightBtn() {
		searchFlight.click();
	}
	
	public void showErrorMessage() {
		System.out.println(homeErrorMessage.getText());
	}
}
