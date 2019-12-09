import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as Global


int n = 0
int p = 1

WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'))

  for (int i = 1; i < 31; i++) {
	  
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {

		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))
		
		WebUI.waitForPageLoad(5)
		
		if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
			
			n++
			
			Thread.sleep(500)
			
			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
			
			Thread.sleep(300)
			
			if (p>1) {
				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/aV_'+p), 0)
				
				Thread.sleep(100)
				
				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/aV_'+p))
			}
			
			Thread.sleep(500)
		
			WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_'+n))
			
			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v'+n),
				5)
			Thread.sleep(150)
			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v'+n))
			
			WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
				5)
			Thread.sleep(150)
			WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
			
			if (n==12){
				n = 0
				p++
			}
	
			if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'),
				1) == true) {
				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
			} else {
		
			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)
		
			WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))
	} 
			
	} 
	
	} else {
	break
	}
	
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i))
		
		if (WebUI.verifyElementInViewport(findTestObject('Object Repository/Page_Login/logoPlaceholder1'), 0)) {
			WebUI.dragAndDropToObject(findTestObject('Page_Login/Logo_3'), findTestObject('Object Repository/Page_Login/logoPlaceholder1'))
		}
	}
  }
  
  
  
  