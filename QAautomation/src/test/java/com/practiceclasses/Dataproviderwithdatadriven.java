package com.practiceclasses;



import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.genericlibraies.Excelutility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderwithdatadriven {

	
	@DataProvider(name="Exceldata")
	

	public Object[][] databank1() throws IOException 
    {
		Excelutility rc= new Excelutility();
        
        int rows=rc.readrowcount("Sheet1");
        int column=rc.readcolumncount("Sheet1",3);
        
        System.out.println(rows);
        System.out.println(column);
        
        Object[] [] obj= new Object[rows][column];
        
        
        /*because in excel first row will be taking header
         * header should not be stored in the data provider so should make it as 0
        
        */
        for(int i=1;i<=rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                obj[i-1][j]=rc.readdatafromexcel("Sheet1", i, j);
            }
        }
        
        for( Object [] object:obj)
        {
            System.out.println(Arrays.toString(object));
        }
        return obj;
    }
	
	@Test(dataProvider="Exceldata")
	
	public void Workbook(String username,String password) throws InterruptedException
	{
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		
		WebElement sub =driver.findElement(By.xpath("//input[@id='submitButton']"));
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",sub);
		
		TimeUnit.SECONDS.sleep(3);
		
		String hometitle = driver.getTitle();
		System.out.println(hometitle);
		
		String actualhometitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		
		if(actualhometitle.equals(hometitle))
		{
			Assert.assertEquals(true, true);
			System.out.println("Valid login credentilas");
			WebElement imgtag=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			
			Actions action = new Actions(driver);
			action.moveToElement(imgtag).perform();
			driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		}
		else
		{
			System.out.println("Invalid Login Credentials");
	
		}
		driver.close();
		
		
		
		
		
	}
	
	
	
	

	}

