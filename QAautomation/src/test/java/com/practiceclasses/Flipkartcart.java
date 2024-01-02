package com.practiceclasses;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartcart {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		Actions action = new Actions(driver);
		System.out.println(driver.getPageSource());
		if (driver.getPageSource().equals("Request OTP"))

		{
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

			// button[text()='Request OTP']

		} else {

			WebElement fas = driver.findElement(By.xpath("//span[text()='Fashion']"));
			action.moveToElement(fas).build().perform();
			TimeUnit.SECONDS.sleep(2);
			WebElement Menbottom = driver.findElement(By.xpath("//a[text()=\"Men's Bottom Wear\"]"));
			action.moveToElement(Menbottom).build().perform();
			TimeUnit.SECONDS.sleep(2);

			WebElement fashion = driver.findElement(By.xpath("//a[text()=\"Men's Jeans\"]"));

			action.moveToElement(fashion).click().build().perform();
			TimeUnit.SECONDS.sleep(2);

			driver.findElement(By.xpath("(//a[@class='IRpwTa'])[1]")).click();

			String parentwindow = driver.getWindowHandle();
			System.out.println(driver.getTitle());
			Set<String> windows = driver.getWindowHandles();
			
			for (String window : windows) {
				if (!window.equals(parentwindow)) {
					driver.switchTo().window(window);
					String title = driver.getTitle();
					System.out.println(title);

					if (title.equals(driver.getTitle())) {

						driver.findElement(By.xpath("//a[@class='_1fGeJ5 _2UVyXR _31hAvz']")).click();
						driver.findElement(By.xpath("//*[name()='svg' and @class ='_1KOMV2']")).click();

					}

				}

			}

		}

	}

}
