package org.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class UtilityClass {
public static WebDriver driver;
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "F:\\Gowtham\\Oxygen workspaces\\TestNG\\Drivers\\chromedriver.exe");
	ChromeOptions popups = new ChromeOptions();
	ChromeOptions disable = popups.addArguments("--disable-notifications");
	driver = new ChromeDriver(disable);
	driver.manage().window().maximize();
}

public void url(String url) {
	driver.get(url);
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}

public void fill(WebElement e, String text) {
	e.sendKeys(text);
}

public void btnClk(WebElement e) {
	e.click();
}

public void implicitWait(int time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}

public void time() {
Date time = new Date();
System.out.println(time);

}

public void assertUrl(String url, String message) {
	Assert.assertTrue(driver.getCurrentUrl().equals(url), message);

}

public static String captureScreenshot(WebDriver driver, String ScreenshotName) {
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String path = System.getProperty("user.dir") + "/Screenshots/" + System.currentTimeMillis();
	File destination = new File(path);
	try {
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken successfully");
	} catch (IOException e) {
		System.out.println("capture failed" + e.getMessage());
	}
	return path;	
}

}
