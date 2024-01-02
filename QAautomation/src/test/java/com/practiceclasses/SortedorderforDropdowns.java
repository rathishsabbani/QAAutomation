package com.practiceclasses;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortedorderforDropdowns {
 public static  Select select ;
	public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
	    WebElement listBox = driver.findElement(By.xpath("//select[@id='animals']"));
	    
	    
	   select =new Select(listBox);
	    List<WebElement> allOptions = select.getOptions();
	    ArrayList<String> allText=new ArrayList<String>();

	    for(int i=0;i<allOptions.size();i++)
	    {
	      String text = allOptions.get(i).getText();
	      System.out.println("Text before sorting : "+text);
	      allText.add(text);
	    }

	    Collections.sort(allText);
	    for(String s:allText)
	    {
	      System.out.println(s);
	    }
	    
	    
	   WebElement second = driver.findElement(By.xpath("//select[@id='second']"));
	    
	    select =new Select(second);
	    List<WebElement> allOpt = select.getOptions();
	    ArrayList<String> alldata=new ArrayList<String>();

	    for(int i=0;i<allOpt.size();i++)
	    {
	      String text2 = allOpt.get(i).getText();
	      System.out.println("Text before sorting : "+text2);
	      alldata.add(text2);
	    }

	    Collections.sort(alldata);
	    for(String s1:alldata)
	    {
	      System.out.println(s1);
	    }
	    
	  select.selectByVisibleText("Burger");  

	}

}
