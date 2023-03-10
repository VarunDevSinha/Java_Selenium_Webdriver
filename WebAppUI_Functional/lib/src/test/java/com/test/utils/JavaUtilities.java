package com.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaUtilities {

	public static void readExcelData(File readFile, Object[][] readData) throws IOException, InvalidFormatException {

		FileInputStream readFileIS = new FileInputStream(readFile);

		XSSFWorkbook workbook = new XSSFWorkbook(readFileIS);
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int r = 0; r <= sheet.getLastRowNum(); r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < row.getLastCellNum(); c++) {
				XSSFCell cell = row.getCell(c);
				String cellVal = cell.toString();
				readData[r][c] = cellVal;
			}
		}

		workbook.close();
		System.out.println("Successfully created \"readData\" Java object, from \"readFile.xlsx\" file.\n");

		for (int i = 0; i < readData.length; i++) {
			for (int j = 0; j < readData[i].length; j++) {
				System.out.print(readData[i][j] + " | ");
			}
			System.out.print("\n");
		}
	}
}
