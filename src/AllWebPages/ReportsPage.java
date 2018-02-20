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

public class ReportsPage {

	@FindBy(linkText = "Reports")
	private WebElement pReportsTab;// Reports tab on practice account

	@FindBy(xpath = "//a[text()='Batch']")
	private WebElement pBatchbtn; // batch button under Reports >> batch on practice account

	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement pClaimbtn; // claim button under Reports >> claim on practice account

	@FindBy(xpath = "//span[text()='Service Line']")
	private WebElement pServieLinebtn; // Service Line button under Reports >> Service Line on practice account

	@FindBy(xpath = "//span[text()='Patient']")
	private WebElement pPatientbtn; // patient button under Reports >> patient on practice account

	@FindBy(xpath = "//span[text()='Aging']")
	private WebElement pAgingbtn; // Aging button under Reports >> Aging on practice account

	@FindBy(xpath = "//span[text()='Payment Analysis Reports']")
	private WebElement pPaymentAnalysisReportsBtn; // Payment Analysis Reports button under Reports >> Payment Analysis
													// reports on practice account

	@FindBy(xpath = "//span[text()='Activity Report']")
	private WebElement pActivityReportBtn; // Activity report button under reports >> activity report on practice
											// account

	@FindBy(xpath = "//span[text()='SFS Program']")
	private WebElement pSFSprogramBtn; // SFS program button under Reports >> SFS Program appears only for PHD account

	@FindBy(xpath = "(//span[text()='Ambulance'])[1]")
	private WebElement pAmbulanceBtn;// Ambulance button under Reports >> Ambulance on practice account

	@FindBy(xpath = "//span[text()='Others']")
	private WebElement pOtherbtn; // others button under Reports >> others on practice account

	@FindBy(xpath = "//a[text()='View Reports']")
	private WebElement pViewReportsbtn; // View Reports button under Reports >> View Reports on practice account

	@FindBy(xpath = "//a[text()='Detail']")
	private WebElement pClaimDetailbtn; // details button under Reports >> claim >> detail on practice account

	@FindBy(xpath = "//a[text()='Master']")
	private WebElement pClaimMasterbtn;// Master button under Reports >> claim >> Master on practice account

	@FindBy(xpath = "//a[text()='Closed']")
	private WebElement pClaimClosedbtn; // Closed button under Reports >> claim >> Closed on practice account

	@FindBy(xpath = "//a[text()='Anticipated Revenue']")
	private WebElement pAnticipateRevenuebtn; // Anticipate Revenue button Reports >> Claim >> Anticipate Revenue

	@FindBy(xpath = "//a[text()='Contracted']")
	private WebElement pContractedbtn; // COntracted button Reports >> Claim >> Contracted

	@FindBy(xpath = "//a[text()='Billing']")
	private WebElement pBillingbtn; // Billing button Reports >> Claim >> Billing

	@FindBy(xpath = "//a[text()='Late Filing']")
	private WebElement pLateFilingbtn; // Late Filling button Reports >> Claim >> Late Filing

	@FindBy(xpath = "//a[text()='Claim Export']")
	private WebElement pClaimExportbtn; // Claim Export button Reports >> Claim >> Claim Export

	@FindBy(xpath = "//a[text()='Details']")
	private WebElement pServiceLineDetailsbtn; // Details button Reports >> Service Line >> Details

	@FindBy(xpath = "//a[text()='Denied Services']")
	private WebElement pSeriveLineDeniedServicesbtn;// Denied Servie button Reports >> Service Line >> Denied Service

	@FindBy(xpath = "//span[text()='Cash Posting']")
	private WebElement pPatientCashPostingbtn;// Cash posting button Reports >> Patient >> cash Posting

	@FindBy(xpath = "//a[text()='Collection Report']")
	private WebElement pPatientCollectionReportbtn; // Collection Report button Reports >> Patient >> Collection Report

	@FindBy(xpath = "//a[text()='Medicaid Patient Vol']")
	private WebElement pPatientMedicadPatientVolbtn;// Medicad Patient vol button Reports >> Patient >> Medicad Patient
													// Vol

	@FindBy(xpath = "//a[text()='Default']")
	private WebElement pPatientCashPostingDefaultbtn;// Default button Reports >> Patient >> Cash Posting >> Default

	@FindBy(xpath = "//a[text()='By Program']")
	private WebElement pPatientCashPostingByProgrambtn; // By program button Reports >> Patient >> Cash Posting >> By
														// Program

