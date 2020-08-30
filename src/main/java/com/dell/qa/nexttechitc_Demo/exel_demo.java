package com.dell.qa.nexttechitc_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exel_demo {

	public static void main(String[] args) throws Exception {
		
		
		// workbook
		//sheet
		//row
		//coloum
		//fileinputstreem reading any file
		// fileoutputstreem write in any fire
		
		
		
		
		File src = new File("C:\\Users\\Owner\\Desktop\\Exls\\STUDENTINFO.xlsx"); // set the file location
		FileInputStream fls= new FileInputStream(src); // read the file
		XSSFWorkbook wb= new XSSFWorkbook(fls);//takling to workbook  
		XSSFSheet sheet1 = wb.getSheetAt(0);//talking to sheet
		
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();// talking to row and coloumn 
		
		System.out.println(data);
		
		String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();// talking to row and coloumn 
		System.out.println(data2);
	
		
		
		

	}

}
