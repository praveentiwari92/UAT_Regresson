package com.Super_Admin;

import static org.testng.Assert.assertTrue;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pace_Base.Base_Pace;
import com.qa.Util.TC_TestUtil;


public class Special_Offer_Project_Page extends Base_Pace
{
	String Send_NTP = "https://uat.homerunportal.com/crons/sendProjectNtp/";
	String Get_msg = "http://uat.homerunportal.com/crons/getMessagesFromActiveQueue";
	String Invoice = "https://uat.homerunportal.com/crons/generateFundingInvoice/";
	
	
	// View Project
		@FindBy(xpath = "//tbody/tr[2]/td[11]/div[1]/a[1]")
		WebElement project_no;

		@FindBy(xpath = "//span[normalize-space()='Special Offer']")
		WebElement UNS_Project;
		
		@FindBy(xpath = "//tbody/tr[2]/td[3]/p[1]/input[1]")
		WebElement VERIFIED_INCOME;
		
		// Add new applicant

		@FindBy(xpath = "//tbody/tr[@class='edit-default-app-name']/td[4]/div[1]/div[1]/a[1]/div[1]/img[1]")
		WebElement Add_Btn;

		@FindBy(xpath = "//input[@id='add_applicant_first_name']")
		WebElement F_name_of_secnd_applicant;

		@FindBy(xpath = "//input[@id='add_applicant_last_name']")
		WebElement L_name_of_secnd_applicant;

		@FindBy(xpath = "//input[@id='add_applicant_email']")
		WebElement Email_of_secnd_applicant;

		@FindBy(xpath = "//input[@id='add_applicant_phone']")
		WebElement Phone_No_of_secnd_applicant;

		@FindBy(xpath = "//label[normalize-space()='Contributor']")
		WebElement Contributor;


		@FindBy(xpath = "//button[@value='fill_here']")
		WebElement Save_Btn_secnd_applicant;
		
		@FindBy(xpath="//button[contains(text(),'credit application')]")
		WebElement Submit_Application;
		
		@FindBy(id = "submit-button") 
		WebElement PrpopetyInfo_Next_Btn;
		
		@FindBy(xpath = "//a[normalize-space()='NEXT']") 
		WebElement Cont_PrpopetyInfo_Next_Btn;
		
		@FindBy(id = "applicant-detail-tracker") 
		WebElement SSN_No;
		
		@FindBy(id = "applicant-detail-pro-date") 
		WebElement DOB;
		
		@FindBy(id = "app-gross-annual-income") 
		WebElement Annual_Income;
		
		@FindBy(className  = "CRB-right") 
		WebElement Save_First_Applicant;
		
		@FindBy(className  = "CRB-right") 
		WebElement Save_First_Contributor;
		
		@FindBy(xpath= "//label[@for='cert-con-0']")
		WebElement checkbox1;
		
		@FindBy(xpath= "//label[@for='cert-con-1']")
		WebElement checkbox2;
		
		@FindBy(xpath= "//label[@for='cert-con-2']")
		WebElement checkbox3;
		
		@FindBy(xpath= "//label[@for='common-checkbox-1']")
		WebElement checkbox4;
		
		@FindBy(id="submit-button-new")
		WebElement certifications_submit_button;
		
		@FindBy(xpath="//label[normalize-space()='I consent to a credit pull and title check']")
		WebElement popup_checkbox;
		
		@FindBy(xpath="//button[@id='submit-button']")
		WebElement Credit_Signature_submit_button;
		// End of new applicant Application
		
		@FindBy(xpath = "//button[@id='modify_credit_final']")
		WebElement Modify_Decision;
		
		@FindBy(xpath = "//button[normalize-space()='Yes, continue']")
		WebElement Yes_Continue;
		
		@FindBy(id = "decision")
		WebElement decision_drp;
		
		@FindBy(xpath = "//select[@id='decision']//option[@value='Approved'][normalize-space()='Approved']")
		WebElement decision_status;
		
		@FindBy(xpath = "//input[@placeholder='Enter amount']")
		WebElement Approve_Amount;
		
		@FindBy(id = "btnUpdateAppStatus")
		WebElement Amt_Submit_btn;
		