	@FindBy(xpath = "//a[text()='Deleted']")
	private WebElement pPatientCashPostingDeletedbtn;// Deleted button Reports >> Patient >> Cash Posting >> Deleted

	@FindBy(xpath = "//a[text()='Insurance Claims']")
	private WebElement pAgingInsuranceClaimbtn;// Insurance Claim button Reports >> Aging >> Insurance claim

	@FindBy(xpath = "//a[text()='Self Pay Claims']")
	private WebElement pAgingSelfPayClaimsbtn;// Self Pay Claims button Reports >> Aging >> Self pay Claim

	@FindBy(xpath = "//a[text()='By DOS']")
	private WebElement pAgingByDOSbtn; // By DOS button Reports >> Aging >> By DOS

	@FindBy(xpath = "//a[text()='A/R']")
	private WebElement pAgingARbtn;// A/R button Reports >> Aging >> A/R

	@FindBy(xpath = "//a[text()='Ledger Balance']")
	private WebElement pAgingLedgerBalancebtn; // Ledger Balance button Reports >> Aging >> LedgerBalance

	@FindBy(xpath = "//a[text()='Medicaid By RA Date']")
	private WebElement pPaymentAnalysisReportsMedicaidByRADatebtn;// Medicaid By RA date button Reports >> Payment
																	// Analysis Reports >> Medicaid By RA Date

	@FindBy(xpath = "//a[text()='By RA Date and Payer']")
	private WebElement pPaymentAnalysisReportsByRADateandPayerbtn;// By RA date and payer button Reports >> Payment
																	// Analysis Reports >> By RA Date and payer

	@FindBy(xpath = "(//a[text()='Invoice'])[1]")
	private WebElement pPaymentAnalysisReportsInvoicebtn;// Invoice button Reports >> Payment Analysis Reports >>
															// Invoice

	@FindBy(xpath = "//a[text()='Revenue Summary']")
	private WebElement pPaymentAnalysisReportsRevenueSummarybtn; // Revenue Summary button Reports >> Payment Analysis
																	// Reports >> Revenue Summary

	@FindBy(xpath = "//span[text()='Practice Analysis']")
	private WebElement pPaymentAnalysisReportsPracticeAnalysisbtn; // Practice Analysis button Reports >> Payment
																	// Analysis Reports >> Practice Analysis

	@FindBy(xpath = "//span[text()='Insurance Analysis']")
	private WebElement pPaymentAnalysisReportsInsuranceAnalysisbtn; // Insurance Analysis button Reports >> Payment
																	// Analysis Reports >> Insurance Analysis

	@FindBy(xpath = "//a[text()='By Claims']")
	private WebElement pPaymentAnalysisReportsPracticeAnalysisByClaimsbtn; // By claims button Reports >> Payment
																			// Analysis Reports >> Practice Analysis >>
																			// By Claims

	@FindBy(xpath = "(//a[text()='By Procedure'])[1]")
	private WebElement pPaymentAnalysisReportsPracticeAnalysisByProcedurebtn; // By procedure button Reports >> Payment
																				// Analysis Reports >> Practice
																				// Analysis >> By procedure

	@FindBy(xpath = "//a[text()='A/R Summary']")
	private WebElement pPaymentAnalysisReportsPracticeAnalysisARSummarybtn; // By A/R Summary Reports >> payment
																			// Analysis Reports >> practice Analysis >>
																			// By A/R Summary

	@FindBy(xpath = "//a[text()='By Payer']")
	private WebElement pPaymentAnalysisReportsInsuranceAnalysisByPayerbtn; // By Payer button Reports >> Payment
																			// Analysis Reports >> Insurance Analysis >>
																			// By Payer

	@FindBy(xpath = "//a[text()='Totals']")
	private WebElement pPaymentAnalysisReportsInsuranceAnalysisTotalsbtn;// Totals button Reports >> Payment Analysis
																			// Reports >> Insurance Analysis >> Total
																			// button

	@FindBy(xpath = "(//a[text()='By Procedure'])[2]")
	private WebElement pPaymentAnalysisReportsInsuranceAnalysisByProcedurebtn; // By Procedure button Reports >> Payment
																				// Analysis Reports >> Insurance
																				// Analysis >> By Procedure button

	@FindBy(xpath = "//span[text()='Activity Summary']")
	private WebElement pActivityReportsActivitySummarybtn; // Activity Summary Reports >> Activity Reports >> Activity
															// Summary button

	@FindBy(xpath = "//span[text()='Daily Activity']")
	private WebElement pActivityReportsDailyActivitybtn; // Daily Activity button Reports >> Activity Reports >> Daily
															// Activity

