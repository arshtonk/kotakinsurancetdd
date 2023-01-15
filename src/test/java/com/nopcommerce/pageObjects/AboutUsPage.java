package com.nopcommerce.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage {

public WebDriver ldriver;
	
	public AboutUsPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By name=By.xpath("//ul[@class='planUL bodUL']//h3");
	
	public List<WebElement> nameList() 
	{
		List<WebElement> names=ldriver.findElements(name);
		return names;
	}
	
	
}
