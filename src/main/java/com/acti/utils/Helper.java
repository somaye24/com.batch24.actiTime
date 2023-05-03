package com.acti.utils;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.acti.base.DriverScript;

public class Helper extends DriverScript {
	
	/*
	 * This method for wait wherever is needed
	 */
	public static void sleep() {
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*
	 * this method capture screen shot
	 */
	
	public static String captureScreen(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = "C:/Users/12018/git/com.batch24.actiTime/reports/screensacti.png";
		try {
		FileHandler.copy(src, new File(dest));
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
		return dest;
		
	}

}