		@FindBy(id = "submit_for_credit_final")
		WebElement submit_for_credit_final;
		
		@FindBy(xpath = "//button[normalize-space()='Yes']")
		WebElement Credit_Confirm_popup;
		
		@FindBy(id = "credit_final")
		WebElement Credit_Final_btn;
		
		@FindBy(xpath="//button[normalize-space()='Yes, continue']")
		WebElement Credit_Final_Popup;
		
		
		// Contract Tab 

		@FindBy(xpath="//a[@id='send-contract-tab-link']")
		WebElement contract_tabs;

		@FindBy(xpath="//div[contains(text(),'Select Product Type')]")
		WebElement Product_drp;

		@FindBy(xpath="//span[normalize-space()='Special Offer']")
		WebElement Select_Product_type;

		@FindBy(xpath="//div[contains(text(),'Select In-Home Salesperson')]")
		WebElement Salesperson_drp;


		@FindBy(xpath="//div[contains(text(),'Select Term')]")
		WebElement Select_term;

		@FindBy(xpath="//span[normalize-space()='5']")
		WebElement Select_term_value;

		@FindBy(xpath="//div[contains(text(),'Select Improvement Type')]")
		WebElement Select_Improvement_Type;

		@FindBy(xpath="//span[normalize-space()='Air Conditioning']")
		WebElement Select_Improvement_Value;

		@FindBy(xpath="//div[contains(text(),'Select Manufacturer')]")
		WebElement Select_Manufacturer_Type;

		@FindBy(xpath="//span[normalize-space()='AC Pro']")
		WebElement Select_Manufacturer_Value;


		@FindBy(id="contract-addendum-improvement-types-0-qty")
		WebElement Quantity_Value;
		
		@FindBy(id="contract-addendum-improvement-types-1-qty")
		WebElement Quantity_Value2;


		@FindBy(id="total-project-cost")
		WebElement Cost_Value;

		@FindBy(xpath="//span[@class='validate-text']")
		WebElement Validate_Btn;

		//	@FindBy(xpath="//input[@value='Void & Resign Contract in Browser']") 
		
		@FindBy(xpath="//input[@value='Sign Contract in Browser']")
		WebElement Sign_Contract_Btn;
			
		@FindBy(xpath="//button[normalize-space()='Attest']")
		WebElement Attest_Btn;

		@FindBy(xpath="//button[normalize-space()='Proceed']")
		WebElement Proceed_Btn;	

		@FindBy(xpath="//div[@class='mt-5 mb-5']")
		WebElement Signature_Btn;

		@FindBy(xpath="//label[@for='disclosureAccepted']") 
		WebElement Signature_Discloser_checkbox;

		@FindBy(xpath="//button[@id='action-bar-btn-continue']") 
		WebElement Continue_Btn;

		@FindBy(xpath="//span[normalize-space()='Start']") 
		WebElement Start_Btn;
		
		@FindBy(xpath="//span[normalize-space()='Choose']") 
		WebElement Choose_Btn1;
		
		

		@FindBy(xpath="//span[normalize-space()='Required - AchDecision - No']") 			  
		WebElement Initial_Sign_Btn_1;

		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[1]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_2;
		
		@FindBy(xpath="//button[normalize-space()='Adopt and Sign']") 
		WebElement Adopt_and_Initial_Btn;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_3;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_4;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[3]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_5;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[4]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_6;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[7]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_7;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[11]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_8;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[12]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_9;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[15]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_10;

		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[18]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  		  
		WebElement Initial_Sign_Btn_11;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[9]/div[2]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  		  
		WebElement Initial_Sign_Btn_12;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[11]/div[1]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  		  
		WebElement Initial_Sign_Btn_13;


		@FindBy(xpath="//body/div[@id='container']/div[5]/div[1]/div[1]/div[1]/button[1]") 
		WebElement Finish_Btn;

		@FindBy(xpath="//div[@class='alert alert-info alert-dismissible fade show mt-2']//div[2]") 
		WebElement Second_Signature_Btn;
		
		
		@FindBy(xpath="//span[normalize-space()='Start']") 
		WebElement Contirbutor_Start_Btn;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[1]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
		WebElement Loan_Essesment_Sign;
		
