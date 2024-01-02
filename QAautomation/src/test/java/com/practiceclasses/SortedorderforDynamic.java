package com.practiceclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SortedorderforDynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@role='combobox']")).click();

		WebElement we = driver.findElement(By.xpath("//li[@data-value ='te']"));
        
      JavascriptExecutor jse = (JavascriptExecutor)driver;
      TimeUnit.SECONDS.sleep(3);
      
      jse.executeScript("arguments[0].scrollIntoView();", we);
      
      TimeUnit.SECONDS.sleep(3);
      
      we.click();
     
		

	}

}
