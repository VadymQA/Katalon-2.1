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
import internal.GlobalVariable as GlobalVariable
import org.apache.xmlbeans.impl.xb.xsdschema.impl.MaxLengthDocumentImpl as MaxLengthDocumentImpl
import org.openqa.selenium.Keys as Keys


WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

  for (int i = 1; i < 31; i++) {
	  
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i), 0) == true) {

		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_'+i))
		
		WebUI.delay(1)
		
		for (int j = 1; j<7; j++) {
					
		if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text '+j), 0) ==true) {
			
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text '+j))
								
			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text '+j), 'data-maxlength')
								
			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
								
			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(1, 5))
								
			int maxL = ((maxlength) as Integer)
								
			if ((maxL >= 100) == true) {
				
		
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(Keys.BACK_SPACE))
								
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(Keys.BACK_SPACE))
								
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(Keys.BACK_SPACE))
			
			} else if ((maxL < 100) == true) {
			
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(Keys.BACK_SPACE))
								
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(Keys.BACK_SPACE))
			
			}
									
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
															
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
								
			maxlength = 0
			
			} else {
		break
		}
		}
	}else {
		break
		}
 }