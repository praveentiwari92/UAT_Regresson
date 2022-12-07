package com.Super_Admin;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TC_UNS_Solar_Project extends Base_Pace
{

	Login_Page Login_page;
	
	PACE_CA_Project_Page PACE;
	
	UNS_Solar_Project_Page UNS_Solar;
	
	public TC_UNS_Solar_Project()
	{
		super();
	}
		

	@BeforeClass
	public void Test_Setup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = new PACE_CA_Project_Page();
		UNS_Solar = new UNS_Solar_Project_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
	
		Thread.sleep(1000);

		
//		driver.findElement(By.xpath("//div[@class='PRAMS-search']//input[@id='search']")).sendKeys("7003090");
//		
//		driver.findElement(By.xpath("//div[@class='PRAMS-search']//input[@id='search']")).sendKeys(Keys.ENTER);
//		
		
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[5]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Funding')]")).click();
	
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		System.out.println("****** UNS_Project *******");
		PACE.New_Project();
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		PACE.Select_Contractor();

	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		PACE.Credit_Application_Tab();
	
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 4)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.navigate().to("https://uatcredit.homerunportal.com/");  
		PACE.Credit_portal_Login();
						
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 5)
	public void View_UNS_Solar_Project() throws InterruptedException
	{	

		UNS_Solar.View_UNS_Solar_Project();
						
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 6)
	public void Submit_UNS_Solar_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		UNS_Solar.Submit_UNS_Solar_Contract();
						
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 7)
	public void Submit_NTP() throws InterruptedException
	{	
		Thread.sleep(3000);
		UNS_Solar.Submit_NTP();
		
						
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 8)
	public void Funding_Tab() throws Exception
	{	
		Thread.sleep(3000);
		UNS_Solar.Funding_Tab();
	}
}
