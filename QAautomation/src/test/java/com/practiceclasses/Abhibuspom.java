package com.practiceclasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Abhibuspom {
	
	WebDriver driver;
	//public String fromplace ="Puducherry";
	//public String expplace ="Indore Junction";
	
	public Abhibuspom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	/*
	@FindBy(xpath="//a[@id='pills-profile-tab' and contains(text(),'Trains')]") public WebElement train;
	
	@FindBy(xpath="//label[@for='source-station']") public WebElement from;
	
	@FindBy(xpath="//input[@placeholder='Enter from']") public WebElement enterfrom;
	
	@FindBy(xpath="//ul[@id='source']") public List <WebElement> sourcestation;
    
	@FindBy(xpath="//label[@for='destination-station']") public WebElement to;
	
	@FindBy(xpath="//input[@placeholder='Enter to']") public WebElement enterto;
	
	@FindBy(xpath="//ul[@id='destination']") public List <WebElement> destination;
	
	*/
	@FindBy(xpath="//input[@placeholder='From Station']") 
	
	private WebElement from;
	
	@FindBy(xpath="//li[@data-id='Hyderabad']") 
	
	private WebElement enterfrom;
	
	
	@FindBy(xpath="//input[@placeholder='To Station']")
	
	private WebElement to;
	
	@FindBy(xpath="//li[@data-id='Vijayawada']") 
	
	private WebElement enterto;
	
	public void src() throws InterruptedException
	{
		
		TimeUnit.SECONDS.sleep(3);
		// train.click();
		TimeUnit.SECONDS.sleep(5);
		from.click();
		TimeUnit.SECONDS.sleep(2);
		enterfrom.click();
	}
	
		
//		
//		for(WebElement rec:sourcestation)
//		{
//			if(rec.getText().contains(fromplace))
//			{
//				System.out.println(rec.getText());
//				rec.sendKeys("PDY");
//			}
//		}
//	}
	
	
	public void dest() throws InterruptedException 
	{
		   TimeUnit.SECONDS.sleep(3);
	       to.click();
	       TimeUnit.SECONDS.sleep(5);
	       enterto.click();
	       
	
//	for(WebElement place:destination)
//	{
//	if(place.getText().contains(expplace))	
//	
//	{
//		System.out.println(place.getText());
//		place.sendKeys("INDB");
//	}
//	}
	
	}
}