	@FindBy(xpath = "//a[text()='Patient Activity']")
	private WebElement pActivityReportsPatientActivitybtn; // Patient Activity button Reports >> Activity Reports >>
															// Patient Activity

	@FindBy(xpath = "//a[text()='Billing Activity']")
	private WebElement pActivityReportsBillingActivitybtn; // Billing Activity button Reports >> Activity Reports >>
															// Billing Activity

	@FindBy(xpath = "//a[text()='Ins Payment Activity']")
	private WebElement pActivityReportsInsPaymentActivitybtn; // Ins Payment Activity button Reports >> Activity Reports
																// >> Ins Payment Activity

	@FindBy(xpath = "//a[text()='By Provider']")
	private WebElement pActivityReportsActivitySummaryByProviderbtn; // By Provider Reports >> Activity Reports >>
																		// Activity Summary >> By Provider

	@FindBy(xpath = "//a[text()='By Insurance']")
	private WebElement pActivityReportsActivitySummaryByInsurancebtn; // By Insurance Reports >> Activity Reports >>
																		// Activity Summary >> By Insurance

	@FindBy(xpath = "(//a[text()='By Procedure'])[3]")
	private WebElement pActivityReportsDailyActivityByProcedurebtn; // By Procedure Reports >> Activity Reports >> Daily
																	// Activity >> By Procedure

	@FindBy(xpath = "//a[text()='By Procedure and Program']")
	private WebElement pActivityReportsDailyActivityByProcedureandProgrambtn; // By Procedure and Program Reports >>
																				// Activity Reports >> Daily Activity >>
																				// By procedure and program

	@FindBy(xpath = "//a[text()='Census']")
	private WebElement pActivityReportsDailyActivityCensusbtn;// Census Reports >> Activity Reports >> Daily Activity >>
																// Census

	@FindBy(xpath = "//a[text()='Provider Schedule']")
	private WebElement pActivityReportsDailyActivityProviderSchedulebtn; // Provider Schedule Reports >> Activity
																			// Reports >> Daily Activity >> Provider
																			// Schedule

	@FindBy(xpath = "//a[text()='Program Summary']")
	private WebElement pSFSProgramProgramSummarybtn; // Program summary Reports >> SFS Program >> Program Summary

	@FindBy(xpath = "//a[text()='SFS Totals']")
	private WebElement pSFSProgramSFSTotalsbtn; // SFS Totals under Reports >> SFS Program >> SFS Totals

	@FindBy(xpath = "//a[text()='Anticipated Revenue By Pickup Zip']")
	private WebElement pAmbulanceAnticipatedRevenueByPickupZipbtn; // Anticipated Revenue By Pickup Zip Reports >>
																	// Ambulance >> Anticiapted Revenue By Pickup Zip

	@FindBy(xpath = "//a[text()='ALS/BLS']")
	private WebElement pAmbulanceALSBLSbtn; // ALS/BLS Reports >> Ambulance >> ALS/BLS

	@FindBy(xpath = "//a[text()='Pickup']")
	private WebElement pAmbulancePickupbtn; // Pick Up Under Reports >> Ambulance >> Pickup

	@FindBy(xpath = "//a[text()='Medicaid/Non Medicaid']")
	private WebElement pOthersMedicaidNonMedicaidbtn;// Medicaid /Non Medicaid Reports >> others >> Medicaid/NonMedicaid

	String sETO = Generic_Methods.Get_Property("ETO");
	long ETO = Long.parseLong(sETO);

	SoftAssert sAssert = new SoftAssert();

