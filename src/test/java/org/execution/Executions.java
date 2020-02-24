package org.execution;

import org.Locators.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class Executions extends UtilityClass {
	LoginPage log;
	
	@BeforeClass
	private void browser() {
		launchBrowser();
		implicitWait(25);
	}
	
	@BeforeMethod 
	private void executionStarts() {
	time();
	}
	
	@Test
	private void testCaseOne() throws InterruptedException {
		log = new LoginPage();
		url("https://accounts.zoho.in/signin?servicename=VirtualOffice&signupurl=https://www.zoho.com/mail/zohomail-pricing.html&serviceurl=https://mail.zoho.com");
		captureScreenshot(driver, "loginpage");
		fill(log.getUser(), "gowtham.s@qbrainx.com");
		captureScreenshot(driver, "loginpage");
		btnClk(log.getNextBtn());
		captureScreenshot(driver, "loginpage");
		fill(log.getPass(), "Myvizhi@1194");
		captureScreenshot(driver, "loginpage");
		btnClk(log.getLogin());
	}

	@AfterMethod
	private void executionEnds() {
	time();
	}
	
}
