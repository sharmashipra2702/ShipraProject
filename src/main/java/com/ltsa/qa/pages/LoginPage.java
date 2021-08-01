package com.ltsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ltsa.qa.base.Base;

public class LoginPage extends Base {

	@FindBy(xpath="//input[@id='email']")
	WebElement username;

	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;

	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}

	public void loginToApp() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
	}
}
