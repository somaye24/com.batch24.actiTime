package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest{
	

	@Test
	public void testLoginPageTitle() {
		logger = report.createTest("Test login page title");
		String actual = lp.getLoginPageTitle();
		String expected = "actiTIME - Login";
		logger.pass("captured page title");
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		logger.pass("verified the login page title");
	}
	@Test
	public void testActiImgDisplayed() {
		logger = report.createTest("Test login page title");
		boolean flag = lp.verifyActiImage();
		logger.pass("identified the image");
		Assert.assertTrue(flag);
		logger.pass("verified logo is displayed");
		
	}
	@Test
	public void testForgotPasswordDisplayed() {
		logger = report.createTest("Test Forgotpassword link is displayed");
		boolean flag = lp.verifyForgotPasswordLink();
		logger.pass("identified Forgotpassword link");
		Assert.assertTrue(flag);
		logger.pass("Forgotpassword link is displayed");
		
	}
	@Test
	public void testLoginFunction() {
		logger = report.createTest("Test Login function");
		lp.enterUsername("admin");
		logger.pass("entered username");
		lp.enterPassword("manager");
		logger.pass("entered password");
		lp.clickLoginButton();
		logger.pass("clicked Login button");
		String actual = ep.getUserLoggedIn();
		System.out.println(actual);
		Assert.assertTrue(actual.contains("John Doe"));
		logger.pass("verified logged in user");
		ep.clickLogout();
		logger.pass("clicked Logout");
		
	}
	@Test
	public void testInvalidCredientials() throws InterruptedException {
		logger = report.createTest("Test login with invalid credintials");
		lp.enterUsername("admin");
		logger.pass("entered username");
		lp.clickLoginButton();
		logger.pass("clicked Login button without entering password");
		Thread.sleep(3000);
		String errmsg = lp.getErrmassegetext();
		logger.pass("captured the error message");
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));
		logger.pass("verified the error message");
		
	}
	
	@Test
	public void testInvalidCredientials1() throws InterruptedException {
		logger = report.createTest("Test login with invalid credintials");
		lp.enterUsername("admin");
		logger.pass("entered username");
		lp.enterPassword("damager");
		logger.pass("entered password");
		lp.clickLoginButton();
		logger.pass("clicked Login button");
		Thread.sleep(3000);
		String actual = ep.getUserLoggedIn();
		System.out.println(actual);
		Assert.assertTrue(actual.contains("John Doe"));
		logger.pass("verified logged in user");
		ep.clickLogout();
		logger.pass("clicked Logout");
		
		
		
	}
}


