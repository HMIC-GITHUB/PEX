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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Commercial Fire'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Name_NameOnPolicy'), 
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Address_AddressLine1'), 
    '404 E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_City_City'), 'Hastings')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/select_State'), 
    'MI', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Zip Code_Zip'), 
    '49058')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Main  Hastings Mutua_5fde70/select_RiskType'), 
    'Apartment', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Main  Hastings Mutua_5fde70/span_Continue to Location 1'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Locations  Hastings _3ae6d8/span_Copy from Mailing Address'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Locations  Hastings _3ae6d8/span_Add Building'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_Search by Class Code or Description_C_15c1d5'), 
    '0077')

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/div_0077 - CONVENTS OR MONASTERIES - UP TO _bbc68d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/select_ConstructionType'), 
    'Frame', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_Year Built_YearBuilt'), 
    '2011')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/select_BuildingHasMortgageeOrLossPayee'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/select_BuildingHasMortgageeOrLossPayee'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_Endorsements_buildingCoverage'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_Limit_buildingCoverageLimit'), 
    '250000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/select_buildingCoverageInflationGuard'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/select_buildingCoverageInflationGuard'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_Agreed Value_contentsCoverage'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_Limit_contentsCoverageLimit'), 
    '50000')

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/td_Agreed Value                        NoYes'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_No property in the open_stock'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/input_Limit_stockLimit'), 
    '2000')

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Buildings  Hastings _76c692/span_Continue to Premium Modifications'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Premium Modification_800c84/span_Continue Submission Process'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Submission Selection_0c3aff/select_-- Choose how you would like to subm_913466'), 
    'NewBusiness', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Submission Selection_0c3aff/span_Continue submission process'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Application Selectio_5adbbb/span_Begin online application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/select_(select)  Association  Corporation  _a924a5'), 
    'Corporation', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/input_Year Business Started_YearBusinessStarted'), 
    '2011')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/textarea_Description of Operation_Descripti_4b13ce'), 
    'Commercial Fire')

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/span_Add Contact Information'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/input_Name_Name'), 'Test Automation')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/input_Office Phone_OfficePhone'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/input_Office Phone_OfficePhone'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/input_Mobile Phone_MobilePhone'), 
    '(824) 423-1411')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/select_-- What role does this contact provi_893561'), 
    'Both', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Applicant Informatio_7fbddb/span_Continue to 404 E Woodlawn Ave'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Application - Buildi_bc9780/input_Total Area_TotalArea'), 
    '1500')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Application - Buildi_bc9780/input_of Stories_NumberOfStories'), 
    '2')

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Application - Buildi_bc9780/span_Continue to General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/td_Is a formal safety program in operation__aefba6'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/input_Is a formal safety program in operati_4dcc3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/span_Continue to Prior Carrier'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Prior Carrier  Hasti_e5808a/span_Continue to Loss History'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Loss History  Hastin_b39bc9/select_(select)  No  Yes, I have Loss Runs _504ea5'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Loss History  Hastin_b39bc9/span_Continue to Certificate Holders'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Certificate Holder/span_Application Finished'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Submission  Hastings_43d570/span_Continue to Submission'))

WebUI.selectOptionByValue(findTestObject('Page_CommercialAuto - Billing/select_BillingMethod'), 'A', true)

WebUI.waitForElementVisible(findTestObject('Page_CommercialAuto - Billing/select_InstallmentPlan'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_CommercialAuto - Billing/select_InstallmentPlan'), '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CommercialAuto - Billing/select_ChangeBillingAtRenewal'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_CommercialFire - Billing/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Submission  Hastings_43d570/input_Contact Name_ContactName'), 
    'Automation Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Submission  Hastings_43d570/select_(Select)  0001-Teadmin 01  0002-ClIn_9e7eb8'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Fire - Submission  Hastings_43d570/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Submission  Hastings_43d570/select_(Select)  Acknowledged'), 
    'True', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Submission  Hastings_43d570/span_Submit Application'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Commercial Fire - Submission  Hastings_43d570/td_This New Business Application has been s_8b0b81'), 
    'This New Business Application has been submitted and is currently in a read only state and cannot be modified')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'),
	FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/a_Logout'))

WebUI.closeBrowser()

