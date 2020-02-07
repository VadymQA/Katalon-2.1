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

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

  for (int i = 1; i < 31; i++) {
	  
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 1) == true) {

		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i))
		
		if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_1'), 1)) {
			WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_1'))
	
			WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
	
			WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
			
			Thread.sleep(50)
	
			WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
					1))
			
			Thread.sleep(50)
	
			WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))    
			
			Thread.sleep(50)
			
		if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_2'), 1)) {
			WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_2'))
			Thread.sleep(50)
			WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
			Thread.sleep(50)
			WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
			Thread.sleep(50)
			WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4,
					1))
			Thread.sleep(50)
			WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
			Thread.sleep(50)
	
		if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_3'), 1)) {
			WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_3'))
			Thread.sleep(50)
	
			WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
			Thread.sleep(50)
	
			WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
			Thread.sleep(50)
	
			WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
					1))
			Thread.sleep(50)
			WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
			Thread.sleep(50)
		}
	}
}
	}else {
		break
		}
  }
  
  WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))