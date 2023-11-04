package com.practiceclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbuswithcalender {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		RedbusPom rom= new RedbusPom(driver);
		
		rom.source.click();
		
		rom.source.sendKeys("Hyderabad");
		TimeUnit.SECONDS.sleep(3);
		rom.Hydplace.click();
		
		rom.destination.click();
		
		rom.destination.sendKeys("Bangalore");
		TimeUnit.SECONDS.sleep(3);
		rom.Bangplace.click();
		
		 rom.Dclick.click();
		rom.firstbtn.click();
		TimeUnit.SECONDS.sleep(2);
		rom.month();
		rom.Date();
		rom.search.click();
		
//		driver.findElement(By.xpath("//div[text()='Oct']"));
//		driver.findElement(By.xpath("//span[text()='15']")).click();
		rom.search.click();
		
		
		
	     
		
		
		
	
		
		
		
		
		
		
		

	}

}
