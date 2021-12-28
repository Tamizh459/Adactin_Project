package com.cucumber.adactin;


import com.CucumberProject.Base_Class;
import com.adactin.pom.Adactin_Pom;
import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Book_Iternity;
import com.adactin.pom.Hotel_Search;
import com.adactin.pom.Select_Hotel;

public class Adactin_Project extends Base_Class {
	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");

		openthePage("https://adactinhotelapp.com/index.php");

		Adactin_Pom pm = new Adactin_Pom(driver);
		inputValues(pm.getUser(), "Tamizhselvan");
		inputValues(pm.getPass(), "Tamizh@459");
		clickonElement(pm.getLogin());

		Hotel_Search hs = new Hotel_Search(driver);
		dropDown(hs.getCity(), "value", "Melbourne");
		dropDown(hs.getHotel(), "value", "Hotel Sunshine");
		dropDown(hs.getRoom(), "value", "Deluxe");
		dropDown(hs.getNo(), "value", "1");
		dropDown(hs.getAdult(), "value", "2");
		dropDown(hs.getChild(), "value", "1");
		clickonElement(hs.getSearch());

		Select_Hotel sh = new Select_Hotel(driver);
		clickonElement(sh.getButton());
		clickonElement(sh.getCnt());

		Book_Hotel bh = new Book_Hotel(driver);		
		inputValues(bh.getFirstname(), "Tamizh");
		inputValues(bh.getLastname(), "Selvan");
		inputValues(bh.getAddress(), "57,padasalai st, vandavasi");
		inputValues(bh.getCreditcard(), "1234567891234567");
		dropDown(bh.getCardtype(), "value", "VISA");
		dropDown(bh.getMonth(), "value", "4");
		dropDown(bh.getYear(), "value", "2021");
		inputValues(bh.getCvv(), "548");
		clickonElement(bh.getBook());

		Book_Iternity bi= new Book_Iternity(driver);
        implicitWait();
		clickonElement(bi.getIternity());
		
		String path=("C:\\Users\\SATHYA\\eclipse-workspace\\CucumberProject\\ScreenShot\\adactin.png");
	    takeSnap(path);
	    
	    clickonElement(bi.getLogout());
	
	}

}
