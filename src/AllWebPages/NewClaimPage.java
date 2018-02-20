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

public class NewClaimPage {

	@FindBy(linkText = "New Claim")
	private WebElement pNewClaimtab;// New claim tab on practice account

	@FindBy(xpath = "//a[text()='Add Primary Professional']")
	private WebElement pAddPrimaryProfessionalbtn;// under New claim >> add primary proffessional on practice account

	@FindBy(xpath = "//a[text()='Add Secondary Professional']")
	private WebElement pAddSecondaryProfessionalbtn; // under New claim >> Add Secondary professional on practice
														// account

	@FindBy(xpath = "//a[text()='Add Primary Institutional']")
	private WebElement pAddPrimaryInstitutionalbtn; // under New claim >> Add primary institutional on practice account

	@FindBy(xpath = "//a[text()='Add Secondary Institutional']")
	private WebElement pAddSecondaryInstitutionalbtn; // under New claim >> Add secondary institutional on practice
														// account

	public NewClaimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public void clickOnNewClaimTab(WebDriver driver) { //Clicked on New claim tab
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pNewClaimtab));
			pNewClaimtab.click();
			Reporter.log("Clicked on New claim tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAddPrimaryProfessional(WebDriver driver) { // clicking on add primary professional under New
																	// claim >> Add primary professional
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAddPrimaryProfessionalbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAddPrimaryProfessionalbtn).perform();
			pAddPrimaryProfessionalbtn.click();
			Reporter.log("Clicked on Add primary professional under New claim >> Add primary professional");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAddSecondaryProfessional(WebDriver driver) { // clicking on Add secondary professional under New
																	// claim >> Add secondary professional
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAddSecondaryProfessionalbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAddSecondaryProfessionalbtn).perform();
			pAddSecondaryProfessionalbtn.click();
			Reporter.log("Clicked on Add Secondary professional under New claim >> Add secondary professional");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAddPrimaryInstitutional(WebDriver driver) { // clicking on Add primary institutional under New
																	// claim >> Add primary Institutional claim
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAddPrimaryInstitutionalbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAddPrimaryInstitutionalbtn).perform();
			pAddPrimaryInstitutionalbtn.click();
			Reporter.log("Clicked on Add primary Institutional under New claim >> Add primary Institutional");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAddSecondaryInstitutional(WebDriver driver) { // clicking on Add secondary institutional under
																		// New claim >> Add secondary institutional
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAddSecondaryInstitutionalbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAddSecondaryInstitutionalbtn).perform();
			pAddSecondaryInstitutionalbtn.click();
			Reporter.log("Clicked on Add Secondary Institutional under New claim >> Add secondary Institutional");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

}
