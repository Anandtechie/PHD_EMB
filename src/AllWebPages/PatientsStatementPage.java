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

public class PatientsStatementPage {

	@FindBy(linkText = "Patient Statements")
	private WebElement pPatientStatementTab; // patient statements tab

	@FindBy(xpath = "(//a[text()='Manage'])[2]")
	private WebElement pPatientStaementManagebtn; // under patient statement >> Manage

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public PatientsStatementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPatientStatementTab(WebDriver driver) { // click on patient statements tab on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientStatementTab));
			pPatientStatementTab.click();
			Reporter.log("Clicked on patient statements tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatientsStatementManage(WebDriver driver) { // click on manage under patient statements >> manage
																	// on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientStaementManagebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientStaementManagebtn).perform();
			pPatientStaementManagebtn.click();
			Reporter.log("Clicked on manage under patient statements >> Manage");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

}
