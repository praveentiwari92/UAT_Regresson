package com.Super_Admin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class PACE_MO_Decrease_Price_at_COC extends Base_Pace {
	
	PACE_MO_Decrease_Price_at_COC_Page Decrease_Amount;
	Login_Page Login_Page;
	PACE_CA_Project_Page PACE;
	
	public PACE_MO_Decrease_Price_at_COC()
	{
		super();
	}
	
	
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_Page = new Login_Page();
		PACE = new PACE_CA_Project_Page();
		Decrease_Amount = new PACE_MO_Decrease_Price_at_COC_Page();
		PACE = Login_Page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
	
		
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[5]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Funding')]")).click();
}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		System.out.println("****** Decrease_Price_Project *******");
		Decrease_Amount.New_Project();

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		Decrease_Amount.Select_Contractor();

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{	
		Thread.sleep(3000);
		Decrease_Amount.Credit_Application_Tab();				
	}

	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 4)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.get(prop.getProperty("credit_portal_url"));
		Decrease_Amount.Credit_portal_Login();

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 5)
	public void View_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		Decrease_Amount.View_Project();

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 6)
	public void Submit_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		Decrease_Amount.Submit_Contract();

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 7)
	public void Submit_NTP() throws InterruptedException
	{	
		Thread.sleep(3000);
		Decrease_Amount.Submit_NTP();


	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 8)
	public void Funding_Tab() throws InterruptedException, IOException
	{

		Decrease_Amount.Funding_Tab();
	}

	
	
	
	
	
}