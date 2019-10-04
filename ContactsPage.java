package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase  {

	@FindBy(xpath="//span[contains(text(),'Contacts') ]")
	WebElement contactsLabel;
	
	// Initializing the page Objects :
		public ContactsPage(){
			PageFactory.initElements(driver, this); // login page constructor
		}
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
}
