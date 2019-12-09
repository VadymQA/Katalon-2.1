import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.RenderingHints.Key as Key
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
import org.apache.xmlbeans.impl.xb.xsdschema.impl.MaxLengthDocumentImpl as MaxLengthDocumentImpl
import org.openqa.selenium.Keys as Keys

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'), 1) ==
	true) {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))
	
		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'), 'data-maxlength')
	
		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
				1, 1))
	
		int maxL = ((maxlength) as Integer)
	
		if ((maxL >= 100) == true) {
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
	
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
	
		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
	
		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(
				2, 1))
	
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
		maxlength = 0
	
		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'), 1) == true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'))
	
			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'), 'data-maxlength')
	
			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
					'vavowDate').getValue(1, 1))
	
			maxL = ((maxlength) as Integer)
	
			if ((maxL >= 100) == true) {
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
	
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
	
			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
	
			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
					'vavowDate').getValue(2, 1))
	
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
			maxlength = 0
	
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'), 1) ==
			true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'))
	
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'), 'data-maxlength')
	
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
						'vavowDate').getValue(1, 1))
	
				maxL = ((maxlength) as Integer)
	
				if ((maxL >= 100) == true) {
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
	
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
	
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
	
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
						'vavowDate').getValue(2, 1))
	
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
				maxlength = 0
	
				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'), 1) ==
				true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'))
	
					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'),
						'data-maxlength')
	
					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
							'vavowDate').getValue(1, 1))
	
					maxL = ((maxlength) as Integer)
	
					if ((maxL >= 100) == true) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
	
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
	
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					} else if ((maxL < 100) == true) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
	
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					}
					
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
	
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
	
					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
	
					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
							'vavowDate').getValue(2, 1))
	
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
					maxlength = 0
	
					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'))
	
						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'),
							'data-maxlength')
	
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							FailureHandling.CONTINUE_ON_FAILURE)
	
						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							findTestData('vavowDate').getValue(1, 1))
	
						maxL = ((maxlength) as Integer)
	
						if ((maxL >= 100) == true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
	
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
	
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						} else if ((maxL < 100) == true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
	
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						}
						
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							maxlength)
	
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
	
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
	
						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
								'vavowDate').getValue(2, 1))
	
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
						maxlength = 0
	
						if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'),
							1) == true) {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'))
	
							maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'),
								'data-maxlength')
	
							WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								FailureHandling.CONTINUE_ON_FAILURE)
	
							WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								findTestData('vavowDate').getValue(1, 1))
	
							maxL = ((maxlength) as Integer)
	
							if ((maxL >= 100) == true) {
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
	
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
	
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
							} else if ((maxL < 100) == true) {
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
	
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
							}
							
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								maxlength)
	
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
	
							WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
	
							WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'),
								findTestData('vavowDate').getValue(2, 1))
	
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
							maxlength = 0
	
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
						} else {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
						}
					} else {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
					}
				} else {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
				}
			} else {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
			}
		} else {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
		}
	} else {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
	}
	
	
/*_______________________________________________________4_______________________________________*/
	
	
	WebUI.delay(0)
	
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'), 0) == true) {
		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'), 1) == true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))
	
			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'), 'data-maxlength')
	
			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
					'vavowDate').getValue(1, 1))
	
			maxL = ((maxlength) as Integer)
	
			if ((maxL >= 100) == true) {
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
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
			
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
			
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(
						2, 1))
			
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
			maxlength = 0
	
			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'), 1) ==
			true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'))
	
				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2'),
					'data-maxlength')
	
				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
						'vavowDate').getValue(1, 1))
	
				maxL = ((maxlength) as Integer)
	
				if ((maxL >= 100) == true) {
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
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
				
					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
				
					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(
							2, 1))
				
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
				maxlength = 0
	
				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'))
	
					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3'),
						'data-maxlength')
	
					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
							'vavowDate').getValue(1, 1))
	
					maxL = ((maxlength) as Integer)
	
					if ((maxL >= 100) == true) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
	
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
	
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					} else if ((maxL < 100) == true) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
	
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					}
					
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), maxlength)
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
					
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
					
						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(
								2, 1))
					
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
					maxlength = 0
	
					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'))
	
						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4'),
							'data-maxlength')
	
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							FailureHandling.CONTINUE_ON_FAILURE)
	
						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							findTestData('vavowDate').getValue(1, 1))
	
						maxL = ((maxlength) as Integer)
	
						if ((maxL >= 100) == true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
	
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
	
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						} else if ((maxL < 100) == true) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
	
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						}
						
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							maxlength)
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
						
							WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
						
							WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(
									2, 1))
						
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
						maxlength = 0
	
						if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'),
							1) == true) {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'))
	
							maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5'),
								'data-maxlength')
	
							WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								FailureHandling.CONTINUE_ON_FAILURE)
	
							WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								findTestData('vavowDate').getValue(1, 1))
	
							maxL = ((maxlength) as Integer)
	
							if ((maxL >= 100) == true) {
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
	
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
	
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
							} else if ((maxL < 100) == true) {
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
	
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									Keys.chord(Keys.BACK_SPACE))
							}
							
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								maxlength)
							
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
							
								WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
							
								WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(
										2, 1))
							
								WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
							maxlength = 0
	
							if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'),
								1) == true) {
								WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'))
	
								maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'),
									'data-maxlength')
	
								WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									FailureHandling.CONTINUE_ON_FAILURE)
	
								WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									findTestData('vavowDate').getValue(1, 1))
	
								maxL = ((maxlength) as Integer)
	
								if ((maxL >= 100) == true) {
									WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
										Keys.chord(Keys.BACK_SPACE))
	
									WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
										Keys.chord(Keys.BACK_SPACE))
	
									WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
										Keys.chord(Keys.BACK_SPACE))
								} else if ((maxL < 100) == true) {
									WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
										Keys.chord(Keys.BACK_SPACE))
	
									WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
										Keys.chord(Keys.BACK_SPACE))
								}
								
								WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
									maxlength)
								
								WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))
								
									WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))
								
									WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(
											2, 1))
								
									WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))
	
								WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	
								maxlength = 0
	
								WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
							} else {
								WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
							}
						} else {
							WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
						}
					} else {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
					}
				} else {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
				}
			} else {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
			}
		} else {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
		}
	}
	/*__________________________________________________________5_____________________________________________________________*/