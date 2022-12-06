package com.Super_Admin;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class PACE_CA_Project_Test extends Base_Pace
{
		
	Login_Page Login_page;
	
	PACE_CA_Project_Page create_project;
	
	public PACE_CA_Project_Test()
	{
		super();
	}
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		create_project = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
	
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[4]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Funding')]")).click();

	}
	
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verifying Create New Project")
	@Test(priority = 1, description = "Verifying Select New Project")
	public void New_Project() throws InterruptedException {
		
		create_project.New_Project();
	}
	
	// Eligibility Tab
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 2, description = "Verfying Address Eligibility")
	public void Select_Contractor() throws InterruptedException
	{		
		create_project.Select_Contractor();
		
	}
	
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 3, description = "Verfying Applicant Details")
	public void Credit_Application_Tab() throws InterruptedException
	{		
		create_project.Credit_Application_Tab();
	
	}
	
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 4, description = "Verfying Login to Credit Portal")
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.get(prop.getProperty("credit_portal_url")); 
		create_project.Credit_portal_Login();
						
	}
	
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 5, description = "Verfying Application Status")
	public void View_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		create_project.View_Project();
						
	}
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 6, description = "Verfying Contract Sign and Send")
	public void Submit_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		create_project.Submit_Contract();
						
	}
	
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 7, description = "Verfying NTP Process ")
	public void Submit_NTP() throws InterruptedException
	{	
		Thread.sleep(3000);
		create_project.Submit_NTP();
		
						
	}
	
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 8, description = "Verfying Funding Process")
	public void Funding_Tab() throws InterruptedException, IOException
	{
		
		create_project.Funding_Tab();
	}	
	
}
