package dayfive;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DayFiveTestThree {



	@BeforeClass
	public void InitialiseBrowser() {
	System.out.println("Before class - InitialiseBrowser - DayFiveTestThree ");
	}

	@Test
	public void verifyPageTitle() {
	System.out.println("@Test - verifyPageTitle - DayFiveTestThree ");

	}

	@Test(enabled = false)
	public void validateLogicbuttonText() {
	System.out.println("@Test(enabled = false) - validateLogicbuttonText - DayFiveTestThree ");
	}

	@Test
	public void verifyLogicButtonDisplay() {
	System.out.println("@Test - verifyLogicButtonDisplay - DayFiveTestThree ");
	}

	@AfterMethod
	public void AfterMethodTestThreeClass() {
	System.out.println("@AfterMethod - AfterMethodTestThreeClass - DayFiveTestThree ");
	}
	
	@AfterClass
	public void stopCar() {
	System.out.println("After class - stopCar - DayFiveTestThree ");
	}


}
