
package browser;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import screenshot.CaptureScreen;

public class Home extends Browser {

	// Send outdoor toys input in search box
	public void input() throws Exception {
		try {
			// Wait until the advanced search link is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-as-a")));

			// Click on Advanced Search
			Locators.advancedLnk().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void keyword_textbox() throws Exception {
		try {
			// Wait until the search box element is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_nkw")));

			Locators.keywordTextBox().sendKeys(ReadExcel.readExcel(0, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void keyword_options() throws Exception {
		try {
			// Wait until the drop down element is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_in_kw")));

			Select dropdownSelectObject = new Select(Locators.keywordOptions());
			dropdownSelectObject.selectByVisibleText("Any words, any order");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void preferred_location() throws Exception {
		try {
			// Wait until the radio button element is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LH_PrefLocRadio")));

			Locators.frmPreferredLoc().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void location_select() throws Exception {
		try {
			// Wait until the list box element for preferred location is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_sargnSelect")));

			Select dropdownSelectObject = new Select(Locators.location_listbox());
			dropdownSelectObject.selectByIndex(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void condition_new() throws Exception {
		try {
			// Wait until the check box element is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LH_ItemConditionNew")));

			Locators.conditionNew().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_search() throws Exception {
		try {
			// Wait until the search button element is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtnLowerLnk")));

			Locators.search().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void category_verify() throws Exception {
		try {
			// Wait until the search button element is located
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-cat")));

			Select sel = new Select(Locators.category_dropdown());
			String categoryMsg = sel.getFirstSelectedOption().getText();

			if (categoryMsg.equals(ReadExcel.readExcel(1, 0))) {
				System.out.println("Category changed to " + ReadExcel.readExcel(1, 0));
			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Collecting all the href_values that are present in the webpage and and
	 * clicking on the first link that consists of Portable word
	 */
	public void href_values() throws Exception {
		try {
			List<WebElement> allLinks = Locators.href();
			Iterator<WebElement> i = allLinks.iterator();

			while (i.hasNext()) {
				WebElement text = i.next();
				if (text.getText().contains(ReadExcel.readExcel(2, 0))) // checks the link that consists of "Portable"
																		// word
				{
					text.click();
					System.out.println("Verified the link contains \"Portable\" text");
					System.out.println("Clicked on the link contains \"Portable\" text");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Invoking all the methods
	public static void main(String[] args) throws Exception {
		try {
			Home obj = new Home();
			setDriver();
			getUrl();
			obj.input();
			obj.keyword_textbox();
			obj.keyword_options();
			obj.condition_new();
			obj.preferred_location();
			obj.location_select();
			obj.click_search();
			obj.category_verify();
			obj.href_values();
			CaptureScreen.screenShot();
			closeBrowser();
			System.out.println("Script completed successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}