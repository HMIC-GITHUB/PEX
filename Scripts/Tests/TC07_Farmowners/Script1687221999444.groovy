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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Farmowners'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Contact Information  Hast_1400cf/span_Close'))

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Contact Information  Hast_1400cf/input_Quote Name_NameOnPolicy'), 
    'Automation Farmowners')

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Contact Information  Hast_1400cf/input_Phone_Phone'), 
    '(741) 852-9546')

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Contact Information  Hast_1400cf/span_Continue to General Policy Information'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - General Policy Informatio_ba0091/img_Click on a picture to select a program__42143d'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/span_Add Applicant'))

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/input_First Name_Firstname'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/input_Last Name_Lastname'), 
    'Automation')

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/input_Phone_Phone'), 
    '(741) 852-9514')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/select_(select)YesNo'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/select_(select)YesNo_1'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/input_Address_Address'))

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/input_Address_Address'), 
    '404 E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/input_City_City'), 'Hastings')

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/input_Zip Code_ZipCode'), 
    '49058')

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Applicants  Hastings Mutu_f29954/span_Continue to Locations'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Locations  Hastings Mutua_1b2814/select_(Select)AlconaAlgerAlleganAlpenaAntr_d51765'), 
    'Barry', true)

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Locations  Hastings Mutua_1b2814/input_Total Acres_TotalAcres'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Locations  Hastings Mutua_1b2814/span_Add Another Location'))

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Locations  Hastings Mutua_1b2814/input_Total Acres_TotalAcres'), 
    '3500')

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Locations  Hastings Mutua_1b2814/span_Continue to Farm Personal'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Farm Personal  Hastings M_b9e61d/span_Schedule a Farm Personal item'))

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Farm Personal  Hastings M_b9e61d/input_Limit_Limit'), 
    '50000')

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Farm Personal  Hastings M_b9e61d/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Farm Personal  Hastings M_b9e61d/span_Continue to Package Endorsements'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Optional Property Coverag_707404/span_Continue to Optional Property Coverages'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Optional Property Coverag_707404/span_Continue to Farm Liability Coverages'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Liability  Hastings Mutua_e9076d/span_Continue to Miscellaneous Coverages'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Miscellaneous Coverages  _1e27f9/span_Continue to Recreational Vehicles'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Recreational Vehicles  Ha_44b323/span_Continue to Watercraft'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Watercraft  Hastings Mutu_473ca3/select_(Select Limit)100200300500'), 
    '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Watercraft  Hastings Mutu_473ca3/select_(Select Limit)10,00020,00030,00040,0_a03cf8'), 
    '10000', true)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Watercraft  Hastings Mutu_473ca3/span_Continue to Personal Articles'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - PersonalArticles  Hasting_fb5434/span_Continue to Premium Adjustments'))

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Premium Modification  Has_9921a1/span_Continue to Submission'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/select_(select)YesNo'), 
    'False', true)

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/input_Previous Carrier Name_NameOfThePrevio_d2a9bb'), 
    'Farmers Insurance')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/select_(select)YesNo_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/select_(select)YesNo_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/select_(select)YesNo_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/select_(select)YesNo_1_2_3_4'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/span_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/select_(select)YesNo_1_2_3_4_5'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - General Eligibility Quest_4871c9/span_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/select_(select)YesNo_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Insured Eligibility Quest_4878a9/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Refer to Underwriting  Ha_71c599/input_Producer Name_ContactName'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/Page_Farmowners - Refer to Underwriting  Ha_71c599/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Refer to Underwriting  Ha_71c599/span_Submit Referral'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Farmowners - Submission  Hastings Mutu_2b786b/p_The quote has been submitted to Hastings _2306ed'), 
    'The quote has been submitted to Hastings Mutual for review.')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'),
	FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Submission  Hastings Mutu_2b786b/a_Logout'))

WebUI.closeBrowser()

