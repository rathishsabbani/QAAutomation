package com.practiceclasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JSeparator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iccrankings {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/overview");
		driver.manage().window().maximize();
		WebElement popup= driver.findElement(By.xpath("//div[text()='Accept']"));
		popup.click();

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		driver.findElement(By.xpath("//h3[text()=\"Men's Team Rankings\"]"));
		WebElement ele= driver.findElement(By.xpath("(//h4[text()='T20I Team Rankings']//following::a[text()='View Full Table'])[1]"));
		
		jse.executeScript("arguments[0].scrollIntoView();",ele);
		
		TimeUnit.SECONDS.sleep(3);
		jse.executeScript("arguments[0].click();", ele);
		
		
		List <WebElement> w= driver.findElements(By.xpath("//div[@class='rankings-block__container full rankings-table']//child::tbody//tr"));
		for(WebElement el:w)
		{
			System.out.println(el.getText());
		}
		
		for(int i=0;i<=w.size()-1;i++)
		{
			System.out.println(w.get(i).getText());
		}
		
		System.out.println(w.get(20).getText());
		
		driver.navigate().back();
		
		
//		
//		List<WebElement> test= driver.findElements(By.xpath("//div[@class='rankings-block__container ' and @data-title='Test Batting Rankings']"));
//		
//		for(WebElement td:test)
//		{
//			System.out.println(td.getText());
//			
//		}
//		
//		for(int i=0;i<=test.size()-1;i++)
//		{
//			System.out.println(test.get(i).getText());
//		}
		// System.out.println(test.get(5).getText());
		
		WebElement tr=driver.findElement(By.xpath("(//h4[text()='Test Batting Rankings']//following::a[text()='View Full Table'])[1]"));
		
		jse.executeScript("arguments[0].scrollIntoView();",tr);
		jse.executeScript("arguments[0].click()",tr);
		
     List<WebElement> tr1= driver.findElements(By.xpath("//div[@class='rankings-block__container full ' and @data-title=\"Men's Test Batting Rankings\"]"));
		
     System.out.println(tr1.size()+" "+"2nd table start");
   
     //Below code is not working because of table size is consider as 1 element only
//		for(WebElement td1:tr1)
//		{
//			System.out.println(td1.getText());
//			
//		}
//		
//		for(int i=0;i<=tr1.size()-1;i++)
//		{
//			System.out.println(tr1.get(i).getText());
//		}
//		
//		System.out.println(tr1.get(5).getText());
		

	}

}
