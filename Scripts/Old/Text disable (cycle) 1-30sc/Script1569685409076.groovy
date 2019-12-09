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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

 for (int i = 1; i < 31; i++) {
	  
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {

		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i))
		
		WebUI.delay(0)
		
		if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'), 0) == true) {
			
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/switch-btn-t active'))
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/save-text-btn')) 
			
			if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'), 0) == true) {
				
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'))
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/switch-btn-t active'))
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/save-text-btn'))
				
				if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'), 0) == true) {
					
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'))
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/switch-btn-t active'))
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/save-text-btn'))
					
					if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'), 0) == true) {
						
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'))
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/switch-btn-t active'))
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/save-text-btn'))
						
						if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'), 0) == true) {
							
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'))
							
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/switch-btn-t active'))
							
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/save-text-btn'))
							
							if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'), 0) == true) {
								
								WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'))
								
								WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/switch-btn-t active'))
								
								WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/save-text-btn'))
							}
						}
					}
				}
			}
		}
						
    } else {
	break
	}
 }
 
 WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))