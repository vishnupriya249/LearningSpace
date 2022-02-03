package com_June_06;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ram mohan reddy\\Desktop\\Book1.xlsx");
	
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		for(int r=0; r<=sh.getLastRowNum(); r++)
		{
			for(int c=0; c<sh.getRow(0).getLastCellNum(); c++)
			{
				System.out.println(sh.getRow(r).getCell(c).getStringCellValue() + " ");
			}
			System.out.println();
			
			wb.close();
			
		}

	}

}
