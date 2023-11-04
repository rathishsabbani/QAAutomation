package com.practiceclasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedbusPom {
	WebDriver driver;
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	public String expmonth = "Dec";
	public static String expdate = "15";

	public RedbusPom(WebDriver driver) {
	

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "src")
	public WebElement source;

	@FindBy(id = "dest")
	public WebElement destination;

	@FindBy(xpath = "//text[contains (text(),'Secunderabad')]")
	public WebElement Hydplace;
	
	@FindBy(xpath = "//text[contains (text(),'Marathahalli')]")
	public WebElement Bangplace;

	@FindBy(xpath = "//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")
	public WebElement Dclick;

	
	@FindBy(xpath="//*[local-name( )='svg' and @id='Layer_1']") public WebElement firstbtn;
	
	@FindBy(xpath = "(//*[local-name( )='svg' and @id='Layer_1'])[2]") public WebElement secondbtn;
	
	@FindBy(xpath = "(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]") public WebElement month;
	
	 

	@FindBy(xpath = "//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']")public List<WebElement> date;
	
	
	@FindBy(id="search_button") public WebElement search;

	public void month() throws InterruptedException 
	{
		for (int i = 1; i<5; i++) 
		{
			if (!month.getText().contains(expmonth))
			{
				System.out.println(month.getText());
				// jse.executeScript("arguments[0].click();", forwardbtn);
				secondbtn.click();
				TimeUnit.SECONDS.sleep(2);
			} 
			else
			{
				System.out.println("Month is oct");
			}

		}
		
	}
	
	public void Date()
	
	{
		for(WebElement dates:date)
		{
			if(!dates.getText().contains(expdate))
			{
				System.out.println(dates.getText());
				dates.click();
				break;
				
			}
			else
			{
				System.out.println("date is not matching");
			}
		}
	}
	

}
