package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/* Name= Task Page
 * Description: Define Task page datails and methods
 * Create By: Somayeh
 * Review: Shantosh
 * Date of Review: 4/26/2023
 */
public class TaskPage extends DriverScript  {
	
//	************************** Page Locators***************************************
	
	@FindBy(id = "container_tasks") WebElement menuTask;
	@FindBy(xpath = "//div[@class='title ellipsis']") WebElement addNewDropdown;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newCustomerOption;
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name'][1]") WebElement customerNameText;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionText;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement createCostumerButton;
	@FindBy(id = "logoutLink") WebElement logoutLink;
	@FindBy(id = "username") WebElement usernameTextbox;
	@FindBy(name= "pwd") WebElement passwordTextbox;
	@FindBy(id = "loginButton") WebElement loginButton;
	@FindBy(id = "container_tasks") WebElement menuTask1;
	@FindBy(xpath = "//div[@class='node customerNode editable selected']//div[@class='title']") WebElement addedCustomer;
	@FindBy(xpath ="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement settingMenu;
	@FindBy(xpath = "(//div[@class='action'])[1]") WebElement menuAction;
	@FindBy(xpath = "(//div[text()='Delete'])[2]") WebElement deleteButton;
	@FindBy(id = "logoutLink") WebElement logoutLink1;
// **************************** Page Initialization********************************
	
			public TaskPage () {
				PageFactory.initElements(driver, this);
			}
			
// *********** Create method for each locator*************
			
		public void clickTaskMenu() {
			
			menuTask.click();
		}
		
		public void clickAddNewDropdown() {
			addNewDropdown.click();
		}
		
		public void clickNewCostumerOption() {
			newCustomerOption.click();
		}
		
		public void enterCustomerName() {
			customerNameText.sendKeys("Allen");
		}
		
		public void enterCustomerDescription() {
			customerDescriptionText.sendKeys("Test");
		}
		
		public void clickNewCustomerButton() {
			createCostumerButton.click();
		}
		
		public void clickLogout() {
			logoutLink.click();
		}
		
		public void enterUsername(String username) {
			usernameTextbox.sendKeys(username);
		}
		
		public void enterPassword(String password) {
			passwordTextbox.sendKeys(password);
		}
		
		public void clickLoginButton() {
			loginButton.click();
		}
		
		public void clickTaskMenu1() {
			
			menuTask.click();
		}
		
		public void clickAddedCustomer() {
			addedCustomer.click();
		}
		
		public void clickSettingMenu() {
			settingMenu.click();
		}
		
		public void clickActionButton() {
			menuAction.click();
		}
		
		public void deleteAddedCustomer() {
			deleteButton.click();
		}
		
		public void clickLogout1() {
			logoutLink.click();
		}

}
