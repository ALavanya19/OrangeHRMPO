package com.OHRM.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeSuite;

import com.OHRM.Utility.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream propfile;
	
	public static ExtentReports report;
	public static ExtentTest logger;

	public TestBase()
	{
		try
		{
			propfile=new FileInputStream("./src/main/java/com/OHRM/config/config.properties");
			prop=new Properties();
			prop.load(propfile);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initilization() {
		
	if(prop.getProperty("browser").equals("chrome")) 
	{
		WebDriverManager.chromedriver().setup();
	   	driver=new ChromeDriver();
	}
	else if(prop.getProperty("browser").equals("opera"))
	{
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
	}
	else if(prop.getProperty("browser").equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	
	}
	/*
	@BeforeSuite
	public void setUpSuite() {
		
		ExtentHtmlReporter extent=new ExtentHtmlReporter("./Reports/ohrmReports.html");
		report=new ExtentReports();
		report.attach
	}
	*/
	
}
