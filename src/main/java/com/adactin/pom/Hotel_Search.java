package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {
	private WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement city;
	
	@FindBy(xpath = "//select[@name='hotels']")	
    private WebElement hotel;
    
    @FindBy(xpath="//select[@name='room_type']")
    private WebElement room;
    
    @FindBy(xpath="//select[@name='room_nos']")
    private WebElement no;
    
    @FindBy(xpath="//select[@name='adult_room']")
    private WebElement adult;
    
    @FindBy(xpath = "//select[@name='child_room']")
    private WebElement child;
    
    @FindBy(xpath = "//input[@type='submit']")
	private WebElement search;
    
	

	public Hotel_Search(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver,this);
    }
    
    public WebElement getCity() {
		return city;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	 public WebElement getSearch() {
			return search;
	
	 }
    
}
