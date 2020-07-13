package com.developerconnectormern.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.developerconnectormern.Tests.IAutoConsts;
import com.developerconnectormern.Tests.TC_DM_Login_001;

public class TC_DM_Logout_001 implements IAutoConsts {
	/*
	 * Logout functionality
	 */
	public WebDriver driver;
	@Test
	public void logout() throws Throwable{
		
	
	 TC_DM_Login_001 l = new  TC_DM_Login_001();
	 l.Login();
	 Thread.sleep(5000);
     driver.findElement(By.id("navbar__logout-li")).click();

	 Thread.sleep(4000);
	 
	 

}}