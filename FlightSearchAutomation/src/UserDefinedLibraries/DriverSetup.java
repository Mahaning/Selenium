package UserDefinedLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {

	public static WebDriver driver;
	public static String exePath;
	public static String url = "https://www.air.irctc.co.in/";
	public static String browsertype;

	public static WebDriver driverInstantiate(String browser) {
		browsertype = browser;
		if (browsertype.equalsIgnoreCase("chrome")) {
			exePath = "C:\\Users\\Suriya\\eclipse-workspace\\FlightSearchAutomation\\DriverSetup\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			exePath = "C:\\Users\\Suriya\\eclipse-workspace\\FlightSearchAutomation\\DriverSetup\\edgedriver_win64\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", exePath);
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static void driverClose() {
		driver.close();
	}

}
