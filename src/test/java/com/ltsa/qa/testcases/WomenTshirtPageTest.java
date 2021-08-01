package com.ltsa.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ltsa.qa.base.Base;
import com.ltsa.qa.pages.WomenTshirtPage;

public class WomenTshirtPageTest extends Base{
	WomenTshirtPage womenObj;
	public WomenTshirtPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {		
		browserInitialize();
		womenObj = new WomenTshirtPage();
	}
	
	@Test
	public void womenNavigationToTopsTest() throws Exception {
		womenObj.womenNavigationToTops();
		Assert.assertEquals(womenObj.topsLabelCheck(), "Tops");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
