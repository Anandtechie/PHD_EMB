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

public class PostingPage {

	@FindBy(linkText = "Posting")
	private WebElement pPostingtab;// posting tab

	@FindBy(xpath = "(//a[text()='Manage'])[1]")
	private WebElement pManagebtn; // under posting >> Manage on practice account

	@FindBy(xpath = "//a[text()='Check/EFT']")
	private WebElement pCheckEftbtn; // under posting >> Check EFT

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public PostingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPostingTab(WebDriver driver) {// clicking on posting tab on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPostingtab));
			pPostingtab.click();
			Reporter.log("Clicked on posting tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnManage(WebDriver driver) {// clicking on manage under posting >> manage on practice account

		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pManagebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pManagebtn).perform();
			pManagebtn.click();
			Reporter.log("Clicked on Manage under Posting >> Manage on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnCheckEFTbtn(WebDriver driver) { // clicking on check EFT under posting >> checkEFT
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pCheckEftbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pCheckEftbtn).perform();
			pCheckEftbtn.click();
			Reporter.log("Clicked on Check EFT under posting >> check EFT on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

}
