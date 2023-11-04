package com.practiceclasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alllinkstoreinoneplace {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://amazon.com/");
		 
		 List <WebElement> we = driver.findElements(By.tagName("a"));
		 
		 System.out.println(we.size());
		 for(WebElement links:we)
		 {
			 System.out.println(links.getAttribute("href"));
			 if(links.getAttribute("href")!=null)
			 {
			 
			 System.out.println(links.getText());
			 links.click();
			 TimeUnit.SECONDS.sleep(6);
		 }
		 }
		

	}

}
