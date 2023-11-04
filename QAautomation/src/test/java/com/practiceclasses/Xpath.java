package com.practiceclasses;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https://demo.opencart.com/");
//		
//		System.out.println(driver.getTitle());
//	 Actions action= new Actions(driver);
//	 
//	 List<WebElement> w=  driver.findElements(By.xpath("//a[contains(text(),'Desktops')]//ancestor::div[@class='container']"));
//    for(WebElement window:w)
//    {
//    	System.out.println(window.getText());
//    }
     driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
     WebElement option= driver.findElement(By.xpath("//div[@class='information closable']"));
  
     Select sel = new Select(option);
     sel.selectByVisibleText("Mali");
     
     
	}	

}
