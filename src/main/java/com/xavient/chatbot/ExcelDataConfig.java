package com.xavient.chatbot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	XSSFSheet sheet2;

	public ExcelDataConfig(String excelPath) {
		try {
			// Specify the path of file
			File src = new File(excelPath);
			// load file
			FileInputStream fis = new FileInputStream(src);
			// Load workbook
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	public String getdata(int sheetNumber, int row, int column) {

		// Load sheet- Here we are loading first sheetonly
		sheet1 = wb.getSheetAt(0);
		sheet2=wb.getSheetAt(1);
		// getRow() specify which row we want to read.

		// and getCell() specify which column to read.;
		// getStringCellValue() specify that we are reading String data
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();

		return data;
	}

	public void writeData(int sheetNumber, int row, int column, String str) throws Throwable {
		// Load sheet- Here we are loading first sheetonly
		sheet1 = wb.getSheetAt(0);
		// getRow() specify which row we want to read.
		// and setCellvalue will set the value
		sheet1.getRow(row).getCell(column).setCellValue(str);
		// here we need to specify where you want to save file

		FileOutputStream fout = new FileOutputStream(
				new File("../ChatBotTest/src/main/resources/template-testing.xlsx"));

		// finally write content

		wb.write(fout);

		// close the file

		fout.close();

	}


	public int rowCount() {
		return sheet1.getPhysicalNumberOfRows();
		
}
	public int getRowcount(int Sheetindex) {
		int row = wb.getSheetAt(Sheetindex).getLastRowNum();
		row = row + 1;
		return row;
	}
}
