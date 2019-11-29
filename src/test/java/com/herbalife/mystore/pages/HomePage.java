package com.herbalife.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(how=How.XPATH, using="//a[@title='Log in to your customer account']")
	WebElement signInTab;
	
	@FindBy(how=How.ID, using="email")
	WebElement emailField;
	
	@FindBy(how=How.ID, using="passwd")
	WebElement passwordField;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	WebElement signInButton;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Automation Test')]")
	WebElement userName;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignInTab() {
		signInTab.click();
	}
	
	public void typeEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	public void typePassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
	public String getDisplayedUsrName() {
		return userName.getText();
	}
	

}
