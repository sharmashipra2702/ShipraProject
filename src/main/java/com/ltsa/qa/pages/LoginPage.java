package com.ltsa.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ltsa.qa.base.Base;

public class LoginPage extends Base {
	public static WebDriverWait wait;

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
		//		wait= new WebDriverWait(driver, 30);
		//	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//img[@class = 'logo img-responsive']"))));

		username.sendKeys(prop.getProperty("username"));


		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
	}
}
