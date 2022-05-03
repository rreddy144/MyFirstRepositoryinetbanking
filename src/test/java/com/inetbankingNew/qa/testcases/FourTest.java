package com.inetbankingNew.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbankingNew.qa.base.BaseClass;

public class FourTest extends BaseClass {
	

	@Test
	public void Fourtest() throws IOException {
	
		
		System.out.println("four test");
		driver=initialdriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		
	}

}
