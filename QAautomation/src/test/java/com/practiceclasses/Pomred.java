package com.practiceclasses;

import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pomred {
	public WebDriver driver;

	public String expmonth = "Dec";
	public String expdate = "25";
	public String expbus = "FRESHBUS";

	public Pomred(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "src")
	public WebElement from;

	@FindBy(id = "dest")
	public WebElement to;

	@FindBy(xpath = "//text[contains(text(),'Majestic')]")
	public WebElement bangloc;

	@FindBy(xpath = "//*[local-name()='svg' and @id='Layer_1']")
	public WebElement firstnextbtn;

	@FindBy(xpath = "(//*[local-name()='svg' and @id='Layer_1'])[2]")
	public WebElement nextbtn;

	@FindBy(xpath = "//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']")
	public List<WebElement> weekdays;

	@FindBy(xpath = "//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']")
	public List<WebElement> weekends;

	@FindBy(xpath = "(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD' ])[2]")
	public WebElement month;

	@FindBy(xpath = "//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj' ]")
	public List<WebElement> days;

	@FindBy(id = "search_button")
	public WebElement searchbtn;

	@FindBy(xpath = "//i[@class='icon-close coach-close']")
	public WebElement popup1;

	@FindBy(xpath = "//label[@for='bt_AC' and @class='custom-checkbox']")
	public WebElement ac;

	@FindBy(xpath = "//label[@for='bp_Chandragiri Road' and @class='custom-checkbox']")
	public WebElement boardingpoint;

	@FindBy(xpath = "//ul[@class='bus-items']")
	public List<WebElement> listofbuses;

	@FindBy(xpath = "//div[@class='button view-seats fr']")
	public WebElement seats;

	@FindBy(xpath = "//div[@class='price-ploy-container']")
	List<WebElement> prices;

	@FindBy(className ="gotIt") public WebElement popupbox;
	
	
	public void month() throws InterruptedException {
		for (int i = 1; i < 10; i++) {
			if (!month.getText().contains(expmonth)) {
				// jse.executeScript("arguments[0].click();", nextbtn);
				nextbtn.click();
				TimeUnit.SECONDS.sleep(2);
			} else {
				System.out.println("Month is dec");
			}

		}

	}

	public void date() {
		for (WebElement day : days) {
			if (day.getText().contains(expdate)) {
				System.out.println(day.getText());
				day.click();
				break;
			}

			else {
				System.out.println("Date is not correct");
			}

		}

	}

	public void popup() {
		
		try {
			popupbox.click();
			popup1.click();
		}
		catch(Exception e)
		{
		popup1.click();
		}

	}

	public void busselection() throws InterruptedException {
		ac.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", boardingpoint);
		jse.executeScript("arguments[0].click();", boardingpoint);

		System.out.println(listofbuses.size());
		TimeUnit.SECONDS.sleep(3);

		for (WebElement bus : listofbuses) {
			if (bus.getText().contains(expbus)) {
				System.out.println(bus.getText());
				seats.click();
				break;

			}

		}

	}

	public void screenshot() throws IOException {
		Random rand = new Random();
		int rn = rand.nextInt();
		
		Date date= new Date();
        String dt=date.toString();

		TakesScreenshot ts = ((TakesScreenshot) driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			File dest = new File("C:/Users/ABC/eclipse-workspace/QAautomation/screenshot/"+dt+"screenshot.png");
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
