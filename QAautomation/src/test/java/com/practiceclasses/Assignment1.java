package com.practiceclasses;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		TimeUnit.SECONDS.sleep(2);
		try
		{
			driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		}
		
		
		finally
		{
			List <WebElement> s = driver.findElements(By.tagName("a"));
			
	        System.out.println(s.size());
	        
	       for(WebElement links:s)
	       {
	    	   String rs=links.getAttribute("href");
	    	   
	    	   System.out.println(rs);
	       }
			
		}
		
		
		
		}

}
