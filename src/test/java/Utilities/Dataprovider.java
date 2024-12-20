package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	
	@DataProvider(name="LoginData")
	
public String [][]getData() throws IOException{
		
		String path=".//Testdata//TestData.xlsx/";
		//String path= System.getProperty("user.dir")+"//Testdata//TestData.xlsx\"";
		//String path= ".\\Testdata\\TestData.xlsx";
		
		ExcelUtility utils=new ExcelUtility(path);{
		int totalrowno=utils.getexcelrow("Sheet1");
		int totalcolno=utils.getcellcount("Sheet1", 1);
		
		String loginData[][]=new String[totalrowno][totalcolno];
		
		for(int i=1;i<=totalrowno;i++) {
			for(int j=0;j<totalcolno;j++) {
				
				 loginData[i-1][j]=utils.getcellData("sheet1", i, j);
				
			}
		}
		return loginData;
		
		
	}
	}}
