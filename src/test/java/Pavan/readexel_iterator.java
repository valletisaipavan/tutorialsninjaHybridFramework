package Pavan;

import java.io.*;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class readexel_iterator {
    
private static final CellType STRING = null;
private static final CellType BOOLEAN = null;
private static final CellType NUMERIC = null;

public static void main(String[] arg) throws IOException {
	String excelfilepath = System
			.getProperty("E:\\Automation\\Com.Selenium.Maven.Project\\src\\test\\java\\Pavan\\fileexcel");
	File file = new File(excelfilepath);
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("one");

	Iterator<Row> itrrow = sheet.iterator();

	while (itrrow.hasNext()) {
		Row row = row.next();

		Iterator<Cell> itrcell = row.iterator();
		while (cell.hasNext()) {

			Cell cell = itrcell.next();
			CellType celltype = cell.getCellType();
			switch (celltype) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			case NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;

			}
			System.out.println(" ");

		}
		System.out.println();
	}
}

}
