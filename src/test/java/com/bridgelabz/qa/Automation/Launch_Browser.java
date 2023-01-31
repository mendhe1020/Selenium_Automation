package com.bridgelabz.qa.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch_Browser {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\eclipse-workspace\\CQA_113_Selenium_Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	
	public void launch_browser() {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\eclipse-workspace\\CQA_113_Selenium_Automation\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bridgelabz.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Current page titel is:" + title);
		String url = driver.getCurrentUrl();
		System.out.println("Current page url is:" + url);
		String sourcecode = driver.getPageSource();
		System.out.println("Current page sourcecode is:" + sourcecode);
		driver.close();
	}
	
	@Test
	
	public void browser_navigations() {
		
		driver.get("https://www.bridgelabz.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.close();
	}

}
