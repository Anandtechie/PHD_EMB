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

public class SearchPage {
	@FindBy(linkText = "Search")
	private WebElement pSearchTab; // Search tab on practice page

	@FindBy(linkText = "Batches")
	private WebElement pBatchesbtn; // under Search >> batches on practice page

	@FindBy(linkText = "Claims")
	private WebElement pClaimsbtn; // under Search >> claims on practice page

	@FindBy(linkText = "Denials") // under search >> Denials on practice page
	private WebElement pDenialsbtn;

	@FindBy(linkText = "Rejections") // under search >> Rejections on practice page
	private WebElement pRejectionsbtn;

	@FindBy(linkText = "Errors") // under search >> Errors on practice page
	private WebElement pErrorsbtn;

	@FindBy(linkText = "Deleted Claims") // under search >> Deleted claims on practice page
	private WebElement pDeletedClaimsbtn;

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSearchTab(WebDriver driver) { // click on search tab on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pSearchTab));
			pSearchTab.click();
			Reporter.log("Clicked on Search tab on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
		}
	}

	public void clickOnBatches(WebDriver driver) { // click on batches under search >> batches on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pBatchesbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pBatchesbtn).perform();
			pBatchesbtn.click();
			Reporter.log("Clicked on Batches under Search >> Batches on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaims(WebDriver driver) { // click on claims under search >> claims on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pClaimsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pClaimsbtn).perform();
			pClaimsbtn.click();
			Reporter.log("Clicked on claims under Search >>  claims on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnDenials(WebDriver driver) { // click on Denials under search >> Denials on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pDenialsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pDenialsbtn).perform();
			pDenialsbtn.click();
			Reporter.log("Clicked on Denials under Search >> Denials on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnRejections(WebDriver driver) { // click on Rejections under search >> Rejections on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pRejectionsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pRejectionsbtn).perform();
			pRejectionsbtn.click();
			Reporter.log("Clicked on Rejections under search >> Rejections on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnErrors(WebDriver driver) { // click on Errors under Search >> Errors on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pErrorsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pErrorsbtn).perform();
			pErrorsbtn.click();
			Reporter.log("Clicked on Errors under search >> Errors on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnDeletedClaims(WebDriver driver) { // click on deleted claims under search >> deleted claims
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pDeletedClaimsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pDeletedClaimsbtn).perform();
			pDeletedClaimsbtn.click();
			Reporter.log("Clicked on Deleted claims under search >> Deleted claims on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

}
