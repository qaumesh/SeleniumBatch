package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualPageTitle=driver.getTitle();
		if(actualPageTitle.equals("Swag Labs 2")) {
			System.out.println("page title is correct - Test case is pass -1");
		}else {
			System.out.println("page title is NOT correct - Test case is FAIL - 1");

		}

		// validate login button text

		WebElement loginButton= driver.findElement(By.id("login-button"));
		String loginButtonText=loginButton.getAttribute("value");
		if(loginButtonText.equals("Login")) {
			System.out.println("login text on button is correct - Test case is pass - 2");
		}else {
			System.out.println("login text on button is NOT correct - Test case is FAIL - 2");
		}
	

		// checking login button is visible or not

		boolean flag=loginButton.isDisplayed();
		if(flag=true){
		System.out.println("loginButton is visible -3");
		}else{
		System.out.println("loginButton is NOT visible -4");
		}
		
		// validate place holder
		WebElement userNamePlaceHoldertext= driver.findElement(By.id("user-name"));
		String loginButtonPlaceholderText=userNamePlaceHoldertext.getAttribute("placeholder");
		
		
		WebElement passwordPlaceHoldertext= driver.findElement(By.id("password"));
		String passwordButtonPlaceholderText=passwordPlaceHoldertext.getAttribute("placeholder");
		
		
		
		driver.close();
	}
}
