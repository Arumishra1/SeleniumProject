package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregistrationpage extends BasePage {

	public Accountregistrationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	WebElement acceptcookies;


	@FindBy(xpath="//input[@id='input-username']")
	
	WebElement username;

	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;

	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;

	@FindBy(xpath="//select[@id='input-country']")
	WebElement country;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
    WebElement register;
	
	
	@FindBy(xpath="//h3[normalize-space()='Welcome to OpenCart, your account has been created']")
	WebElement welcome;
	

	
	public void acceptcookie() {
		acceptcookies.click();
	}
		
	public void setusername(String usernam) {
		username.sendKeys(usernam);
		
		
	}
	public void setfirstname(String firstn) {
		firstname.sendKeys(firstn);
	
		
	}
	
	public void setlastname(String lastnam) {
		lastname.sendKeys(lastnam);
		
		
	}
	
	public void setemail(String emal) {
		email.sendKeys(emal);
		
		
	}

	public void setcountry(String countr) {
		country.sendKeys(countr);
		
	}
	public void setpassword(String passwo) {
		password.sendKeys(passwo);
		
		
		
	}

	public void clickregister(String clickre) {
		register.click();
		
		
	}
	
	public String getconfirmvalidate() {
		try {
			return welcome.getText();
		
		}catch (Exception e) {
			return (e.getMessage());
		}
	}
		
		
	}
	
	

