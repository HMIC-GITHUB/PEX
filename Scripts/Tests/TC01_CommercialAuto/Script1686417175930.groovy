import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SubTest/PEX_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Commercial Auto'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Name_NameOnPolicy'), 
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Address_AddressLine1'), 
    '404 E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_City_City'), 'Hastings')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/div_Entry of the Social Security Number or _0ec4f9'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/select_State'), 
    'MI', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Zip Code_Zip'), 
    '49058')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/div_Entry of the Social Security Number or _0ec4f9'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/span_Continue to Vehicles'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicles  Hastings M_9bd2cb/span_Add Vehicle'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Close_VIN'), '1GTH6NFE0B8128633')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Year_VehicleYear'), 
    '2011')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Stated Amount_StatedAmount'), 
    '')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)ACURAAUDIBMWBUICKCADILLACCHE_724d6d'), 
    'GMC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)ACADIA DENALIACADIA DENALI A_ede497'), 
    'CANYON CREW CAB SLT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)4DR PICKUP TRUCK 4X24DR PICK_4ab9de'), 
    '4DR PICKUP TRUCK 4X4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)  011  012  013  017  018  0_f9c643'), 
    '012', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/td_(select)  IA  IL  IN  MI  OH  WI'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Garaging Zip Code_Zip'), 
    '49058')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)  Commercial  Farm  Retail  _c9dd22'), 
    'Commercial', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Will this vehicle have Comprehensive _ca0bcd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)  0  50  100  250  500  1,00_8dd8ad'), 
    '500', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Deductible_Collision'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)  100  250  500  1,000  2,00_1e562c'), 
    '1000', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Tapes, Records,  Discs_RentalReimbursement'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)  30  50  75  100'), 
    '100', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Coverage_SingleLimitDeductible'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/td_(select)  250  500  1,000'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/select_(select)  250  500  1,000'), 
    '1000', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Deductible_applyCoordBenefitsToVehicl_c32045'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Deductible_AudioVisualDataElectronicE_dda79f'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_Coverage_AudioVisualDataElectronicEqu_079d7c'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/td_Coverage'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/input_0_CostNew'), '8000')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Vehicle  Hastings Mu_eead01/span_Continue to Policy Coverages'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Policy Coverages  Ha_de87d9/select_(Select)  Individual  Non-Individual'), 
    'Individual', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Policy Coverages  Ha_de87d9/select_(select)Option 1  Unlimited PIP Bene_875cbb'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Policy Coverages  Ha_de87d9/span_Continue to Premium Modifications'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Commercial Auto - Premium Modification_6eb52f/h1_Premium Modifications'), 
    'Premium Modifications')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Premium Modification_6eb52f/span_Continue Submission Process'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Submission Selection_0acf37/select_-- Choose how you would like to subm_913466'), 
    'FormalQuote', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Submission Selection_0acf37/span_Continue submission process'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Application Selectio_c21e2f/span_Begin online application'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/input_Year Business Started_YearBusinessStarted'), 
    '2010')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/textarea_Description of Operation_Descripti_4b13ce'), 
    'Test description')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/span_Add Contact Information'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/input_Name_Name'), 'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/input_Mobile Phone_MobilePhone'), 
    '(123) 456-7891')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/select_-- What role does this contact provi_893561'), 
    'Both', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Applican_8296d2/span_Continue to General Information'))

