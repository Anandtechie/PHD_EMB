package AllWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import GenericMethods.Generic_Methods;

public class InvoicePage {

	@FindBy(linkText = "Invoice")
	private WebElement pInvoiceTab; // Invoice tab on practice account

	@FindBy(xpath = "//a[text()='Create']")
	private WebElement pCreatebtn; // Create button under Invoice >> create on practice account

	@FindBy(xpath = "//a[text()='Rate Chart']")
	private WebElement pRateChartbtn; // Rate chart button under Invoice >> Rate Chart on practice account

	@FindBy(xpath = "//a[text()='Settings']")
	private WebElement pSettingsbtn; // settings button under Invoice >> Settings on practice account

	@FindBy(xpath = "//div[text()='Invoice Configuration']")
	private WebElement pCreatePageText; // After clicking on create the text appeared on that page 'Invoice
										// Configuration'

	@FindBy(xpath = "//div[text()='Invoice - Rate Chart']")
	private WebElement pRateChartPageText; // After clicking Rate chart the text appeared on that page 'Invoice - Rate
											// Chart'

	@FindBy(xpath = "//div[text()='Invoice Settings']")
	private WebElement pInvoiveSettingPageText; // After clicking on setting the text appeared on that page 'Invoice
												// Settings'

	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public void clickOnInvoiceTab(WebDriver driver) { // click on Invoice tab on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pInvoiceTab));
			pInvoiceTab.click();
			Reporter.log("Clicked on Invoice Tab on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnCreate(WebDriver driver) { // Click on Create button under Invoice >> create on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			Actions act = new Actions(driver);
			w.until(ExpectedConditions.visibilityOf(pCreatebtn));
			act.moveToElement(pCreatebtn).perform();
			pCreatebtn.click();
			Reporter.log("Clicked on Create button under Invoice >> create on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnRateChart(WebDriver driver) { // click on Rate Chart under Invoice >> Rate Chart on practice
														// account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			Actions act = new Actions(driver);
			w.until(ExpectedConditions.visibilityOf(pRateChartbtn));
			act.moveToElement(pRateChartbtn).perform();
			pRateChartbtn.click();
			Reporter.log("Clicked on Rate chart button under Invoice >> Rate Chart on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnSettings(WebDriver driver) { // click on Settings under Invoice >> Settings on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			Actions act = new Actions(driver);
			w.until(ExpectedConditions.visibilityOf(pSettingsbtn));
			act.moveToElement(pSettingsbtn).perform();
			pSettingsbtn.click();
			Reporter.log("Clicked on Setting button under Invoice >> Settings on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void VerifyCreatePageDisplayed() {
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 5, 2);
			Generic_Methods.verifyPageDisplayed(pCreatePageText, eText, "Invoice >> Create");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void VerifyRateChartPageDisplayed() {
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 6, 2);
			Generic_Methods.verifyPageDisplayed(pRateChartPageText, eText, "Invoice >> Rate Chart");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void VerifySettingPageDisplayed() {
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 8, 2);
			Generic_Methods.verifyPageDisplayed(pInvoiveSettingPageText, eText, "Invoice >> Settings");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
