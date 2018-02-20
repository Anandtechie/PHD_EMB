package AllWebPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import GenericMethods.Generic_Methods;

public class AppointmentsPage {
	@FindBy(linkText = "Appointments")
	private WebElement pAppointmentstab; // appointments tab on practice page

	@FindBy(id = "appointmentSchedulerHeading")
	private WebElement pAppointmentPageText; // Appointments page text, after click on appointments tab the text is
												// 'Patient Appointments'

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public AppointmentsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAppointments(WebDriver driver) { // clicking on Appointments tab
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAppointmentstab));
			pAppointmentstab.click();
			Reporter.log("Clicked on Appointments Tab button");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();

		}
	}

	public void VerifyAppointmentsPageDisplayed() { // verification code to check whether appointments page is displayed
													// or not after clicking on Appointment Tab
		try {
			String eText = Generic_Methods.Get_cell_value("VerifiactionTextForAllPages", 1, 2);
			Generic_Methods.verifyPageDisplayed(pAppointmentPageText, eText,"AppointmentsPage");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}
}
