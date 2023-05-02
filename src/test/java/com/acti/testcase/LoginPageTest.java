package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest{
	

	
	public void testLoginPageTitle() {
		String actual = lp.getLoginPageTitle();
		System.out.println(actual);
		String expected = "actiTIME -  Login";
		Assert.assertEquals(actual, expected);
		
	}
	
	public void testActiImgDisplayed() {
		boolean flag = lp.verifyActiImage();
		Assert.assertTrue(flag);
		
	}
	
	public void testForgotPasswordDisplayed() {
		boolean flag = lp.verifyForgotPasswordLink();
		Assert.assertTrue(flag);
		
	}
	
	public void testLoginFunction() {
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.getUserLoggedIn();
		System.out.println(actual);
		System.out.println(actual);
		Assert.assertTrue(actual.contains("John Doe"));
		ep.clickLogout();
		
	}
	
	public void testInvalidCredientials() throws InterruptedException {
		lp.enterUsername("trainee");
		lp.clickLoginButton();
		Thread.sleep(3000);
		String errmsg = lp.getErrmassegetext();
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));
		
	}
}
