package com.practiceclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePom {
	
	
	 WebDriver driver;

	public LoginpagePom(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@placeholder=' Code']")
	public WebElement Code;

	@FindBy(xpath="//input[@placeholder=' Username']")
	public WebElement Username;

	@FindBy(xpath="//input[@placeholder=' Password']")
	public WebElement Password;

	@FindBy(xpath="//span[@class='ui-button-text ui-clickable']")
	public WebElement Login;

	public void LCode()
	{

	Code.click();

	Code.sendKeys("2580");
	}


	public void LUsername()
	{

	Username.click();
	Username.sendKeys("ABC");
	}


	public void LPassword()
	{


	Password.click();
	Password.sendKeys("85264");
	}


	public void LLogin()
	{

	Login.click();
	}



	

	}




