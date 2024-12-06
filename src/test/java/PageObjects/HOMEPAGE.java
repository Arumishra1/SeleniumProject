package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HOMEPAGE extends BasePage{

	
	
	public HOMEPAGE(WebDriver driver){
		
		super(driver);
		
		
		
		
	}
@FindBy(xpath= "//a[@class='btn btn-link navbar-btn']")
WebElement login;


@FindBy(xpath="//a[@class='btn btn-black navbar-btn']")
WebElement registration;


public void clicklogin() {
	login.click();
	
	
}
public void clickregistration(){
	
	
	registration.click();
}
}
