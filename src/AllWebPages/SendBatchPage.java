package AllWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import GenericMethods.Generic_Methods;

public class SendBatchPage {

	@FindBy(linkText = "Send Batch")
	private WebElement pSendBatchTab; // send batch tab on practice page

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public SendBatchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSendBatchTab(WebDriver driver) { // clicking on Send Batch tab
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pSendBatchTab));
			pSendBatchTab.click();
			Reporter.log("Clicked on send batch tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

}
