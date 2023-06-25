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

WebUI.callTestCase(findTestCase('SubTest/PEX_InitiateQuote'), [('LOB') : 'Commercial Umbrella'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Main  Hastings M_4fec17/input_Name_NameOnPolicy'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Main  Hastings M_4fec17/span_Continue to General Liability'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/span_Schedule Underlying Policy'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/input_Policy Number_PolicyNumberab0099d0506_92a434'), 
    10)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/input_Policy Number_PolicyNumberab0099d0506_92a434'), 
    '1234567')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/select_(select)  Apartment  Auto Service Ri_04f673'), 
    'Apartment', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/select_(Select)500,0001,000,0001,000,0002,000,000'), 
    '1,000,000/2,000,000', true)

WebUI.setText(findTestObject('Page_Commercial Umbrella - General Liabilit_70e0ae/input_Class Code_ClassCodeSearche32236d3223_663913'), 
    '91315')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/div_91315 - Cable Or Subscription Televisio_fe0ac9'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/input_Underlying Premises Premium_Underlyin_608e27'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - General Liabilit_70e0ae/span_Continue to Businessowners'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/span_Schedule Underlying Policy'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/input_Policy Number_PolicyNumbereb6a269232a_ebd805'), 
    '1587429')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/input_Underlying Premium_UnderlyingPremiume_37880d'), 
    '50000')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/input_Underlying Premium_UnderlyingPremiume_37880d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/select_(select)  500,0001,000,000  1,000,00_3a9ff9'), 
    '1,000,000/2,000,000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/select_(select)  Mercantile  Service or Pro_68b759'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/select_(select)Appliance Stores and Distrib_4864c3'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/select_No  Yes'), 
    'True', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Businessowners  _48b438/span_Continue to Commercial Auto'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/span_Schedule Underlying Policy'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/input_Policy Number_PolicyNumberabdbc3b010e_8b7fa6'), 
    '8579465')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/select_(Select)  500,000  1,000,000'), 
    '500000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/select_(select)  Private Passenger Auto  Li_31a42e'), 
    'Heavy Trucks', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/select_(select)  0-100 miles  101-300 miles'), 
    '101-300 miles', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/select_(select)  Macomb, Oakland, and Wayne_174078'), 
    'Remainder of State', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/input_of Vehicles_NumberOfVehiclesabf472634_ef6db9'), 
    '3')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Commercial Auto _2cd35f/span_Continue to Premium Modifications'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Premium Modifica_28765b/span_Continue Submission Process'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Submission Selec_68603e/select_-- Choose how you would like to subm_913466'), 
    'NewBusiness', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Submission Selec_68603e/span_Continue submission process'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Application Sele_4e622c/span_Begin online application'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/select_(select)  Association  Corporation  _83d9d3'), 
    'Corporation', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/input_Address_AddressLine1'), 
    '404 E Woolawn Ave')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/input_City_City'), 'Hastings')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/td_City_ui-widget-content'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/select_(Select)  Alabama  Alaska  Arizona  _1e4f5a'), 
    'MI', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/input_Zip Code_Zip'), 
    '49058')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/input_Year Business Started_YearBusinessStarted'), 
    '2010')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/textarea_Description of Operation_Descripti_4b13ce'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/span_Add Contact Information'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/input_Name_Name'), 'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/input_Email_Email'), 
    'ssomaundaram@hastingsmutual.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/select_-- What role does this contact provi_893561'), 
    'Both', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/input_Office Phone_OfficePhone'), 
    '(845) 596-8745')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Applicant Inform_e7c26e/span_Continue to General Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6_7'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6_7_8'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'False', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/select_(select)  Yes  No_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - General Informat_9b1d2f/span_Continue to Prior Carrier'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Prior Carrier  H_733928/span_Continue to Loss History'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Loss History  Ha_62c6aa/select_(select)  No  Yes, I have Loss Runs _504ea5'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Loss History  Ha_62c6aa/span_Continue to Underlying Insurance'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/select_(select)  No  Yes'), 
    'False', true)

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Liquor Liability_PollutionLiabilityCoverage'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Incidental Medical Malpractice_Liquor_316892'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Professional Liability (EO)_VendorsLi_ca24f6'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/img_Effective Date_ui-datepicker-trigger'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Effective Date_EffectiveDateACVabdbc3_a738bb'), 
    '01/01/2023')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Expiration Date_ExpirationDateACVabdb_cca3ca'), 
    '01/01/2024')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Effective Date_EffectiveDateACVabdbc3_a738bb'), 
    '01/01/2023')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/td_Policy'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Effective Date_EffectiveDateGLab0099d_f79da3'), 
    '01/01/2023')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Expiration Date_ExpirationDateACVabdb_cca3ca'), 
    '01/01/2024')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Effective Date_EffectiveDateACVabdbc3_a738bb'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Expiration Date_ExpirationDateGLab009_c26035'), 
    '01/01/2024')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Prod  Comp Ops Aggr_LimitAggProdCompO_7cd08f'), 
    '50000')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Personal  Adv Injury_LimitPersAdvInju_b54a48'), 
    '5000')

WebUI.setText(findTestObject('Page_Commercial Umbrella - Underlying Insur_207ad5/input_LimitDamageRentedPremisesGL'), '5000')

WebUI.setText(findTestObject('Page_Commercial Umbrella - Underlying Insur_207ad5/input_LimitMedicalExpensesGL'), '5000')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Effective Date_EffectiveDateBOPeb6a26_662ccf'), 
    '01/01/2023', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Expiration Date_ExpirationDateBOPeb6a_07d621'), 
    '01/01/2024', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Explanation_CoveragesExposuresExplanation'), 
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/input_Explanation_PreviousExperienceClaimsE_9275a9'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Underlying Insur_207ad5/span_Continue to Additional Exposures'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Additional Expos_c413b7/span_Application Finished'))

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/span_Continue to Submission'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CommercialUmbrella - Billing/select_(Select)Agency BillDirect Bill Colle_65144c'), 
    'A', true)

WebUI.waitForElementPresent(findTestObject('Page_CommercialUmbrella - Billing/select_(Select)Full PaySemi-annualQuarterly_69046b'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CommercialUmbrella - Billing/select_(Select)Full PaySemi-annualQuarterly_69046b'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CommercialUmbrella - Billing/select_(Select)YesNo'), 'False', 
    true)

WebUI.click(findTestObject('Object Repository/Page_CommercialUmbrella - Billing/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/input_Contact Name_ContactName'), 
    'Automation Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/select_(Select)  0001-Teadmin 01  0002-ClIn_9e7eb8'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/input_Email Address_EmailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/span_Submit Application'))

WebUI.rightClick(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/td_This New Business Application has been s_8b0b81'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/td_This New Business Application has been s_8b0b81'), 
    'This New Business Application has been submitted and is currently in a read only state and cannot be modified')

QuoteNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_70126465'),
	FailureHandling.STOP_ON_FAILURE)

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_Homeowners - Submission  Hastings Mutu_67ef28/td_3860301'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Commercial Umbrella - Submission  Hast_f0187d/a_Logout'))

WebUI.closeBrowser()

