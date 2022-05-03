package com.inetbankingNew.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbankingNew.qa.base.BaseClass;

public class ThreeTest extends BaseClass  {
	
    @Test
	public void Threetest() throws IOException  {
    	
    	System.out.println("Three test");
		driver=initialdriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
    	
	}

}
