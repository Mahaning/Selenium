package TestObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UserDefinedLibraries.ExcelReadWrite;

/*
 * Author       : Suriya Subramanian Murugaian
 * Associate ID : 2111615
 * DOC          : 04-Mar-2022
 * Description  : IRCTC Flight Search Automation
 */

public class FindElements {
	public static WebElement element = null;
	public static WebDriver driver;
	// public static String origin=ExcelReadWrite.chooseOrigin;

	// Method to locate the origin text box
	public static WebElement originTbox(WebDriver driver) {
		element = driver.findElement(By.id("stationFrom"));
		return element;
	}

	// Method to locate the origin option
	public static WebElement originOption(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='" + ExcelReadWrite.chooseOrigin + "']"));
		return element;
	}

	// Method to locate the destination text box
	public static WebElement destinationTbox(WebDriver driver) {
		element = driver.findElement(By.id("stationTo"));
		return element;
	}

	// Method to locate the destination option
	public static WebElement destinationOption(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='" + ExcelReadWrite.chooseDestination + "']"));
		return element;
	}

	// Method to locate Departure
	public static WebElement departure(WebDriver driver) {
		element = driver.findElement(By.id("originDate"));
		return element;
	}

	// Method to locate today's date in calendar
	public static WebElement todayDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='act active-red']"));
		return element;
	}

	// Method to locate travel class
	public static WebElement classType(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@class='form-control']"));
		return element;
	}

	// Method to locate the Business class option
	public static WebElement travelClass(WebDriver driver) {
		element = driver.findElement(By.id("travelClass"));
		return element;
	}

	// Method to locate search button
	public static WebElement submit(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='form-in-custom3']/button[@type='submit']"));
		return element;
	}

	// Method to locate the displayed flights
	public static List<WebElement> flights(WebDriver driver) {
		List<WebElement> flights = driver.findElements(
				By.xpath("//div[@class='col-12 col-md-12 right-searchbar']/div[@class='right-searchbarbtm']"));
		return flights;
	}

}
