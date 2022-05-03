package com.inetbankingNew.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbankingNew.qa.base.BaseClass;

public class TwoTest extends BaseClass {

	@Test
	public void TestTwo() throws IOException {
		
		System.out.println("Two test");
		driver=initialdriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		
	}
}
