package Testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.Accountregistrationpage;
import PageObjects.HOMEPAGE;
import PageObjects.Registersalesforce;
import net.bytebuddy.utility.RandomString;

public class TC_004 extends BaseClass {
	
	
	@Test
	public void register() throws InterruptedException {
		
		Registersalesforce regsal=new Registersalesforce(driver);
		
		HOMEPAGE Hp= new HOMEPAGE(driver);

		Accountregistrationpage reg= new Accountregistrationpage(driver);
		reg.acceptcookie();
		logger.info("Accepted cookies");

		Thread.sleep(3000);
		reg.clicktryforfree();

		Thread.sleep(5000);

		 boolean heading= reg.headingvisible();
		assertTrue(heading);

		regsal.setfirstname(p.getProperty("firstname"));
		
		regsal.setlastname(p.getProperty("lastname"));

		regsal.settitle("title");
		
		Thread.sleep(5000);

		regsal.clicknext();

		regsal.selectemployee();
		//regsal.clearcompanyname();
		Thread.sleep(1000);

		//regsal.setcompanyname(p.getProperty("companynamee"));
		regsal.selectcountry();
		regsal.selectprovince();
		
		Thread.sleep(5000);
		
		regsal.clicksecnext();
		Thread.sleep(5000);
		
		regsal.phone(p.getProperty("phone"));
		Thread.sleep(5000);
		
		regsal.setemail(randomstring()+"@gmail.com");
		
		regsal.clickcheckbox();
		Thread.sleep(5000);

		
         regsal.clicksubmit();

         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
         
         boolean finalstatus =regsal.finalpagedisplay();
          assertTrue(finalstatus) ;
          
		
          
		
	}
	
	
	
	
	

}
