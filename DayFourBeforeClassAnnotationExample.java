package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DayFourBeforeClassAnnotationExample {

	
	// BeforeClass / AfterClass / Enabled=false

	WebDriver driver=null;
	@BeforeClass
	public void InitialiseBrowser() {
	driver = new ChromeDriver();
	System.out.println("Initialise browser");
	driver.get("https://www.saucedemo.com");
	System.out.println("open  website");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void verifyPageTitle() {
	System.out.println("verifying page title");
	String actualPageTitle=driver.getTitle();
	System.out.println("Actual page title :"+actualPageTitle);
	Assert.assertEquals(actualPageTitle, "Swag Labs");
	}
	
	@Test (enabled=false)
	public void validateLogicbuttonText() {
		System.out.println("validateLogicbuttonText");
		WebElement loginButton= driver.findElement(By.id("login-button"));
		String loginButtonText=loginButton.getAttribute("value");
		Assert.assertEquals(loginButtonText, "Login");
	}
	
	
	
	@Test
	public void verifyLogicButtonDisplay() {
		System.out.println("verifyLogicButtonDisplay");
		WebElement loginButton= driver.findElement(By.id("login-button"));
		boolean flag=loginButton.isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@AfterClass
	public void stopCar() {
		System.out.println("close browser");
		driver.close();
	}
	

}
