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

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

WebUI.delay(1)

String sceneCore = "Page_Reevio Video Maker/Editor_Scene_" 

 for (int i = 1; i < 31; i++) {
	 
	 if (WebUI.verifyElementPresent((findTestObject(sceneCore+i)), 1) == true) {
		 
	 
	 WebUI.doubleClick(findTestObject(sceneCore+i))
	 
	 WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_Color'))
	 
	 WebUI.clearText(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/change color/input_RGB_hex-color'))
	 
	 WebUI.setText(findTestObject('Object Repository/Add video in placeholers/Video_img repository (videos, imgs and buttons)/change color/input_RGB_hex-color'),
		 '#123456')
	 
	 WebUI.click(findTestObject('Object Repository/Add video in placeholers/Video_img repository (videos, imgs and buttons)/change color/button_Apply'))
	 
	 if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {
		 WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i))
		 
		 if (WebUI.verifyElementInViewport(findTestObject('Object Repository/Page_Login/logoPlaceholder1'), 0)) {
			 WebUI.dragAndDropToObject(findTestObject('Page_Login/Logo_4'), findTestObject('Object Repository/Page_Login/logoPlaceholder1'))
		 }
	 }
	 } else {
	 break
	 }
	 
	 Thread.sleep(500)
} 
 
 WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))