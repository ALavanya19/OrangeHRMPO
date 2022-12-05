package com.OHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.TestBase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="txtUsername")
	WebElement userNameE;
	
	@FindBy(id="txtPassword")
	WebElement passwordE;
	
	@FindBy(id="btnLogin")
	WebElement loginButtonE;
	
	//initilizing Page Objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validatingOHRMTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage Login(String uName,String pwd)
	{
		userNameE.sendKeys(uName);
		passwordE.sendKeys(pwd);
		loginButtonE.click();
		return new HomePage();
		
	}
	
	public HomePage LoginMultipleTestData(String userName,String password)
	{
		userNameE.sendKeys(userName);
		passwordE.sendKeys(password);
		loginButtonE.click();
		return new HomePage();
	}
}
