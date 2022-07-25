package com.Super_Admin;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.lang3.StringUtils;

import com.sendemail.CONSTANTS;
import com.sendemail.Utill;

public class SendMailSSLWithMessage {
	
	// Properties
		private static final String MAIL_SMTP_HOST = "smtp.gmail.com";
		private static final String MAIL_SMTP_SOCKET_FACTORY_PORT = "465";//"465"; //587
		private static final String MAIL_SMTP_AUTH_TRUE = "true";
		private static final String MAIL_SMTP_PORT = "465";//"465"; //587

		//Authenticator
		private static final String AUTHENTICATOR_EMAIL = "qateampace@gmail.com"; //"$guser"; //"devprogramdks@gmail.com"; //"guser@gmail.com"; //"devprogramdks@gmail.com"
		private static final String AUTHENTICATOR_PWD =  "Closeloop@123"; //"$gpass"; //"d@@pak123"; //"gpass"; //"d@@pak123"
		
		// Set the from address
		private static final String FROM_EMAIL = "qateampace@gmail.com"; //"$guser";//"devprogramdks@gmail.com"; //"guser@gmail.com";
		private static final Utill Util = null;
		
		// Set the recipient address
		private static final String RECIPIENT_EMAIL = Utill.getPropertyByKey("recipient_email"); //"deepak.khandal@sarvika.com,rsharma@sarvika.com"; //,rsharma@sarvika.com, apoorva.joshi@sarvika.com
		
		// Add the subject link
		private static final String SUBJECT_EMAIL = "Report Date " + Utill.getLocalDate(CONSTANTS.DATE_FORMATE2) + " (Run by: " + CONSTANTS.CREDENTIALS_USER_NAME + " )";
		
		// Set the body of email
		private static String BODY_EMAIL = "Please find attached the Regression Automation Test Report for Stage Environment Admin Panel. All the Test cases are passed in this run. Please download the report to view detailed Status of the Test Run";

		public static void main(String[] args) throws IOException {
//			String emailMessage = "Clower SWAGr API done successfully with attached report on " + CONSTANTS.BASE_URI + " By " + CONSTANTS.EMAIL;
//			System.out.println(" inside  sendEmailWithMessage");
//			if(!StringUtils.isEmpty(emailMessage)){
//				BODY_EMAIL = emailMessage;
//			}
			
			// Create object of Property file
			Properties props = new Properties();

			// this will set host of server- you can change based on your requirement 
			props.put("mail.smtp.host", MAIL_SMTP_HOST);

			// set the port of socket factory 
			props.put("mail.smtp.socketFactory.port", MAIL_SMTP_SOCKET_FACTORY_PORT);

			// set socket factory
			props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

			// set the authentication to true
			props.put("mail.smtp.auth", MAIL_SMTP_AUTH_TRUE);

			// set the port of SMTP server
			props.put("mail.smtp.port", MAIL_SMTP_PORT);
			
//			props.put("mail.smtp.ssl.enable", true);
			
			if(StringUtils.isEmpty(AUTHENTICATOR_EMAIL) || StringUtils.isBlank(AUTHENTICATOR_EMAIL)) {
				System.out.println("===== AUTHENTICATOR_EMAIL not set ===== " + AUTHENTICATOR_EMAIL);
				return;
			}else {
//				System.out.println("===== AUTHENTICATOR_EMAIL received ===== " + AUTHENTICATOR_EMAIL); // testing purpose only to see getting environment variable or not
			}
			if(StringUtils.isEmpty(AUTHENTICATOR_PWD) || StringUtils.isBlank(AUTHENTICATOR_PWD)) {
				System.out.println("===== AUTHENTICATOR_PWD not set ===== " + AUTHENTICATOR_PWD);
				return;
			}else {
//				System.out.println("===== AUTHENTICATOR_PWD received ===== " + AUTHENTICATOR_PWD); // testing purpose only to see getting environment variable or not
			}

			Session session = null;
			try {
				// This will handle the complete authentication
				session = Session.getDefaultInstance(props,

						new javax.mail.Authenticator() {

							protected PasswordAuthentication getPasswordAuthentication() {

							return new PasswordAuthentication(AUTHENTICATOR_EMAIL, AUTHENTICATOR_PWD);

							}

						});
			} catch (Exception e) {
				System.out.println("===== Authentication Failed =====" + e.getLocalizedMessage());
				e.printStackTrace();
			}


			try {

				// Create object of MimeMessage class
				Message message = new MimeMessage(session);

				try {
					// Set the from address
					message.setFrom(new InternetAddress(FROM_EMAIL, "SIS Project Regression Test Report"));
			    } catch (UnsupportedEncodingException e) {
			        e.printStackTrace();
			    }
				

				// Set the recipient address
				message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(RECIPIENT_EMAIL));
	            
	            // Add the subject link
				message.setSubject(SUBJECT_EMAIL);

				// Create object to add multimedia type content
				BodyPart messageBodyPart1 = new MimeBodyPart();

				// Set the body of email
				messageBodyPart1.setText(BODY_EMAIL);

//				// Create another object to add another content
				MimeBodyPart messageBodyPart2 = new MimeBodyPart();
				
				String projectRootPath = Utill.getProjectDirectory();
				String rootPath = "";
		    	  if(Utill.isWindows()) {
		    		  rootPath = projectRootPath + "\\" + "target\\surefire-reports" + "\\" + "emailable-report.html";
		    		  
		    		  
		    	  }else {
		    		  rootPath = projectRootPath + "/" + "target/surefire-reports" + "/" + "emailable-report.html";	  
		    	  }
		    	  System.out.println(" inside sendEmailWithMessage   "+ rootPath);
	
				// Create data source and pass the filename
				DataSource source = new FileDataSource(rootPath);// Mention the file which you want to send
	
			// set the handler
				messageBodyPart2.setDataHandler(new DataHandler(source));
	
				// set the file
				messageBodyPart2.setFileName("emailable-report.html");
			//	htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
	
				// Create object of MimeMultipart class
				Multipart multipart = new MimeMultipart();
	
			// add body part 1
				multipart.addBodyPart(messageBodyPart2);
	
				// add body part 2
				multipart.addBodyPart(messageBodyPart1);
	
				// set the content
				message.setContent(multipart);

				// finally send the email
				Transport.send(message);
				

				System.out.println("=====Email Sent Successfully=====");

			} catch (MessagingException e) {

				System.out.println("=====Email Failed due to =====" + e.getLocalizedMessage());
				e.printStackTrace();
			//	throw new RuntimeException(e);

			}

		}


}
