package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	XSSFWorkbook wb;
	public ExcelUtil (String Excelpath) throws IOException {
		
		try {
		File src = new File(Excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to load excel sheet, please check"+e.getMessage());
		}
	}
	
	//this method get the rows
	public int getRows(int sheetnum) {
		
		int rows = wb.getSheetAt(sheetnum).getLastRowNum()+1;
		return rows;
		}
	
	//cell values
	public String cellData(int sheetnum,int row, int col) {
		
		String data = wb.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
		return data;
	}

}
