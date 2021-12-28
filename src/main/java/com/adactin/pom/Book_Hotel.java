package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
private WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement creditcard;
	
	@FindBy(name="cc_type")
	private WebElement cardtype;
	
	@FindBy(name="cc_exp_month")
	private WebElement month;
	
	@FindBy(name="cc_exp_year")
	private WebElement year;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
    private WebElement book;
	
	public Book_Hotel(WebDriver driver) {
    this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	

}
