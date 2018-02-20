package AllTestScripts;

import org.testng.annotations.Test;

import AllWebPages.HomePage;
import AllWebPages.IndexPage;
import AllWebPages.MaintenancePage;
import GenericMethods.BaseTestClass;
import GenericMethods.Generic_Methods;

public class claimStatusSummaryDashlet extends BaseTestClass {
	@Test
	public void verifyClaimStatusSummaryDashlet() throws InterruptedException {

		IndexPage index = new IndexPage(driver);
		index.clickOnPracticeLoginbuttonIndexpage(driver);
		String userName = Generic_Methods.Get_cell_value("LoginDetails", 1, 1);// sending the login details from dataEmb
																				// excel sheet name= Logindetaisl
		String password = Generic_Methods.Get_cell_value("LoginDetails", 1, 2); // sending the login details from
																				// dataEmb excel sheet name=Logindetaisl
		index.setUserName(userName,driver);

		index.setPassword(password,driver);
		index.clickLoginOnPracticeaccount(driver); // click on login button

		index.verifyPracticeLoginPageIsDisplayed(driver); // verifying whether the error message is present in login
															// page or not

		MaintenancePage mp = new MaintenancePage(driver);
		mp.clickOnPracticeMaintenaceTab(driver); // clicking on Maintenance tab on practice page
		mp.clickOnPracticeDashBoardViewSetting(driver); // clicking on dashboard view setting on practice page
		mp.selectClaimStatusSummaryDashlet1OnPractice(driver); // selecting claim status summary dashlet
		mp.clickOnSavebuttonDashletScreen(driver); // clicking on save on dashlet screen

		HomePage h = new HomePage(driver);
		h.clickOnHometab(driver); // clicking on home page of practice screen
		h.switchToiframDashlet1(driver); //switching inside frame of dashlet one
		h.switchToMainpage(driver); //switching to main webpage

		Thread.sleep(10000);

	}

}
