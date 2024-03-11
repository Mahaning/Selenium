package TestScenarios;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestObjectRepository.FindElements;
import UserDefinedLibraries.DriverSetup;
import UserDefinedLibraries.ExcelReadWrite;
import UserDefinedLibraries.ScreenShot;

/*
 * Author       : Suriya Subramanian Murugaian
 * Associate ID : 2111615
 * DOC          : 04-Mar-2022
 * Description  : IRCTC Flight Search Automation
 */

public class FlightSearch {
	public static WebDriver driver;
	public static List<WebElement> flightsInfo;
	public static int count = 0, count1 = 0;
	public static String flightName, flightNumber;
	public static String url;
	public static String currDate, dateNxtPg, fCityNxtPg, tCityNxtPg;
	public static XSSFCell cell, cell2;
	public static XSSFRow Row;
	public static File src;
	public static String[] name, number;

	@Parameters("browser")
	@BeforeClass
	// Method to instantiate driver
	public void driverConfig(String browser) {
		driver = DriverSetup.driverInstantiate(browser);
	}

	@Test(priority = 1)
	// Method to read data from excel sheet
	public void testcaseReadxl() {
		try {
			ExcelReadWrite.readexcel();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	// Method to choose option in Origin
	public void testOrigin() {
		FindElements.originTbox(driver).sendKeys(ExcelReadWrite.enterOrigin);
		FindElements.originOption(driver).click();
	}

	@Test(priority = 3)
	// Method to choose option in Destination
	public void testDestination() {
		FindElements.destinationTbox(driver).sendKeys(ExcelReadWrite.enterDestination);
		FindElements.destinationOption(driver).click();
	}

	@Test(priority = 4)
	// Method to select today's date
	public void testDate() {
		FindElements.departure(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", FindElements.todayDate(driver));
	}

	@Test(priority = 5)
	// Method to choose travel class type as business
	public void testClass() {
		FindElements.classType(driver).click();
		Select select = new Select(FindElements.travelClass(driver));
		select.selectByValue(ExcelReadWrite.classType);
	}

	@Test(priority = 6)
	// Method to click Search Button
	public void testSubmit() {
		FindElements.submit(driver).click();
	}

	@Test(priority = 7)
	// Method to verify date and city values
	public void verifyDateCity() {
		// Using SimpleDateFormat class to find today's date
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		currDate = s.format(d);
		url = driver.getCurrentUrl();
		int index = url.indexOf(currDate);
		// take the date value from the next page url value
		dateNxtPg = url.substring(index, index + 10);
		// check whether current date and date displayed are same
		if (currDate.equals(dateNxtPg)) {
			System.out.println("The Displayed date is same as the chosen date");
			// collect the displayed flights data
			flightsInfo = FindElements.flights(driver);
			count = flightsInfo.size();
			for (int i = 1; i <= count; i++) {
				// locate and collect origin city name in result page
				fCityNxtPg = driver
						.findElement(By.xpath("//div[@class='right-searchbarbtm'][" + i + "]/div/div[2]//span"))
						.getText();
				// locate and collect destination city name in result page
				tCityNxtPg = driver
						.findElement(By.xpath("//div[@class='right-searchbarbtm'][" + i + "]/div/div[3]//span"))
						.getText();
				// check whether entered city values and displayed city values are same
				if (fCityNxtPg.equals(ExcelReadWrite.chooseOrigin)
						&& tCityNxtPg.equals(ExcelReadWrite.chooseDestination))
					count1++;
				else {
					System.out.println("The Displayed City is not same as the chosen City");
					break;
				}

			}
			if (count == 0)
				System.out.println("No flights are available between " + ExcelReadWrite.chooseOrigin + " and "
						+ ExcelReadWrite.chooseDestination);
			if (count > 0) {
				// validate whether all the flights data displayed are according to the selected
				// values
				if (count1 == count) {
					System.out.println(
							"The Displayed City values are same as the Chosen City Values.\nAll the results displayed after submit are successfully verified.\n");
				}
			}
		} else {
			System.out.println("The Displayed date is not same as the chosen date");
		}
	}

	@Test(priority = 8)
	// Method to collect the available flight name and number
	public void testCollectFlights() {

		if (count > 0) {
			System.out.println("There are " + count + " flights available between " + ExcelReadWrite.chooseOrigin
					+ " and " + ExcelReadWrite.chooseDestination);
			name = new String[count];
			number = new String[count];
			for (int i = 0; i < count; i++) {
				name[i] = (driver
						.findElement(By.xpath("//div[@class='right-searchbarbtm'][" + (i + 1) + "]/div/div[1]//b"))
						.getText());
				number[i] = (driver
						.findElement(By.xpath("//div[@class='right-searchbarbtm'][" + (i + 1) + "]/div/div[1]//span"))
						.getText());
				System.out.println((i + 1) + ") Flight Name: " + name[i] + "    Number: " + number[i]);
			}
		}

	}

	@Test(priority = 9)
	// Method to take screenshot
	public static void screenshot() {
		try {
			ScreenShot.screenShotTC(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	// Method to write the displayed result into excel sheet
	public static void prodintoexcel() {
		for (int i = 0; i < count; i++) {
			try {
				Row = ExcelReadWrite.sheet.getRow(i + 1);
				if (Row == null) {
					// First cell in the row, create
					Row = ExcelReadWrite.sheet.createRow(i + 1);
				}
				cell = Row.getCell(5);
				if (cell == null)
					cell = Row.createCell(5);
				cell2 = Row.getCell(6);
				if (cell2 == null)
					cell2 = Row.createCell(6);
				cell.setCellValue(name[i]);
				cell2.setCellValue(number[i]);
				ExcelReadWrite.writeexcel();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@AfterClass
	// Method to close driver
	public void driverexit() {
		DriverSetup.driverClose();
	}

}
