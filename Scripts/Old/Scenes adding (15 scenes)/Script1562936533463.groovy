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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.reevio.com/editor/7298')

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Page_Reevio - Online Video Maker - Video Editor - Video Creator/a_Login'))

WebUI.click(findTestObject('Page_Login/form_Log in'))

WebUI.setEncryptedText(findTestObject('Page_Login/input_Log in_password'), 'QJRGRb5Kh1JVL6lDJsVMuw==')

WebUI.setText(findTestObject('Page_Login/input_Log in_email'), 'reevtest@gmail.com')

WebUI.click(findTestObject('Page_Login/button_Log in'))

WebUI.navigateToUrl('https://dev.reevio.com/editor/7449')

WebUI.waitForPageLoad(1)

'Go to scenes menu'
WebUI.click(findTestObject('null'))

WebUI.waitForPageLoad(1)

WebUI.delay(2)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.delay(2.5)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 4)

WebUI.click(findTestObject('null'))

WebUI.delay(2.5)

WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 15_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 15_add-scene-btn'), 4)

WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 15_add-scene-btn'))

WebUI.delay(2.5)

WebUI.click(findTestObject('null'))

