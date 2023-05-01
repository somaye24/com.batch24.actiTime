package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Name: DriverScript
 * Description: Manage the driver and browsers related configuration
 * Developed by:
 * Reviewed by:
 * Date reviewed:
 */
public class DriverScript {

	public static WebDriver driver; // make global variable so we can use in the whole package
	Properties prop;
	
 //constructor is responsible for getting details from the config file
 
	public DriverScript() {

		try { // we load config file in the constructor

			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		}

		catch (Exception e) {

			System.out.println("Unable to load config.properties file, Please check " + e.getMessage());
			e.printStackTrace();

		}

	}
	 //after unit test we shall remove annotation
	public void initApplication() { // we need to run browser
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(browser + " :in use");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println(browser + " :in use");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("msedge")) {
			System.out.println(browser + " :in use");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else {
			System.out.println(browser + " This is not supported browser in the config.properties file, please check");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		launchURL();
	}
	private void launchURL() {
		// TODO Auto-generated method stub
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	public void quitDriver() {
		driver.quit();
	}
}

