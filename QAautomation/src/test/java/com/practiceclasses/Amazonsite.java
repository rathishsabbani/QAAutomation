package com.practiceclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class Amazonsite {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().clearDriverCache().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		TimeUnit.SECONDS.sleep(10);

		WebElement ws = driver.findElement(By.xpath("//a[@aria-label='New Launches from Mobile, Electronics & more']"));

		Actions action = new Actions(driver);
		action.moveToElement(ws).build().perform();
		ws.click();

		driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]")).click();

		driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.xpath("//input[@aria-labelledby='Apple']"));
		

		jse.executeScript("arguments[0].click();", ele);

	}

}
