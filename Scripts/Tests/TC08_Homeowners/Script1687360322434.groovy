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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Homeowners'], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/select_(Select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/select_(select)  Yes  No (1)'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/select_(Select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/select_(Select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/select_(Select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/select_(Select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/select_(Select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/span_Continue to General Policy Information'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - General Policy Informatio_38f91a/span_Continue to Insured  Address Information'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_First Name'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_Last Name'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_Date of Birth'), 
    '01/01/1980')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/select_(Select)  Divorced  Single  Married _b78225'), 
    'Married', true)

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_Number_MailingAddressNumber'), 
    '404')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_Street Name_MailingAddressStreetName'), 
    'E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_City_MailingAddressCity'), 
    'Hastings')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/select_(Select)  Alabama  Alaska  Arizona  _1e4f5a'), 
    'MI', true)

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_Zip Code_MailingAddressPostalCode'), 
    '49058')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/select_(Select)  Yes  No'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/span_Continue to Insurance Score'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Insurance Score  Hastings_9fbc6b/span_Continue to Dwelling Information and C_1b396a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(select)  1  2  3  4'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(Select)  HO 00 02  HO 00 02 Repair _49ccc8'), 
    'HO 00 02', true)

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/input_Market Value_MarketValue'), 
    '400000')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/input_Replacement Cost_ReplacementCost'), 
    '400000')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/input_Coverage A - Dwelling_CoverageA'), 
    '400000')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/td_Coverage A - Dwelling_ui-widget-content'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(select)  100,000  200,000  300,000 _627a03'), 
    '100000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(select)  1,000  2,000  3,000  4,000  5,000'), 
    '1000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(select)  750  1,000  1,500  2,000  _192aa3'), 
    '750', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(select)1,0001,5002,0002,5003,0004,0_abb474'), 
    '1000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(Select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(Select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/select_(Select)  Yes  No_1_2'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/span_Continue to Underwriting Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(select)  Adobe  Asbestos  Stucco  C_956226'), 
    'Frame', true)

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/input_Year of Construction_ConstructionYear'), 
    '2010')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/span_Continue to Other Structures'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Other Structures  Hasting_a9226c/span_Continue to Endorsements'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Endorsements  Hastings Mu_72e553/input_Schedule an Item_EarthquakeApplied'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Endorsements  Hastings Mu_72e553/select_(Select)  5  10  15  20  25'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Endorsements  Hastings Mu_72e553/select_(Select)  Yes  No'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Endorsements  Hastings Mu_72e553/input_Description of Other Structure_Person_9c7ec3'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Endorsements  Hastings Mu_72e553/span_Continue to Scheduled Personal Property'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Schedule an Item_Jewelery'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/input_Coverage Amount_CoverageAmountJewelry'), 
    '5000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/select_0  100  250'), 
    '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/select_(Select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/select_(Select)  Yes  No_1'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Save'))

WebUI.click(findTestObject('Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Schedule an Item - PersonalComputer'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/input_Coverage Amount_CoverageAmount'), 
    '5000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/select_All Computers but Laptops  Laptop'), 
    'Laptop', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Continue to Recreational Motor Vehicles'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/span_Schedule an Item'))

