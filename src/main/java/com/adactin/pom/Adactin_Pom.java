package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pom {
	private WebDriver driver;
	
	@FindBy(id="username")
    private WebElement user;
	
	@FindBy(id="password")
    private WebElement pass;
	
	@FindBy(xpath="//input[@type='Submit']")
    private WebElement login;

	public Adactin_Pom(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}





 }
