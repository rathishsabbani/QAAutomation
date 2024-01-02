package com.practiceclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipletablesHandling {
	
	
	@Test

	public void Multiple() {
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		 
		 driver.get("https://www.html-code-generator.com/html/drop-down/country-names");
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 WebElement w = driver.findElement(By.xpath("//select[@id='condi']"));
		 jse.executeScript("arguments[0].scrollIntoView();",w);
		 Select sel = new Select(w);
		 sel.selectByVisibleText("All countries");

		 WebElement s = driver.findElement(By.xpath("//option[text()='Asia']"));
		 s.click();
		 
		 WebElement ww = driver.findElement(By.xpath("//table[@class='mtbl']//tr//th[text()='Country Names']"));
		 
		 jse.executeScript("arguments[0].scrollIntoView();",ww );
		 
		 WebElement qq= driver.findElement(By.xpath("//td[text()='India']//following-sibling::td//input[@type='checkbox']"));
		 
		qq.click();
		


	}

}
