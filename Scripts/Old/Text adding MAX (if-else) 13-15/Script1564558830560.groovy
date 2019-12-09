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
import org.apache.xmlbeans.impl.xb.xsdschema.impl.MaxLengthDocumentImpl
import org.openqa.selenium.Keys as Keys

WebUI.delay(0)

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'), 0) == true) {
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.1'), 1) == true) {
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.1'))
		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.1'), 'data-maxlength')
		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
				1, 1))
	
		int maxL = ((maxlength) as Integer)
		if ((maxL >= 100) ==true) {
		
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				
			} else if ((maxL < 100) == true) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
	
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
			maxlength = 0
			  
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.2'), 1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.2'))
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.2'), 'data-maxlength')
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
				1, 1))
				maxL = ((maxlength) as Integer)
			
				if ((maxL >= 100) ==true) {
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					
				} else if ((maxL < 100) == true) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
				}
	
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
			maxlength = 0
	
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.3'), 1) ==
			true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.3'))
	
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.3'), 'data-maxlength')
	
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
			
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
						1, 1))
				
				maxL = ((maxlength) as Integer)
			
				if ((maxL >= 100) ==true) {
		
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				
				} else if ((maxL < 100) == true) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				}
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
				
				maxlength = 0
	
				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.4'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.4'))
	
					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.4'), 'data-maxlength')
	
					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
				
					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
							1, 1))
					
					maxL = ((maxlength) as Integer)
				
					if ((maxL >= 100) ==true) {
			
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					
					} else if ((maxL < 100) == true) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					}
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
					maxlength = 0
	
					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.5'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.5'))
	
						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.5'), 'data-maxlength')
	
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
					
						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
								1, 1))
						
						maxL = ((maxlength) as Integer)
					
						if ((maxL >= 100) ==true) {
				
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
						
						} else if ((maxL < 100) == true) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
						}
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
						maxlength = 0
	
						if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.6'),
							1) == true) {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.6'))
							maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.6'), 'data-maxlength')
							WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
							WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
									1, 1))
							
							maxL = ((maxlength) as Integer)
							if ((maxL >= 100) ==true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							
							} else if ((maxL < 100) == true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							}
				
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
							maxlength = 0
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
						} else {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
						}
					} else {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
					}
				} else {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
				}
			} else {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
			}
		} else {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
		}
	} else {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
	}
	}
	/*__________________________________________________________13_____________________________________________________________*/
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'), 0) == true) {
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.1'), 1) == true) {
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.1'))
		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.1'), 'data-maxlength')
		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
				1, 1))
	
		int maxL = ((maxlength) as Integer)
		if ((maxL >= 100) ==true) {
		
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				
			} else if ((maxL < 100) == true) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
	
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
			maxlength = 0
			  
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.2'), 1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.2'))
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.2'), 'data-maxlength')
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
				1, 1))
				maxL = ((maxlength) as Integer)
			
				if ((maxL >= 100) ==true) {
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					
				} else if ((maxL < 100) == true) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
				}
	
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
			maxlength = 0
	
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.3'), 1) ==
			true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.3'))
	
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.3'), 'data-maxlength')
	
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
			
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
						1, 1))
				
				maxL = ((maxlength) as Integer)
			
				if ((maxL >= 100) ==true) {
		
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				
				} else if ((maxL < 100) == true) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				}
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
				
				maxlength = 0
	
				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.4'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.4'))
	
					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.4'), 'data-maxlength')
	
					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
				
					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
							1, 1))
					
					maxL = ((maxlength) as Integer)
				
					if ((maxL >= 100) ==true) {
			
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					
					} else if ((maxL < 100) == true) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					}
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
					maxlength = 0
	
					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.5'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.5'))
	
						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.5'), 'data-maxlength')
	
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
					
						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
								1, 1))
						
						maxL = ((maxlength) as Integer)
					
						if ((maxL >= 100) ==true) {
				
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
						
						} else if ((maxL < 100) == true) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
						}
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
						maxlength = 0
	
						if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.6'),
							1) == true) {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.6'))
							maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.6'), 'data-maxlength')
							WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
							WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
									1, 1))
							
							maxL = ((maxlength) as Integer)
							if ((maxL >= 100) ==true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							
							} else if ((maxL < 100) == true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							}
				
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
							maxlength = 0
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
						} else {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
						}
					} else {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
					}
				} else {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
				}
			} else {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
			}
		} else {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
		}
	} else {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
	}
	}
	/*__________________________________________________________14_____________________________________________________________*/
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'), 0) == true) {
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.1'), 1) == true) {
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.1'))
		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.1'), 'data-maxlength')
		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
				1, 1))
	
		int maxL = ((maxlength) as Integer)
		if ((maxL >= 100) ==true) {
		
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				
			} else if ((maxL < 100) == true) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
	
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
			maxlength = 0
			  
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.2'), 1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.2'))
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.2'), 'data-maxlength')
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
				1, 1))
				maxL = ((maxlength) as Integer)
			
				if ((maxL >= 100) ==true) {
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					
				} else if ((maxL < 100) == true) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
	
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
				}
	
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
			maxlength = 0
	
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.3'), 1) ==
			true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.3'))
	
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.3'), 'data-maxlength')
	
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
			
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
						1, 1))
				
				maxL = ((maxlength) as Integer)
			
				if ((maxL >= 100) ==true) {
		
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				
				} else if ((maxL < 100) == true) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
				}
	
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
			
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
				
				maxlength = 0
	
				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.4'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.4'))
	
					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.4'), 'data-maxlength')
	
					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
				
					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
							1, 1))
					
					maxL = ((maxlength) as Integer)
				
					if ((maxL >= 100) ==true) {
			
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					
					} else if ((maxL < 100) == true) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
							Keys.BACK_SPACE))
					}
		
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
					maxlength = 0
	
					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.5'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.5'))
	
						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.5'), 'data-maxlength')
	
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
					
						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
								1, 1))
						
						maxL = ((maxlength) as Integer)
					
						if ((maxL >= 100) ==true) {
				
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
						
						} else if ((maxL < 100) == true) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
								Keys.BACK_SPACE))
						}
			
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
						maxlength = 0
	
						if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.6'),
							1) == true) {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.6'))
							maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.6'), 'data-maxlength')
							WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
							WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
									1, 1))
							
							maxL = ((maxlength) as Integer)
							if ((maxL >= 100) ==true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							
							} else if ((maxL < 100) == true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
									Keys.BACK_SPACE))
							}
				
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
							maxlength = 0
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
						} else {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
						}
					} else {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
					}
				} else {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
				}
			} else {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
			}
		} else {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
		}
	} else {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
	}
	}
	/*__________________________________________________________15_____________________________________________________________*/