
package browser;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Browser 
{
	public static WebDriver driver;
	
	/* 
	 * WebBrowser settings 
	 * This file contains methods which allows user to select in which browser they need to execute the script
	 * Available Browsers : Google Chrome, MS Edge, FireFox
	 */
	public static WebDriver setDriver()
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Ebay Search Automation\n");
			System.out.println("=======================\n");
			System.out.println("Which browser would you like to execute the script on? \n" 
				+"1.Google Chrome \n"
				+"2.Mozilla Firefox \n"
				+"3.Microsoft Edge");
			int browserChoice = scan.nextInt();
			scan.close();

			if (browserChoice == 1) 
			{
				driver = setChromeDriver();
			} 
			else if(browserChoice==2)
			{
				driver=setFirefoxDriver();
			} 
			else if(browserChoice==3)
			{
				driver=setEdgeDriver();
			} 
			else 
			{
				System.out.println("Invalid data...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}

	/*
	 * Setting up Chrome Driver
	 */
	public static WebDriver setChromeDriver() 
	{
		try
		{
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}
	
	/* 
	 * Setting up Mozilla Firefox 
	 */

	public static WebDriver setFirefoxDriver() 
	{
		try
		{
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
	        driver = new FirefoxDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}
	// Setting up Microsoft Edge Driver
	public static WebDriver setEdgeDriver() 
	{
		try
		{
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", driverPath);
	        driver = new EdgeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}

	/*
	 * getUrl - > get the URL for automation testing from a Configure.properties file located 
	 * inside of Properties folder inside project root
	 */
	public static void getUrl() throws Exception
	{
		try
		{
			String filelocation = System.getProperty("user.dir") + "\\Properties\\Configure.properties";
			File file = new File(filelocation);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileinput);
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 *  Close the Browser 
	 */
	public static void closeBrowser() 
	{
		driver.quit();
	}
}