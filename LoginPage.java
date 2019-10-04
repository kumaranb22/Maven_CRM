package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - Object Repository :
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement SignUp;

	// Initializing the page Objects :
	public LoginPage(){
		PageFactory.initElements(driver, this); // login page constructor
	}
	
	// Actions :
	public String validateLoginPageTitle(){
		return driver.getTitle();
		}
	
	public HomePage login(String un, String pwd) {
	 username.sendKeys(un);
	 password.sendKeys(pwd);
	 login.click();
	 
	 return new HomePage();  // return type of LoginPage is HomePage
	}
	
	
	
}
