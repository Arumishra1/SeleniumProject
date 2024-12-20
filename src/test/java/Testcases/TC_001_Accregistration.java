package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

@Test
public class TC_001_Accregistration extends BaseClass  {

	
	public void accountregistration() throws InterruptedException {	

		
			
		HOMEPAGE Hp= new HOMEPAGE(driver);

Accountregistrationpage reg= new Accountregistrationpage(driver);
reg.acceptcookie();
logger.info("Accepted cookies");

Thread.sleep(3000);
reg.clicktryforfree();


Thread.sleep(5000);

 boolean heading= reg.headingvisible();
assertTrue(heading);

logger.info(heading);

	}

	}


