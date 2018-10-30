import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vl311.msais.com:8190/id/#/login')

WebUI.setText(findTestObject('Page_MSA Retailer Portal/input_Email_email'), 'mlstestdpa@mailinator.com')

WebUI.setEncryptedText(findTestObject('Page_MSA Retailer Portal/input_Password_password'), 'TFy7ZZvOP0LUM7+WDlN84g==')

WebUI.click(findTestObject('Page_MSA Retailer Portal/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_MSA Retailer Portal Dashboard/a_View'))

WebUI.click(findTestObject('Object Repository/Page_Portal Users/a_Create New User'))

WebUI.setText(findTestObject('Object Repository/Page_Portal Users/input_First Name _form-control'), 'MLSTEST')

WebUI.setText(findTestObject('Object Repository/Page_Portal Users/input_Middle Name_form-control'), 'Middle')

WebUI.setText(findTestObject('Object Repository/Page_Portal Users/input_Last Name _form-control'), 'MLSDPUZ')

WebUI.setText(findTestObject('Object Repository/Page_Portal Users/input_Title_form-control'), 'Data Provider User')

WebUI.setText(findTestObject('Object Repository/Page_Portal Users/input_Primary Email _form-cont'), 'mlstestdpuz@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Page_Portal Users/input_Phone Number _form-contr'), '(412) 555-1515')

WebUI.setText(findTestObject('Object Repository/Page_Portal Users/input_Phone Extension_form-con'), '1234')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Portal Users/select_MLS Test Org Chain'), '9A7P4T', true)

WebUI.click(findTestObject('Object Repository/Page_Portal Users/span_Add Organization(s)_glyph'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Portal Users/select_Data Provider AdminData'), '2', true)

WebUI.click(findTestObject('Object Repository/Page_Portal Users/span_Add Role(s)_glyphicon gly'))

WebUI.click(findTestObject('Object Repository/Page_Portal Users/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Portal Users/button_Ok'))

WebUI.click(findTestObject('Object Repository/Page_Portal Users/span_mlstestdpamailinator.com_'))

WebUI.click(findTestObject('Object Repository/Page_Portal Users/a_Logout'))

WebUI.closeBrowser()

