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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Commercial Package'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Name_NameOnPolicy'), 
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/input_Address_AddressLine1'), 
    '404 E Woodlawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/input_City_City'), 'Hastings')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package - Main  Hastings Mu_e64242/select_(Select)AlabamaAlaskaArizonaArkansas_cad9fe'), 
    'MI', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Inland Marine - Locations a_e3f486/input_Zip Code_Zip'), 
    '49058')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Fire - Main  Hastings Mutua_5fde70/select_RiskType'), 
    'Apartment', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Main  Hastings Mu_e64242/span_Continue to Locations'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Locations  Hastin_7f3b8d/span_Add Location'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Locations  Hastin_7f3b8d/input_Address_AddressLine1'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Locations  Hastin_7f3b8d/span_Copy from Mailing Address'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Locations  Hastin_7f3b8d/span_Save and Close'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Locations  Hastin_7f3b8d/span_Continue to Commercial Fire'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/span_Add Building'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/input_Search by Class Code or Description_C_15c1d5'), 
    '0077')

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/div_0077 - CONVENTS OR MONASTERIES - UP TO _bbc68d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/select_- please select -FrameJoisted Masonr_90e57d'), 
    'Frame', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/input_Year Built_YearBuilt'), 
    '2011')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/select_(Select)YesNo'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/input_Endorsements_buildingCoverage'))

WebUI.setText(findTestObject('Page_Commercial Package - Commercial Fire -_933526/input_Limit_buildingCoverageLimit'), '250000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/select_(select)4 6 8 10 12'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Commercial Fire -_933526/span_Continue to Crime'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Crime - Policy Le_89d315/span_Continue to Inland Marine'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package - Inland Marine  Ha_8fd405/select_(Select)YesNo'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Inland Marine  Ha_8fd405/input_Policy Level Coverages_buildersRisk'))

WebUI.setText(findTestObject('Page_Commercial Package - Inland Marine  Ha_8fd405/input_Total Limit_buildersRiskLimit'), 
    '250000')

WebUI.sendKeys(findTestObject('Page_Commercial Package - Inland Marine  Ha_8fd405/input_Total Limit_buildersRiskLimit'), 
    Keys.chord(Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Commercial Package - Inland Marine  Ha_8fd405/input_Rate_buildersRiskRate'), 
    30)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package - Inland Marine  Ha_8fd405/input_Rate_buildersRiskRate'), 
    '0.5')

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Inland Marine  Ha_8fd405/span_Continue to General Liability'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - General Liability_0fccf5/span_Continue to 404 E Woodlawn Ave'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/select_-- Choose Territory --001003004005'), 
    '004', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/span_Schedule a Classification'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/input_Search by Class Code or Description_C_15c1d5'), 
    '51005')

WebUI.sendKeys(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/input_Search by Class Code or Description_C_15c1d5'), 
    Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/input_Search by Class Code or Description_C_15c1d5'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/div_51005 - Aerosol Containers - Filling Or_d4edd6'), 
    10)

not_run: WebUI.click(findTestObject('Page_Commercial Package - General Liability_adaebe/div_51005 - Aerosol Containers - Filling Or_d4edd6'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Commercial Package - General Liability_adaebe/input_Exposure'), '20000')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/input_Products  Completed Operations (a) Ra_ea04c4'), 
    '0.5')

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/span_Save and Close'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - General Liability_adaebe/span_Continue to Endorsements'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - General Liability_653e13/span_Continue to Additional Insured'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - General Liability_653e13/a_Premium Modifications'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Premium Modificat_05cbe5/span_Continue to Submission Process'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package - Submission Select_2f2fc1/select_-- Choose how you would like to subm_0484fb'), 
    'FormalQuote', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Submission Select_2f2fc1/span_Continue submission process'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Application Selec_a33f98/span_Begin online application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/select_(select)  Association  Corporation  _83d9d3'), 
    'Corporation', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/input_Year Business Started_YearBusinessStarted'), 
    '2011')

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/span_Add Contact Information'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/input_Name_Name'), 'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/input_Mobile Phone_MobilePhone'), 
    '(876) 543-4321')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/select_-- What role does this contact provi_893561'), 
    'Both', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/span_Save'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/textarea_Description of Operation_Descripti_4b13ce'), 
    'Automation')

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Appli_2adf29/span_Continue to General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Gener_1e2059/span_Continue to Prior Carrier'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Prior_d39912/span_Continue to Loss History'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Loss _db9517/select_(select)  No  Yes, I have Loss Runs _504ea5'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Loss _db9517/span_Continue to 404 E Woodlawn Ave'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package Application - Build_28e76d/input_Total Area_TotalArea'), 
    '1500')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package Application - Build_28e76d/input_of Stories_NumberOfStories'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Build_28e76d/span_Continue to Liability General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/div_Applicant InformationGeneral Informatio_9d1673'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Liabi_b607b2/span_Continue to Contractors General Information'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Contr_069883/span_Continue to ProductsCompleted Operations'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Produ_a7dcbe/span_Continue to Additional Interest'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package Application - Addit_2a3557/span_Application Finished'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Submission  Hasti_3d65c9/span_Continue to Submission'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package - Submission  Hasti_3d65c9/input_Contact Name_ContactName'), 
    'Test Automation')

WebUI.selectOptionByValue(findTestObject('Page_Commercial Fire - Submission  Hastings_43d570/select_(Select)  0001-Teadmin 01  0002-ClIn_9e7eb8'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Package - Submission  Hasti_3d65c9/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Submission  Hasti_3d65c9/span_Submit Quote'))

WebUI.rightClick(findTestObject('Object Repository/Page_Commercial Package - Submission  Hasti_3d65c9/td_This Formal Quote has been submitted and_a84c2e'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Commercial Package - Submission  Hasti_3d65c9/td_This Formal Quote has been submitted and_a84c2e'), 
    'This Formal Quote has been submitted and is currently in a read only state and cannot be modified')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'),
	FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Commercial Package - Submission  Hasti_3d65c9/a_Logout'))

WebUI.closeBrowser()

