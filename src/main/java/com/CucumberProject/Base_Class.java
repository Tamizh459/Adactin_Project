package com.CucumberProject;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
      public static WebDriver driver;
//browserLaunch
      
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHYA\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.GECKO.driver", "");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("invalid browser");
		}
		return driver;

	}
//close
	
	public static void closethePage() {
         driver.close();
	
	}
//quit	
	
	public static void quittheBrowser() {
         driver.quit();
         
	}
//get
	
	public static void openthePage(String str) {
       driver.get(str);
	
	}
//getcurrentUrl
	
	public void gettheCurrentUrl() {
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);

	}	
//getTitle
	
	public static void gettheTitle() {
      String title = driver.getTitle();
      System.out.println(title);
      
	}
	
	// navigate to
	
		public static void to(String str) {
	      driver.navigate().to(str);
	      
		}
	//navigate back
		
		public static void back() {
	driver.navigate().back();

		}
	//navigate forward
		
		public static void forward() {
			driver.navigate().forward();

		}
	//navigate refresh
		public static void refresh() {
	 driver.navigate().refresh();
		
		}
		
		
		
	//  click 
		
		public static void clickonElement(WebElement element) {
	     element.click();
		}
		
//		sendKeys
		public static void inputValues(WebElement element,String str) {
	    element.sendKeys(str);
		}
		
	//getText	
		
		public static void gettheText(WebElement element) {
	    String text = element.getText();
	    System.out.println(text);
		}
	//getAttribute
		
		public static void gettheAttribute(WebElement element) {
	    String text = element.getAttribute("Values");
		System.out.println(text);
		
		}
	//getLocation
		
		public static void gettheLocation(WebElement element) {
		element.getLocation();	
			
		}
	//gettagName
		
		public static void gettheTagName(WebElement element) {
	   String tagName = element.getTagName();
		System.out.println(tagName);
		
		}
	//clear
		
		public static void erase(WebElement element) {
	    element.clear();
	    
		}
	//submit	
		
		public static void submittheElement(WebElement element) {
	     element.submit();
	     
		}
			
//frames	
	public static void frames(WebElement element,String value,String type) {
  
		if (type.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(value);
			driver.switchTo().frame(num);
		}
		else if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);
		}
		else if (type.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}
	}
//Actions
	
	public static void actions(WebElement element,String type) {
     Actions act=new Actions(driver);
     
     if (type.equalsIgnoreCase("click")) {
		act.click(element).build().perform();
	}
     else if (type.equalsIgnoreCase("doubleclick")) {
		act.doubleClick(element).build().perform();
	}
     else if (type.equalsIgnoreCase("rightclick")) {
		act.contextClick(element).build().perform();
	}
     else if (type.equalsIgnoreCase("moveToElement")) {
		act.moveToElement(element).build().perform();
		}
	}
//explicitWait
	
	public static void explicitWait(String type,WebElement ele,By locator) {
WebDriverWait wait=new WebDriverWait(driver, Duration.ofNanos(30));
		if (type.equalsIgnoreCase("visibleofElement")) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
    
    else if (type.equalsIgnoreCase("visibleofElements")) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
    
    else if (type.equalsIgnoreCase("alert")) {
		wait.until(ExpectedConditions.alertIsPresent());
	}
    else if (type.equalsIgnoreCase("elementToClickable")) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}
	
	//element to click
	public static void elementToClick(WebElement ele) {
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofNanos(10));
      wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
//implicit wait
	
	public static void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		} catch (Exception e) {
	}
		 }
//Screenshot
	
	public static void takeSnap(String path) throws IOException {
        TakesScreenshot shot=(TakesScreenshot) driver;
        File src = shot.getScreenshotAs(OutputType.FILE);
        File dest=new File(path);
        FileUtils.copyFile(src, dest);
	}
//Scroll up and down and click	
	
	public static void scroll(WebElement element,String type,String value) {
      JavascriptExecutor js=(JavascriptExecutor) driver;
      
      if (type.equalsIgnoreCase("scrollby")) {
		js.executeScript(value);
	}
      else if (type.equalsIgnoreCase("scrollinto")) {
		js.executeScript("arguments[0].scrollIntoView()",element);
 
      }
    	}
//java script
           public static void jsClick(WebElement element) {
        	   JavascriptExecutor js=(JavascriptExecutor) driver;
        	   js.executeScript("arguments[0].click();", element);
		}	
//Alert
	public static void alert(String type,String value) {

		if (type.equalsIgnoreCase("accept")) {
			Alert alt = driver.switchTo().alert();
			alt.accept();
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			Alert alt = driver.switchTo().alert();
			alt.dismiss();
		}
		else if (type.equalsIgnoreCase("sendkeys")) {
			Alert alt = driver.switchTo().alert();
			alt.sendKeys(value);
		}
		else if (type.equalsIgnoreCase("getText")) {
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			System.out.println(text);
		}
	}
	
//robot
	public static void robot() throws Throwable {
     Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
     rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
//WindowHandling	
	
	
	
	
	
//dropDown
	
	public static void dropDown(WebElement ele, String type, String value) {
      Select s=new Select(ele);
     if (type.equalsIgnoreCase("value")) {
		s.selectByValue(value);
	} 
     
     else if (type.equals("index")) {
		s.selectByIndex(Integer.parseInt(value));
	}
      
     else if (type.equals("text")) {
		s.selectByVisibleText(value);
	}    
}
 }
