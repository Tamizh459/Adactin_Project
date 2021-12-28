package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement button;
	
	@FindBy(xpath="//input[@type='submit']")
	   private WebElement cnt;
	
	public Select_Hotel(WebDriver driver) {
    this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	public WebElement getButton() {
		return button;
	}

	public WebElement getCnt() {
		return cnt;
	}

	
	
	
}