WebUI.waitForElementPresent(findTestObject('Page_Commercial Auto Application - General _620b3e/select_ApplicantSubsidiaryOfAnotherEntityAnswer'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Commercial Auto Application - General _620b3e/select_ApplicantSubsidiaryOfAnotherEntityAnswer'), 
    'False', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_ApplicantHaveSubsidiariesAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_FormalSafetyProgramAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_FormalSafetyProgramAnswer'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/input_Is a formal safety program in operati_4dcc3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_ExposureToFlammablesAnswer'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_ExposureToFlammablesAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_OtherInsuranceAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_CoverageDeclinedAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_LossesRelatingToSexualAbuseAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_IndictedOrConvictedOfFraudAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_FireOrSefetyCodeViolationsAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_ForeclosureRepossessionOrBankruptcyAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_JudgementOrLienAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_BusinessPlacedInTrustAnswer'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_BusinessPlacedInTrustAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_ForeignOperationsAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/select_OtherBusinessVenturesAnswer'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - General _620b3e/span_Continue to Prior Carrier'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Prior Ca_24e6be/span_Continue to Loss History'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Loss His_42d17e/select_(select)  No  Yes, I have Loss Runs _504ea5'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Loss His_42d17e/span_Continue to Covered Auto Symbols'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Covered _9cbaf4/span_Continue to Driver General Info'))

WebUI.waitForElementPresent(findTestObject('Page_Commercial Auto Application - Driver G_41789c/select_AnyVehiclesNotSolelyOwnedByApplicantAnswer'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Commercial Auto Application - Driver G_41789c/select_AnyVehiclesNotSolelyOwnedByApplicantAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_Over50PercentEmployeesUseAutosAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_VehicleMaintProgramInOperationAnswer'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_VehiclesLeasedToOthersAnswer'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_VehiclesLeasedToOthersAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_AnyModifiedSpecialEquipmentAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_IUCorPUCorOtherFilingsRequiredAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_OperationsInvolveTransportHazardousMaterialAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_AnyHoldHarmlessAgreementsAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_VehicleUsedByFamilyMembersAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_ApplicantObtainsMVRVerificationsAnswer'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_ApplicantObtainsMVRVerificationsAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_ApplicantHasSpecificDriverRecruitingMethodAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_AnyVehiclesOwnedButNotScheduledAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_AnyDriversNotCoveredByWorkersCompensationAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_AnyDriversConvictedForMovingViolationsAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_HasAgentInspectedVehiclesAnswer'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/select_AllVehiclesIncludedPartOfFleetAnswer'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/span_Schedule a Driver'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/input_Name_DriverName'), 
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/input_Date of Birth_BirthDate'), 
    '01/01/1980')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/input_Drivers License Number Social Securit_7a45ed'), 
    '32452987')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/u_S'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Driver G_41789c/span_Continue to Vehicle Schedule'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto Application - Vehicle _7ab7aa/input_Garaging Zip Code_GaragingCity'), 
    'Hastings')

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Vehicle _7ab7aa/span_Continue to Additional Interest'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto Application - Addition_2250cf/span_Application Finished'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/span_AttachFile_PD 04 95'))

WebUI.sendKeys(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile'), 'C:\\Test.pdf')

WebUI.click(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile_AttachFile'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/span_AttachFile_Personal Injury Protection (PIP)'))

WebUI.sendKeys(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile'), 'C:\\Test1.pdf')

WebUI.click(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile_AttachFile'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/span_Continue to Submission'))

not_run: WebUI.selectOptionByValue(findTestObject('Page_CommercialAuto - Billing/select_BillingMethod'), 'A', true, FailureHandling.OPTIONAL)

not_run: WebUI.waitForElementVisible(findTestObject('Page_CommercialAuto - Billing/select_InstallmentPlan'), 10, FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Page_CommercialAuto - Billing/select_InstallmentPlan'), '0', true, FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CommercialAuto - Billing/select_ChangeBillingAtRenewal'), 
    'False', true, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Object Repository/Page_CommercialAuto - Billing/span_Continue'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/input_Contact Name_ContactName'), 
    'Automation Test ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/select_(Select)  0001-Teadmin 01  0002-ClIn_9e7eb8'), 
    '05', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/textarea_Agent Comments to Underwriting_Comment'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/select_IsFarmRisk'), 
    'False', true)

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/span_Submit Application'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/span_Submit Application'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/p_Your New Business Application has uploade_0d6b0b'), 
    'Your New Business Application has uploaded successfully.', FailureHandling.OPTIONAL)

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'), 
    FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/a_Logout'))

WebUI.closeBrowser()

