package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");
		driver = new ChromeDriver();  
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
	 	driver.get("https://www.amazon.com");
	 	System.out.println("before method");
		
		
	}
	
	
	@Test(groups="title")
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.", "title is not correct");
		System.out.println("title is correct");
	}
	
	@Test(groups="display")
	public void logotest() {
		Boolean b = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(groups="display")
	public void imgdisplayed() {
		Boolean c = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).isEnabled();
		System.out.println(c);
		
	}
	
	@Test(groups="Runtest" ,priority =2)
	public void test1() {
		System.out.println("test1");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("test ended");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
