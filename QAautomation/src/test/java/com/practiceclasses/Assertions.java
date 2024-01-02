package com.practiceclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {
	
		@Test
		public void assertions() throws InterruptedException
		
		{
			WebDriverManager.chromiumdriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.name("email")).sendKeys("hyr", Keys.ENTER);
			Thread.sleep(5000);
			
			//Title assertion
			String token="?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzAzNTIxNTQzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
			
			String actualtitle = driver.getTitle();
			String expectedtitle = "Log in to Facebook";
			
			Assert.assertEquals(actualtitle, expectedtitle,"Title mismatched");
			
			// Url Assertion
			
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.facebook.com/login/"+token;
			Assert.assertEquals(actualUrl, expectedUrl,"Url is mismatched");
	
			// Text Assertion 
			String actualdetails = driver.findElement(By.xpath("//input [@id='email']")).getAttribute("value");
			String expecteddetails ="";
			Assert.assertEquals(actualdetails, expecteddetails,"Username text is mismatched");
			
			
			//border assertion
			String actualBorder = driver.findElement(By.xpath("//input [@id='email']")).getCssValue("border");
			String expectedBorder ="1px solid rgb(240, 40, 73)";
			Assert.assertEquals(actualBorder, expectedBorder,"Border is mismatched");
			
			//Error Msg Assertion
			
			String actualMsg = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getAttribute("value");
			String expectedMsg = "";
			
			Assert.assertEquals(actualMsg, expectedMsg,"Error Msg mismatched");
			

			
			
			
		}
		

	}


