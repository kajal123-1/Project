package com.developerconnectormern.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_DM_CreateProfile_001 implements IAutoConsts {
	/*
	 * Create Profile Functionality
	 */
	public WebDriver driver;
	@Test
	public void createProfile1() throws Throwable{
		
	
	 TC_DM_Login_001 l = new  TC_DM_Login_001();
	 l.Login();
	 Thread.sleep(5000);
	 driver.findElement(By.id("dashboard__create-profile-btn")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.name("handle")).sendKeys("kajalMohanty,wipro,Kaj");
	 Thread.sleep(5000);
	 Select s  = new Select(driver.findElement(By.name("status")));
	 s.selectByVisibleText("QA / Tester");
	 Thread.sleep(5000);
	 driver.findElement(By.name("company")).sendKeys("abc");
	 Thread.sleep(5000);
	 driver.findElement(By.name("website")).sendKeys("abc.com");
	 Thread.sleep(5000);
	 driver.findElement(By.name("Location")).sendKeys("Bangalore");
	 Thread.sleep(5000);
	 driver.findElement(By.name("skills")).sendKeys("java,selenium");
	 Thread.sleep(5000);
	 driver.findElement(By.name("Github Username")).sendKeys("kajal123-1");
	 Thread.sleep(5000);
	 driver.findElement(By.name("bio")).sendKeys("Hello23345387");
	 
	}

}
