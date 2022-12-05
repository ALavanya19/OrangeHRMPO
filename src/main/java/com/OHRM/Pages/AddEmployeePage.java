package com.OHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.TestBase.TestBase;

public class AddEmployeePage extends TestBase {

	
	public AddEmployeePage()
	{
	PageFactory.initElements(driver, this);
	}

	// Verifying the AddEmployee Text
	// //*[@id="content"]/div/div[1]/h1

	@FindBy(xpath="//*[@id='content']/div/div[1]/h1")
	WebElement addEmployeeLabel;

	@FindBy(id="firstName")
	WebElement firstName;

	@FindBy(id="lastName")
	WebElement lastName;

	@FindBy(id="employeeId")
	WebElement empID;

	@FindBy(id="btnSave")
	WebElement saveButton;

	public boolean verifyAddEmployeeLabel()
	{
	return addEmployeeLabel.isDisplayed();
	}

	public String verifyAddEmployeePageTitle()
	{
	return driver.getTitle();
	}


	public void createNewEmployee(String fName,String lName) throws InterruptedException, IOException
	{
	firstName.sendKeys(fName);
	lastName.sendKeys(lName);

	String empIdNumber=empID.getAttribute("value");

	Actions act = new Actions(driver);
	act.sendKeys(Keys.TAB).build().perform();

	act.sendKeys(Keys.TAB).build().perform();
	//act.sendKeys(Keys.TAB).build().perform(); // Focus will be at the Photograph Element

	act.sendKeys(Keys.ENTER).build().perform();

	//Runtime.getRuntime().exec("C:\\Users\\srinivas1\\Desktop\\Srini_POM_CompleApproach\\OrangeHRMApplication_POM\\AutoITScript\\EmployeePhotographUpload.exe");

	saveButton.click();

	}


	
}
