package com.OHRM.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT=40;
	public static long IMPLICIT_WAIT=20;
	
	public static String TESTDATA_SHEET_PATH="./src/main/java/com/OHRMinputDataFiles/OrangeHRM_Login_MultipleTestData.xlsx";
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream file;
		try
		{
			file=new FileInputStream(TESTDATA_SHEET_PATH);
			workbook=new XSSFWorkbook(file);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet=workbook.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int row=0;row<sheet.getLastRowNum();row++)
		{
			for(int cell=0;cell<sheet.getRow(row).getLastCellNum();cell++)
			{
				data[row][cell]=sheet.getRow(row+1).getCell(cell).toString();
			}
		}
		
		return data;
		
	}

}
