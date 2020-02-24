package org.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class LoginPage extends UtilityClass {
 
public LoginPage() {
	PageFactory.initElements(driver, this);
}

@FindBy (id = "login_id")
private WebElement user;

@FindBy (id = "nextbtn")
private WebElement nextBtn;

@FindBy (id = "password")
private WebElement pass;

@FindBy (id = "nextbtn")
private WebElement login ;

public WebElement getUser() {
	return user;
}

public WebElement getNextBtn() {
	return nextBtn;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLogin() {
	return login;
}

}
