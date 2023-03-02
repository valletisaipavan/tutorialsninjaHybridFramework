package Pavan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel_forloop {
public static void main(String[] arg) throws IOException {
	

String excelfilepath = System.getProperty("E:\\Automation\\Com.Selenium.Maven.Project\\src\\test\\java\\Pavan\\fileexcel")	;
File file = new File(excelfilepath);
FileInputStream fis = new FileInputStream(file);
   XSSFWorkbook workbook = new XSSFWorkbook(fis);
  XSSFSheet sheet = workbook.getSheet("one");
	int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();
	for(int r=0;r<rows;r++) {

	XSSFRow  row = sheet.getRow(r);
	
	for(int c=0;c<cols;c++) {
		
		 XSSFCell cell = row.getCell(c);
 CellType celltype = cell.getCellType();
 switch(celltype) {
 case STRING : System.out.println(cell.getStringCellValue());
 break;
 case BOOLEAN : System.out.println(cell.getBooleanCellValue());
 break;
 case NUMERIC: System.out.println(cell.getNumericCellValue());
 break;
 
 }
	System.out.println(" ");	 
			 
	}
	System.out.println();
}




}}