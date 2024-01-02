package com.practiceclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageMain {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://iemodemoindia.meditab.com/nursing");

		driver.manage().window().maximize();

		LoginpagePom rom = new LoginpagePom(driver);

		String title=driver.findElement(By.xpath("//h2[@class='mtab-login-iemo-welcome']")).getText();
		System.out.println(title);
		
		rom.LCode();
		rom.LUsername();
		rom.LPassword();
		rom.LLogin();

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String s= "Invalid username or password";
		
			if(driver.getTitle().contentEquals("Homepage of nursing"))
			{
				System.out.println("Entered into home page"); 
			}
		
			else
		{
			 
				
				
				WebElement err=driver.findElement(By.xpath("//span[@class='mtab-login-error-message']"));
			String error=(String) jse.executeScript("return arguments[0]. innerText;" , err) ;
		
			 System.out.println(error);
			 Assert.assertEquals(s,error);
		}
		
		

		}


}
