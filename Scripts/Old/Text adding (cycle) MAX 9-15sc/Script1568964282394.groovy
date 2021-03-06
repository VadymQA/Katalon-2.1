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
import org.apache.xmlbeans.impl.xb.xsdschema.impl.MaxLengthDocumentImpl as MaxLengthDocumentImpl
import org.openqa.selenium.Keys as Keys

String a = 'Page_Reevio Video Maker/Editor/Test Text fields/a_Text '

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))

	for (int j = 1; j<7; j++) {
		String textField = a+j
				
		if (WebUI.verifyElementPresent(findTestObject(textField), 1) ==
			true) {
				WebUI.doubleClick(findTestObject(textField))
			
				maxlength = WebUI.getAttribute(findTestObject(textField), 'data-maxlength')
			
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
	}
		}
/*________________________________________________________________________9____________________________________________________________________*/
	
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
	
		for (int j = 1; j<7; j++) {
			String textField = a+j
					
			if (WebUI.verifyElementPresent(findTestObject(textField), 1) ==
				true) {
					WebUI.doubleClick(findTestObject(textField))
				
					maxlength = WebUI.getAttribute(findTestObject(textField), 'data-maxlength')
				
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
		}
			}
	/*________________________________________________________________________10____________________________________________________________________*/
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
		
			for (int j = 1; j<7; j++) {
				String textField = a+j
						
				if (WebUI.verifyElementPresent(findTestObject(textField), 1) ==
					true) {
						WebUI.doubleClick(findTestObject(textField))
					
						maxlength = WebUI.getAttribute(findTestObject(textField), 'data-maxlength')
					
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
			}
				}
		/*________________________________________________________________________11____________________________________________________________________*/
			
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
			
				for (int j = 1; j<7; j++) {
					String textField = a+j
							
					if (WebUI.verifyElementPresent(findTestObject(textField), 1) ==
						true) {
							WebUI.doubleClick(findTestObject(textField))
						
							maxlength = WebUI.getAttribute(findTestObject(textField), 'data-maxlength')
						
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
				}
					}
			/*________________________________________________________________________12____________________________________________________________________*/
				
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
				
					for (int j = 1; j<7; j++) {
						String textField = a+j
								
						if (WebUI.verifyElementPresent(findTestObject(textField), 1) ==
							true) {
								WebUI.doubleClick(findTestObject(textField))
							
								maxlength = WebUI.getAttribute(findTestObject(textField), 'data-maxlength')
							
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
					}
						}
				/*________________________________________________________________________13____________________________________________________________________*/
					
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
					
						for (int j = 1; j<7; j++) {
							String textField = a+j
									
							if (WebUI.verifyElementPresent(findTestObject(textField), 1) ==
								true) {
									WebUI.doubleClick(findTestObject(textField))
								
									maxlength = WebUI.getAttribute(findTestObject(textField), 'data-maxlength')
								
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
						}
							}
					/*________________________________________________________________________14____________________________________________________________________*/
						
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
						
							for (int j = 1; j<7; j++) {
								String textField = a+j
										
								if (WebUI.verifyElementPresent(findTestObject(textField), 1) ==
									true) {
										WebUI.doubleClick(findTestObject(textField))
									
										maxlength = WebUI.getAttribute(findTestObject(textField), 'data-maxlength')
									
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
							}
								}
						/*________________________________________________________________________15____________________________________________________________________*/
							