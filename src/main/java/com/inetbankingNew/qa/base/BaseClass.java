package com.inetbankingNew.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.inetbanking.qa.utils.WebEventListeners;

import io.github.bonigarcia.wdm.WebDriverManager;


@SuppressWarnings("deprecation")
public class BaseClass {

	public static WebDriver driver;
	 public Properties prop;
	 public Logger logger;
	 public  static EventFiringWebDriver e_driver;
	public static WebEventListeners eventListener;
 

	
	@SuppressWarnings({ "static-access", "deprecation" })
	public WebDriver initialdriver() throws IOException {
		
		
	   prop=new Properties();
		//String proppath=;
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\inetbanking\\qa\\config\\Config.properties");
		prop.load(ip);
		
	
		 String browsername=prop.getProperty("browser");
		 if(browsername.equals("chrome")) { 
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
		 }
		 else if(browsername.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 
		 }
		 else if(browsername.equalsIgnoreCase("ie")) {
			 WebDriverManager.iedriver().setup();
			 driver=new InternetExplorerDriver();
			 
		 }
		 
		 e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListeners();
			e_driver.register(eventListener);
			driver = e_driver;
		 
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		  return driver;
		  
		
	}
	
	}

	   


