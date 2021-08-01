package com.ltsa.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ltsa.qa.base.Base;

public class WomenTshirtPage extends Base{
	JavascriptExecutor js;
	
	@FindBy(xpath="//a[@title ='Women']")
	WebElement womenNavigation;

	@FindBy(xpath="//a[@title ='Tops' and @class= 'sf-with-ul']")
	WebElement topsNavigation;

	@FindBy(xpath="//span[@class= 'category-name']")
	WebElement topsPageLabel;

	public WomenTshirtPage() {
		PageFactory.initElements(driver, this);	
	}

	public void womenNavigationToTops() {
		womenNavigation.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		//js.executeScript("arguments[0].scrollIntoView();", topsNavigation);
		topsNavigation.click();	
	}
	
	public String topsLabelCheck() {
		return topsPageLabel.getText();
	}
}
