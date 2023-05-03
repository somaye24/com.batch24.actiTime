package com.acti.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void testCreatCustomer() {
		logger = report.createTest("Test create customer");
		lp.enterUsername("admin");
		logger.pass("entered username");
		lp.enterPassword("manager");
		logger.pass("entered password");
		lp.clickLoginButton();
		logger.pass("clicked Login button");
		String actual = ep.getUserLoggedIn();
		//System.out.println(actual);
		Assert.assertTrue(actual.contains("John Doe"));
		logger.pass("verify logged in customer");
		ep.clickTaskMenu();
		logger.pass("clicked task menu");
		tp.clickAddNewButton();
		logger.pass("clicked add new customer button");
		tp.clickNewCostumerOption();
		logger.pass("clicked new customer option");
		tp.enterCustomerName("testcustomer");
		logger.pass("entered customer name");
		tp.enterCustomerDescription("This is dummy customer for automation test");
		logger.pass("entered customer description");
		tp.clickCreatCustomer();
		logger.pass("clicked create customer button");
		String msg = tp.getSuccessMsg();
		Assert.assertTrue(msg.contains("has been created"));
		logger.pass("verified the msg");
		ep.clickLogout();
		logger.pass("clicked Logout button");
	}
	@Test(priority = 2)
	public void testDeleteCustomer() {
		logger = report.createTest("Test delete customer");
		lp.enterUsername("admin");
		logger.pass("entered username");
		lp.enterPassword("manager");
		logger.pass("entered password");
		lp.clickLoginButton();
		logger.pass("clicked Login button");
		String actual = ep.getUserLoggedIn();
		//System.out.println(actual);
		Assert.assertTrue(actual.contains("John Doe"));
		logger.pass("verify logged in customer");
		ep.clickTaskMenu();
		logger.pass("clicked task menu");
		tp.searchCreatedCustomer("testcustomer");
		logger.pass("search the created customer");
		tp.clickSearchedCustomer();
		logger.pass("clicked on searched customer");
		tp.clickButtonEdit();
		logger.pass("clicked Edit button");
		tp.clickButtonAction();
		logger.pass("clicked Action button");
		tp.clickButtonDelete();
		logger.pass("clicked delete button");
		tp.clickDeletePermanently();
		logger.pass("clicked delete permanently button");
		String msg = tp.getSuccessMsg();
		System.out.println(msg);
		logger.pass("verify delete message");
		ep.clickLogout();
		logger.pass("clicked Logout");
	}
	

}

