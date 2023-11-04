package com.genericlibraies;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MichaelkorsAssement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.michaelkors.global/en_BH/");
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
		// closing the popup
		driver.findElement(By.xpath("//button[contains(text(),'Accept All')]")).click();
		TimeUnit.SECONDS.sleep(2);

		// closing the region popup
		driver.findElement(By.xpath("//button[@class='close-button']")).click();
		TimeUnit.SECONDS.sleep(2);

		WebElement countryselector = driver.findElement(By.xpath("//button[@class='countrySelector ']"));
		System.out.println(countryselector.getText());
		countryselector.click();
		TimeUnit.SECONDS.sleep(2);

		List<WebElement> countrylist = driver.findElements(By.xpath("//a[@role='button']"));
		System.out.println(countrylist.size());
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		Actions ac = new Actions(driver);

		for (WebElement list : countrylist) {
			for (int i = 1; i < countrylist.size(); i++) {
				// if(!list.getText().contains("Canada")&&!list.getText().contains("United
				// States"))
				// {
				// System.out.println(list.getText());
				// TimeUnit.SECONDS.sleep(3);
				// jse.executeScript("arguments[0].click();", list);
				// TimeUnit.SECONDS.sleep(3);
				// jse.executeScript("arguments[0].click();", countryselector);
				// TimeUnit.SECONDS.sleep(3);
				// //driver.findElement(By.xpath("//*[name()='svg' and
				// @class='bx-close-xsvg']")).click();
				// }
				ac.moveToElement(list).perform();
				if (list.getText().matches("EN") && list.getText().matches("FR") || list.getText().matches("IT")
						|| list.getText().matches("DE") || list.getText().matches("ES")) {

					System.out.println(list.getText());
				}
			}
			// List<WebElement> countrylang =driver.findElement(By.xpath("//"));
			
			
		}

	}

	
	
	
}
