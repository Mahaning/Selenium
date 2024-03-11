package UserDefinedLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void screenShotTC(WebDriver ldriver) {
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try { // now copy the screenshot to desired location using copyFile method
			FileUtils.copyFile(src,
					new File("C:\\Users\\Suriya\\eclipse-workspace\\FlightSearchAutomation\\Screenshots\\"
							+ System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
