package com.practiceclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameshandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		WebElement wb= driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		// frame 2 operations 
		/*
		
		WebElement f1= driver.findElement(By.xpath("//h3[text()='Frame2:']"));
	
		
		WebElement wb= driver.findElement(By.xpath("//input[@id='name']"));
		wb.sendKeys("Entering into frame2");
		
		TimeUnit.SECONDS.sleep(3);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();",f1);
		
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Hyr totuorials");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Practice");
		
		driver.findElement(By.xpath("//input[@id='femalerb']")).click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//button[@id='clearbtn']")).click();
		
		TimeUnit.SECONDS.sleep(3);
		
		driver.switchTo().defaultContent();
		wb.clear();
		
		wb.sendKeys("frame2 completed");
		*/
		
		// operations for Nested frame (frame3)
		
		wb.sendKeys("Entering to frame3");
		WebElement f3=driver.findElement(By.xpath("//h3[text()='Frame3:']"));
		
		jse.executeScript("arguments[0].scrollIntoView();",f3);
		
		driver.switchTo().frame("frm3");
		
		WebElement frame33= driver.findElement(By.xpath("//input[@id='name']"));
		frame33.sendKeys("Entering into frame1");
		
		driver.switchTo().frame("frm1");
		
		WebElement wr= driver.findElement(By.xpath("//select[@id='selectnav1']"));
		Select dropp= new Select(wr);
		dropp.selectByVisibleText("-- Selenium");
		TimeUnit.SECONDS.sleep(10);
		
		driver.switchTo().parentFrame();
		frame33.clear();
		frame33.sendKeys("Entering into frame2");
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Hyr totuorials");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Practice");
		
		driver.findElement(By.xpath("//input[@id='femalerb']")).click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		TimeUnit.SECONDS.sleep(6);
		
		driver.findElement(By.xpath("//button[@id='clearbtn']")).click();
		
		
		
		driver.switchTo().parentFrame();
		
		frame33.clear();
		frame33.sendKeys("frame 2 is completed");
		TimeUnit.SECONDS.sleep(10);
		
		driver.switchTo().defaultContent();
		wb.clear();
		wb.sendKeys("Frame3 completed");
		
		
		 
		
		
		
		
		
		
		
		
		
		

	}
	

}
