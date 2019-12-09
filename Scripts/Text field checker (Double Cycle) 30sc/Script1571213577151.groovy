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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

for (int i = 1; i < 31; i++) {
	
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {
	
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i))
	
		for (int j = 1; j < 7; j++) {
			
			if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text '+j), 0) == true) {
			
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text '+j))
				
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test disable/save-text-btn'))
			} else {
			break
			}
		}
	} else {
	break
	}
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))