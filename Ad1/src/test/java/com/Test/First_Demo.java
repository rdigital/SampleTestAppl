package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class First_Demo {

	public static WebDriver driver;
	@Test
	public  void PrintHello() throws InterruptedException
	{
		
	
		System.out.println("Heloo world 1");
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.co.in");
		 driver.manage().window().maximize();
		 Thread.sleep(10000);
		 System.out.println("Heloo world 2");
		 driver.close();
		 driver.quit();
		
	}
	
}
