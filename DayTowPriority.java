package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DayTowPriority {

	@Test (priority=-2)
	public void helloWorld() {
		System.out.println("@Test - helloWorld");
	}
	
	
	@Test (priority=-1)
	public void apple() {
		System.out.println("@Test - apple");
	}
	
	@Test 
	public void car() {
		System.out.println("@Test - car");
	}
	
}
