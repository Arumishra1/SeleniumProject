package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registersalesforce extends BasePage{

	public Registersalesforce(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}
	

 @FindBy(xpath="//input[@name='UserFirstName']")
 WebElement firstname;
 
 @FindBy(xpath="//input[@name='UserLastName']")
 WebElement lastname;
 
 @FindBy(xpath="//input[@name='UserTitle']")
 WebElement usertitle;
 
 
 @FindBy(xpath="//a[contains(@class,'btn btn-primary salesforce-sans-regular')]")
 WebElement next;
 
 
 @FindBy(xpath="//select[@name='CompanyEmployees']")
 WebElement employees;
 
 @FindBy(xpath="//input[@name='CompanyName']")
 
 WebElement companyname;
 
 @FindBy(xpath="//select[@name='CompanyCountry']")
 WebElement country;
 
 @FindBy(xpath="//select[@name='CompanyState']")
 WebElement province;
 
 @FindBy(xpath="//a[contains(@class,'btn btn-primary salesforce-sans-regular')]")
 WebElement secnext;
 
 @FindBy(xpath="//input[@name='UserPhone']")
 WebElement phonenoo;
 
 @FindBy(xpath="//input[@name='UserEmail']")
 WebElement emailid;
 
 @FindBy(xpath="//div[@class='msaCheckbox checkboxInput section']//div//div[@class='checkbox-ui']")
 WebElement checkbox;
 
 
 @FindBy(xpath="//button[normalize-space()='Submit']")
 WebElement submit;
 
 
 @FindBy(xpath="//span[normalize-space()='Almost there! Check your email.']")
 WebElement finalpage;
 
 
 public boolean finalpagedisplay() {
	 
	 return finalpage.isDisplayed();
	 

 }
 public void clicksubmit() {
	 
	 
	 submit.click();
 }
 
 public void clickcheckbox() {
	 
	 checkbox.click();
 }
 
 
 public void clearcompanyname() {
	 
	 
	 companyname.clear();
 }
 
 public void phone(String phoneno) {
	 
phonenoo.sendKeys(phoneno);
	
 }
 
 public void settitle(String title) {
	 
	usertitle.sendKeys(title);
	
 }
 
 
public void setemail(String email) {
	 
	emailid.sendKeys(email);
}
 
public void setcompanyname(String companynamee) {
	 
	companyname.sendKeys(companynamee);
}
 
 public void setfirstname(String firstnamee) {
	 
	 firstname.sendKeys(firstnamee);
	 
 }
  public void setlastname(String lastnamee) {
	  lastname.sendKeys(lastnamee);
	  
  }
 
 public void clicknext() {
	 
	 next.click();
 }
 
 public void clicksecnext() {
	 
	 
	 secnext.click();
 }
 
 public void selectemployee() {
	 
	 Select sel=new Select(employees);
	 sel.selectByIndex(1);
	 
	
	 
 }
 public void selectcountry() {
	 
	 Select sel=new Select(country);
	 sel.selectByValue("CA");
	
	 
 }
 
public void selectprovince() {
	 
	 Select sel=new Select(province);
	 sel.selectByValue("ON");
	
	 
 }
  
 public boolean mainscreen() 
 
{
	 
	return false;
	 
	 
	 
 }

}
