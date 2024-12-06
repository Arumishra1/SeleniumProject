package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Accountregistrationpage;
import PageObjects.HOMEPAGE;
import PageObjects.LoginPage;

public class TC_001_Accregistration extends BaseClass  {

	
	@Test
	public void accountregistration() {	

		
			
		HOMEPAGE Hp= new HOMEPAGE(driver);

Accountregistrationpage reg= new Accountregistrationpage(driver);
reg.acceptcookie();
logger.info("Accepted cookies");
		
try {

		}	
	catch(Exception e)
		
	{
		logger.error("TC failed");
		logger.debug("Debug logs");
		

			
		}
		
	}

	}


