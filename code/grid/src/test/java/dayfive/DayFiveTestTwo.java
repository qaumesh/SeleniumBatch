package dayfive;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DayFiveTestTwo {




	@BeforeClass
	public void InitialiseBrowser() {
	System.out.println("Before class - InitialiseBrowser - DayFiveTestThree ");
	}

	@Test
	public void verifyPageTitle() {
	System.out.println("@Test - verifyPageTitle - DayFiveTestThree ");

	}

	@Test
	public void validateLogicbuttonText() {
	System.out.println("@Test - validateLogicbuttonText - DayFiveTestThree ");
	}

	@Test
	public void verifyLogicButtonDisplay() {
	System.out.println("@Test - verifyLogicButtonDisplay - DayFiveTestThree ");
	}
	
	@AfterMethod
	public void afterMethods() {
	System.out.println("@AfterMethod -  afterMethods - DayFiveTestThree ");
	}


	



}
