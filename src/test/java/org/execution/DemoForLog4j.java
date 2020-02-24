package org.execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoForLog4j {
WebDriver driver;

@BeforeMethod
private void setup() {
	System.setProperty("webdriver.chrome.driver", "F:\\Gowtham\\Oxygen workspaces\\TestNG\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}

@Test
private void facebooktest() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertTrue(true);
}

@Test
private void facebooklogintest() {
	boolean result = driver.findElement(By.id("loginbutton")).isDisplayed();
	System.out.println(result);
}





}
