package com.Super_Admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;
import com.qa.Util.JiraPolicy;
import com.qa.Util.TC_TestUtil;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class TC_Login_Test extends Base_Pace
{

	Login_Page Login_page;
	PACE_CA_Project_Page PACE;
	
	public TC_Login_Test() {
		
		super();
	}
	
	
	@BeforeClass
	public void TestSetup() throws FileNotFoundException {
		Initialization();
		
		String projectRootPath = TC_TestUtil.getProjectDirectory();
		
		if(TC_TestUtil.isWindows()) {
			System.setOut(new PrintStream(new FileOutputStream(projectRootPath + "\\" +"Log.txt"))); //Uploading the file using sendKeys
		}else {
			System.setOut(new PrintStream(new FileOutputStream(projectRootPath + "/" +"Log.txt"))); //Uploading the file using sendKeys
		}

		Login_page = new Login_Page();
	
	}
	
	@Severity(SeverityLevel.NORMAL)
	@JiraPolicy(logTicketReady=false)
	@Test(priority = 1)
	public void Admin_Login()
	{
		try {
			Thread.sleep(2000);
			PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
			
			String actualTitle = driver.getTitle();
			
			String Expected_title = "Home | Home Run Financing";
			
			if(actualTitle.equalsIgnoreCase(Expected_title))
				System.out.println("Title Matched");
			
			else
				System.out.println("Title didn't match");
						
		
			
		} catch (InterruptedException e) {
			
			System.out.println("WebDriver couldn’t locate the element");
		}
		
	}
	
	
	}

