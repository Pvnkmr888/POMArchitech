package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//pageFatcory - Object Repository 
//	@FindBy(name="Login")
//	WebElement login;
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(linkText= "Login")
	WebElement login;
//	@FindBy(xpath= "Login")
//	WebElement loginbutton;
	
	public LoginPage() {
		
		//all the current class objects will be initialized by using page Factory method (this - current class object or LoginPage.class)0
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPage() {
		return driver.getTitle();
	}
	
//	public HomePage login(String us, String Pwd) {
//	//	login.click();
//		username.sendKeys(us);
//		password.sendKeys(Pwd);
//		
//		return new HomePage();
//		
//	}
}
