package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.utils.Helper;

/* Name= Task Page
 * Description: Define Task page datails and methods
 * Create By: Somayeh
 * Review: Shantosh
 * Date of Review: 4/26/2023
 */
public class TaskPage extends DriverScript  {
	
//	************************** Page Locators***************************************
	

	@FindBy(xpath = "//div[@class='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newCustomerOption;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement customerNameTextbox;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTextArea;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement createCostumerButton;
	@FindBy(xpath = "//span[@class='innerHtml']") WebElement successMsg;
	@FindBy(xpath = "//input[@placeholder='Start typing name ...']") WebElement textboxStartTyping;
	@FindBy(xpath = "//div[@class='filteredContainer']//div[@class='title']") WebElement searchedCustomer;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	@FindBy(xpath = "(//div[@class='action'])[1]") WebElement buttonAction;
	@FindBy(xpath = "(//div[text()='Delete'])[2]") WebElement buttonDelete;
	@FindBy(xpath = "//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermanently;
// **************************** Page Initialization********************************
	
			public TaskPage () {
				PageFactory.initElements(driver, this);
			}
			
// *********** Create method for each locator*************
			
		public void searchCreatedCustomer(String customername) {
			textboxStartTyping.sendKeys(customername);
		}
		
		public void clickSearchedCustomer() {
			searchedCustomer.click();
		}
		
		public void clickButtonEdit() {
			buttonEdit.click();
			Helper.sleep();
		}
		
		public void clickButtonAction() {
			buttonAction.click();
			Helper.sleep();
		}
		
		public void clickButtonDelete() {
			buttonDelete.click();
			Helper.sleep();
		}
		
		public void clickDeletePermanently() {
			buttonDeletePermanently.click();
			Helper.sleep();
		}
		
		public void clickAddNewButton() {
			addNewButton.click();
		}
		
		public void clickNewCostumerOption() {
			newCustomerOption.click();
		}
		
		public void enterCustomerName(String CustomerName) {
			customerNameTextbox.sendKeys(CustomerName);
		}
		
		public void enterCustomerDescription(String CustomerDescription) {
			customerDescriptionTextArea.sendKeys(CustomerDescription);
		}
		
		public void clickCreatCustomer() {
			createCostumerButton.click();
		}
		
		public String getSuccessMsg() {
			return successMsg.getText();
		}
		


}
