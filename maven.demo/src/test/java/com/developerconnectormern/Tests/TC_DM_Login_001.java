package com.developerconnectormern.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_DM_Login_001 implements IAutoConsts {
	/*
	 * Login Fuctonality
	 */
	public WebDriver driver;
	@Test
	public void Login() throws Throwable {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.get("https://www.developer-connector-mern.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("a[@class='btn btn-lg btn-light landing__btn'][contains(@id,'btn-login')][contains(.,'Login')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("email")).sendKeys("kmohanty188@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Kajal@123");
	}
}