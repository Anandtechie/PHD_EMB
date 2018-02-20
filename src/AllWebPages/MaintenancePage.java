package AllWebPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import GenericMethods.Generic_Methods;

public class MaintenancePage {
	@FindBy(linkText = "Maintenance")
	private WebElement pMaintenanceTab; // Maintenance tab on practice page

	@FindBy(linkText = "Dashboard View Settings")
	private WebElement pDashboardViewSettingTab; // dashboard view setting on practice page

	@FindBy(id = "dashlet1")
	private WebElement pDashLetone; // first dashlet on practice page

	@FindBy(id = "Submit2")
	private WebElement pSaveDashletBtn; // save button for dashlet

	@FindBy(xpath = "//div[text()='Dashboard View Settings']")
	private WebElement pMaintenanceDashBoardPageText; // After clicking on Dashboard the text should appear 'Dashboard
														// View Settings'

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public MaintenancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPracticeMaintenaceTab(WebDriver driver) { // clicking on maintenance tab on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pMaintenanceTab));
			pMaintenanceTab.click();
			Reporter.log("clicked on practice Maintenace tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPracticeDashBoardViewSetting(WebDriver driver) { // click on dashboard view setting on practice
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			Actions act = new Actions(driver);
			w.until(ExpectedConditions.visibilityOf(pDashboardViewSettingTab));
			act.moveToElement(pDashboardViewSettingTab).perform();
			pDashboardViewSettingTab.click();
			Reporter.log("clicked on dashboard view setting on practice");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void selectClaimStatusSummaryDashlet1OnPractice(WebDriver driver) { // Select dash let claim status summary
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pDashLetone));
			Select s = new Select(pDashLetone);
			s.selectByVisibleText("Claim Status Summary");
			Reporter.log("Selecting dash let claim status summary");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnSavebuttonDashletScreen(WebDriver driver) { // clicking on save button on dashlet screen
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pSaveDashletBtn));
			pSaveDashletBtn.click();
			w.until(ExpectedConditions.alertIsPresent());
			Alert a = driver.switchTo().alert();
			a.accept();
			Reporter.log("clicked on save after selecting the dashlet");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void VerifyDashBoardViewSettingPageDisplayed() {
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 8, 2);
			Generic_Methods.verifyPageDisplayed(pMaintenanceDashBoardPageText, eText,
					"Maintenance >> Dashboard View Setting");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
