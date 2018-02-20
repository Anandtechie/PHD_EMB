package AllTestScripts;

import org.testng.annotations.Test;

import AllWebPages.AppointmentsPage;
import AllWebPages.BatchStatusPage;
import AllWebPages.IndexPage;
import AllWebPages.InvoicePage;
import AllWebPages.NewClaimPage;
import AllWebPages.PatientsPage;
import AllWebPages.PatientsStatementPage;
import AllWebPages.PostingPage;
import AllWebPages.ReportsPage;
import AllWebPages.SearchPage;
import AllWebPages.SendBatchPage;
import GenericMethods.BaseTestClass;
import GenericMethods.Generic_Methods;

public class demo extends BaseTestClass {
	@Test
	public void testing() throws InterruptedException {

		IndexPage index = new IndexPage(driver);
		index.clickOnPracticeLoginbuttonIndexpage(driver);
		String userName = Generic_Methods.Get_cell_value("LoginDetails", 1, 1);// sending the login details from dataEmb
																				// excel sheet name= Logindetaisl
		String password = Generic_Methods.Get_cell_value("LoginDetails", 1, 2); // sending the login details from
																				// dataEmb excel sheet name=Logindetaisl
		index.setUserName(userName, driver);

		index.setPassword(password, driver);
		index.clickLoginOnPracticeaccount(driver); // click on login button

		index.verifyPracticeLoginPageIsDisplayed(driver); // verifying whether the error message is present in login
															// page or not
//		PatientsPage p = new PatientsPage(driver);
//		p.clickOnPatientsTab(driver);
//		p.clickOnViewbtn(driver);
//		p.clickOnPatientsTab(driver);
//		p.clickOnEligibilitybtn(driver);
//		p.clickOnBatches(driver);
//		p.clickOnPatientsTab(driver);
//		p.clickOnEligibilitybtn(driver);
//		p.clickOnInquries(driver);
//		p.clickOnPatientsTab(driver);
//		p.clickOnReferral(driver);
//		p.clickOnPatientsTab(driver);
//		p.clickOnHistory(driver);
//		p.clickOnImportExport(driver);
//		p.clickOnPatientsTab(driver);
//		p.clickOnDebtSetOff(driver);
//
//		p.clickOnPatientsTab(driver);
//		p.clickOnBadDebtWriteOff(driver);
//		p.clickOnPatientsTab(driver);
//		p.clickOnDebtSetOffSummary(driver);

//		AppointmentsPage a = new AppointmentsPage(driver);
//		a.clickOnAppointments(driver);
//		a.VerifyAppointmentsPageDisplayed();

//		SendBatchPage s = new SendBatchPage(driver);
//		s.clickOnSendBatchTab(driver);

		BatchStatusPage b = new BatchStatusPage(driver);
		b.clickOnBatchStatustab(driver);
		b.VerifyBatchStatusPageDisplayed();

//		SearchPage sp = new SearchPage(driver);
//		sp.clickOnSearchTab(driver);
//		sp.clickOnBatches(driver);
//		sp.clickOnSearchTab(driver);
//		sp.clickOnClaims(driver);
//		sp.clickOnSearchTab(driver);
//		sp.clickOnDeletedClaims(driver);
//		sp.clickOnSearchTab(driver);
//		sp.clickOnDenials(driver);
//		sp.clickOnSearchTab(driver);
//		sp.clickOnErrors(driver);
//		sp.clickOnSearchTab(driver);
//		sp.clickOnRejections(driver);
//
//		NewClaimPage n = new NewClaimPage(driver);
//		n.clickOnNewClaimTab(driver);
//		n.clickOnAddPrimaryProfessional(driver);
//		n.clickOnNewClaimTab(driver);
//
//		n.clickOnAddSecondaryProfessional(driver);
//		n.clickOnNewClaimTab(driver);
//
//		n.clickOnAddPrimaryInstitutional(driver);
//		n.clickOnNewClaimTab(driver);
//
//		n.clickOnAddSecondaryInstitutional(driver);
//
//		PostingPage pp = new PostingPage(driver);
//		pp.clickOnPostingTab(driver);
//
//		pp.clickOnManage(driver);
//		pp.clickOnPostingTab(driver);
//
//		pp.clickOnCheckEFTbtn(driver);
//
//		PatientsStatementPage psp = new PatientsStatementPage(driver);
//		psp.clickOnPatientStatementTab(driver);
//		psp.clickOnPatientsStatementManage(driver);
//
//		ReportsPage r = new ReportsPage(driver);
//		r.clickOnReportsTab(driver);
//
//		r.clickOnBatch(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimDetail(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimMaster(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimClosed(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimAnticipateRevenue(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimContracted(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimBilling(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimLateBiling(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnClaim(driver);
//
//		r.clickOnClaimExport(driver);
//		r.clickOnReportsTab(driver);
//
//		r.clickOnServiceLine(driver);
//		r.clickOnServiceLineDetails(driver);
//		r.clickOnReportsTab(driver);
//		r.clickOnServiceLine(driver);
//		r.clickOnServieLineDeniedService(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPatient(driver);
//		r.clickOnPatientCashPosting(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPatient(driver);
//		r.clickOnPatientCashPosting(driver);
//		r.clickOnPatientCashPostingDefault(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPatient(driver);
//		r.clickOnPatientCashPosting(driver);
//		r.clickOnPatientCashPostingByProgram(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPatient(driver);
//		r.clickOnPatientCashPosting(driver);
//		r.clickOnPatientCashPostingDeleted(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPatient(driver);
//		r.clickOnPatientCollectionReport(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPatient(driver);
//		r.clickOnPatientMedicadPatientVol(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAging(driver);
//		r.clickOnAgingInsuranceClaims(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAging(driver);
//		r.clickOnAgingSelfPayClaims(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAging(driver);
//		r.clickOnAgingByDOS(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAging(driver);
//		r.clickOnAgingAR(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAging(driver);
//		r.clickOnAgingLedgerBalance(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportMedicaidByRADate(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportByRADateandPayer(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportInvoice(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportRevenueSummary(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportPracticeAnalysis(driver);
//		r.clickOnPaymentAnalysisReportPracticeAnalysisByClaims(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportPracticeAnalysis(driver);
//		r.clickOnPaymentAnalysisReportPracticeAnalaysisByProcedure(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportPracticeAnalysis(driver);
//		r.clickOnPaymentAnalysisReportPracticeAnalaysisARSummary(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportInsuranceAnalysis(driver);
//		r.clickOnPaymentAnalysisReportInsuranceAnalysisByPayer(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportInsuranceAnalysis(driver);
//		r.clickOnPaymentAnalysisReportInsuranceAnalysisByProcedure(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnPaymentAnalysisReports(driver);
//		r.clickOnPaymentAnalysisReportInsuranceAnalysis(driver);
//		r.clickOnPaymentAnalysisReportInsuranceAnalysisTotals(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportActivitySummary(driver);
//		r.clickOnActivityReportsActivitySummaryByProvider(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportActivitySummary(driver);
//		r.clickOnActivityReportsActivitySummaryByInsurance(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportDailyActivity(driver);
//		r.clickOnActivityReportsDailyActivityByProcedure(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportDailyActivity(driver);
//		r.clickOnActivityReportDailyActivityByProcedureandProgram(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportDailyActivity(driver);
//		r.clickOnActivityReportDailyActivityCensus(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportDailyActivity(driver);
//		r.clickOnActivityReportDailyActivityProviderSchedule(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportPatientActivity(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportBillingActivity(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnActivityReports(driver);
//		r.clickOnActivityReportInsPaymentActivity(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnSFSProgram(driver);
//		r.clickOnSFSProgramProgramSummary(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnSFSProgram(driver);
//		r.clickOnSFSProgramSFSTotals(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAmbulance(driver);
//		r.clickOnAmbulanceAnticipateRevenueByPickupZip(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAmbulance(driver);
//		r.clickOnAmbulanceALSBLS(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnAmbulance(driver);
//		r.clickOnAmbulancePickUp(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnOthers(driver);
//		r.clickOnOthersMedicaidNonMedicaid(driver);
//
//		r.clickOnReportsTab(driver);
//		r.clickOnViewReports(driver);
//
//		 InvoicePage ip = new InvoicePage(driver);
//		 ip.clickOnInvoiceTab(driver);
//		
//		 ip.clickOnCreate(driver);
//		 ip.clickOnInvoiceTab(driver);
//		 ip.clickOnRateChart(driver);
//		 ip.clickOnInvoiceTab(driver);
//		 ip.clickOnSettings(driver);

		Thread.sleep(10000);

	}
}
