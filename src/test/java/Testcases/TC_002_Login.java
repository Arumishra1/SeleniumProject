package Testcases;

import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObjects.Accountregistrationpage;
import PageObjects.HOMEPAGE;
import PageObjects.LoginPage;

public class TC_002_Login extends BaseClass{
	
	
	@Test
	public void login() throws InvocationTargetException, InterruptedException {
		

		Accountregistrationpage reg= new Accountregistrationpage(driver);
		LoginPage Lp= new LoginPage(driver);

		reg.acceptcookie();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    logger.info("Moving the cursor to the element");
			
	    
	    
      Lp.loginhoverr();
    Thread.sleep(2000);

	Lp.loginbut();
	Thread.sleep(1000);

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
