package GenericMethods;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class Generic_Methods implements Iconstants {
	public static String Get_Property(String key) {
		Properties p = new Properties();
		String value = "";
		try {
			p.load(new FileInputStream(SETTING_PATH));
			value = p.getProperty(key);

		} catch (Exception e) {

		}
		return value;
	}

	public static String Get_cell_value(String sheet, int row, int col) {
		String value = "";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(XL_PATH));
			value = wb.getSheet(sheet).getRow(row).getCell(col).toString();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return value;
	}

	public static int getRowCount(String sheet) {
		int rowCount = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(XL_PATH));
			rowCount = wb.getSheet(sheet).getLastRowNum();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowCount;

	}

	public static int getColcount(String sheet, int row) {
		int colCount = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(XL_PATH));
			colCount = wb.getSheet(sheet).getRow(row).getLastCellNum();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return colCount;
	}

	public static void clickScreenshot(String folder, String TestName, WebDriver driver) {
		String dateTime = new Date().toString().replaceAll(":", "_");
		TakesScreenshot t = (TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		String dstPath = folder + TestName + dateTime + ".png";
		try {
			FileUtils.copyFile(srcFile, new File(dstPath));
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void verifyPageDisplayed(WebElement e, String eText,String methName) {
		try {
			String aText = e.getText();
			if (aText.equals(eText)) {
				Reporter.log(methName+"     Page is displayed");
			} else {
				Reporter.log(methName+"     Page is not displayed");
				Assert.fail();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			Assert.fail();
		}
	}
	

}
