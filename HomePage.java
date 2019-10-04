package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase  {
	
	@FindBy(xpath="//span[contains(text(),'kumaran B') ]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts') ]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	// Initializing the page Objects :
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
		return driver.getTitle();
			}
		public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
			}
		public TasksPage clickOnTasksLink(){
			contactsLink.click();
			return new TasksPage();
				}
			
		
		
}
