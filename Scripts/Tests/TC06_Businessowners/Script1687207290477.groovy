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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Businessowners'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Main  Hastings Mutual_87daad/input_Name_NameOnPolicy'), 
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Main  Hastings Mutual_87daad/input_Address_AddressLine1'), 
    '404 E woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Main  Hastings Mutual_87daad/input_City_City'), 'Hastings')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/select_State'), 
    'MI', true)

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Main  Hastings Mutual_87daad/input_Zip Code_PostalCode'), 
    '49058')

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Main  Hastings Mutual_87daad/span_Continue to Location 1'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Locations  Hastings M_e609c5/span_Copy from Mailing Address'))

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Locations  Hastings M_e609c5/input_Territory_Territory'), 
    '005')

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Locations  Hastings M_e609c5/span_Continue to Building 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/select_(Select)Limited CookingMercantileOff_022bd7'), 
    'LCOOK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/select_(Select)Coffee Bars or Coffee ShopsD_992e1b'), 
    'lcook1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/select_(Select)FrameJoisted MasonryNon Comb_87dc98'), 
    'Frame', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/select_(Select)Owner occupied 75 or moreOwn_7e80c1'), 
    'Tenant', true)

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/input_Year Built_YearBuilt'), 
    '2010')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/input_Apartment square foot area must be le_957864'), 
    '1500')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/select_(Select)YesNo'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/div_Building 1                             _775092'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/select_(Select)YesNo'), 
    'False', true)

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/input_Limit_BuildingCoverageLimit'), 
    '50000')

WebUI.setText(findTestObject('Page_Businessowners - Buildings  Hastings M_821eb9/input_Limit_ContentsCoverageLimit'), '5000')

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/td_Replacement Cost'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Buildings  Hastings M_821eb9/span_Continue to Location 1 Coverages'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Location Coverages  H_5d536c/span_Continue to Policy Coverages'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Policy Coverages  Has_103e00/input_Limit_EmployeeBenefitsLiablity'))

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Policy Coverages  Has_103e00/input_Number of Employees_EmployeeBenefitsL_42bb4b'), 
    '25')

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Policy Coverages  Has_103e00/input_25,000_TheftExclusion'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Policy Coverages  Has_103e00/span_Continue to Supporting Policies'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Supporting Policies  _5ae382/span_Premium Adjustments'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Premium  Hastings Mut_510013/span_Continue Application Process'))

WebUI.selectOptionByValue(findTestObject('Page_Businessowners Application - Applicant_03e475/select_Entity'), 'Corporation', 
    false)

WebUI.setText(findTestObject('Object Repository/Page_Businessowners Application - Applicant_03e475/input_Years in Business_YearsInBusiness'), 
    '2010')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners Application - Applicant_03e475/textarea_Description of Operation_Descripto_c0936c'), 
    'Automation')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners Application - Applicant_03e475/input_Inspection Contact Name_InspectionCon_c6b3b6'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners Application - Applicant_03e475/input_Inspection Contact Phone Number_Inspe_bba57e'), 
    '(814) 257-4785')

WebUI.click(findTestObject('Object Repository/Page_Businessowners Application - Applicant_03e475/span_Continue to General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/select_(Select)YesNo_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Businessowners Application - General I_adde48/span_Continue to Limited Cooking'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Limited Cooking  Hast_32794b/select_(Select)YesNo'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Limited Cooking  Hast_32794b/select_(Select)YesNo_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Limited Cooking  Hast_32794b/select_(Select)YesNo_1_2'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Limited Cooking  Hast_32794b/span_Continue to Financial Reports'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners Application - Order Rep_61559a/span_Order Financial Reports'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners Application - Order Rep_61559a/span_Continue to Prior Carrier and Loss Inf_b3cfe6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prior Carrier and Loss Information  Ha_44d8c3/select_(Select)YesNo'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prior Carrier and Loss Information  Ha_44d8c3/select_(Select)YesNo_1'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Prior Carrier and Loss Information  Ha_44d8c3/span_Continue to 404 E woodlawn Ave'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners Application - Location 1/span_Continue to Building 1'))

WebUI.setText(findTestObject('Object Repository/Page_Businessowners Application - Building 1/textarea_Description of operations at the p_3e354e'), 
    'Test Automation')

WebUI.setText(findTestObject('Page_Businessowners Application - Building 1/input_Total Building Square Feet_BuildingSq_4bcac1'), 
    '1500')

WebUI.setText(findTestObject('Page_Businessowners Application - Building 1/input_Square Feet occupied by applicant_Squ_6f8c99'), 
    '1200')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners Application - Building 1/input_Of Stories_NumberOfStories'), 
    '3')

WebUI.click(findTestObject('Object Repository/Page_Businessowners Application - Building 1/span_Continue to Additional Interest'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners Application - Additiona_148783/span_Continue to Employee Benefits Liability'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/select_(select)YesNo'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/select_(Select)YesNo (1)'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/select_(Select)YesNo_1'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/select_(Select)YesNo_1_2'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/select_(Select)YesNo_1_2_3'), 
    'True', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/select_(Select)YesNo_1_2_3'), 
    'False', true)

WebUI.setText(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/textarea_Employee Benefits Liability Inform_6c21f6'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/label_Check if there are none'))

WebUI.click(findTestObject('Object Repository/Page_Employee Benefits Liability Informatio_491fdd/span_Continue to Billing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Billing/select_(Select)Agency BillDirect Bill Colle_65144c'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Billing/select_(Select)Full PaySemi-annualQuarterly_69046b'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Billing/select_(Select)YesNo'), 'False', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Billing/span_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/span_Continue to Submission'))

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/input_Contact Name_ContactName'), 
    'Test Automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/select_(Select)0001-Teadmin     010002-ClIn_587726'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/input_Phone Number_PhoneNumber'), 
    '(845) 978-7487')

WebUI.setText(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/input_Fax Number_Fax'), 
    '(789) 587-4514')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/select_(select)Yes'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/span_Refer to Underwriting for issuance'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/td_This policy has been referred and is cur_ffae4f'), 
    'This policy has been referred and is currently in a read only state and cannot be modified')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'),
	FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Businessowners - Submission  Hastings _a95dad/a_Logout'))

WebUI.closeBrowser()

