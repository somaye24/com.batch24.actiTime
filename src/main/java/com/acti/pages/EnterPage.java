package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/* Name= Enter Page
 * Description: Define Enter page datails and methods
 * Create By: Somayeh
 * Review: Shantosh
 * Date of Review: 4/26/2023
 */

public class EnterPage extends DriverScript {
	
//	************************** Page Locators***************************************
	
	@FindBy(id = "logoutLink") WebElement logoutLink;
	@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement userLoggedText;
	@FindBy(id = "container_tasks") WebElement menuTask;
	@FindBy(id = "container_reports") WebElement menuReports;
	@FindBy(id = "container_users") WebElement menuUsers;
	
	
	
// **************************** Page Initialization********************************
	
		public EnterPage () {
			PageFactory.initElements(driver, this);
		}
		
// *********** Create method for each locator*************
		
		public void clickLogout() {
			logoutLink.click();
		}
		
		public String getUserLoggedIn() {
			return userLoggedText.getText();
		}
		
		public void clickTaskMenu() {
			menuTask.click();
		}
		
		public void clickReportsMenu() {
			menuReports.click();
		}
		
		public void clickUsersMenu() {
			menuUsers.click();
		}

		
		
		
}
