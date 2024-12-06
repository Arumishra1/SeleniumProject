package PageObjects;


import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage (WebDriver driver) {
	  
	super(driver);

}
	
	//@FindBy(xpath= "img[class='icon login--hover']")
	//WebElement loginhover;
	
	
	//@FindBy(css="a[href='https://login.salesforce.com/?locale=ca']")
	//WebElement loginbutton;
	
	
public  void loginhoverr()  {
	
		//Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		//action.moveToElement(loginhover).perform();
		
	JavascriptExecutor jse=(JavascriptExecutor) driver;
   WebElement loginhover=(WebElement) jse.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('hgf-c360login').shadowRoot.querySelector('hgf-button> span')");

   ((JavascriptExecutor) driver).executeScript("return arguments[0].click();", loginhover);

   
   
   
	
}


public void loginbut() {
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	   WebElement loginbut=(WebElement) jse.executeScript("return 	document.querySelector('hgf-c360nav').shadowRoot.querySelector('hgf-c360login').shadowRoot.querySelector('a')");

	   ((JavascriptExecutor) driver).executeScript("return arguments[0].click();", loginbut);

	
	
}
}