package com.practiceclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abhibusmain {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriverManager.chromiumdriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.abhibus.com/");
       TimeUnit.SECONDS.sleep(2);
       
       Abhibuspom ap = new Abhibuspom(driver);
       
       ap.src();
       
       ap.dest();
       
       
	}

}
