package Selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_JXL {
  
  public static void main(Strings[] args) throws Exception  {
	  
	File src =new File("D:\\New folder\\Book1.xlsx");
	FileInputStream fis= new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	for(int i=0;i<sheet1.getLastRowNum();i++)
	{
	   String data=sheet1.getRow(i).getCell(0).getStringCellValue()	;
	   System.out.println(data);
	}
	
	
	
		
  }
}
