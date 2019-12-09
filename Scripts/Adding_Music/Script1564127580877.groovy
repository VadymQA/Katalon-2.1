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

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/p_Audio'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/p_Audio Settings'), 
    2)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/button_Open Music Library'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/label_Upload'))

WebUI.delay(1)

WebUI.verifyElementInViewport(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/a_Action_add-btn select-music-1 add-music-sidebar'), 
    3)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/a_Action_add-btn select-music-1 add-music-sidebar'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/button_Go to editor'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/adding_music/button_Go to editor'))

WebUI.delay(1)

