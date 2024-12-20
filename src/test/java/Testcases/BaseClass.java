package Testcases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BaseClass {
	

public org.apache.logging.log4j.Logger logger;
public static WebDriver driver;
public Properties p;

	
	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters({"os", "browser"})
	public void setup(String os, String br) throws IOException {
		
	 FileReader file=new FileReader("./src//test/resources/config.properties");
     p= new Properties();
     p.load(file);
		
		
		logger=LogManager.getLogger(this.getClass());
		
		/*switch(br.toLowerCase())
		{
		case "chrome" :driver= new ChromeDriver(); break;
		
		case "firefox" :driver= new FirefoxDriver(); break;
		case "edge" :driver= new EdgeDriver(); break;
        default : System.out.println("Invalid browser"); return;
		
		}*/

		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().implicitlyWait(10, null);
		driver.get(p.getProperty("APPURL"));
		
		driver.manage().window().maximize();
		
		
	}
	@AfterClass
	public void teradown() {
		//if(this.driver != null){
	       driver.quit();
	   	
		
	}
	
	
public String randomstring() {
		
		String randomstr= RandomStringUtils.randomAlphabetic(5);
		return randomstr;
		
		
	}
	
public String randomnos() {
		
		String randomno= RandomStringUtils.randomNumeric(10);
		return randomno;
		
		
	}

public String captureScreen(String tname) throws IOException {

	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	
	String targetFilePath=System.getProperty("user.dir")+".\\screenshots\\" + tname + "_" + timeStamp + ".png";
	File targetFile=new File(targetFilePath);
	
	sourceFile.renameTo(targetFile);
		
	return targetFilePath;

}

	
	
	
	
	
	

}

