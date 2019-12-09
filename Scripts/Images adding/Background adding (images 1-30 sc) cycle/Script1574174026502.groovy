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

WebUI.delay(0)

String sceneCore = "Page_Reevio Video Maker/Editor_Scene_" 


 for (int i = 1; i < 13; i++) {
	 
	 if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {
	 
	 WebUI.doubleClick(findTestObject(sceneCore + i))
	 
	 WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_image'))

	 WebUI.waitForPageLoad(5)

 if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
	
	    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))
	
	    WebUI.delay(1)
	
	    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_Nature'))
	
	    WebUI.delay(1)
	
	    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_'+i))
	
	    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v'+i), 
	        5)
	
	    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v'+i))
	
	    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
	        5)
	
	    WebUI.delay(2)
	
	    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))
	
	    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Photo added'), 
	        10)
	
	    WebUI.delay(1)
		
 		}
     } else {
	 break
	 }
	 
	 if (WebUI.verifyElementInViewport(findTestObject('Object Repository/Page_Login/logoPlaceholder1'), 0)) {
		 WebUI.dragAndDropToObject(findTestObject('Page_Login/Logo_2'), findTestObject('Object Repository/Page_Login/logoPlaceholder1'))
	 }
 }
 
 for (int i = 13; i < 31; i++) {
	 
	 if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {
	 
	 WebUI.doubleClick(findTestObject(sceneCore + i))
	 
	 WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_image'))

	 WebUI.waitForPageLoad(5)
	 
	 if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
		 
		 WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))
 
		 WebUI.delay(1)
 
		 WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_Nature'))
 
		 WebUI.delay(1)
 
		 WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_'+i))
	
	     WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v'+i), 
	        5)
	
	     WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v'+i))
 
		 WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
			 5)
 
		 WebUI.delay(3)
 
		 WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))
 
		 WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Photo added'),
			 10)
 
		 WebUI.delay(2)
		 
	 	}
	 } else {
	 break
	 }
 }
 
 WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
