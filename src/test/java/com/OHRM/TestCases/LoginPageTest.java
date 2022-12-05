package com.OHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRM.Pages.LoginPage;
import com.OHRM.TestBase.TestBase;
import com.OHRM.Utility.Log;
import com.OHRM.Utility.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initilization();
		loginpage=new LoginPage();
		Log.info("OrangeHRM Application Login Page Launched Successfully");
		
	}
	/*
	@Test(priority=1)
	public void loginPageTitleTest() {
		
		String title=loginpage.validatingOHRMTitle();
		Assert.assertEquals(title, "OrangeHRM");
		Log.info("Login Page Title Validation Successfully");
	}
	
	@Test(priority=2)
	public void LoginTest() {
		
		loginpage.Login(prop.getProperty("ALavanya19"),prop.getProperty("ALavanya@19"));
		Log.info("Entered UserName and Password Successfully");
		
	}*/
	
	@Test(priority=3)
	public void LoginMultipleTestData() {
		
		String data=TestUtil.getTestData("Sheet1").toString();
		System.out.println(data.toString());
		loginpage.LoginMultipleTestData(data,data);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		Log.info("OrangeHRM Application closed Successfully");
	}
}

