package com.practiceclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement li =driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(li);
		 
	    
	    WebElement des =driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	    
	    
	    Actions action = new Actions(driver);
	    action.dragAndDrop(src, des).build().perform();
	    
	    
	    String colourbefore=src.getCssValue("color");
        System.out.println(colourbefore);
        
        String colourafter=des.getCssValue("color");
        System.out.println(colourafter);
        
        String actualcolour = "rgba(119, 118, 32, 1)";
        
        Assert.assertEquals(colourafter, actualcolour);
	    
	    
	    
	    
		

		
		
	}

}
