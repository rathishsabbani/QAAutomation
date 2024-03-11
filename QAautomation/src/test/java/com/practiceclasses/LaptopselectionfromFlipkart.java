package com.practiceclasses;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaptopselectionfromFlipkart {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromiumdriver().setup();
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Actions ac = new Actions(driver);
		
		
		// click on the search bar and type "laptop" and press Enter button 
		
		WebElement fas = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		fas.sendKeys("Laptop");
		TimeUnit.SECONDS.sleep(2);	
		WebElement search = driver.findElement(By.xpath(" //button[@title='Search for Products, Brands and More']//*[name()='svg']"));
		search.click();
		
		// click on the first laptop item  hyperlink 
		WebElement laptop = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		laptop.click();
		
		// open the new tab and verify the selected product is showing or not  by using window handles method
		String parentwindow = driver.getWindowHandle();
		
		System.out.println(driver.getTitle());
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String childwindow : windows)
			
			if(!childwindow.equals(parentwindow))
			{
				driver.switchTo().window(childwindow);
				String title = driver.getTitle();
				System.out.println(title);
				
				if(title.equals(driver.getTitle()))
				{
					// select the first laptop on the webpage 
				WebElement sc = 	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
					
					//Enter the pincode for check
					Actions action = new Actions(driver);
					action .moveToElement(sc);
					action.click();
					
					driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("500061");
					
					driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
					
					TimeUnit.SECONDS.sleep(3);
					
					//Click on go to cart item
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
					
					TimeUnit.SECONDS.sleep(3);
					
					// verify the details and click on place order
					driver.findElement(By.xpath("//span[text()='Place Order']")).click();
					
					//Enter the login user name or mobile number
					
					TimeUnit.SECONDS.sleep(2);
					
					driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("9505643641");
					
					driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
					
					
					//Actually here we can not automate OTP  once enter enter the OTP below code is working as per scenario
					
					// after enter the OTP  and click on the Login button
					TimeUnit.SECONDS.sleep(2);
					driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh _17N0em']")).sendKeys("505453");
					TimeUnit.SECONDS.sleep(2);
					driver.findElement(By.xpath("//span[text()='Login']")).click();
					
					
					// verify & select the delivery address
					driver.findElement(By.xpath("//button[@class='_2KpZ6l RLM7ES _3AWRsL']")).click();
					
					
					// accept the terms & conditions 
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']")).click();
					
					driver.findElement(By.xpath("_2KpZ6l _1uR9yB _3dESVI")).click();
					
					//  Choose a payment method 
					
					driver.findElement(By.xpath("//label[@for='WALLETOTHERS']//div[@class='_1XFPmK']")).click();
					
					driver.findElement(By.xpath("//button[@type='button']")).click();
					
					//enter the otp for payment
					
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _1VCsXx _3dESVI']")).click(); 
					

					
					
					
			}
				
		}

		
	}

}
