package com.nopcommerce.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AboutUsPage;
import com.nopcommerce.pageObjects.HomePage;

public class TC_AboutUs_002 extends BaseClass{

	@Test
	public void AboutUs() 
	{
		HomePage hp=new HomePage(driver);
		
		driver.get(baseURL);
		logger.info("URL Opened");//logger msg
		
		driver.manage().window().maximize(); 
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Why Kotak Life?')]")));
	
		
		//Hovering on main menu
		action.moveToElement(hp.WhyKotakLife()).perform();
		logger.info("Hovered on WhyKotakLife");
		
		//Performing the mouse hover action on the target element.
		action.moveToElement(hp.AboutUs());
		logger.info("Clicked on AboutUs");

		//build()- used to compile all the actions into a single step 
		action.click().build().perform();
		
		AboutUsPage ap= new AboutUsPage(driver);
		
		for(WebElement l:ap.nameList())
		{
			System.out.println(l.getText());
		}
		logger.info("Printed Directors name");
		
	}
}