
package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Browser {
	// Locating Advanced Search link
	public static WebElement advancedLnk() {
		try {
			return driver.findElement(By.id("gh-as-a"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Locating the keyword drop down
	public static WebElement keywordTextBox() {
		try {
			return driver.findElement(By.id("_nkw"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Locating the Keyword Options
	public static WebElement keywordOptions() {
		try {
			return driver.findElement(By.id("_in_kw"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Locating the check box for Condition with label "New"
	public static WebElement conditionNew() {
		try {
			return driver.findElement(By.id("LH_ItemConditionNew"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Locating radio button for "From preferred locations"
	public static WebElement frmPreferredLoc() {
		try {
			return driver.findElement(By.id("LH_PrefLocRadio"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Locating drop down for "From preferred locations"
	public static WebElement location_listbox() {
		try {
			return driver.findElement(By.id("_sargnSelect"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Locating Search button
	public static WebElement search() {
		try {
			return driver.findElement(By.id("searchBtnLowerLnk"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Locating drop down for category drop down
	public static WebElement category_dropdown() {
		try {
			return driver.findElement(By.id("gh-cat"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	Locating all href links
	public static List<WebElement> href() {
		try {
			List<WebElement> allLinks = driver.findElements(By.className("vip"));
			System.out.println("Found all the href values");
			return allLinks;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
