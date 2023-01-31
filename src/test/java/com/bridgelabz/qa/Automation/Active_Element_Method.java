package com.bridgelabz.qa.Automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Active_Element_Method {
	
WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		
//		 public static void main(String[] args)
//		 {
			 Scanner sc = new Scanner(System.in);
			 
				int variable;
		        System.out.println("Please enter the variable value");
		        
		        variable= sc.nextInt();
		        
		        switch(variable)
		        {
		            case 1:
		            	System.setProperty("webdriver.edge.driver","C:\\Users\\anura\\eclipse-workspace\\CQA_113_Selenium_Automation\\Drivers\\msedgedriver.exe");
		        		driver = new EdgeDriver();
		        		break;
		        	
		            case 2:
		            	System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\eclipse-workspace\\CQA_113_Selenium_Automation\\Drivers\\chromedriver.exe");
		        		driver = new ChromeDriver();
		        		break;
		        }
				
		// }
		
		
	}
	
	@Test
	public void active_Element() {
		
		 driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.switchTo().activeElement().sendKeys("admin");
	}

}
