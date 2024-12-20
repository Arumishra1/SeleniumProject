package Testcases;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import PageObjects.Accountregistrationpage;
import PageObjects.LoginPage;
import Utilities.Dataprovider;

public class Login_005_DataDrivenTC extends BaseClass {
	

	@Test(dataProvider="LoginData", dataProviderClass=Dataprovider.class)
	public void login(String Username, String password, String status) throws InvocationTargetException, InterruptedException, IOException {
		

		Accountregistrationpage reg= new Accountregistrationpage(driver);
		LoginPage Lp= new LoginPage(driver);

		reg.acceptcookie();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);	 
		logger.info("Moving the cursor to the element");
			
		Thread.sleep(2000);	 

        Lp.loginhoverr();
		Thread.sleep(2000);	 

	   Lp.loginbut();
		Thread.sleep(2000);	 

		
	
Lp.setusername(Username);
Lp.setpassword(password);

Lp.clicklogin();



}
}