package screenshot;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import org.apache.commons.io.FileUtils;

import browser.Browser;

public class CaptureScreen extends Browser
{
	public static int i=0;
	
	/*
	 * Capturing the Screenshot of the Webpage after clicking the first link that consists of "Portable" word
	 */
	public static void screenShot()
	{
		try
		{
			TakesScreenshot scrShot =((TakesScreenshot)driver); 
			File Src=scrShot.getScreenshotAs(OutputType.FILE);	
			String filePath = System.getProperty("user.dir")+"\\Screenshot\\Screenshot"+i+".png";
			i++;
			File Dest=new File(filePath);	 
			FileUtils.copyFile(Src, Dest);	
			System.out.println("Screenshot captured successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}