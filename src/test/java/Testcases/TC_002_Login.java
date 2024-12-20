package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.google.common.io.Files;

import PageObjects.Accountregistrationpage;
import PageObjects.HOMEPAGE;
import PageObjects.LoginPage;
@Listeners(Utilities.Extentreport.class)

public class TC_002_Login extends BaseClass{
	

	@Test
	public void login() throws InvocationTargetException, InterruptedException, IOException {
		

		Accountregistrationpage reg= new Accountregistrationpage(driver);
		LoginPage Lp= new LoginPage(driver);

		reg.acceptcookie();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    logger.info("Moving the cursor to the element");
			
	    
	    
      Lp.loginhoverr();
   
	Lp.loginbut();
	
	File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File(".\\Screenshots\\"+ "screenshot.png"));

		
	

Lp.setusername(p.getProperty("Username"));
Lp.setpassword(p.getProperty("Passwordd"));

Lp.clicklogin();

  //Lp.recaptcha();	

	try {
	
	logger.info("succeful cookies");



	}	
    catch(Exception e)
    
{
	logger.error("TC failed");
	logger.debug("Debug logs");
		
	
	}
	}
}
