package com.inetbanking.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbankingNew.qa.base.BaseClass;

public class ManagerPage extends BaseClass {
	
 WebDriver driver;
	
	public ManagerPage( WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//td[text()='Manger Id : mngr400098']")
	WebElement manageridfield;
	
	public WebElement manageridfield() {
		
		return manageridfield;
	}
	
}
