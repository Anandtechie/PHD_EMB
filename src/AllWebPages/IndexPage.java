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

public class IndexPage {
	@FindBy(xpath = "//img[@alt='User']")
	private WebElement practiceLoginbutton; // practice login button on index page

	@FindBy(xpath = "//img[@alt='Admin']")
	private WebElement adminLoginbutton; // admin login button on index page

	@FindBy(xpath = "//img[@alt='Manager']")
	private WebElement managerLoginbutton; // manager login button on index page

	@FindBy(id = "username")
	private WebElement practiceUserNametextbox; // practice user name text box

	@FindBy(id = "password")
	private WebElement practicePasswordtextbox; // practice password text box

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement practiceLoginbtn; // practice page login button

	@FindBy(xpath = "//div[contains(text(),'invalid')]") // element to find whether error mgs is present is or not
	private WebElement errMgs;

	@FindBy(xpath = "//h3[text()='Practice Login']")
	private WebElement pPracticeHeaderText;

	@FindBy(xpath = "//h3[text()='Administrator Login']")
	private WebElement AdminPageHeaderText;
	SoftAssert sAssert = new SoftAssert();

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void clickOnPracticeLoginbuttonIndexpage(WebDriver driver) { // clicking on login for practice user
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(practiceLoginbutton));
			practiceLoginbutton.click();
			Reporter.log(" clicked on practice page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void verifyPracticeLoginPageDisplayed() { // Going to index page and click on practice button
														// to be verified whether the practice login
														// page is displayed
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 9, 2);
			Generic_Methods.verifyPageDisplayed(pPracticeHeaderText, eText, "Practice Login page header text");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnAdminLoginbuttonIndexpage(WebDriver driver) { // clicking on login for admin
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(adminLoginbutton));
			adminLoginbutton.click();
			Reporter.log("clicked on Admin page");
		} catch (Exception e) {

			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void verifyAdminLoginPageDisplayed() { // Verification of admin Login Page the text should be 'Administrator
													// Login'
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 10, 2);
			Generic_Methods.verifyPageDisplayed(AdminPageHeaderText, eText, "Admin Page Header");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void clickOnManagerLoginbuttonIndexpage(WebDriver driver) { // clicking on login for manager
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(managerLoginbutton));
			managerLoginbutton.click();
			Reporter.log("clicked on manager page");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void setUserName(String uname, WebDriver driver) { // sending user name for practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(practiceUserNametextbox));
			practiceUserNametextbox.sendKeys(uname);
			Reporter.log("Entered user name for practice account   " + uname);
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void setPassword(String pwd, WebDriver driver) { // sending password for practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(practicePasswordtextbox));
			practicePasswordtextbox.sendKeys(pwd);
			Reporter.log("Entered password for practice account  " + pwd);
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickLoginOnPracticeaccount(WebDriver driver) { // clicking on login button on practice page
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(practiceLoginbtn));
			practiceLoginbtn.click();
			Reporter.log("clicked on practice  page login button");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void verifyPracticeLoginPageIsDisplayed(WebDriver driver) { // verifying whether the error is present in
																		// practice login page or not
		WebDriverWait w = new WebDriverWait(driver, ETO);
		try {
			w.until(ExpectedConditions.visibilityOf(errMgs));
			Reporter.log("Login is not passed", true);
			Assert.fail();
		} catch (Exception e) {
			Reporter.log("Login is passed", true);
			Assert.fail();

		}
	}

}
