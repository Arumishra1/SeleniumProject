package Utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Testcases.BaseClass;

public class Extentreport implements ITestListener{
	
	
	public ExtentSparkReporter sparkreporter; //responsible for UI of the report
	public ExtentReports extentrep; // responsible for population common info in the report ex browser name, os, test name, env details
	public ExtentTest extenttest; //  responsible for updating the creating test entries and update status of test methods 
	

String reportname;

public void onStart(ITestContext testcontext) {
	
	/*SimpleDateFormat df=new SimpleDateFormat();
	Date dt=new Date();
	String currentDatetimestamp=df.format(dt);*/
	
	
	String timeStamp=new SimpleDateFormat("yyyy.MM.dd.mm.ss").format(new Date()); //getting current timestamp of report
	reportname="Report-name" + timeStamp + ".html";
    sparkreporter= new ExtentSparkReporter(".//reports//" + reportname); //locatiom of report
	
	sparkreporter.config().setDocumentTitle("opencart Automation report"); // title of report
	sparkreporter.config().setReportName("opencart functional testing"); //name of report
    sparkreporter.config().setTheme(Theme.DARK); // theme of report
	
	extentrep=new ExtentReports();
	extentrep.attachReporter(sparkreporter);
	extentrep.setSystemInfo("Application"," salesforce");
	extentrep.setSystemInfo("module"," admin");

	extentrep.setSystemInfo("sub module"," customer");
	extentrep.setSystemInfo("username",System.getProperty("user.name"));
	extentrep.setSystemInfo("environment"," QA");
	
	String os=testcontext.getCurrentXmlTest().getParameter("os");
	extentrep.setSystemInfo("operating sys",os);

	String browser=testcontext.getCurrentXmlTest().getParameter("browser");
	extentrep.setSystemInfo("Browser","browser");

	
	List<String> incgroups =testcontext.getCurrentXmlTest().getIncludedGroups();
	if(incgroups.isEmpty()) {
		
		
		extentrep.setSystemInfo("groups", "none");
		
	}
	
	
	
	
}
public void onTestSuccess(ITestResult result) {
	
	extenttest= extentrep.createTest(result.getTestClass().getName());
	
	extenttest.assignCategory(result.getMethod().getGroups());
	extenttest.log(Status.PASS, result.getName()+"passed");
	
	
	
	
}


public void onTestFailure(ITestResult result) {
	
extenttest= extentrep.createTest(result.getTestClass().getName());
	
	extenttest.assignCategory(result.getMethod().getGroups());
	extenttest.log(Status.FAIL, result.getName()+"failed");
	
	
	extenttest.log(Status.INFO, result.getThrowable().getMessage());
	String imgpath=new BaseClass().capturescreenshot(result.getName());
	extenttest.addScreenCaptureFromBase64String(imgpath);
	
	
	
}

public void onTestSkip(ITestResult result) {
	
	
extenttest= extentrep.createTest(result.getTestClass().getName());
	
	extenttest.assignCategory(result.getMethod().getGroups());
	extenttest.log(Status.SKIP, result.getName()+"skipped");
	
	
	extenttest.log(Status.INFO, result.getThrowable().getMessage());
	
}

public void onFinish(ITestContext testcontext) {
	
	
	extentrep.flush();
	
	String reportpath= System.getProperty("user.dir")+ "\\Reports\\" + reportname;
	File extent=new File(reportpath);
	
	/*try {
		
		Desktop.getDesktop().browse(extent.toURI());
	} catch(IOException e) {
		
		e.printStackTrace();
	}
	
	
}*/
}

}