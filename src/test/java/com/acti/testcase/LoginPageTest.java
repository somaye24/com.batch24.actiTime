package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest{
	

	@Test
	public void testLoginPageTitle() {
		String actual = lp.getLoginPageTitle();
		System.out.println(actual);
		String expected = "actiTIME -  Login";
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void testActiImgDisplayed() {
		boolean flag = lp.verifyActiImage();
		Assert.assertTrue(flag);
		
	}
	@Test
	public void testForgotPasswordDisplayed() {
		boolean flag = lp.verifyForgotPasswordLink();
		Assert.assertTrue(flag);
		
	}
	@Test
	public void testLoginFunction() {
		lp.enterUsername("trainee");
		lp.enterPassword("trainee");
		lp.clickLoginButton();
		
	}
	@Test
	public void testInvalidCredientials() throws InterruptedException {
		lp.enterUsername("trainee");
		lp.clickLoginButton();
		Thread.sleep(3000);
		String errmsg = lp.getErrmassegetext();
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));
		
	}
}
