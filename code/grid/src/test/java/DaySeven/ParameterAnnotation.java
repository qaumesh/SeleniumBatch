package DaySeven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.GetProperty;
import utility.InitialiseBrower;

public class ParameterAnnotation {

	
	// BeforeClass / AfterClass / Enabled=false

	WebDriver driver=null;
	@BeforeClass
	public void StartBrowser() throws Throwable {
	GetProperty get=new GetProperty();
	String brName=get.getProperty("browsrName");
	String url=get.getProperty("url");
		
	InitialiseBrower browser=new InitialiseBrower();
	driver=browser.InitialiseBrowser(brName);
	
	driver.get(url);
	
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
	
	
	
	
	


	
}
