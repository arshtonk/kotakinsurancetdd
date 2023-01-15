package com.nopcommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
public WebDriver ldriver;
	
	public LandingPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By lnkPopup=By.xpath("//a[@id=\"nv_js-leadform-close-button_1511\"]");
	
	
	public void closePopup() {
		ldriver.findElement(lnkPopup).click();
	}
	

}
