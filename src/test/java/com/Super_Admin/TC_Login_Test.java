package com.Super_Admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;
import com.qa.Util.JiraPolicy;


public class TC_Login_Test extends Base_Pace
{

	Login_Page Login_page;
	Create_PACE_Project_Page PACE;
	
	public TC_Login_Test() {
		
		super();
	}
	
	
	@BeforeClass
	public void TestSetup() {
		Initialization();
		Login_page = new Login_Page();
	
	}
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 1)
	public void Admin_Login()
	{
		try {
			Thread.sleep(2000);
			PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_paass"));
			
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
