package com.nopcommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By lnkWhyKotakLife=By.xpath("//span[contains(text(),'Why Kotak Life?')]");
	
	By lnkAboutUs=By.xpath("//span[contains(text(),'About Us')]");
	
	public WebElement WhyKotakLife() 
	{
		return ldriver.findElement(lnkWhyKotakLife);
	}
	
	public WebElement AboutUs() 
	{
		return ldriver.findElement(lnkAboutUs);
	}
}