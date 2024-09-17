package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import org.testng.annotations.Parameters;
import fiveException.utility.Browser_Factory;
import fiveException.utility.ReaderClass;
import five_exception.pages.CheckOutOverview;
import five_exception.pages.CheckOutYourInfo;
import five_exception.pages.Log_Out_Page;
import five_exception.pages.Login_Page;
import five_exception.pages.Product_Page;
import five_exception.pages.YourCard;


public class TestCases {

	static WebDriver driver=null;
	ReaderClass read=new ReaderClass ();
	
	@Parameters({"browsername"})
	@BeforeClass
	public void startUp(String browsername) throws Exception {
		Browser_Factory br=new Browser_Factory ();
		String url=read.get("url");
		// String browser=read.get("br");
		driver=br.startUp(browsername,url);
	}
	
	@Test(priority=1)
	public void TC_01() throws Exception{
		Login_Page login=new Login_Page(driver);
		String user=read.get("username");
		String pass=read.get("passward");
		System.out.println(user);
		System.out.println(pass);
		login.username(user);
		login.passward(pass);
		login.clickonButton();
		//check sucessfully login or not so compare product page name
		Product_Page productPage=new Product_Page (driver);
		String actual=productPage.productPageNames();
		Assert.assertEquals(actual,"Products");
	}
	
	@Test(priority=2)
	public void TC_02() throws Exception {
		//add product to cart
		Product_Page product=new Product_Page (driver);
		String bagName=read.get("itemPurchased");
		product.selectBag(bagName);
		product.addTocard();
		
		//click to add product int card
		product.clickOnCard();
		
		//verify selected product added into card or not
		YourCard card=new YourCard (driver);
		String selected=card.getProductNameFromCard();
		Assert.assertEquals(selected, bagName);
	}
	
	@Test(priority=3)
	public void TC_03() throws Exception {
		YourCard yourcard=new YourCard (driver);
		yourcard.checkOut();
		CheckOutYourInfo checkOutInfo=new CheckOutYourInfo (driver);
		String firstname=read.get("firstName");
		checkOutInfo.firstName(firstname);
		String lastname=read.get("lastName");
		checkOutInfo.lastName(lastname);
		String code=read.get("zipCode");
		checkOutInfo.zipcode(code);
		checkOutInfo.clickOncontinue();
		
		// verify again product is same we have selected
		CheckOutOverview order=new CheckOutOverview(driver);
		String item=order.verifyOrderItem();
		String itemExpected=read.get("itemPurchased");
		Assert.assertEquals(item, itemExpected);
		order.clickOnFinish();
	
		//again we verify order sucess message
		String orderSucessMsg=order.orderSucessMessage();
		Assert.assertEquals(orderSucessMsg,"Thank you for your order!");
	}
	
	@Test(priority=4)
	public void TC_04() {
		Log_Out_Page logout=new Log_Out_Page(driver);
		logout.clickOnButton();
		logout.clickOnLogout();
		String title=driver.getTitle();
		// verify sucessfully loged out
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@AfterClass
	public void tearDrop() {
		Browser_Factory br=new Browser_Factory ();
		br.closure();
	}
	
}
