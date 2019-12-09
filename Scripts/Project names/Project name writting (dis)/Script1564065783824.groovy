import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.server.handler.FindElement as FindElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/videoTitle/img_Continue_add-title'))

WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/videoTitle/input_videoTitle'), 7, FailureHandling.CONTINUE_ON_FAILURE)

attribute = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/videoTitle/input_videoTitle'), 'value')

WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/videoTitle/input_videoTitle'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/videoTitle/input_Continue_videos-name'))

templateID = findTestData('vavowDate').getValue(1, 3)

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/videoTitle/input_Continue_videos-name'), attribute + '_DIS_' + templateID)

