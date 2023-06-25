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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Personal Auto'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/span_Continue to General Policy Information'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - General Policy Informa_05d4dc/span_Continue to Insured  Address Information'))

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/input_First Name_fee8b744f5642ed980d7d156c2_4f50e4'), 
    'Automation')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/input_Last Name_fee8b744f5642ed980d7d156c2a_fc1bde'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/input_Number_MailingAddressNumber'), 
    '404')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/input_Street Name_MailingAddressStreetName'), 
    'E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/input_City_MailingAddressCity'), 
    'Hastings')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/input_Zip Code_MailingAddressPostalCode'), 
    '49058')

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/span_Continue to Insurance Score'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/span_Continue to Driver Information  Losses_0359a4'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/span_Add A Driver  HHM'))

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/input_First Name_FirstName'), 
    'Automation')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/input_Last Name_LastName'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/select_(Select)  Add as driver  Add as non-_9e3d02'), 
    'Add as driver', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/select_(Select)  Insured  Spouse  Child  Gr_e99461'), 
    'Insured', true)

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/input_Drivers License (Do not use Social Se_ad877a'), 
    '741852963')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/input_Date of Birth(MMDDYYYY)_DateOfBirth'), 
    '01/01/1980')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/select_(Select)  Male  Female'), 
    'Male', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/select_(Select)  Divorced  Single  Married _b78225'), 
    'Married', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/select_(Select)  Yes  No'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/select_(Select)  Alabama  Alaska  Arizona  _1e4f5a'), 
    'MI', true)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/span_Continue to Vehicle Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)  10,000  25,000  50,000  10_bc6066'), 
    '10000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)  Reject  50,000-100,000  10_4268c1'), 
    '50,000-100,000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)Reject50,000-100,000100,000-_8da386'), 
    '50,000-100,000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)  0-5,999  6,000-Over'), 
    '0-5,999', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)  1  2 or more'), 
    '2 or more', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)  Option 1 - Unlimited PIP B_75a6cb'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)None'), 
    'None', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/select_(select)Full300 Medical300 Wage Loss_0e9f0d'), 
    4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/span_Add A Vehicle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/select_(select)  Private Passenger  Pickup _020192'), 
    'Private Passenger', true)

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/input_Year_VehicleYear'), 
    '2010')

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/input_VIN_VIN'), '1GTH6NFE0B8128633')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/select_(select)  Business  Farm  Pleasure  Work'), 
    'Work', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/select_(select)  Business  Farm  Pleasure  Work'), 
    'Work', true)

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/input_of miles one way to work_NumberOfMilesToWork'), 
    '5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/select_(select)  Yes  No'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Vehicle  Hastings Mutu_bcc400/span_Continue to Driver Assignment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Driver Assignment  Has_00c60f/select_(select)  Automation Test'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Driver Assignment  Has_00c60f/span_Continue to Prior Carrier  Credits'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/select_(select)  Yes  No'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/select_(select)  Yes  No_1'), 
    'False', true)

def d = new Date()

def tz = TimeZone.getTimeZone('GMT')

formattedDate = d.format('MM-dd-yyyy', tz)

WebUI.setText(findTestObject('Page_Personal Auto - Prior Carrier and Cred_9a168b/input_Expiration Date_ExpirationDate'), 
    formattedDate)

WebUI.sendKeys(findTestObject('Page_Personal Auto - Prior Carrier and Cred_9a168b/input_Expiration Date_ExpirationDate'), 
    Keys.chord(Keys.TAB))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/select_(select)  0  1 Years  2 Years  3 Yea_ad0446'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/select_(select)  Less than 6 months  6 mont_8fd8ff'), 
    '12 months', true)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/span_Continue to Payment Plan'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Payment Plan  Hastings_4285ed/select_(select)  Yes  No'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Payment Plan  Hastings_4285ed/span_Continue to Premium'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Premium Calculation  H_8fc66a/span_Continue to Application'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Continue to Applicatio_3182cd/span_Convert Express Quote to Application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Eligibility  Hastings _5b1c8e/span_Continue to General Policy Information'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - General Policy Informa_05d4dc/span_Continue to Insured  Address Information'))

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/input_Social Security Number_fee8b744f5642e_2b6235'), 
    '789-78-8547')

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Insured  Address Infor_e85ed9/span_Continue to Insurance Score'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/span_Continue to Driver Information  Losses_0359a4'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Driver Information  Ha_c135f1/span_Continue to Vehicle Information'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Vehicle Information  H_d28cc0/span_Continue to Driver Assignment'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Driver Assignment  Has_00c60f/span_Continue to Prior Carrier  Credits'))

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/input_Prior Carrier Name_Company'), 
    'Test Insurance')

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Prior Carrier and Cred_9a168b/span_Continue to Payment Plan'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Payment Plan  Hastings_4285ed/select_(Select)  Agency Bill  Direct Bill C_b7d1a8'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Payment Plan  Hastings_4285ed/select_(Select)Full Pay'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Payment Plan  Hastings_4285ed/span_Continue to Premium'))

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Premium Calculation  H_8fc66a/span_Continue to Billing'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PersonalAuto - Billing/select_(Select)YesNo'), 'False', 
    true)

WebUI.click(findTestObject('Object Repository/Page_PersonalAuto - Billing/span_Continue'))

WebUI.click(findTestObject('Page_Personal Auto - Submission  Hastings M_11c0d5/span_AttachFile_MedicalForm'))

WebUI.sendKeys(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile'), 'C:\\Test.pdf')

WebUI.click(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile_AttachFile'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Personal Auto - Submission  Hastings M_11c0d5/span_AttachFile_PIP'))

WebUI.sendKeys(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile'), 'C:\\Test1.pdf')

WebUI.click(findTestObject('Page_Commercial Auto - Submission  Hastings_059815/button_ChooseFile_AttachFile'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Submission  Hastings M_11c0d5/input_Agency Contact Name_ContactName'), 
    'Test Automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Personal Auto - Submission  Hastings M_11c0d5/select_(Select)0001-Teadmin     010002-ClIn_587726'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Personal Auto - Submission  Hastings M_11c0d5/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.click(findTestObject('Object Repository/Page_Personal Auto - Submission  Hastings M_11c0d5/span_Submit Referral'))

WebUI.verifyElementText(findTestObject('Page_Personal Auto - Submission  Hastings M_11c0d5/Message'), 'This policy is currently in a read-only state and cannot be modified.')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'), 
    FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Commercial Auto - Submission  Hastings_059815/a_Logout'))

WebUI.closeBrowser()

