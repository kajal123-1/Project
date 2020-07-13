package com.developerconnectormern.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_DM_Register_001 implements IAutoConsts {
	/*
	 * SignUp Functionality
	 */
	 
	 public WebDriver driver;
     @Test
     public void signup() throws Throwable {
    	 System.setProperty(CHROME_KEY, CHROME_VALUE);
    	 driver = new ChromeDriver();
    	 driver.get("https://www.developer-connector-mern.com/");
    	 Thread.sleep(5000);
    	 driver.manage().window().maximize();
    	 Thread.sleep(5000);
    	 driver.findElement(By.id("landing__btn-sign-up")).click();
    	 Thread.sleep(7000);
    	 driver.findElement(By.name("name")).sendKeys("Kajal Mohanty");;
    	 Thread.sleep(4000);
    	 driver.findElement(By.name("email")).sendKeys("kmohanty188@gmail.com");;
    	 Thread.sleep(4000);
    	 driver.findElement(By.name("password")).sendKeys("Kajal@123");
    	 Thread.sleep(4000);
    	 driver.findElement(By.name("password2")).sendKeys("Kajal@123");
    	 Thread.sleep(4000);
    	 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
    	 
    	 
     }
}

