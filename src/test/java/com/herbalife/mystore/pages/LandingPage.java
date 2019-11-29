package com.herbalife.mystore.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	@FindBy(how=How.XPATH, using="//a[@title='Women']")
	WebElement womenTab;
	
	@FindBy(how=How.XPATH, using="//a[@title='Women']")
	WebElement dressesTab;
	
	@FindBy(how=How.XPATH, using="//span[@class='cat-name']")
	WebElement subCategoryName;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWomenTab() {
		womenTab.click();
	}
	
	public void clickOnDresses() {
		dressesTab.click();
	}
	
	public String getDisplayedSubCtegoryName() {
		return subCategoryName.getText();
	}
}
