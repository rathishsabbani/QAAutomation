package com.practiceclasses;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		WebElement ws= driver.findElement(By.xpath("//div[@id='search-input']/input[@id='search']"));
		ws.click();
		ws.sendKeys("salaar songs");
		driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		TimeUnit.SECONDS.sleep(3);
		
		WebElement link=driver.findElement(By.xpath("//a[@id='video-title' and @title='Sooreede (Telugu) - Salaar |Prabhas | Prithviraj | Prashanth Neel | Ravi Basrur | Hombale Films']"));
		
      // WebElement link=driver.findElement(By.xpath("(//div[@id='title-wrapper'])[1]"));
        
        try {
        	 link.click();
        }
		catch(Exception e)
        {
			System.out.println("Direct click is not working");
		jse.executeScript("arguments[0].click();", link);
		
        }
	}

}
