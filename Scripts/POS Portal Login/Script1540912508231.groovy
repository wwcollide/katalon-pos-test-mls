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

WebUI.setText(findTestObject('Object Repository/Page_MSA Retailer Portal/input_Email_email'), 'mlstestdpa@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MSA Retailer Portal/input_Password_password'), 'TFy7ZZvOP0LUM7+WDlN84g==')

WebUI.click(findTestObject('Object Repository/Page_MSA Retailer Portal/button_Login'))

WebUI.click(findTestObject('Page_MSA Retailer Portal Dashboard/a_MShafferMSA.com'))

WebUI.click(findTestObject('Object Repository/Page_MSA Retailer Portal Dashboard/a_Logout'))

WebUI.closeBrowser()

