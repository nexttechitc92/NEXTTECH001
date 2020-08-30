package com.dell.qa.nexttechitc_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exal_configer {
	
	
	
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public exal_configer(String exalpath) {
		
		try {
			File src = new File(exalpath); 
			FileInputStream fls= new FileInputStream(src); 
			wb= new XSSFWorkbook(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		
	}
	
	public String getData(int sheetNumber, int rownumber, int colmnnumber) {
		
		sheet = wb.getSheetAt(0);
		String data1 =sheet.getRow(rownumber).getCell(colmnnumber).getStringCellValue();
		
		
		return data1;
		
		
		
	}

}
