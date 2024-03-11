package UserDefinedLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static File src;
	public static String exfilepath = "C:\\Users\\Suriya\\eclipse-workspace\\FlightSearchAutomation\\src\\DataTables\\FlightDataSheet.xlsx";
	public static FileInputStream fileip;
	public static FileOutputStream fileop;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static String val1;
	public static int row;
	public static XSSFCell cell;
	public static XSSFRow Row;
	public static String enterOrigin;
	public static String enterDestination;
	public static String chooseOrigin;
	public static String chooseDestination;
	public static String classType;

	public static int readexcel() {
		try {
			src = new File(exfilepath);
			fileip = new FileInputStream(src);
			workbook = new XSSFWorkbook(fileip);
			sheet = workbook.getSheetAt(0);

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				if (i == 1) {
					// first row first column
					enterOrigin = (sheet.getRow(i).getCell(0)).getStringCellValue();
					// first row second column
					enterDestination = (sheet.getRow(i).getCell(1)).getStringCellValue();
					// first row third column
					chooseOrigin = (sheet.getRow(i).getCell(2)).getStringCellValue();
					// first row fourth column
					chooseDestination = (sheet.getRow(i).getCell(3)).getStringCellValue();
					// first row fifth column
					classType = (sheet.getRow(i).getCell(4)).getStringCellValue();
					System.out.println("The data values present in the excel sheet are:");
					System.out.println(enterOrigin + "- " + chooseOrigin);
					System.out.println(enterDestination + "- " + chooseDestination);
					System.out.println(classType+"\n");
					row = i;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return row;
	}

	public static void writeexcel() {
		try {
			// Close input stream
			fileip.close();
			// Create an object of FileOutputStream class to create write data in excel file
			fileop = new FileOutputStream(new File(exfilepath));
			// write data in the excel file
			workbook.write(fileop);
			// close output stream
			fileop.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
