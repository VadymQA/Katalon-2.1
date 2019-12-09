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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.1'), 1) == true) {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.1'))

	maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.1'), 'data-maxlength')

	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
			1, 1))

	int maxL = ((maxlength) as Integer)

	int max30 = maxL * 0.3

	for (int i = 0; i < max30; ++i) {
		WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
				Keys.BACK_SPACE))
	}
	
	WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

	maxlength = 0

	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.2'), 1) == true) {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.2'))

		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.2'), 'data-maxlength')

		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
				'vavowDate').getValue(1, 1))

		maxL = ((maxlength) as Integer)

		max30 = (maxL * 0.3)

		for (int i = 0; i < max30; ++i) {
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
					Keys.BACK_SPACE))
		}
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		maxlength = 0

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.3'))

			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.3'),
				'data-maxlength')

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
					'vavowDate').getValue(1, 1))

			maxL = ((maxlength) as Integer)

			max30 = (maxL * 0.3)

			for (int i = 0; i < max30; ++i) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.4'))

				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.4'),
					'data-maxlength')

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
						'vavowDate').getValue(1, 1))

				maxL = ((maxlength) as Integer)

				for (int i = 0; i < max30; ++i) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						Keys.chord(Keys.BACK_SPACE))
				}
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'))

					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'),
						'data-maxlength')

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						findTestData('vavowDate').getValue(1, 1))

					maxL = ((maxlength) as Integer)

					for (int i = 0; i < max30; ++i) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					}
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.6'))

						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'),
							'data-maxlength')

						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							findTestData('vavowDate').getValue(1, 1))

						maxL = ((maxlength) as Integer)

						for (int i = 0; i < max30; ++i) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						}
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

					}
				}
			}
		}
	}
}
/*__________________________________________________________6_____________________________________________________________*/

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.1'), 1) == true) {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.1'))

	maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.1'), 'data-maxlength')

	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
			1, 1))

	int maxL = ((maxlength) as Integer)

	int max30 = maxL * 0.3

	for (int i = 0; i < max30; ++i) {
		WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
				Keys.BACK_SPACE))
	}
	
	WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

	maxlength = 0

	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.2'), 1) == true) {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.2'))

		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.2'), 'data-maxlength')

		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
				'vavowDate').getValue(1, 1))

		maxL = ((maxlength) as Integer)

		max30 = (maxL * 0.3)

		for (int i = 0; i < max30; ++i) {
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
					Keys.BACK_SPACE))
		}
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		maxlength = 0

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.3'))

			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.3'),
				'data-maxlength')

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
					'vavowDate').getValue(1, 1))

			maxL = ((maxlength) as Integer)

			max30 = (maxL * 0.3)

			for (int i = 0; i < max30; ++i) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.4'))

				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.4'),
					'data-maxlength')

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
						'vavowDate').getValue(1, 1))

				maxL = ((maxlength) as Integer)

				for (int i = 0; i < max30; ++i) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						Keys.chord(Keys.BACK_SPACE))
				}
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'))

					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'),
						'data-maxlength')

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						findTestData('vavowDate').getValue(1, 1))

					maxL = ((maxlength) as Integer)

					for (int i = 0; i < max30; ++i) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					}
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.6'))

						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'),
							'data-maxlength')

						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							findTestData('vavowDate').getValue(1, 1))

						maxL = ((maxlength) as Integer)

						for (int i = 0; i < max30; ++i) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						}
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

					}
				}
			}
		}
	}
}
/*__________________________________________________________7_____________________________________________________________*/

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.1'), 1) == true) {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.1'))

	maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.1'), 'data-maxlength')

	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
			1, 1))

	int maxL = ((maxlength) as Integer)

	int max30 = maxL * 0.3

	for (int i = 0; i < max30; ++i) {
		WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
				Keys.BACK_SPACE))
	}
	
	WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

	maxlength = 0

	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.2'), 1) == true) {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.2'))

		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.2'), 'data-maxlength')

		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
				'vavowDate').getValue(1, 1))

		maxL = ((maxlength) as Integer)

		max30 = (maxL * 0.3)

		for (int i = 0; i < max30; ++i) {
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
					Keys.BACK_SPACE))
		}
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		maxlength = 0

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.3'))

			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.3'),
				'data-maxlength')

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
					'vavowDate').getValue(1, 1))

			maxL = ((maxlength) as Integer)

			max30 = (maxL * 0.3)

			for (int i = 0; i < max30; ++i) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.4'))

				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.4'),
					'data-maxlength')

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
						'vavowDate').getValue(1, 1))

				maxL = ((maxlength) as Integer)

				for (int i = 0; i < max30; ++i) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						Keys.chord(Keys.BACK_SPACE))
				}
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'))

					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'),
						'data-maxlength')

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						findTestData('vavowDate').getValue(1, 1))

					maxL = ((maxlength) as Integer)

					for (int i = 0; i < max30; ++i) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					}
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.6'))

						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'),
							'data-maxlength')

						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							findTestData('vavowDate').getValue(1, 1))

						maxL = ((maxlength) as Integer)

						for (int i = 0; i < max30; ++i) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						}
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

					}
				}
			}
		}
	}
}
/*__________________________________________________________8_____________________________________________________________*/

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.1'), 1) == true) {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.1'))

	maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.1'), 'data-maxlength')

	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
			1, 1))

	int maxL = ((maxlength) as Integer)

	int max30 = maxL * 0.3

	for (int i = 0; i < max30; ++i) {
		WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
				Keys.BACK_SPACE))
	}
	
	WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

	maxlength = 0

	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.2'), 1) == true) {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.2'))

		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.2'), 'data-maxlength')

		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
				'vavowDate').getValue(1, 1))

		maxL = ((maxlength) as Integer)

		max30 = (maxL * 0.3)

		for (int i = 0; i < max30; ++i) {
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
					Keys.BACK_SPACE))
		}
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		maxlength = 0

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.3'))

			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.3'),
				'data-maxlength')

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
					'vavowDate').getValue(1, 1))

			maxL = ((maxlength) as Integer)

			max30 = (maxL * 0.3)

			for (int i = 0; i < max30; ++i) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.4'))

				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.4'),
					'data-maxlength')

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
						'vavowDate').getValue(1, 1))

				maxL = ((maxlength) as Integer)

				for (int i = 0; i < max30; ++i) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						Keys.chord(Keys.BACK_SPACE))
				}
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'))

					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'),
						'data-maxlength')

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						findTestData('vavowDate').getValue(1, 1))

					maxL = ((maxlength) as Integer)

					for (int i = 0; i < max30; ++i) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					}
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.6'))

						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'),
							'data-maxlength')

						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							findTestData('vavowDate').getValue(1, 1))

						maxL = ((maxlength) as Integer)

						for (int i = 0; i < max30; ++i) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						}
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

					}
				}
			}
		}
	}
}
/*__________________________________________________________9_____________________________________________________________*/

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.1'), 1) == true) {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.1'))

	maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.1'), 'data-maxlength')

	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
			1, 1))

	int maxL = ((maxlength) as Integer)

	int max30 = maxL * 0.3

	for (int i = 0; i < max30; ++i) {
		WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
				Keys.BACK_SPACE))
	}
	
	WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

	maxlength = 0

	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.2'), 1) == true) {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.2'))

		maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.2'), 'data-maxlength')

		WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
				'vavowDate').getValue(1, 1))

		maxL = ((maxlength) as Integer)

		max30 = (maxL * 0.3)

		for (int i = 0; i < max30; ++i) {
			WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
					Keys.BACK_SPACE))
		}
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		maxlength = 0

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.3'))

			maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.3'),
				'data-maxlength')

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
					'vavowDate').getValue(1, 1))

			maxL = ((maxlength) as Integer)

			max30 = (maxL * 0.3)

			for (int i = 0; i < max30; ++i) {
				WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
						Keys.BACK_SPACE))
			}
			
			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			maxlength = 0

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.4'))

				maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.4'),
					'data-maxlength')

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
						'vavowDate').getValue(1, 1))

				maxL = ((maxlength) as Integer)

				for (int i = 0; i < max30; ++i) {
					WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						Keys.chord(Keys.BACK_SPACE))
				}
				
				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				maxlength = 0

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'))

					maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'),
						'data-maxlength')

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
						findTestData('vavowDate').getValue(1, 1))

					maxL = ((maxlength) as Integer)

					for (int i = 0; i < max30; ++i) {
						WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							Keys.chord(Keys.BACK_SPACE))
					}
					
					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					maxlength = 0

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.6'))

						maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'),
							'data-maxlength')

						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
							findTestData('vavowDate').getValue(1, 1))

						maxL = ((maxlength) as Integer)

						for (int i = 0; i < max30; ++i) {
							WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'),
								Keys.chord(Keys.BACK_SPACE))
						}
						
						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

						maxlength = 0

					}
				}
			}
		}
	}
}
/*__________________________________________________________10_____________________________________________________________*/