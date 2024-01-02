package com.practiceclasses;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NavigationMethod {
	
	

	@Test
	
	
	public void Assignment2() throws InterruptedException
	{
		
		
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qatechhub.com");
		
		driver.manage().window().maximize();
		
		String s = driver.getTitle();
		System.out.println(s);
		
		String s2 = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
		
		
		if(s2.equals(s))
		{
			Assert.assertEquals(true,true);
			System.out.println("Title Matched");
		}
		else
		{
			Assert.assertEquals(false, false);
			System.out.println("Title is not matched");
		}
		
		driver.navigate().to("https://www.facebook.com");
		
		TimeUnit.SECONDS.sleep(5);
		
		driver.navigate().back();
		TimeUnit.SECONDS.sleep(4);
		
		String t = driver.getCurrentUrl();
		
		System.out.println(t);
		
		driver.navigate().forward();
		TimeUnit.SECONDS.sleep(4);
		
		driver.navigate().refresh();
		TimeUnit.SECONDS.sleep(4);
		
		driver.close();
		
		
		
		
		
		

	}

}