	public ReportsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnReportsTab(WebDriver driver) { // click on Reports tab on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pReportsTab));
			pReportsTab.click();
			Reporter.log("Clicked on Reports Tab");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnBatch(WebDriver driver) { // click on Batch under Reports >> batch on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pBatchbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pBatchbtn).perform();
			pBatchbtn.click();
			Reporter.log("Clicked on Batch under Reports >> Batch on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnClaim(WebDriver driver) { // click on cliam under Reports >> claim on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pClaimbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pClaimbtn).perform();
			pClaimbtn.click();
			Reporter.log("Clicked on claim button under Reports >>  claim on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnServiceLine(WebDriver driver) { // click on Service Line under Reports >> Service Line on
														// practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pServieLinebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pServieLinebtn).perform();
			pServieLinebtn.click();
			Reporter.log("Clicked on Service Line button under Reports >> Service Line on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatient(WebDriver driver) { // click on patient under Reports >> Patient on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientbtn).perform();
			pPatientbtn.click();
			Reporter.log("Clicked on Patient button under Reports >> Patient on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAging(WebDriver driver) { // click on Aging under Reports >> Aging on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAgingbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAgingbtn).perform();
			pAgingbtn.click();
			Reporter.log("Clicked on Aging button under Reports >> Aging on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnPaymentAnalysisReports(WebDriver driver) { // click on Payment Analysis Reports under Reports >>
																	// Payment Analysis Reports on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsBtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsBtn).perform();
			pPaymentAnalysisReportsBtn.click();
			Reporter.log(
					"Clicked on payement Analysis Report button under Reports >> Payment Analysis report on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReports(WebDriver driver) { // click on Activity Reports under Reports >> Activity
															// Reports on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportBtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportBtn).perform();
			pActivityReportBtn.click();
			Reporter.log("Clicked on Activity Reports under Reports >> Activity Reports on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnSFSProgram(WebDriver driver) { // click on SFS program button under Reports >> SFS program on
														// practice account only PHD account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pSFSprogramBtn));
			Actions act = new Actions(driver);
			act.moveToElement(pSFSprogramBtn).perform();
			pSFSprogramBtn.click();
			Reporter.log("Clicked on SFS program button under Reports >> SFS program on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAmbulance(WebDriver driver) { // click on Ambulance button under Reports >> Ambulance on practice
														// account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAmbulanceBtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAmbulanceBtn).perform();
			pAmbulanceBtn.click();
			Reporter.log("Clicked on Ambulance button under Reports >> Ambulance on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnOthers(WebDriver driver) { // click on other button under Reports >> others on practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pOtherbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pOtherbtn).perform();
			pOtherbtn.click();
			Reporter.log("Clicked on Others under Reports >> others on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnViewReports(WebDriver driver) { // click on view Reports under Reports >> View Reports on
														// practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pViewReportsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pViewReportsbtn).perform();
			pViewReportsbtn.click();
			Reporter.log("Clicked on View Reports under Reports >> View Reports on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimDetail(WebDriver driver) { // click on detail under Reports >> claim >> detail on practice
														// account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pClaimDetailbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pClaimDetailbtn).perform();
			pClaimDetailbtn.click();
			Reporter.log("Clicked on Detail button under Reports >> Claim >> Detail on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimMaster(WebDriver driver) { // click on master button under Reports >> claim >> Master on
														// practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pClaimMasterbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pClaimMasterbtn).perform();
			pClaimMasterbtn.click();
			Reporter.log("Clicked on Master button under Reports >> Claim >> Master on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimClosed(WebDriver driver) { // click on closed button under Reports >> Claim >> Closed on
														// practice account
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pClaimClosedbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pClaimClosedbtn).perform();
			pClaimClosedbtn.click();
			Reporter.log("Clicked on Closed button under Reports >> Claim >> Closed on practice account");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimAnticipateRevenue(WebDriver driver) { // Click on Antipate Revenue button under Reports >>
																	// Claim >> Anticipate Revenue
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAnticipateRevenuebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAnticipateRevenuebtn).perform();
			pAnticipateRevenuebtn.click();
			Reporter.log("Clicked on Antipate Revenue button under Reports >> Claim >> Anticipate Revenue");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimContracted(WebDriver driver) { // Click on Contracted button under Reports >> Claim >>
															// Contracted
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pContractedbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pContractedbtn).perform();
			pContractedbtn.click();
			Reporter.log("Clicked on Contracted button under Reports >> Claim >> Contracted");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimBilling(WebDriver driver) { // Click on Billing button under Reports >> Claim >> Billing
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pBillingbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pBillingbtn).perform();
			pBillingbtn.click();
			Reporter.log("Clicked on Billing button under Reports >> Claim >> Billing");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimLateBiling(WebDriver driver) { // Click on Late Biling under Reports >> Claim >> Late Filing
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pLateFilingbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pLateFilingbtn).perform();
			pLateFilingbtn.click();
			Reporter.log("Clicked on Late Biling under Reports >> Claim >> Late Filing");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnClaimExport(WebDriver driver) { // Click on Claim Export under Reports >> Claim >> Claim Export
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pClaimExportbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pClaimExportbtn).perform();
			pClaimExportbtn.click();
			Reporter.log("Clicked on Claim Export under Reports >> Claim >> Claim Export");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnServiceLineDetails(WebDriver driver) { // Click on Details under Reports >> Service Line >>
																// Details
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pServiceLineDetailsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pServiceLineDetailsbtn).perform();
			pServiceLineDetailsbtn.click();
			Reporter.log("Clicked on Details under Reports >> Service Line >> Details");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnServieLineDeniedService(WebDriver driver) { // Click on Denied Service button under Reports >>
																	// Servie Line >> Denied Service
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pSeriveLineDeniedServicesbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pSeriveLineDeniedServicesbtn).perform();
			pSeriveLineDeniedServicesbtn.click();
			Reporter.log("Clicked on Denied Service button under Reports >> Servie Line >> Denied Service");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatientCashPosting(WebDriver driver) { // Click on cash posting button under Reports >> Patient
																// >> cash posting
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientCashPostingbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientCashPostingbtn).perform();
			Reporter.log("Clicked on cash posting button under Reports >> Patient >> cash posting");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatientCollectionReport(WebDriver driver) { // Click on Collection Report button under Reports >>
																	// Patient >> Collection Report
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientCollectionReportbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientCollectionReportbtn).perform();
			Reporter.log("Clicked on Collection Report button under Reports >> Patient >> Collection Report");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatientMedicadPatientVol(WebDriver driver) { // Click on Medicad Patient vol button under Reports
																	// >> Patient >> Medicad patient Vol
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientMedicadPatientVolbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientMedicadPatientVolbtn).perform();
			Reporter.log("Clicked on Medicad Patient vol button under Reports >> Patient >> Medicad patient Vol");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatientCashPostingDefault(WebDriver driver) { // Click on Default button under Reports >> Patient
																		// >> cash Posting >> Default
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientCashPostingDefaultbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientCashPostingDefaultbtn).perform();
			pPatientCashPostingDefaultbtn.click();
			Reporter.log("Clicked on Default button under Reports >> Patient >> cash Posting >> Default");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatientCashPostingByProgram(WebDriver driver) { // Click on By Program button under Reports >>
																		// Patient >> cash Posting >> By Program
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientCashPostingByProgrambtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientCashPostingByProgrambtn).perform();
			pPatientCashPostingByProgrambtn.click();
			Reporter.log("Clicked on By Program button under Reports >> Patient >> cash Posting >> By Program");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPatientCashPostingDeleted(WebDriver driver) { // Click on Deleted button under Reports >> Patient
																		// >> Cash Posting >> Deleted
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPatientCashPostingDeletedbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPatientCashPostingDeletedbtn).perform();
			pPatientCashPostingDeletedbtn.click();
			Reporter.log("Clicked on Deleted button under Reports >> Patient >> Cash Posting >> Deleted");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAgingInsuranceClaims(WebDriver driver) { // Click on Insurance Claim Button under Reports >>
																// Aging >> Insurance Claim
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAgingInsuranceClaimbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAgingInsuranceClaimbtn).perform();
			pAgingInsuranceClaimbtn.click();
			Reporter.log("Clicked on Insurance Claim Button under Reports >> Aging >> Insurance Claim");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAgingSelfPayClaims(WebDriver driver) { // Click on Self Pay claim button under Reports >> Aging
																// >> Self Pay Claim
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAgingSelfPayClaimsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAgingSelfPayClaimsbtn).perform();
			pAgingSelfPayClaimsbtn.click();
			Reporter.log("Clicked on Self Pay claim button under Reports  >> Aging >> Self Pay Claim");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAgingByDOS(WebDriver driver) { // Click On By DOS button under Reports >> Aging >> By DOS
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAgingByDOSbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAgingByDOSbtn).perform();
			pAgingByDOSbtn.click();
			Reporter.log("Clicked On By DOS button under Reports >> Aging >> By DOS");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAgingAR(WebDriver driver) { // Click on A/R button under Reports >> Aging >> A/R
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAgingARbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAgingARbtn).perform();
			pAgingARbtn.click();
			Reporter.log("Clicked on A/R button under Reports >> Aging >> A/R");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAgingLedgerBalance(WebDriver driver) { // Click on Ledger Balance button under Reports >> Aging
																// >> Ledger Balance
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAgingLedgerBalancebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAgingLedgerBalancebtn).perform();
			Reporter.log("Clicked on Ledger Balance button under Reports >> Aging >> Ledger Balance");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportMedicaidByRADate(WebDriver driver) { // Click on Medicaid By RA Date button
																					// under Reports >> Payment Analysis
																					// Report >> Medicaid By RA date
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsMedicaidByRADatebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsMedicaidByRADatebtn).perform();
			pPaymentAnalysisReportsMedicaidByRADatebtn.click();
			Reporter.log(
					"Clicked on Medicaid By RA Date button under Reports >> Payment Analysis Report >> Medicaid By RA date");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportByRADateandPayer(WebDriver driver) { // Click on By RA Date and Payer button
																					// under Reports >> Payment Analysis
																					// Report >> By RA Date and Payer
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsByRADateandPayerbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsByRADateandPayerbtn).perform();
			pPaymentAnalysisReportsByRADateandPayerbtn.click();
			Reporter.log(
					"Clicked on By RA Date and Payer button under Reports >> Payment Analysis Report >> By RA Date and Payer");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportInvoice(WebDriver driver) { // Click on Invoice button under Reports >>
																		// Payment Analysis Report >> Invoice
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsInvoicebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsInvoicebtn).perform();
			pPaymentAnalysisReportsInvoicebtn.click();
			Reporter.log("Clicked on Invoice button under Reports >> Payment Analysis Report >> Invoice");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportRevenueSummary(WebDriver driver) { // Click on Revenue Summary button under
																				// Reports >> Payment Analysis Report >>
																				// Revenue Summary
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsRevenueSummarybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsRevenueSummarybtn).click();
			pPaymentAnalysisReportsRevenueSummarybtn.click();
			Reporter.log(
					"Clicked on Revenue Summary button under Reports >> Payment Analysis Report >> Revenue Summary");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();

		}
	}

	public void clickOnPaymentAnalysisReportPracticeAnalysis(WebDriver driver) { // CLick on Practice Analysis button
																					// under Reports >> Payment Analysis
																					// Reports >> Pratice Analysis
																					// button
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsPracticeAnalysisbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsPracticeAnalysisbtn).perform();
			Reporter.log(
					"CLicked on Practice Analysis button under Reports >> Payment Analysis Reports >> Pratice Analysis button");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportInsuranceAnalysis(WebDriver driver) { // Click on Insurance Analysis button
																					// under Reports >> Payment Analysis
																					// Reports >> Insurance Analysis
																					// button
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsInsuranceAnalysisbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsInsuranceAnalysisbtn).perform();
			Reporter.log(
					"Clicked on Insurance Analysis button under Reports >> Payment Analysis Reports >> Insurance Analysis button");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportPracticeAnalysisByClaims(WebDriver driver) { // Click on By claims button
																							// under Reports >> Payment
																							// Analysis Reports >>
																							// Practice Analysis >> By
																							// claims
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsPracticeAnalysisByClaimsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsPracticeAnalysisByClaimsbtn).perform();
			Reporter.log(
					"Clicked on By claims button under Reports >> Payment Analysis Reports >> Practice Analysis >> By claims");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportPracticeAnalaysisByProcedure(WebDriver driver) { // click on By procedure
																								// button under Reports
																								// >> Payment Analysis
																								// Reports >> Practice
																								// Analysis >> By
																								// Procedure
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsPracticeAnalysisByProcedurebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsPracticeAnalysisByProcedurebtn).perform();
			pPaymentAnalysisReportsPracticeAnalysisByProcedurebtn.click();
			Reporter.log(
					"CLicked on By procedure button under Reports >> Payment Analysis Reports >> Practice Analysis >> By procedure");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnPaymentAnalysisReportPracticeAnalaysisARSummary(WebDriver driver) { // click on A/R Summary
																							// button under Reports >>
																							// Payment Analysis Reports
																							// >> Practice Analysis >>
																							// A/R Summary button
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsPracticeAnalysisARSummarybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsPracticeAnalysisARSummarybtn).perform();
			pPaymentAnalysisReportsPracticeAnalysisARSummarybtn.click();
			Reporter.log(
					"Clicked on A/R Summary button under Reports >> Payment Analysis Reports >> Practice Analysis >> A/R Summary");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnPaymentAnalysisReportInsuranceAnalysisByPayer(WebDriver driver) { // click on By payer button
																							// under Reports >> Payment
																							// Analysis Reports >>
																							// Insurance Analysis >> By
																							// payer

		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsInsuranceAnalysisByPayerbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsInsuranceAnalysisByPayerbtn).perform();
			pPaymentAnalysisReportsInsuranceAnalysisByPayerbtn.click();
			Reporter.log(
					"Clicked on By Payer button under Reports >> Payment Analysis Reports >> Insurance Analysis >> By Payer");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnPaymentAnalysisReportInsuranceAnalysisTotals(WebDriver driver) { // click on Totals button under
																						// Reports >> Payment Analysis
																						// Reports >> Insurance Analysis
																						// >> Totals

		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsInsuranceAnalysisTotalsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsInsuranceAnalysisTotalsbtn).perform();
			pPaymentAnalysisReportsInsuranceAnalysisTotalsbtn.click();
			Reporter.log(
					"Clicked on Totals button under Reports >> Payment Analysis Reports >> Insurance Analysis >> Totals");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnPaymentAnalysisReportInsuranceAnalysisByProcedure(WebDriver driver) { // Click on By procedure
																								// under Reports >>
																								// Payment Analysis
																								// Reports >> Insurance
																								// Analysis >> By
																								// Procedure
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pPaymentAnalysisReportsInsuranceAnalysisByProcedurebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pPaymentAnalysisReportsInsuranceAnalysisByProcedurebtn).perform();
			pPaymentAnalysisReportsInsuranceAnalysisByProcedurebtn.click();
			Reporter.log(
					"Clicked on By procedure under Reports >> Payment Analysis Reports >> Insurance Analysis >> By Procedure");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportActivitySummary(WebDriver driver) { // click on Activity Summary button under
																			// Reports >> Activity Reports >> Activity
																			// Summary
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsActivitySummarybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsActivitySummarybtn).perform();
			pActivityReportsActivitySummarybtn.click();
			Reporter.log("Clicked On Activity Summary button under Reports  >> Activity Reports >> Activity Summary");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnActivityReportDailyActivity(WebDriver driver) { // Click on Daily Activity button under Reports
																		// >> Activity Reports >> Daily Activity
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsDailyActivitybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsDailyActivitybtn);
			pActivityReportsDailyActivitybtn.click();
			Reporter.log("Clicked on Daily Activity button under Reports >> Activity Reports >> Daily Activity");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportPatientActivity(WebDriver driver) { // Click On Patient Activity button under
																			// Reports >> Activity Reports >> Patient
																			// Activity
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsPatientActivitybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsPatientActivitybtn).perform();
			pActivityReportsPatientActivitybtn.click();
			Reporter.log("Clicked On Patient Activity button under Reports >> Activity Reports >> Patient Activity");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}

	}

	public void clickOnActivityReportBillingActivity(WebDriver driver) { // Click on Billing Activity button under
																			// Reports >> Activity Reports >> Billing
																			// Activity
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsBillingActivitybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsBillingActivitybtn).perform();
			pActivityReportsBillingActivitybtn.click();
			Reporter.log("Clicked on Billing Activity button under Reports  >> Activity Reports >> Billing Activity");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportInsPaymentActivity(WebDriver driver) { // Click On Ins Payment Activity button
																			// under Reports >> Activity Reports >> Ins
																			// Payment Activity
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsInsPaymentActivitybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsInsPaymentActivitybtn).perform();
			pActivityReportsInsPaymentActivitybtn.click();
			Reporter.log(
					"Clicked On Ins Payment Activity button under Reports >> Activity Reports >> Ins Payment Activity");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportsActivitySummaryByProvider(WebDriver driver) { // Click on By Provider button under
																					// Reports >> Activity Reports >>
																					// Activity Summary >> By Provider
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsActivitySummaryByProviderbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsActivitySummaryByProviderbtn).perform();
			pActivityReportsActivitySummaryByProviderbtn.click();
			Reporter.log(
					"Clicked on By Provider button under Reports >> Activity Reports >> Activity Summary >> By Provider");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportsActivitySummaryByInsurance(WebDriver driver) {
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsActivitySummaryByInsurancebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsActivitySummaryByInsurancebtn).perform();
			pActivityReportsActivitySummaryByInsurancebtn.click();
			Reporter.log(
					"Clicked on By Insurance button under Reports >> Activity Reports >> Activity Summary >> By Insurance");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportsDailyActivityByProcedure(WebDriver driver) { // Click on By Procedure button under
																					// Reports >> Activity Reports >>
																					// Daily Activity >> By Procedure
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsDailyActivityByProcedurebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsDailyActivityByProcedurebtn).perform();
			pActivityReportsDailyActivityByProcedurebtn.click();
			Reporter.log(
					"Clicked on By Procedure button under Reports >> Activity Reports >> Daily Activity >> By Procedure");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportDailyActivityByProcedureandProgram(WebDriver driver) { // Click On By Procedure and
																							// Program button under
																							// Reports >> Activity
																							// Reports >> Daily Activity
																							// >> By Procedure and
																							// Program
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsDailyActivityByProcedureandProgrambtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsDailyActivityByProcedureandProgrambtn).perform();
			pActivityReportsDailyActivityByProcedureandProgrambtn.click();
			Reporter.log(
					"Clicked On By Procedure and Program button under Reports >> Activity Reports >> Daily Activity >> By Procedure and Program");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportDailyActivityCensus(WebDriver driver) { // Click On Census button under Reports >>
																				// Activity Reports >> Daily Activity >>
																				// Census
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsDailyActivityCensusbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsDailyActivityCensusbtn).perform();
			pActivityReportsDailyActivityCensusbtn.click();
			Reporter.log("Clicked On Census button under Reports >> Activity Reports >> Daily Activity >> Census");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnActivityReportDailyActivityProviderSchedule(WebDriver driver) { // Click On Provider Schedule
																						// under Reports >> Activity
																						// Reports >> Daily Activity >>
																						// Provider Schedule
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pActivityReportsDailyActivityProviderSchedulebtn));
			Actions act = new Actions(driver);
			act.moveToElement(pActivityReportsDailyActivityProviderSchedulebtn).perform();
			pActivityReportsDailyActivityProviderSchedulebtn.click();
			Reporter.log(
					"Clicked On Provider Schedule under Reports >> Activity Reports >> Daily Activity >> Provider Schedule");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnSFSProgramProgramSummary(WebDriver driver) { // Click on Program Summary button under Reports >>
																	// SFS program >> Program Summary
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pSFSProgramProgramSummarybtn));
			Actions act = new Actions(driver);
			act.moveToElement(pSFSProgramProgramSummarybtn).perform();
			pSFSProgramProgramSummarybtn.click();
			Reporter.log("Clicked on Program Summary button under Reports >> SFS program >> Program Summary");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnSFSProgramSFSTotals(WebDriver driver) { // Click On SFS Totals button under Reports >> SFS
																// Program >> SFS Totals
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pSFSProgramSFSTotalsbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pSFSProgramSFSTotalsbtn).perform();
			pSFSProgramSFSTotalsbtn.click();
			Reporter.log("Clicked On SFS Totals button under Reports >> SFS Program >> SFS Totals");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAmbulanceAnticipateRevenueByPickupZip(WebDriver driver) { // Click On Anticipated Revenue By pick
																					// Up Zip button under Reports >>
																					// Ambulance >> Anticipated Revenue
																					// By Pick Up Zip
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAmbulanceAnticipatedRevenueByPickupZipbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAmbulanceAnticipatedRevenueByPickupZipbtn).perform();
			pAmbulanceAnticipatedRevenueByPickupZipbtn.click();
			Reporter.log(
					"Clicked On Anticipated Revenue By pick Up Zip button under Reports >> Ambulance >> Anticipated Revenue By Pick Up Zip ");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAmbulanceALSBLS(WebDriver driver) { // Click on ALS/BLS button under Reports >> Ambulance >> ALS
															// / BLS
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAmbulanceALSBLSbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAmbulanceALSBLSbtn).perform();
			pAmbulanceALSBLSbtn.click();
			Reporter.log("Clicked on ALS/BLS button under Reports >> Ambulance >> ALS / BLS ");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnAmbulancePickUp(WebDriver driver) { // Click on Pick up button under Reports >> Ambulance >> Pick
															// up
		try {
			WebDriverWait w = new WebDriverWait(driver, ETO);
			w.until(ExpectedConditions.visibilityOf(pAmbulancePickupbtn));
			Actions act = new Actions(driver);
			act.moveToElement(pAmbulancePickupbtn).perform();
			pAmbulancePickupbtn.click();
			Reporter.log("Clicked on Pick up button under Reports >> Ambulance >> Pick up");
		} catch (Exception e) {
			e.printStackTrace();
			sAssert.fail();
			sAssert.assertAll();
		}
	}

	public void clickOnOthersMedicaidNonMedicaid(WebDriver driver) { // Click on Medicaid/Non Medicaid button under
																		// Reports >> Others >> Medicaid/Non Medicaid
		WebDriverWait w = new WebDriverWait(driver, ETO);
		w.until(ExpectedConditions.visibilityOf(pOthersMedicaidNonMedicaidbtn));
		Actions act = new Actions(driver);
		act.moveToElement(pOthersMedicaidNonMedicaidbtn).perform();
		pOthersMedicaidNonMedicaidbtn.click();
		Reporter.log("Clicked on Medicaid/Non Medicaid button under Reports >> Others >> Medicaid/Non Medicaid");

	}

}
