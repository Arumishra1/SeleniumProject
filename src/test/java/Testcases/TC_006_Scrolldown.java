package Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import PageObjects.Accountregistrationpage;
import PageObjects.LoginPage;
import PageObjects.ScrollFramwes;

public class TC_006_Scrolldown extends BaseClass {
	
	
	
	@Test
	public void scrolldowning() throws InterruptedException {
		
		Accountregistrationpage accreg=new Accountregistrationpage(driver);
		
		LoginPage lg=new LoginPage(driver);
		
		ScrollFramwes scroll=new ScrollFramwes(driver);
		
		accreg.acceptcookie();
		scroll.scroll();
		
		Thread.sleep(3000);
		
		scroll.clickimage();
		
		boolean validatesreen= scroll.validatingimagscreen();
		assertTrue(validatesreen);
		
		
		
		
	}
	
	

}
