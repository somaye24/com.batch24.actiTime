package com.acti.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void testCreatCustomer() {
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.getUserLoggedIn();
		//System.out.println(actual);
		Assert.assertTrue(actual.contains("John Doe"));
		ep.clickTaskMenu();
		tp.clickAddNewButton();
		tp.clickNewCostumerOption();
		tp.enterCustomerName("testcustomer");
		tp.enterCustomerDescription("This is dummy customer for automation test");
		tp.clickCreatCustomer();
		String msg = tp.getSuccessMsg();
		Assert.assertTrue(msg.contains("has been created"));
		ep.clickLogout();
	}
	@Test(priority = 2)
	public void testDeleteCustomer() {
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.getUserLoggedIn();
		//System.out.println(actual);
		Assert.assertTrue(actual.contains("John Doe"));
		ep.clickTaskMenu();
		tp.searchCreatedCustomer("testcustomer");
		tp.clickSearchedCustomer();
		tp.clickButtonEdit();
		tp.clickButtonAction();
		tp.clickButtonDelete();
		tp.clickDeletePermanently();
		String msg = tp.getSuccessMsg();
		System.out.println(msg);
		ep.clickLogout();
	}
	

}
