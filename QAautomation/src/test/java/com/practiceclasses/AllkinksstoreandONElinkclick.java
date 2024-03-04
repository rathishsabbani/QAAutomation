package com.practiceclasses;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericlibraies.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;

public class AllkinksstoreandONElinkclick {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
	
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Applephone");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		List <WebElement> li= driver.findElements(By.xpath("//div[@class='s-item__title']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		System.out.println(li.size());
		
		// String s = "Apple iPhone 12 Pro 128GB Unlocked AT&T T-Mobile Verizon Excellent Condition";
		
		String s= li.get(10).getText();
		
		String parentwindow  = driver.getWindowHandle();
		
		
		
		for(WebElement bw:li)
			{
			
			if(bw.getText().contains(s))
			{
				jse.executeScript("arguments[0].scrollIntoView();", bw);
				
				
				
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File des = new File("C://Users//ABC//git//QA Automation//QAautomationtest-output//ms.png");
				FileUtils.copyFile(src, des);
				
				TimeUnit.SECONDS.sleep(3);
				jse.executeScript("arguments[0].click();", bw);
				
				
			}
			
			}
		
		
		Set<String> windows = driver.getWindowHandles();
		for(String win:windows)
		{
			if(!win.equals(parentwindow))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()='Add to cart' ]")).click();
				
				
				
			}
		}
		
	

	

//	
//		for(int i=0;i<=li.size()-1;i++)
//		{
//			System.out.println(li.get(i));
//		}
//		System.out.println(li.get(10).getText());
				
		}     

}
