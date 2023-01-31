package com.bridgelabz.qa.Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Handling_Mouse_Keyboard_Oprection {
	
	 @Test
	    public void mouse_and_Keyboard_Operations() throws AWTException {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\anura\\eclipse-workspace\\CQA_113_Selenium_Automation\\Drivers\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
	        driver.get("https://www.bridgelabz.com/");
	        driver.manage().window().maximize();
	        Robot robot = new Robot();
	        robot.mouseMove(300, 500);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_S);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_S);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_F);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_F);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_W);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_W);
	    }

}

