package org.parallel.crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting  {
	
	public WebDriver driver = null;

@BeforeTest
@Parameters ("browser")
private void chrome(String name) throws Exception {
	if (name.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\Gowtham\\Oxygen workspaces\\TestNG\\Drivers\\chromedriver.exe");
		ChromeOptions notif = new ChromeOptions();
		ChromeOptions disable = notif.addArguments("--disable-nitifications");
		driver = new ChromeDriver(disable);
		driver.manage().window().maximize();
		driver.get("https://accounts.zoho.in/");
		
	}
	
	else if (name.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "F:\\Gowtham\\Oxygen workspaces\\TestNG\\Drivers\\geckodriver.exe");
		FirefoxProfile customProfile = new FirefoxProfile();
		customProfile.setPreference("dom.disable_beforeunload", true);
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.zoho.in/");
	}
	else {
		throw new Exception("Browser not found");
	}
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
}

	@Test
	private void testCaseOne() {
		driver.get("https://accounts.zoho.in/");
		
	}
	

}

