	package com.practiceclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.*;

public class selectdropdown {

	public static void main(String[] args) {
	
		WebDriverManager.chromiumdriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		 
		driver.findElement(By.xpath("//input[@name='travname']")).sendKeys("Oracle");
		driver.findElement(By.xpath("//input[@name='travlastname']")).sendKeys("Company");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		WebElement month= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel= new Select(month);
		sel.selectByVisibleText("Sep");
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select drop = new Select(year);
		drop.selectByVisibleText("1996");
		 
		WebElement date= driver.findElement(By.xpath("//a[text()='6']"));
		date.click();
		
		driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
		
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Tirupati");
		
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		
		// Departure date and year
		
		
		WebElement monthdep= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select dep= new Select(monthdep);
		dep.selectByVisibleText("Aug");
		
		WebElement depyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select depy = new Select(depyear);
	    depy.selectByVisibleText("2023");
	    
	    String Ddate = "25";
	    
	    
	    WebElement depdate= driver.findElement(By.xpath("//a[text()=" +Ddate+"]"));
		depdate.click();
		
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
	    
	    //Return date and year
		
		WebElement returnyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select returny = new Select(returnyear);
	    returny.selectByVisibleText("2024");
	    
	    WebElement monthreturn= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select returnm= new Select(monthreturn);
		returnm.selectByVisibleText("Feb");
		
		 String newdate="30";
		 
		   List<WebElement> allnewDates=    driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	        for(WebElement ele:allnewDates)
	        {
	            String dt=ele.getText();
	            System.out.println(dt);
	            
	            if(dt.equals(date))
	            {
	                //ele.click();
	                driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td//a[text()="+newdate+"]")).click();
	                break;
	            }
	            
	            else
	            {
	            	System.out.println("Given date is wrong");
	            }
	        }	    
//	    WebElement returndate= driver.findElement(By.xpath("//a[text()=" +Ddate+"]"));
//		returndate.click();
	    
	    
	    
		
		
		
		
		
		
		
		 

	}

}
