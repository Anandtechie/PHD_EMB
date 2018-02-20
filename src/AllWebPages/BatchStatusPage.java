package AllWebPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import GenericMethods.Generic_Methods;

public class BatchStatusPage {

	@FindBy(linkText = "Batch Status")
	private WebElement pBatchStatustab; // Batch status tab on practice page

	@FindBy(xpath = "//div[text()='Batch Status']")
	private WebElement pBatchStatusPageText; // Batch status page text, after click on Batch status tab the text is
												// 'Batch Status'

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public BatchStatusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnBatchStatustab(WebDriver driver) { // Click on Batch Status Tab
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pBatchStatustab));
			pBatchStatustab.click();
			Reporter.log("Clicked on Batch Status Tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void VerifyBatchStatusPageDisplayed() { // Verfication code to check whether the batch status page is
													// displayed or not after click on Batch Status Tab
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 2, 2);
			Generic_Methods.verifyPageDisplayed(pBatchStatusPageText, eText,"BatchStatus");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

}
