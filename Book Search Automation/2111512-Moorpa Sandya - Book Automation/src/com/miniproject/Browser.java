package com.miniproject;


import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser {
	public static WebDriver driver;
	public static Actions act;
	// WebDriver Setup Selection Method
	public static WebDriver setDriver() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which browser would you like to execute the script on? \r\n 1. Google Chrome \r\n 2. Firefox");
		int browserChoice = scan.nextInt();
		scan.close();

		if (browserChoice == 1) {
			driver = setChromeDriver();
		} else if (browserChoice == 2) {
			driver = setFirefoxDriver();
		} else {
			System.out.println("Invalid data...");
		}
		act = new Actions(driver);
		return driver;
	}

	// ChromeDriver Setup Method
	public static WebDriver setChromeDriver() {
		String driverPath = System.getProperty("user.dir") + "\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://openlibrary.org/");
		return driver;
	}

	// firefox Driver Setup Method
	public static WebDriver setFirefoxDriver() {
	
		System.setProperty("webdriver.gecko.driver","C:\\dibs\\workspace\\dibs\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://openlibrary.org/");
		return driver;
	}
	

	// Driver Close Method
	public static void closeBrowser() {
		driver.quit();
	}
}