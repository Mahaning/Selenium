package browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	//Reads data from Excel file
	public static String readExcel(int r, int c) throws IOException 
	{
		String filePath = System.getProperty("user.dir")+"\\Excel\\TestData.xlsx";
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheetAt(0);
		String testData = String.valueOf(ws.getRow(r).getCell(c));
		wb.close();
		return testData;
	}
}