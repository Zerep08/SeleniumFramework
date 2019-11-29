package com.herbalife.mystore.pages;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {
	WebDriver driver = null;
	
	@FindBy(how=How.XPATH, using="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']")
	WebElement firstItem;
	

	@FindBy(how=How.XPATH, using="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]")
	WebElement addToCartButton;
	

	@FindBy(how=How.XPATH, using="//div[@class='layer_cart_product col-xs-12 col-md-6']//h2")
	WebElement succesfullMessage;
	
	
	public DressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void moveToFirstItem() {
		Actions action = new Actions(driver);
		action.moveToElement(firstItem).build().perform();
	}
	
	public void addItemToCart() {
		if(addToCartButton.isDisplayed()) {
			addToCartButton.click();
		}else {
			fail("Add to Cart button is not displayed");
		}
	}
	
	public String getSuccesfullMessage() {
		return succesfullMessage.getText();
	}
	
}
