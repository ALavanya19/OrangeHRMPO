package com.OHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.TestBase.TestBase;

public class HomePage extends TestBase{

	//Find all Objects in HomePage
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
	WebElement adminE;
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']")
	WebElement pimE;
	   
	  @FindBy(xpath="//*[@id='menu_pim_addEmployee']")
	  WebElement addEmployeeE;
	
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']")
	WebElement leaveE;
	
	@FindBy(xpath="//*[@id='menu_time_viewTimeModule']")
	WebElement timeE;
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']")
	WebElement recruitmentE;
	
	@FindBy(xpath="//*[@id='menu__Performance']")
	WebElement performanceE;
	
	@FindBy(xpath="//*[@id='menu_dashboard_index']")
	WebElement dashBoardE;
	
	@FindBy(xpath="//*[@id='menu_directory_viewDirectory']")
	WebElement DirectoryE;
	
	@FindBy(xpath="//*[@id='menu_maintenance_purgeEmployee']")
	WebElement maintananceE;
	
	//initilization
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//operations
	public String validatingOHRMHomePageTitle() {
		
		return driver.getTitle();
	}
	
	public String validatingOHRMHomePageCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public AdminPage adminClick() {
		
		Actions action=new Actions(driver);
		action.moveToElement(adminE).perform();
		return new AdminPage();
	}
	
	public PIMPage pimClick() {
		Actions action=new Actions(driver);
		action.moveToElement(pimE).perform();
		return new PIMPage();
	}
	
	public AddEmployeePage addEmpClick() {
		
		Actions action=new Actions(driver);
		action.moveToElement(pimE).perform();
		addEmployeeE.click();
		return new AddEmployeePage();
	}
	
	
}
