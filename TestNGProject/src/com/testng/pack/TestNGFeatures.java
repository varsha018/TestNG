package com.testng.pack;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	@Test(invocationCount = 4)  //if you want to run same test case again and again..
	public void loginTest() {
		System.out.println("login page");
	//	int i = 5/0;
	//	System.out.println(i);
		
	}
	
	
	@Test(dependsOnMethods = "loginTest" )  //depends on loginTet method,if that is pass,then only this will be executed else skipped.
	public void homepageTest() {
		System.out.println("home page test");
	}
	
	
	

}
