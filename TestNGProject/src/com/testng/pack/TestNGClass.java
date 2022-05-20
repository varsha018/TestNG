package com.testng.pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@Test(priority=1)
	public void Test1() {
		System.out.println("Test 1 ");
	}
	
	@Test(enabled=false)
	public void Test2() {
		System.out.println("Test 2 ");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After suite");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class ");
	
	}
	@AfterClass
	public void afterclass() {
	System.out.println("after class ");
		
	}
	
	
}
