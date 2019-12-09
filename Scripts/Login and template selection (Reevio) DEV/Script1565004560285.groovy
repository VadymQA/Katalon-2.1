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

WebUI.openBrowser('https://dev.reevio.com/auth/login')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Login/form_Log in'))

WebUI.setEncryptedText(findTestObject('Page_Login/input_Log in_password'), 'QJRGRb5Kh1JVL6lDJsVMuw==')

WebUI.setText(findTestObject('Page_Login/input_Log in_email'), 'reevtest@gmail.com')

WebUI.click(findTestObject('Page_Login/button_Log in'))

WebUI.navigateToUrl('https://dev.reevio.com/editor/7780')

WebUI.waitForPageLoad(1)

