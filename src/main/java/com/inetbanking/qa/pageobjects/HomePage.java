package com.inetbanking.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbankingNew.qa.base.BaseClass;

public class HomePage extends BaseClass {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	WebElement usernameoption;
	
	@FindBy(name="password")
	WebElement passwodoption;
	
	@FindBy(name="btnLogin")
	WebElement loginbtnoption;
	
	public WebElement usernameoption() {
		return usernameoption;
	}
	
	public WebElement passwodoption() {
		return passwodoption;
	}
	
	public WebElement loginbtnoption() {
		return loginbtnoption;
	}
	
	
	
	

}
