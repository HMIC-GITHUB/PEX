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

//String strLOB = 'Commercial Fire'
WebUI.click(findTestObject('Object Repository/Page_Agent Dashboard/a_QUOTE'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Quote/div_Start a New Business'), 20)

WebUI.click(findTestObject('Object Repository/Page_Quote/div_Start a New Business'))

WebUI.verifyElementText(findTestObject('Page_Quote/div_Title'), 'Start a Quote')

WebUI.click(findTestObject('Page_Quote/div_LOB'))

System.out.println(LOB)

if (LOB == 'Businessowners') {
    WebUI.click(findTestObject('Page_Quote/div_Businessowners'))
}

if (LOB == 'Commercial Auto') {
    WebUI.click(findTestObject('Page_Quote/div_Commercial Auto'))
}

if (LOB == 'Commercial Fire') {
    WebUI.click(findTestObject('Page_Quote/div_Commercial Fire'))
}

if (LOB == 'Commercial InlandMarine') {
    WebUI.click(findTestObject('Page_Quote/div_Commercial InlandMarine'))
}

if (LOB == 'Commercial Package') {
    WebUI.click(findTestObject('Page_Quote/div_Commercial Package'))
}

if (LOB == 'Commercial Umbrella') {
    WebUI.click(findTestObject('Page_Quote/div_Commercial Umbrella'))
}

if (LOB == 'Farmowners') {
    WebUI.click(findTestObject('Page_Quote/div_Farmowners'))
}

if (LOB == 'General Liability') {
    WebUI.click(findTestObject('Page_Quote/div_General Liability'))
}

if (LOB == 'Homeowners') {
    WebUI.click(findTestObject('Page_Quote/div_Homeowners'))
}

if (LOB == 'Personal Auto') {
    WebUI.click(findTestObject('Page_Quote/div_Personal Auto'))
}

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Quote/svg_Select_css-19bqh2r'), 20)

WebUI.click(findTestObject('Object Repository/Page_Quote/svg_Select_css-19bqh2r'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Quote/div_0001634'), 20)

WebUI.click(findTestObject('Object Repository/Page_Quote/div_0001634'))

WebUI.click(findTestObject('Object Repository/Page_Quote/div_State'))

WebUI.click(findTestObject('Object Repository/Page_Quote/div_MI'))

if (LOB == 'Commercial Package') {
    WebUI.click(findTestObject('Page_Quote/div_Type'))

    WebUI.click(findTestObject('Page_Quote/div_AllOther'))
}

WebUI.click(findTestObject('Object Repository/Page_Quote/button_Next'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Commercial Auto - Main  Hastings Mutua_ee63f4/input_Name_NameOnPolicy'), 
    10, FailureHandling.OPTIONAL)

