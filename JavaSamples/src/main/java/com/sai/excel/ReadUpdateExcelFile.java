package com.sai.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadUpdateExcelFile {

	public ReadUpdateExcelFile() {
		// TODO Auto-generated constructor stub
	}

	static String FILE_NAME = ".//src//main//resources//TestB.xlsx";
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File(".//src//main//resources//Test.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook (fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		cell1.setCellValue("Name");
		XSSFRow row2 = sheet.getRow(2);
		XSSFCell cell2 = row2.getCell(1);
		cell2.setCellValue("Address");
		fis.close();
		FileOutputStream fos =new FileOutputStream(new File(".//src//main//resources//Test.xlsx"));
	    workbook.write(fos);
	    fos.close();
		System.out.println("Done");

		HashMap map = (HashMap<String, Long>) prepareDummyData();
		
		ReadUpdateExcelFile excel = new ReadUpdateExcelFile();
		excel.updateExcel(map, FILE_NAME);
	}
	
	public static Map<String, Long> prepareDummyData() {
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("Screening", 1000L);
		map.put("Baseline", 1002L);
		map.put("Week 4", 1003L);
		map.put("Week 8", 1004L);
		map.put("Week 12", 1005L);
		map.put("Week 16", 1006L);
		return map;
	}
	
	
	
	
public void updateExcel (Map visitSidMap, String FILE_NAME) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(new File(FILE_NAME));
		XSSFWorkbook workbook = new XSSFWorkbook (fis);
		XSSFSheet sheet = workbook.getSheetAt(0); //get first sheet in excel file
		
		
		String visit = null;
        StringBuffer sb = new StringBuffer();
        
        int rows = sheet.getPhysicalNumberOfRows();
        
        for (int i = 1; i < rows; i ++ ) {  //start with i=1, 1st row is header
        	
        	XSSFCell cell = null; // declare a Cell object
        	 cell = sheet.getRow(i).getCell(1);  // get the 2nd excel column
        	 visit = cell.getStringCellValue(); // Visit Name
        	 
        	 cell = sheet.getRow(i).createCell(0); // get the 1st excel column
        	 cell.setCellType(XSSFCell.CELL_TYPE_NUMERIC);
        	   // Access the 1st cell in second row to update the value
        	 if (visit != null && visit.length() > 0) {
                 System.out.println(visit + "___"+ visitSidMap.get(visit));
        		
                 if (visitSidMap.get(visit) != null ) {
                 Integer sid = new Integer(visitSidMap.get(visit).toString());
        		 cell.setCellValue(sid.intValue()); // update the 1st excel column with SID
                 } else {
                	 sb.append(visit); // visit not in Map but in SVO
                	 sb.append("\n");
                 }
             }
        }//end for
		
		fis.close();
		FileOutputStream fos =new FileOutputStream(new File(FILE_NAME));
	    workbook.write(fos);
	    fos.close();
		System.out.println("Done");
		System.out.println("Missing visits-"  + sb.toString());
		
	}
	
	

}
