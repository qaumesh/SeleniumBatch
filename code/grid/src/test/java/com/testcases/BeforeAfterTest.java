package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeAfterTest {

	static WebDriver driver=null;
	
	@BeforeTest
	public WebDriver beforeTest() throws Exception {
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	return driver;
	}
	
	
	@AfterTest
	public void afterTest() throws Exception {
	Thread.sleep(3000);
	driver.close();
	}
}
