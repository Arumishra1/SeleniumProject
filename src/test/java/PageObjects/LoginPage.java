package PageObjects;


import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	public LoginPage (WebDriver driver) {
	  
	super(driver);

}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement login;
	
	
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

public void recaptcha() {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
            By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
    
    wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
  
}

public void setusername(String Username1) {
	username.sendKeys(Username1);
	
	
}

public void setpassword(String Passwordd) {
	
	password.sendKeys(Passwordd);
	
	
}
public void clicklogin() {
	login.click();
	
	
}
}