package com.practiceclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbuses {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(5);
		Pomred rb = new Pomred(driver);
		/*
		 * Selecting From
		 */

		rb.from.click();
		rb.from.sendKeys("Tirupati");
		TimeUnit.SECONDS.sleep(3);

		/*
		 * Selecting To
		 */
		rb.to.click();
		rb.to.sendKeys("Bangalore");
		TimeUnit.SECONDS.sleep(3);
		rb.bangloc.click();

		/*
		 * Selecting date
		 */

		driver.findElement(By.className("dateText")).click();
		TimeUnit.SECONDS.sleep(3);

		System.out.println(rb.month.getText());
		rb.firstnextbtn.click();

		// Selecting the month
		System.out.println(rb.month.getText());
		rb.month();

		/*
		 * Selecting date
		 */

		TimeUnit.SECONDS.sleep(3);
		rb.date();

		rb.searchbtn.click();
		TimeUnit.SECONDS.sleep(6);
		rb.popup();
		rb.busselection();
		TimeUnit.SECONDS.sleep(3);
		rb.screenshot();

	}

}
