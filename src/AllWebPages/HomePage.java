package AllWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import GenericMethods.Generic_Methods;

public class HomePage {
	@FindBy(linkText = "Home")
	private WebElement pHomeBtn;// practice home button element

	@FindBy(xpath = "//span[text()='Claim Status Summary']")
	private WebElement pDashlet1TitleClaimStatusSummary; // dashlet one tile claim status summary

	@FindBy(id = "dashlet1")
	private WebElement pFrameDashlet1; // on home page inside iframe dashlet one

	@FindBy(xpath = "//div[text()='Dashboard']")
	private WebElement pHomePageDashboardText; // text of the dashboard, after clicking on home button dashboard text
												// should appear

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnHometab(WebDriver driver) { // clicking on home button on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pHomeBtn));
			pHomeBtn.click();
			Reporter.log("Clicked on home button");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void switchToiframDashlet1(WebDriver driver) { // Switiching to Iframe on home page to dash let one
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pFrameDashlet1));
			driver.switchTo().frame(pFrameDashlet1);
			Reporter.log("Switching to frame dashlet one");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void switchToMainpage(WebDriver driver) { // switching to main page
		try {
			driver.switchTo().defaultContent();
			Reporter.log("Switching to Main page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void VerifyHomePageDisplayed() { // verification code to check whether the home page is displayed or not,
											// after click on Home button the dashboard text should appear
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 3, 2);
			Generic_Methods.verifyPageDisplayed(pHomePageDashboardText, eText,"HomePage");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void VerifyControlIsInsideDashLet1() { // verification code to check whether the control is inside Dashlet 1
													// or not ,after click on home button
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 4, 2);
			String aText = pFrameDashlet1.getAttribute("id");
			if (aText.equals(eText)) {
				Reporter.log("The Control is Inside DashLet one Screen");
			} else {
				Reporter.log("The Control is not inside DashLet one screen");
				Assert.fail();
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

}
