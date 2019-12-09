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

int n = 0
int p = 1

WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'))

for (int i = 1; i < 31; i++) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_' + i), 0) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_' + i))

        for (int j = 1; j < 7; j++) {
            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_' + j), 0) == true) {
				
				n= n+1
				
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_' + j))

                WebUI.waitForPageLoad(5)
								
				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))
				
				Thread.sleep(500)
				
				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'),
					5)
				
				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))
		
		        Thread.sleep(500)
				
				if (p>1) {
					
				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_'+p), 0)
				
				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_'+p))
				
				Thread.sleep(500)
				}
				
				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_'+n),
					0)
				Thread.sleep(500)
				WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_'+n))
			
				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v'+n),
					5)
			
				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v'+n))
			
				WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
					5)
				
				WebUI.delay(3)
				
				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))
				
				WebUI.delay(2)
								
				if (n==12){
					n = 0					
					p++
				}
		
		        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
		            1) == true) {
				
		            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
					
		        } 
				
            } else {
                break
            }
			
			
        }
    } else {
        break
    }
}