		@FindBy(xpath="//button[normalize-space()='Adopt and Sign']") 
		WebElement Adopt_and_Sign_Btn;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
		WebElement Lien_On_My_Imp_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[4]/button[1]/div[1]/div[1]") 
		WebElement Late_Payment_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[6]/button[1]/div[1]/div[1]") 
		WebElement Tax_Benefits_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[3]/div[1]/div[4]/div[8]/button[1]/div[1]/div[1]") 		   
		WebElement Insurance_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[7]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
		WebElement Loan_Agreement_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[11]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
		WebElement Term_Conditon_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[15]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
		WebElement Reconveyance_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[18]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]/i[1]") 
		WebElement Borrower_Sign;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[9]/div[2]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
		WebElement Oral_agrmnt_Sign;
		
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[11]/div[1]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
		WebElement Disbursement_Sign;
		
		// End Sign for contributor	
		
		@FindBy(xpath="//div[@class='modal-dialog modal-add custom-modal']//button[@aria-label='Close']") 
		WebElement Close_Popup;

		@FindBy(xpath="//button[@id='contractNxt']") 
		WebElement Next_btn;
		
		// NTP TAB
		
		@FindBy(xpath="//div[@id='ntp_collapseFiveTerm']//button[@type='button'][normalize-space()='Success']") 
		WebElement TCC_Success_Btn;
		
		
		@FindBy(xpath="//label[@for='Term-Confirmation-Call-english']") 
		WebElement TCC_English;
		
		@FindBy(xpath="//label[normalize-space()='No']") 
		WebElement TCC_English_No;
		
		
		@FindBy(xpath="//button[@id='Term-Confirmation-Call']") 
		WebElement TCC_English_Done;
		
	// Courtesy Call
		@FindBy(xpath="//div[@id='ntp_collapseFiveCour']//button[@type='button'][normalize-space()='Success']") 
		WebElement CC_English_Btn;

		@FindBy(xpath="//label[@for='Courtesy-Call-english']") 
		WebElement CC_English;

		@FindBy(xpath="//div[@id='ntp_collapseFiveCour']//button[@type='button'][normalize-space()='Done']") 
		WebElement CC_English_Done;
		
		@FindBy(xpath="//button[@id='ntpNextStep']") 
		WebElement NTP_Next_Btn;
		
	// Funding Tab 
		
		@FindBy(id="generate-coi") 
		WebElement Generate_coi;

		@FindBy(xpath="//button[@data-type='projectcost']") 
		WebElement TPC_Confirm_Btn;

		@FindBy(xpath="//button[@data-type='termaddendum']") 
		WebElement Term_Confirm_Btn;


		@FindBy(xpath="//button[@data-type='rate']") 
		WebElement Rate_Confirm_Btn;


		@FindBy(xpath="//button[@data-type='fee']") 
		WebElement Fee_Confirm_Btn;

		@FindBy(xpath="//button[@data-type='netPayment']") 
		WebElement NetPayment_Confirm_Btn;

		@FindBy(xpath="//button[@data-type='transfer']") 
		WebElement Transfert_Confirm_Btn;


		@FindBy(xpath="//button[@data-type='account']") 
		WebElement Account_Confirm_Btn;

		@FindBy(xpath="//button[@data-type='routing']") 
		WebElement Routing_Confirm_Btn;

		@FindBy(xpath="//button[@data-type='contemail']") 
		WebElement Contemail_Confirm_Btn;

		@FindBy(xpath="//button[@data-type='contphone']") 
		WebElement Contphonel_Confirm_Btn;


		@FindBy(xpath="//button[normalize-space()='Attest']") 
		WebElement Attest_Confirm_Btn;

		@FindBy(xpath="//button[normalize-space()='Proceed']") 
		WebElement Proceed_Confirm_Btn;
		
	
	public Special_Offer_Project_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void View_UNS_Project() throws InterruptedException
	{
		project_no.click();
		Thread.sleep(2000);
		UNS_Project.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1550)", "");
		
		VERIFIED_INCOME.clear();
		Thread.sleep(4000);
		VERIFIED_INCOME.sendKeys("7000000");
		Thread.sleep(1000);
		VERIFIED_INCOME.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		System.out.println("******* Add New Contributor *********");
		
		// Add First Contributor ------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				driver.findElement(By.xpath("//tbody/tr[@class='edit-default-app-name']/td[5]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
				Thread.sleep(1000);
				F_name_of_secnd_applicant.sendKeys("praveen");
				L_name_of_secnd_applicant.sendKeys("Testcase");
				Email_of_secnd_applicant.sendKeys("pkt2@yopmail.com");
				Thread.sleep(1000);
				Phone_No_of_secnd_applicant.sendKeys("974) 724-6219");
				Thread.sleep(1000);
				Contributor.click();
				Thread.sleep(1000);
				Save_Btn_secnd_applicant.click();
				Thread.sleep(2000);
				ArrayList<String> cc = new ArrayList<String>(driver.getWindowHandles());
				//switch to open tab
				driver.switchTo().window(cc.get(2));	

				Thread.sleep(3000);

				//	System.out.println("New tab title: " + driver.getTitle());
				Submit_Application.click();
				Thread.sleep(2000);
				JavascriptExecutor jss = (JavascriptExecutor) driver;
				jss.executeScript("window.scrollBy(0,450)", "");
				Thread.sleep(2000);
				Cont_PrpopetyInfo_Next_Btn.click();

				Thread.sleep(2000);
				SSN_No.sendKeys("00000000");
				Thread.sleep(2000);
				SSN_No.sendKeys("3");
				Thread.sleep(2000);
				DOB.sendKeys("05/12/1989");
				Thread.sleep(3000);
				Annual_Income.sendKeys("800000");
				Thread.sleep(2000);
				Save_First_Contributor.click();

				Thread.sleep(2000);

				checkbox1.click();

				checkbox2.click();

				checkbox3.click();

				checkbox4.click();

				Thread.sleep(2000);
				certifications_submit_button.click();

				Thread.sleep(2000);
				popup_checkbox.click();

				Credit_Signature_submit_button.click();

				driver.findElement(By.xpath("//a[normalize-space()='Close Window']")).click();

				driver.switchTo().window(cc.get(1));

				Thread.sleep(2000);
				System.out.println("****** Contributor Added Successfully  *****");
		
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-1550)", "");
		
		Thread.sleep(60000);
		driver.navigate().refresh();
		Thread.sleep(70000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement credit_final =driver.findElement(By.xpath("//p[normalize-space()='Credit Finalled']"));
		String s= credit_final.getText();
		System.out.println("Text content is : " + s);
		
		
		Thread.sleep(1000);
		Modify_Decision.click();
		Thread.sleep(2000);
		
		Yes_Continue.click();
		Thread.sleep(3000);
		
		Select Status = new Select(driver.findElement(By.xpath("//select[@id='decision']")));
		Status.selectByValue("Approved");
		
		Thread.sleep(2000);
		Approve_Amount.clear();
		Thread.sleep(1000);
		
		Approve_Amount.sendKeys("500000");
		Thread.sleep(2000);
		
		Amt_Submit_btn.click();
		Thread.sleep(5000);
		
		Credit_Final_btn.click();
		Thread.sleep(1000);
		
		Credit_Final_Popup.click();
		Thread.sleep(2000);
		
		// store window handle ids
		ArrayList<String> ww = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.close();
		driver.switchTo().window(ww.get(0));	
		Thread.sleep(1000);
	
		System.out.println("**** Credit Status Approved Successfully ****");

	}
	
	public void Submit_SO_Contract() throws InterruptedException
	{
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-550)", "");
			
			contract_tabs.click();
			
			Product_drp.click();
			Select_Product_type.click();
			Thread.sleep(2000);
			
			Salesperson_drp.click();
			Thread.sleep(2000);
	
			Select se = new Select(driver.findElement(By.xpath("//select[@id='home-salesperson-id']")));
			se.selectByValue("30002");
			Thread.sleep(1000);
			
			Select Prog = new Select(driver.findElement(By.xpath("//select[@id='program-id']")));			
			Prog.selectByValue("471");
			Thread.sleep(2000);
			
			Select Term = new Select(driver.findElement(By.xpath("//select[@id='term']")));
			Term.selectByValue("20");
			
			Cost_Value.sendKeys("700000");
			Thread.sleep(2000);				
			
			Select improve= new Select(driver.findElement(By.xpath("//select[@id='contract-addendum-improvement-types-0-improvement-type-id']")));
			improve.selectByValue("13");
			
			Thread.sleep(2000);
			Quantity_Value.sendKeys("1");
			
			Thread.sleep(2000);
			Validate_Btn.click();
			Thread.sleep(3000);
			
			String actualString = driver.findElement(By.xpath("//div[@id='assessment-limit-exceed-uns']//strong[contains(text(),'Exceeds Limit')]")).getText();
			
			assertTrue(actualString.contains("Exceeds Limit"));
			
			if(actualString.contains("Exceeds Limit")) {
				System.out.println("**** Amount Validate Successfully for Limit Exceed ******");
			}
			else if(actualString.contains("Credit declined")){
			System.out.println("**** Amount Validate Successfully for Credit declined ******");
			}
			else {
				System.out.println("**** Something Went Wrong ******");
			}
			
			Thread.sleep(2000);	
			Cost_Value.clear();
			Thread.sleep(1000);	
			Cost_Value.sendKeys("40000");
			Thread.sleep(2000);	
			Validate_Btn.click();
			Thread.sleep(3000);	
			String actualString1 = driver.findElement(By.xpath("//div[@id='assessment-approve-uns']//strong[contains(text(),'Approved')]")).getText();
			assertTrue(actualString1.contains("Approved")); 
			
			if(actualString1.contains("Approved"))
			{
			System.out.println("**** Amount Approved Successfully ******");
			}
			
			Thread.sleep(1000);
			Sign_Contract_Btn.click();
			Thread.sleep(3000);
			
			Attest_Btn.click();
			Thread.sleep(1000);
			
			Proceed_Btn.click();
			Thread.sleep(1000);
			
		//	driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
	
			
			Thread.sleep(35000);
			Signature_Btn.click();
			System.out.println("****** Waiting for the Doc-sign ******");
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(w.get(1));	
			Thread.sleep(5000);
		
			Signature_Discloser_checkbox.click();
			Thread.sleep(2000);
			Continue_Btn.click();
			Thread.sleep(2000);
			
			Start_Btn.click();
			Thread.sleep(2000);
		
		//	Thread.sleep(2000);	
			Initial_Sign_Btn_1.click();
			System.out.println("***** Sign 1 ****");
			Thread.sleep(2000);
			
		//	Choose_Btn1.click();
			
			Initial_Sign_Btn_2.click();
			Thread.sleep(4000);
			
			Adopt_and_Initial_Btn.click();
			System.out.println("***** Sign 2 ****");
			Thread.sleep(5000);
			
			Initial_Sign_Btn_3.click();
			System.out.println("***** Sign 3 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_4.click();
			System.out.println("***** Sign 4 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_5.click();
			System.out.println("***** Sign 5 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_6.click();
			System.out.println("***** Sign 6 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_7.click();
			System.out.println("***** Sign 7 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_8.click();
			System.out.println("***** Sign 8 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_9.click();
			System.out.println("***** Sign 9 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_10.click();
			System.out.println("***** Sign 10 ****");
			Thread.sleep(2000);

			Initial_Sign_Btn_11.click();
			System.out.println("***** Sign 11 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_12.click();
			System.out.println("***** Sign 12 ****");
			Thread.sleep(2000);
			
			Initial_Sign_Btn_13.click();
			System.out.println("***** Sign 14 ****");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			Finish_Btn.click();
			Thread.sleep(9000);
			System.out.println("******* Sign for First Applicant Completed ********");
			
			// Doc-Sign for Contributor
			
			Second_Signature_Btn.click();
			System.out.println("******* Sign for Second Applicant started ********");			
			ArrayList<String> con = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(con.get(2));	
			Thread.sleep(5000);
		
			Signature_Discloser_checkbox.click();
			Thread.sleep(2000);
			Continue_Btn.click();
			Thread.sleep(2000);
			
			Start_Btn.click();
			Thread.sleep(2000);

			Loan_Essesment_Sign.click();
			System.out.println("***** Loan_Essesment_Sign ****");
			Thread.sleep(2000);
			
			Adopt_and_Sign_Btn.click();
			System.out.println("***** Adopt_and_Sign_Btn ****");
			Thread.sleep(5000);
			
			Lien_On_My_Imp_Sign.click();
			System.out.println("***** Lien_On_My_Imp_Sign ****");
			
			Thread.sleep(2000);
			
			Late_Payment_Sign.click();
			System.out.println("***** Late_Payment_Sign ****");
			Thread.sleep(2000);
			
			Tax_Benefits_Sign.click();
			System.out.println("***** Tax_Benefits_Sign ****");
			Thread.sleep(2000);
			
			Insurance_Sign.click();
			System.out.println("***** Insurance_Sign ****");
			Thread.sleep(2000);
			
			Loan_Agreement_Sign.click();
			System.out.println("***** Loan_Agreement_Sign ****");
			Thread.sleep(2000);
			
			Term_Conditon_Sign.click();
			System.out.println("***** Term_Conditon_Sign ****");
			Thread.sleep(2000);
			
			Reconveyance_Sign.click();
			System.out.println("***** Reconveyance_Sign ****");
			Thread.sleep(2000);
			
			Borrower_Sign.click();
			System.out.println("***** Oral_agrmnt_Sign ****");
			Thread.sleep(2000);
			
			Oral_agrmnt_Sign.click();
			System.out.println("***** Oral_agrmnt_Sign ****");
			Thread.sleep(2000);
			
			Disbursement_Sign.click();
			System.out.println("***** Disbursement_Sign ****");
			
			Thread.sleep(2000);
			
			Finish_Btn.click();
			System.out.println("******* Sign for Second Applicant Completed ********");
			Thread.sleep(5000);
			
			driver.close();
			driver.switchTo().window(w.get(0));	
			
			Thread.sleep(2000);
			Close_Popup.click();
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			Next_btn.click();
			
			System.out.println("**** Contract Send Successfully ****");
		
	}

		public void Submit_NTP() throws InterruptedException
		{
			System.out.println("****** User on NTP Tab ********");
			// Assessment Contract Sign
						WebElement Contract = driver.findElement(By.xpath("//div[@class='custom-upload-box']//input[@name='file']"));
						
						String projectRootPath = TC_TestUtil.getProjectDirectory();
						
						if(TC_TestUtil.isWindows()) {
							Contract.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
						}else {
							Contract.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
						}
						Thread.sleep(1000);
						driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
						
						System.out.println("***** Assessment Contract Sign *****");
						
					//	Term Confirmation Call
						
						Thread.sleep(2000);
						TCC_Success_Btn.click();
						Thread.sleep(2000);
						TCC_English.click();
						Thread.sleep(2000);
						TCC_English_No.click();
						Thread.sleep(2000);
						TCC_English_Done.click();
						Thread.sleep(3000);
						System.out.println("***** Term Confirmation Call *****");
						
					
					// Curtsy Call 
						CC_English_Btn.click();
						Thread.sleep(2000);
						CC_English.click();
						Thread.sleep(2000);
						CC_English_Done.click();
						Thread.sleep(2000);
						System.out.println("***** Curtsy Call *****");
						
						
						WebElement p=driver.findElement(By.xpath("//div[@class='custom-bread-left']//li[3]"));
					    //getText() to obtain text
						String s= p.getText();
						System.out.println("Project Number is : " + s);
						System.out.println("***** Project Number Get *****");
						
						
						driver.switchTo().newWindow(WindowType.TAB);
						ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
						//switch to open tab
						driver.switchTo().window(w.get(1));	
						Thread.sleep(2000);
						driver.get(Get_msg);
						Thread.sleep(2000);
						driver.navigate().refresh();
						Thread.sleep(8000);
						
						driver.get(Send_NTP+s); 
							
						Thread.sleep(3000);
						
						 WebElement text = driver.findElement(By.xpath("//body/br[2]"));
						   
				         // Fetching the text using method and printing it     
				         System.out.println("Element found using text: " + text.getText());
					
						
						Thread.sleep(2000);
						ArrayList<String> wr = new ArrayList<String>(driver.getWindowHandles());
						driver.close();
						driver.switchTo().window(wr.get(0));
						
						driver.navigate().refresh();
					
						Thread.sleep(2000);
						driver.findElement(By.xpath("//a[normalize-space()='More ...']")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//a[normalize-space()='Additional Review']")).click();
						
						Thread.sleep(1000);
						
						WebElement cheklist = driver.findElement(By.xpath("//label[@for='applications']"));
										
						cheklist.click();
						
						Thread.sleep(3000);
						driver.findElement(By.xpath("//div[@class='modal-dialog modal-add custom-modal modal-lock-project']//button[@aria-label='Close']")).click();
						logger.info("***** Additional Review  *****");
						
						driver.switchTo().newWindow(WindowType.TAB);
						ArrayList<String> ww = new ArrayList<String>(driver.getWindowHandles());
						
						//switch to open tab
						driver.switchTo().window(ww.get(1));	
						
						driver.get(Get_msg);
						driver.navigate().refresh();
						
						Thread.sleep(8000);

						driver.switchTo().window(w.get(0));
						
						Thread.sleep(2000);
						ArrayList<String> we = new ArrayList<String>(driver.getWindowHandles());
						driver.switchTo().window(we.get(1));
						driver.get(Send_NTP+s); 
						Thread.sleep(4000);
						driver.close();
						
						driver.switchTo().window(we.get(0));
						
						driver.navigate().refresh();
						Thread.sleep(8000);
						
						ArrayList<String> sndNtp = new ArrayList<String>(driver.getWindowHandles());
						driver.switchTo().window(sndNtp.get(0));
						
						driver.get(Get_msg);
						Thread.sleep(2000);
						driver.navigate().refresh();
						
						Thread.sleep(4000);
						driver.navigate().back();
						Thread.sleep(4000);
						driver.switchTo().window(sndNtp.get(0));
						Thread.sleep(2000);
					
						JavascriptExecutor jss = (JavascriptExecutor) driver;
						jss.executeScript("window.scrollBy(0,1050)", "");
						
						Thread.sleep(2000);
						NTP_Next_Btn.click();
						System.out.println("**** NTP Send Successfully ****");
		}
		
		@SuppressWarnings("deprecation")
		public void Funding_Tab() throws Exception 
		{
			System.out.println("******* User on Funding Tab ******");
			Generate_coi.click();
			Thread.sleep(2000);
			
			String actualString = driver.findElement(By.xpath("//div[@id='coc_totalCost']")).getText();
			assertTrue(actualString.contains("$40,000.00"));
			
			if(actualString.contains("$40,000.00"))
			{
			System.out.println("**** Amount Matched to Total Project Cost Successfully ******");
			}
			
				
			TPC_Confirm_Btn.click();
			
			Term_Confirm_Btn.click();
			Rate_Confirm_Btn.click();
			Fee_Confirm_Btn.click();
			NetPayment_Confirm_Btn.click();
			Transfert_Confirm_Btn.click();
			Account_Confirm_Btn.click();
			Routing_Confirm_Btn.click();
			Contemail_Confirm_Btn.click();
			Contphonel_Confirm_Btn.click();
			Attest_Confirm_Btn.click();
			Proceed_Confirm_Btn.click();
			Thread.sleep(9000);
				
						
		//	Installation Certificate
			WebElement Certificate = driver.findElement(By.xpath("//form[@id='completion-ceritificate']//input[@name='file']"));
			
			String projectRootPath = TC_TestUtil.getProjectDirectory();
			
			if(TC_TestUtil.isWindows()) {
				Certificate.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
			}else {
				Certificate.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			
			Thread.sleep(1000);
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("window.scrollBy(0,400)", "");
			
	     // Inspection Report
			Thread.sleep(5000);
			WebElement Inspection = driver.findElement(By.xpath("//div[contains(@class,'u-left NFU-form-left NFUFL-img link-with-upload S3filesContainer ml-2')]//input[@name='file']"));
			
			if(TC_TestUtil.isWindows()) 
			{
				Inspection.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
			}else {
				Inspection.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			Thread.sleep(5000);
			
			
		// Inspection Report Approve
			driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Success']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[normalize-space()='English']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
			
			System.out.println("****** Inspection Report Approved *****");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='Completion-Call']")).click();
			Thread.sleep(5000);
			
			JavascriptExecutor Per = (JavascriptExecutor) driver;
			Per.executeScript("window.scrollBy(0,400)", "");	
			
			// Building Permit Approve
			WebElement Permit = driver.findElement(By.xpath("//div[@id='building-permit_div']//input[@name='file']"));
			
			
			if(TC_TestUtil.isWindows()) 
			{
				Permit.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
			}else {
				Permit.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("//input[@value='Approve']")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			
			System.out.println("****** Building Permit Approve *****");
			Thread.sleep(2000);
			
			WebElement invoice =driver.findElement(By.xpath("//div[@class='custom-bread-left']//li[3]"));
		      //getText() to obtain text
			String project_number = invoice.getText();
			System.out.println("Project Number is : " + project_number);
			
			driver.switchTo().newWindow(WindowType.TAB);
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(w.get(1));	
			
			driver.get(Invoice+project_number); 
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			driver.switchTo().window(w.get(0));
			driver.navigate().refresh();
			
			WebElement invoices_No =driver.findElement(By.xpath("//span[contains(text(),'Invoice #')]"));
			String project_Invoice = invoices_No.getText();
			
			String test = project_Invoice;
			test= test.replace("Invoice #   ", "");
			System.out.println(test);
			
			Thread.sleep(2000);
			String f = (projectRootPath + "\\" +"Documents\\Sample.csv");
			
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(f));
	        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
	                .withHeader("Invoice Number", "Date"));

	        csvPrinter.printRecord(test, "07/10/2022");
	        csvPrinter.flush();
	        System.out.println("Invoice Id has been Written in the File");
			csvPrinter.close();
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='More']"));

			//Creating object of an Actions class
			Actions action = new Actions(driver);

			//Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			
			Thread.sleep(2000);
			WebElement report = driver.findElement(By.xpath("//a[@title='Reports']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(report).perform();
						
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/reports']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='nav nav-pills']//li[2]")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor rep = (JavascriptExecutor) driver;
			rep.executeScript("window.scrollBy(0,200)", "");
			
			
			driver.findElement(By.xpath("//a[normalize-space()='Daily Payment Report - Unsecured']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Run NOw']")).click();
			
			Thread.sleep(20000);
			driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='project-details-box']//li[5]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='fundingPanel']//a[contains(text(),'Funding')]")).click();
			
			Thread.sleep(3000);
				
			WebElement elem = driver.findElement(By.xpath("//a[normalize-space()='More']"));

			//Creating object of an Actions class
			Actions action3 = new Actions(driver);

			//Performing the mouse hover action on the target element.
			action3.moveToElement(elem).perform();

			Thread.sleep(2000);
			WebElement reports = driver.findElement(By.xpath("//a[normalize-space()='Bulk Operations']"));
			Actions actions4 = new Actions(driver);
			actions4.moveToElement(reports).perform();

			driver.findElement(By.xpath("//a[normalize-space()='Invoice Status To Paid']")).click();
			
			
			Thread.sleep(5000);

			WebElement Invoice_Status = driver.findElement(By.xpath("//div[@id='change-invoice-status']//input[@name='importcsv']"));

			

			if(TC_TestUtil.isWindows()) {
				Invoice_Status.sendKeys(projectRootPath + "\\" +"Documents\\Sample.csv"); //Uploading the file using sendKeys
			}else {
				Invoice_Status.sendKeys(projectRootPath + "/" +"Documents/Sample.csv"); //Uploading the file using sendKeys
			}
			
			driver.findElement(By.xpath("//div[@id='change-invoice-status']//button[@type='button'][normalize-space()='Import']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='funding-tab-link']")).click();
			
			 String t = "Paid";
		      // getPageSource() to get page source
		      if ( driver.getPageSource().contains("Paid")){
		         System.out.println("**** Project Status: " +t);
		      } else {
		         System.out.println("**** Project Not Funded **** ");
		      }
			
		}
}
