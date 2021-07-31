package com.ltsa.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ltsa.qa.util.Utils;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public Base() {
		try {
			prop = new Properties();
			FileInputStream fis= new FileInputStream("D:\\Automation-Testing\\ShipraProject\\src\\main\\java" + "\\" + "com\\ltsa\\qa\\config\\config.properties");
			prop.load(fis);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void browserInitialize() {
		String browserName= prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://Automation-Testing//Drivers//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D://Automation-Testing//Drivers//geckodriver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Utils.TIMEOUT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	    
	}	
}
