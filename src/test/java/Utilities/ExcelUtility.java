package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	

public FileInputStream fi;
public FileOutputStream fo;
public XSSFWorkbook workbook;
public XSSFSheet sheet;
public XSSFRow row;
public XSSFCell cell;
public CellStyle style;
String path;

public ExcelUtility(String path) {
	
	this.path=path;
	
}

public int getexcelrow(String sheetName) throws IOException {
	
	fi=new FileInputStream(path);
	workbook=new XSSFWorkbook(fi);
	sheet=workbook.getSheet(sheetName);
	int rowscount=sheet.getLastRowNum();
	workbook.close();
	fi.close();
	return rowscount;
}

public int getcellcount(String sheetName, int rowscount) throws IOException {
	
	fi=new FileInputStream(path);
	workbook=new XSSFWorkbook(fi);
	sheet=workbook.getSheet(sheetName);
	row=sheet.getRow(rowscount);
	int cellno=row.getLastCellNum();
	workbook.close();
	fi.close();
	return cellno;
	
}

public String getcellData(String sheetName, int rowscount, int cellno) throws IOException {
	
	fi=new FileInputStream(path);
	workbook=new XSSFWorkbook(fi);
	sheet=workbook.getSheet(sheetName);
	row=sheet.getRow(rowscount);
    cell=row.getCell(cellno);
    
    DataFormatter df=new DataFormatter();
    String data;
    try {
	data=df.formatCellValue(cell);
	
}catch(Exception e){
	
	data="";
}
	
	
workbook.close();
fi.close();
return data;  
}
public void setCellData(String sheetName,int rowscount,int cellno,String data) throws IOException
{
	File xlfile=new File(path);
	if(!xlfile.exists())    // If file not exists then create new file
	{
	workbook=new XSSFWorkbook();
	fo=new FileOutputStream(path);
	workbook.write(fo);
	}
			
	fi=new FileInputStream(path);
	workbook=new XSSFWorkbook(fi);
		
	if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
		workbook.createSheet(sheetName);
	sheet=workbook.getSheet(sheetName);
				
	if(sheet.getRow(rowscount)==null)   // If row not exists then create new Row
			sheet.createRow(rowscount);
	row=sheet.getRow(rowscount);
	
	cell=row.createCell(cellno);
	cell.setCellValue(data);
	fo=new FileOutputStream(path);
	workbook.write(fo);		
	workbook.close();
	fi.close();
	fo.close();
}



public void fillGreenColor(String sheetName,int rowscount,int cellno) throws IOException
{
	fi=new FileInputStream(path);
	workbook=new XSSFWorkbook(fi);
	sheet=workbook.getSheet(sheetName);
	
	row=sheet.getRow(rowscount);
	cell=row.getCell(cellno);
	
	style=workbook.createCellStyle();
	
	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
			
	cell.setCellStyle(style);
	workbook.write(fo);
	workbook.close();
	fi.close();
	fo.close();
}


public void fillRedColor(String sheetName,int rowscount,int cellno) throws IOException
{
	fi=new FileInputStream(path);
	workbook=new XSSFWorkbook(fi);
	sheet=workbook.getSheet(sheetName);
	row=sheet.getRow(rowscount);
	cell=row.getCell(cellno);
	
	style=workbook.createCellStyle();
	
	style.setFillForegroundColor(IndexedColors.RED.getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
	
	cell.setCellStyle(style);		
	workbook.write(fo);
	workbook.close();
	fi.close();
	fo.close();
}







}
