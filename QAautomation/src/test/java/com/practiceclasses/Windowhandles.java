package com.practiceclasses;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		WebElement sr =driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(sr).build().perform();
		sr.click();
		
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		System.out.println(driver.getTitle());
		
		Set<String> windowhandles= driver.getWindowHandles();
		 for(String window:windowhandles)
		 {
			 if(!window.equals(Parentwindow))
			 {
				 driver.switchTo().window(window);
				 System.out.println(window);
				 driver.manage().window().maximize();
				 TimeUnit.SECONDS.sleep(3);
				 String var =driver.getTitle();
				 System.out.println(var);
				 
				 driver.switchTo().window(window);
				 
				 if(var.contentEquals("Basic Controls - H Y R Tutorials"))
						 {
					 System.out.println("Entering into Basic controls page");
					 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mukesh");
					 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("ch");
					  driver.findElement(By.xpath("//input[@id='femalerb']")).click();
		                
		                driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
		                driver.findElement(By.xpath("//input[@class='bcCheckBox']//following::input[@id='chinesechbx']")).click();
		                
		                
		                TimeUnit.SECONDS.sleep(3);
		                driver.findElement(By.xpath("//button[@onclick='clearFeilds()']")).click();
		                driver.close();
		                
		            }
				 else if(var.contentEquals("AlertsDemo - H Y R Tutorials"))
				 {
					 System.out.println("Entering into AlertsDemo practice page");
					 driver.findElement(By.id("alertBox")).click();
					 Alert al= driver.switchTo().alert();
					 TimeUnit.SECONDS.sleep(2);
					 al.accept();
					 driver.findElement(By.id("confirmBox")).click();
					 TimeUnit.SECONDS.sleep(3);
					 al.dismiss();
					 driver.findElement(By.id("promptBox")).click();
					 System.out.println(al.getText());
					 al.sendKeys("Sample frame");
					 
					 TimeUnit.SECONDS.sleep(4);;
					 al.accept();
					 driver.close();
				 }
				 else if(var.contentEquals("XPath Practice - H Y R Tutorials"))
				 {
					 System.out.println("Entering into Xpath practice page");
					 driver.manage().window().maximize();
					 driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Rahul");
		                
		                driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("shetty");
		                
		                TimeUnit.SECONDS.sleep(3);
		                
		                driver.findElement(By.name("refreshbtn")).click();
		                
		                driver.close();
		                
		                                
		            }
		            
		            else
		                if(var.contentEquals("Contact Me - H Y R Tutorials"))
		            {
		                System.out.println("Entering into contact me page");
		                driver.findElement(By.xpath("(//input[@id='ContactForm1_contact-form-name'])[1]")).sendKeys("Sample");
		                
		                TimeUnit.SECONDS.sleep(3);
		                driver.close();
		                
		            }
		            
					 
				 }
		            
		            else
		            {
		                System.out.println("Windows mismatched");
		                driver.close();
		               
		            }	
				 
					 
			 }
	} 
}
			 
		
