package AllWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import GenericMethods.Generic_Methods;

public class PatientsPage {

	@FindBy(linkText = "Patients")
	private WebElement pPatientsTab; // patients tab on practice page

	@FindBy(xpath = "//a[text()=' View ']")
	private WebElement pViewpatientsbtn; // under patients view button on practice page

	@FindBy(xpath = "//span[text()='Eligibility']")
	private WebElement pEligibilitybtn; // under patients eligibility button on practice page

	@FindBy(linkText = "Referral/Authorization")
	private WebElement pReferralbtn;// under patients Referral/authorization button on practice page

	@FindBy(xpath = "//span[text()='History']")
	private WebElement pHistorybtn; // under patients History button on practice page

	@FindBy(linkText = "Debt Set Off")
	private WebElement pDebtSetoffbtn;// under patients debt set off button on practice page

	@FindBy(linkText = "Bad Debt Write Off")
	private WebElement pBadDebtWriteoffbtn; // under patients bad debt write off button on practice page

	@FindBy(linkText = "Debt Set Off Summary")
	private WebElement pDebtSetoffSummarybtn;// under patients debt sett off summary button on practice page

	@FindBy(xpath = "//a[text()='Batches ']")
	private WebElement pBatchesbtn;// under patients >> eligibility>> batches btn on practice page

	@FindBy(xpath = "//a[text()='Inquiries ']")
	private WebElement pInquiriesbtn;// under patients >> eligibility >> inquiries btn on practice page

	@FindBy(xpath = "//a[text()='Import/Export ']")
	private WebElement pImportbtn;// under patients>> history>> import/export btn on practice page

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public PatientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPatientsTab(WebDriver driver) { // clicking on patients tab on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientsTab));
			pPatientsTab.click();
			Reporter.log("Clicked on patients tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnViewbtn(WebDriver driver) { // clicking on view button under patients tab on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pViewpatientsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pViewpatientsbtn).perform();
			pViewpatientsbtn.click();
			Reporter.log("Clicked on View button patients >> view");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnEligibilitybtn(WebDriver driver) { // clicking on eligibility button under patients tab on
															// practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pEligibilitybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pEligibilitybtn).perform();
			pEligibilitybtn.click();
			Reporter.log("Clicked on eligibilitiy button patients >> eligibility");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnBatches(WebDriver driver) { // clicking on batches under patients>> eligibility >>batches on
													// practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pBatchesbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pBatchesbtn).perform();
			pBatchesbtn.click();
			Reporter.log("Clicked on batches under patients >> eligibility >> batches");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnInquries(WebDriver driver) {// clicking on inquries under patients>> eligibitlity >>inquires on
													// practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pInquiriesbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pInquiriesbtn).perform();
			pInquiriesbtn.click();
			Reporter.log("Clicked on inquiries button under patients >> eligibility >> inquires");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnReferral(WebDriver driver) { // clicking on referral/authrozation on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pReferralbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pReferralbtn).perform();
			pReferralbtn.click();
			Reporter.log("Clicked on referral or authorization");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnHistory(WebDriver driver) {// clicking on history on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pHistorybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pHistorybtn).perform();
			pHistorybtn.click();
			Reporter.log("Clicked on History button");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnImportExport(WebDriver driver) { // clicking on history >>Import/Export button on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pImportbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pImportbtn).perform();
			pImportbtn.click();
			Reporter.log("Clicked on import/export under patients >> history >> import/export");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnDebtSetOff(WebDriver driver) {// clicking on Debt set off button on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pDebtSetoffbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pDebtSetoffbtn);
			pDebtSetoffbtn.click();
			Reporter.log("Clicked on Debt set off ");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnBadDebtWriteOff(WebDriver driver) { // clicking on Bad Debt write off button on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pBadDebtWriteoffbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pBadDebtWriteoffbtn).perform();
			pBadDebtWriteoffbtn.click();
			Reporter.log("Clicked on Bad debt write off");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnDebtSetOffSummary(WebDriver driver) { // clicking on Debt set off summary
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pDebtSetoffSummarybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pDebtSetoffSummarybtn).perform();
			pDebtSetoffSummarybtn.click();
			Reporter.log("Clicked on Debt sett off summary button");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

}
