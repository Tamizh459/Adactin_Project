package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Iternity {
	private WebDriver driver;
	
	@FindBy(name="my_itinerary")
    private WebElement iternity;
	
	@FindBy(name="logout")
	private WebElement logout;
	
	public Book_Iternity(WebDriver driver) {
      	this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
   public WebElement getIternity() {
		return iternity;
	}

	public WebElement getLogout() {
		return logout;
	}


	
	
}
