package com.ltsa.qa.testcases;

import org.testng.annotations.*;

import com.ltsa.qa.base.Base;
import com.ltsa.qa.pages.LoginPage;

public class LoginPageTest extends Base {
	LoginPage loginObj;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {		
		browserInitialize();
		loginObj = new LoginPage();
	}
	
	@Test
	public void login() {
		loginObj.loginToApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
