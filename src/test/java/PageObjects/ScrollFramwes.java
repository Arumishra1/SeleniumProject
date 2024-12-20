package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollFramwes extends BasePage{
	
	//WebDriver driver;
	
	public ScrollFramwes(WebDriver driver) {
		
		super(driver);	
		
	}
	
	@FindBy(xpath="//img[contains(@class, 'card__image')]")
	WebElement image;
	
	
	@FindBy(xpath="//p[contains(text(), 'Dreamforce returns to San Francisco')]")
	WebElement imagescreen;
	
	
	public void clickimage() {
		
		image.click();
		
	}
	
	public boolean validatingimagscreen() {
		return imagescreen.isDisplayed();
			
		
	}
 public void scroll() {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,650)", "");
	 
	 
	 
 }

}