WebUI.selectOptionByValue(findTestObject('Page_Homeowners - Recreational Vehicles  Ha_d076f5/select_Eligibility'), 'False', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/select_(Select)  Snowmobile  Golf Cart  Tra_9fce2d'), 
    'Snowmobile', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/select_(Select)Physical Damage OnlyPhysical_9838d8'), 
    'Physical Damage Only', true)

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/input_Coverage Amount_CoverageAmount'), 
    '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/select_(Select)  50  100  250  500'), 
    '50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/select_(Select)  0-600 ccs  Over 600 ccs'), 
    '0-600 cc’s', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/span_Continue to Watercraft'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Watercraft  Hastings Mutu_4c9866/span_Continue to Prior Carrier  Discounts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/select_(Select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/select_(select)  Central Station - Burglary_6fc7b1'), 
    'Central Station - Burglary & Fire', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/select_(Select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/select_(Select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/select_(Select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/span_Continue to Loss History'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Loss History  Hastings Mu_477e69/span_Continue to Premium'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Premium Calculation  Hast_44e8c9/span_Continue to Application'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Continue to Application  _97856b/span_Convert Express Quote to Application'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Eligibility  Hastings Mut_37823c/span_Continue to General Policy Information'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - General Policy Informatio_38f91a/span_Continue to Insured  Address Information'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_Residence Home Phone Number_PhoneNumber'), 
    '(852) 963-7415')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/input_Social Security Number'), 
    '789-45-6125')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Insured  Address Informat_23e93c/span_Continue to Insurance Score'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Insurance Score  Hastings_9fbc6b/span_Continue to Dwelling Information and C_1b396a'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/input_Square Footage_SquareFootage'), 
    '2500')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Dwelling Information and _8b6572/span_Continue to Underwriting Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(Select)  Yes  No'), 
    'True', true)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(select)  Boiler  Electric  Natural _937852'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(select)  Boiler  Electric  Natural _937852'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(select)  Boiler  Electric  Fireplac_82ffcc'), 
    'Electric', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(Select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(Select)  Yes  No_1_2'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(Select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(select)  Apartment  Condo  Cooperat_28ee7b'), 
    'Apartment', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(select)  Composition  Flat  Metal  _abd3da'), 
    'Flat', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/select_(select)  Closed  Stilts  Poles  Pil_ba9362'), 
    'Closed', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Underwriting Information _9303eb/span_Continue to Other Structures'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Other Structures  Hasting_a9226c/span_Continue to Endorsements'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Endorsements  Hastings Mu_72e553/span_Continue to Scheduled Personal Property'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/textarea_Description_Description'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Save'))

WebUI.click(findTestObject('Page_Homeowners - Scheduled Personal Proper_e5fb77/span_EditPersonalComputer'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/textarea_Description_Description'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Scheduled Personal Proper_e5fb77/span_Continue to Recreational Motor Vehicles'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/input_Model Year_ModelYear'), 
    '1950')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/input_Make  Model_MakeModel'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/input_Serial  Identification Number_SerialI_5659dd'), 
    '123456')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/select_(Select)YesNo'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Recreational Vehicles  Ha_d076f5/span_Continue to Watercraft'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Watercraft  Hastings Mutu_4c9866/span_Continue to Operator  RMV and Watercraft'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Home Owners - Insured  Address Informa_887f6e/select_(Select)  Child  Grandparent  Insure_3bab0e'), 
    'Insured', true)

WebUI.setText(findTestObject('Object Repository/Page_Home Owners - Insured  Address Informa_887f6e/input_Drivers License Number_b574e8ed42d099_b70ce2'), 
    '123456')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Home Owners - Insured  Address Informa_887f6e/select_(Select)  Alabama  Alaska  Arizona  _1e4f5a'), 
    'MI', true)

WebUI.click(findTestObject('Object Repository/Page_Home Owners - Insured  Address Informa_887f6e/span_Continue to Prior Carrier  Discounts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/select_(Select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/select_(Select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/input_Explanation_Explanation'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/span_Continue to Supplemental Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/select_(Select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Supplemental Information _3ebece/span_Continue to Renovations'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Renovations  Hastings Mut_2feb07/span_Continue to Loss History'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Loss History  Hastings Mu_477e69/span_Continue to Premium'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Premium Calculation  Hast_44e8c9/span_Continue to Interests'))

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Prior Carrier  Discounts _9fad58/span_Continue to Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Billing/select_(Select)Agency BillDirect Bill Colle_65144c'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Billing/select_(Select)Full Pay'), '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Billing/select_(Select)YesNo'), 'False', true)

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Billing/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/input_Agency Contact Name_ContactName'), 
    'Test Automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/select_(Select)0001-Teadmin     010002-ClIn_587726'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.click(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/span_Submit Referral'))

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'), 
    FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Farmowners - Submission  Hastings Mutu_2b786b/a_Logout'))

WebUI.closeBrowser()

