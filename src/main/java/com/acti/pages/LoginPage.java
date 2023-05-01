package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class LoginPage extends DriverScript {
	
	/*
	 * Name: DriverScript
	 * Description: Manage the driver and browsers related configuration
	 * Developed by:
	 * Reviewed by:
	 * Date reviewed:
	 */
	
//	************************** Page Locators***************************************
	
	@FindBy(id = "username") WebElement usernameTextbox;
	@FindBy(name= "pwd") WebElement passwordTextbox;
	@FindBy(id = "loginButton") WebElement loginButton;
	@FindBy(className= "errormsg") WebElement errmsgText;
	@FindBy(linkText = "Forgot your password?") WebElement forgotpasswordLink;
	@FindBy(xpath = "//div[@class='atLogoImg']") WebElement actiImg;
	//@FindBy(name ="remember") WebElement remembercheckbox;
	
	// **************************** Page Initialization*******************************
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// *********** Create method for each locator*************
	
	
	public void enterUsername(String username) {
		usernameTextbox.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordTextbox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String getErrmassegetext() {
		return errmsgText.getText();
	}
	public boolean verifyForgotPasswordLink() {
		return forgotpasswordLink.isDisplayed();
	}
	
	public boolean verifyActiImage() {
		return actiImg.isDisplayed();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
}
