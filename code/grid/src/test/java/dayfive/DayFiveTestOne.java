package dayfive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DayFiveTestOne {

	@BeforeClass
	public void InitialiseBrowser() {
	System.out.println("Before class - InitialiseBrowser - DayFiveTestOne ");
	}

	@Test
	public void verifyPageTitle() {
	System.out.println("@Test - verifyPageTitle - DayFiveTestOne ");

	}
	
	@BeforeMethod
	public void BeforeMethodTestOneClass() {
		System.out.println("Before Method - BeforeMethodTestOneClass - DayFiveTestOne ");

		}

	@Test(enabled = false)
	public void validateLogicbuttonText() {
	System.out.println("@Test(enabled = false)  - validateLogicbuttonText - DayFiveTestOne ");
	}

	@Test
	public void verifyLogicButtonDisplay() {
	System.out.println("@Test - verifyLogicButtonDisplay - DayFiveTestOne ");


	}

	@AfterClass
	public void stopCar() {
	System.out.println("After class - stopCar - DayFiveTestOne ");
	}

}
