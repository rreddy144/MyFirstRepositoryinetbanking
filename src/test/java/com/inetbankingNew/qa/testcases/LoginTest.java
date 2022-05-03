package com.inetbankingNew.qa.testcases;



import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.qa.pageobjects.HomePage;
import com.inetbanking.qa.pageobjects.ManagerPage;
import com.inetbankingNew.qa.base.BaseClass;

public class LoginTest extends BaseClass {
	
	
		
	
	@Test(dataProvider="getlogindata")
	public void logintest(String username,String password,String expectedresult) throws  InterruptedException  {
			
		HomePage homepage=new HomePage(driver);
		 
		homepage.usernameoption().sendKeys(username);

		homepage.passwodoption().sendKeys(password);
		homepage.loginbtnoption().click();
				
		ManagerPage managerpage=new ManagerPage(driver);
		
		String actualresult=null;
		
		try {
		if(managerpage.manageridfield().isDisplayed()) {
			actualresult="Successfull";
		}
		}
		catch(Exception e) {
			
			actualresult="failed";
		}
			Assert.assertEquals(actualresult, expectedresult);
		}
		
	
	@DataProvider
	public Object[][] getlogindata() {
		
		Object[][] data= {{"mngr400098","zUzUhuz","Successfull"},{"mngr401298","zUzUhuz","failed"}};
		return data;
		
	}

	 @BeforeMethod
		 public void setup() throws IOException {

			
			 driver=initialdriver();

			driver.get(prop.getProperty("url"));
			
			 
		 }
	 

	@AfterMethod
	public void teardown() {
		driver.quit();
	
	}
	
}
