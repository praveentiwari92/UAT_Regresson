package com.Super_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;
import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class UNS_Solar_FL_Vanity_URL_Project extends Base_Pace
{

	Login_Page Login_page;

	PACE_CA_Project_Page PACE;

	UNS_Solar_FL_Vanity_URL_Project_Page Vanity;


	public UNS_Solar_FL_Vanity_URL_Project()
	{
		super();
	}


	@BeforeClass
	public void TestSetup() throws InterruptedException
	{
		Initialization();
		Vanity = new UNS_Solar_FL_Vanity_URL_Project_Page();
		Thread.sleep(1000);
	}	

	@Test(priority = 1)
	public void Submit_Application() throws InterruptedException
	{
		System.out.println("***** vanity_url Project ********");
		driver.get(prop.getProperty("vanity_url"));
		Vanity.Submit_Application();
		Thread.sleep(2000);


	}

	@Test(priority = 2)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		driver.get(prop.getProperty("credit_portal_url"));
		Thread.sleep(3000);  
		Vanity.Credit_portal_Login();

	}


	@Test(priority = 3)
	public void View_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		Vanity.View_Project();
		Thread.sleep(2000);

	}


	@Test(priority = 4)
	public void Contract_page() throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		Login_page = new Login_Page();
		PACE = new PACE_CA_Project_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='project-details-box']//li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Funding')]")).click();
		
		Vanity.Submit_UNS_Contract();

	}

	@Test(priority = 5)
	public void Submit_NTP() throws InterruptedException
	{	
		Thread.sleep(3000);
		Vanity.Submit_NTP();


	}

	@Test(priority = 6)
	public void Funding_Tab() throws Exception
	{	
		Thread.sleep(3000);
		Vanity.Funding_Tab();
	}

}