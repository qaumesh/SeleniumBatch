package dayfive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotaion {

	static WebDriver driver=null;
	
	// @Test (dataProvider="supply_userid_pass")
	public static void test1(String userName, String pass) {
		System.out.println("userName :"+userName);
		System.out.println("pass :"+pass);
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String actualPageTitle=driver.getTitle();
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		String products=driver.findElement(By.xpath("//*[text()='Products']")).getText();
		Assert.assertEquals(products, "Products");
	}
	
	
	
	//@AfterMethod
	public void teardrop() {
		driver.close();
	}
	
	
	//@DataProvider (name = "supply_userid_pass")
	public Object[][] dpMethod() {
		Object [][] twoD_arr = new Object [5][2];
		twoD_arr[0][0]="standard_user";
		twoD_arr[0][1]="secret_sauce";
		
		twoD_arr[1][0]="locked_out_user";
		twoD_arr[1][1]="secret_sauce";
		
		twoD_arr[2][0]="problem_user";
		twoD_arr[2][1]="secret_sauce";
		
		twoD_arr[3][0]="performance_glitch_user";
		twoD_arr[3][1]="secret_sauce";
		return twoD_arr;
	}
	
	@Test(invocationCount=10)
	public void invocationCount() {
		System.out.println("Hello");
	}
}
