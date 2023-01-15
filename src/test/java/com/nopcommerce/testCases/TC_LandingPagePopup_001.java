package com.nopcommerce.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LandingPage;


public class TC_LandingPagePopup_001 extends BaseClass {

	@Test
	public void LandingPagePopup() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		logger.info("URL Opened");//logger msg
		driver.manage().window().maximize(); 
		
		LandingPage lp = new LandingPage(driver);		
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Why Kotak Life?')]")));
		
			lp.closePopup();
			logger.info("Popup Closed");
		}
		catch(Exception e)
		{
			logger.info("Popup not found");
		}
		
			
			if (driver.getTitle().equals("Life Insurance - Kotak Life Insurance Company in India")) {	
				Assert.assertTrue(true);
				logger.info("Title is same");//logger msg
				
			} else {
				captureScreen(driver,"LandingPage");
				Assert.assertTrue(false);
				logger.info("Title is different");//logger msg
			}
	}
	
}