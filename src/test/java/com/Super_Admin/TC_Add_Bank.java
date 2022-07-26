package com.Super_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TC_Add_Bank extends Base_Pace{
	
	Login_Page Login_page;
	Add_Bank_Page Add_Bank;
	PACE_CA_Project_Page PACE;
	
	public TC_Add_Bank()
	{
		super();
	}
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = new PACE_CA_Project_Page();
		Add_Bank = new Add_Bank_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='project-details-box']//li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Application')]")).click();
		
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		Add_Bank.New_Project();
	}
	
	// Eligibility Tab
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		Add_Bank.Select_Contractor();

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		Add_Bank.Credit_Application_Tab();
	
	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 4)
	public void Add_Bank_From_More_Menu() throws InterruptedException
	{		
		Add_Bank.Add_Bank_From_More_Menu();
	
	}
	

}
