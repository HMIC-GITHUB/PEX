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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'General Liability'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Main  Hastings Mut_d5a932/input_Name_NameOnPolicy'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Main  Hastings Mut_d5a932/input_Address_AddressLine1'), 
    '404 E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Main  Hastings Mut_d5a932/input_City_City'), 'Hastings')

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Main  Hastings Mut_d5a932/input_Zip Code_Zip'), 
    '49058')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/select_(Select)  Alabama  Alaska  Arizona  _1e4f5a'), 
    'MI', true)

WebUI.click(findTestObject('Object Repository/Page_General Liability - Main  Hastings Mut_d5a932/span_Continue to Location 1'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Locations and Clas_af97d3/span_Copy from Mailing Address'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - Locations and Clas_af97d3/select_-- Choose Territory --001003004005'), 
    '001', true)

WebUI.click(findTestObject('Object Repository/Page_General Liability - Locations and Clas_af97d3/span_Schedule a Classification'))

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Locations and Clas_af97d3/input_Search by Class Code or Description_C_15c1d5'), 
    '10010')

WebUI.click(findTestObject('Object Repository/Page_General Liability - Locations and Clas_af97d3/div_10010 - Air Conditioning Equipment - De_25ccab'))

WebUI.setText(findTestObject('Page_Commercial Package - General Liability_adaebe/input_Exposure'), '50000')

WebUI.click(findTestObject('Object Repository/Page_General Liability - Locations and Clas_af97d3/span_Save and Close'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Locations and Clas_af97d3/span_Continue to Endorsements'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Endorsements  Hast_c6e644/span_Continue to Additional Insured'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Endorsements  Hast_c6e644/span_Continue to Premium Modifications'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Premium Modificati_5ee709/span_Continue Submission Process'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - Submission Selecti_6b468b/select_-- Choose how you would like to subm_913466'), 
    'NewBusiness', true)

WebUI.click(findTestObject('Object Repository/Page_General Liability - Submission Selecti_6b468b/span_Continue submission process'))

WebUI.click(findTestObject('Object Repository/Page_General Liablility - Application Selec_8f5913/span_Begin online application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/select_(select)  Association  Corporation  _a924a5'), 
    'Trust', true)

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/input_Year Business Started_YearBusinessStarted'), 
    '2010')

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/textarea_Description of Operation_Descripti_4b13ce'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/span_Add Contact Information'))

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/input_Name_Name'), 'Test Automation')

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/input_Office Phone_OfficePhone'), 
    '(857) 496-7485')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/select_-- What role does this contact provi_893561'), 
    'Both', true)

WebUI.click(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Applicant Informat_89ddac/span_Continue to 404 E Woodlawn Ave'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Locations  Hasting_ca1103/span_Continue to General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'False', true)

WebUI.setText(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/textarea_General Remarks_GeneralRemarks'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_General Liability - General Informatio_fbc034/span_Continue to Prior Carrier'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Prior Carrier  Has_cb7da5/span_Continue to Loss History'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - Loss History  Hast_a7ca53/select_(select)  No  Yes, I have Loss Runs _504ea5'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Page_General Liability - Loss History  Hast_a7ca53/span_Continue to Liability General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_General Liability - GL General Informa_daac97/span_Continue to Contractors'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Contractors Genera_8fecc4/span_Continue to ProductsCompleted Operations'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - ProductsCompleted _6b33ef/span_Continue to Additional Insured'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Additional Insured_9de5e3/span_Continue to Certificate Holders'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Certificate Holder_281891/span_Application Finished'))

WebUI.click(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/span_Continue to Submission'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GeneralLiability - Billing/select_(Select)Agency BillDirect Bill Colle_65144c'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GeneralLiability - Billing/select_(Select)Full PaySemi-annual'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GeneralLiability - Billing/select_(Select)YesNo'), 'False', 
    true)

WebUI.click(findTestObject('Object Repository/Page_GeneralLiability - Billing/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/input_Contact Name_ContactName'), 
    'Test Automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/select_(Select)  0001-Teadmin 01  0002-ClIn_9e7eb8'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/select_(Select)  Acknowledged'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/span_Submit Application'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/td_This New Business Application has been s_8b0b81'), 
    'This New Business Application has been submitted and is currently in a read only state and cannot be modified')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'),
	FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_General Liability - Submission  Hastin_ff4575/a_Logout'))

WebUI.closeBrowser()

