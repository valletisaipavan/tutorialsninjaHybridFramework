package FRAMEWORKS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class utilities {
public static final int implicit_wait_time=10;
public static final int  page_wait_time=10;
public static String generatetimestamp() {

		Date date = new Date();
		String timestamp = date.toString().replace(" ", "_").replace(":", "_");
	 return "saipavan805"+timestamp+"@gmail.com";
	}

/*
public static Object[][] readdatafromexcel() {
String ecxelfilepath= System.getProperty("excelpath");
	File file = new File(ecxelfilepath);
	XSSFWorkbook workbook = null;
	
try {
	FileInputStream fis =new FileInputStream(file);
 workbook = new XSSFWorkbook(fis);
}catch(IOException e) {
	e.printStackTrace();
}
	XSSFSheet sheet = workbook.getSheet("login");
	int rows = sheet.getPhysicalNumberOfRows();
	int cols = sheet.getRow(0).getLastCellNum();
	Object [][] data =new Object [rows][cols];
	for(int i=0;i<rows;i++) {
		XSSFRow row =sheet.getRow(i+1);
		for(int j=0;j<cols;j++) {
			XSSFCell cell = row.getCell(j);
			org.apache.poi.ss.usermodel.CellType celltype = cell.getCellType();
			switch(celltype) {
			case STRING:
				data[i][j]= cell.getStringCellValue();
				break;
			case NUMERIC:	
			data[i][j]=Integer.toString((int)cell.getNumericCellValue());
			break;
			case BOOLEAN:
				data[i][j]= cell.getBooleanCellValue();
				break;
			}
			
	}
	
	
	}
	return data;
}*/
}

