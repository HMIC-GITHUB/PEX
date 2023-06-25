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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Commercial InlandMarine'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Name_NameOnPolicy'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Page_Commercial Fire - Main  Hastings Mutua_5fde70/span_Continue to Location 1'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/input_Address_AddressLine1'), 
    '404 E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/input_City_City'), 'Hastings')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/input_Zip Code_Zip'), 
    '49058')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/select_ProtectionClassCode'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/span_Continue to Coverages'))

WebUI.click(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/input_Policy Level Coverages_buildersRisk'))

WebUI.setText(findTestObject('Page_Hastings Mutual Insurance Company powe_13a547/input_Total Limit_buildersRiskLimit'), 
    '250000')

WebUI.click(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/td'))

WebUI.click(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/input_Close_contractorsEquipment'))

WebUI.setText(findTestObject('Page_Hastings Mutual Insurance Company powe_13a547/input_Total Limit_d7ca904a324bacada281fbed9_68bd36'), 
    '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/select_(Select)  80   90   100'), 
    '0.8', true)

WebUI.click(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/input_Accounts Receivable_AccountsReceivabl_eb8eb5'))

WebUI.setText(findTestObject('Page_Hastings Mutual Insurance Company powe_13a547/input_Limit_AccountsReceivableLimit_a96904a_51840b'), 
    '50000')

WebUI.setText(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/input_CSP Class Code_CspLookup_a96904ad4543_cbba9b'), 
    '0077')

WebUI.click(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/div_0077 - CONVENTS OR MONASTERIES - UP TO _bbc68d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/select_-- Choose a type --  Frame  Joisted _44e5e4'), 
    'Frame', true)

WebUI.setText(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/input_Rate_buildersRiskRate'), 
    '0.5')

WebUI.setText(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/input_Rate_d7ca904a324bacada281fbed978063_C_c9af53'), 
    '0.5')

WebUI.click(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company powe_13a547/span_Continue to Premium Calculation'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Premium Cal_d94793/span_Continue Submission Process'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _273746/select_-- Choose how you would like to subm_913466'), 
    'NewBusiness', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _273746/span_Continue submission process'))

WebUI.click(findTestObject('Object Repository/Page_General Liablility - Application Selec_8f5913/span_Begin online application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/select_(select)  Association  Corporation  _a924a5'), 
    'Corporation', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/input_Year Business Started_YearBusinessStarted'), 
    '2011')

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/span_Add Contact Information'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/input_Name_Name'), 'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/input_Mobile Phone_MobilePhone'), 
    '(832) 234-1211')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/select_-- What role does this contact provi_893561'), 
    'Both', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/span_Save'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/textarea_Description of Operation_Descripti_4b13ce'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Applicant I_baa12c/span_Continue to General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - General Information _633b06/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - General Inf_f3f603/span_Continue to Prior Carrier'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Prior Carri_100de1/span_Continue to Loss History'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - Loss Histor_11c057/select_(select)  No  Yes, I have Loss Runs _504ea5'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Loss Histor_11c057/span_Continue to Contractors Equipment'))

WebUI.selectOptionByValue(findTestObject('Page_Commercial Inland Marine Application -_6a998e/select_Schedule'), 'CompletedOnlineSchedule', 
    false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/input_Description'), 
    10)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/input_Description'), 
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/input_Amount of Insurance'), 
    '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine Application -_6a998e/span_Continue to Loss Payees'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Loss Payee/span_Continue to Certificate Holders'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Certificate Holder/span_Application Finished'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/span_Continue to Submission'))

WebUI.selectOptionByValue(findTestObject('Page_CommercialAuto - Billing/select_BillingMethod'), 'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CommercialInlandMarine - Billing/select_(Select)Full PaySemi-annualQuarterly_69046b'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CommercialInlandMarine - Billing/select_(Select)YesNo'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_CommercialInlandMarine - Billing/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/input_Contact Name_ContactName'), 
    'Automation Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/select_(Select)  0001-Teadmin 01  0002-ClIn_9e7eb8'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/select_(select)  Yes  No'), 
    'False', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/span_Submit Application'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/td_This New Business Application has been s_8b0b81'), 
    'This New Business Application has been submitted and is currently in a read only state and cannot be modified')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'),
	FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Commercial Inland Marine - Submission _7c75f2/a_Logout'))

WebUI.closeBrowser()

