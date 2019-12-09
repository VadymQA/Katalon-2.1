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

WebUI.openBrowser('https://dev.reevio.com/auth/login')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Login/form_Log in'))

WebUI.setEncryptedText(findTestObject('Page_Login/input_Log in_password'), 'QJRGRb5Kh1JVL6lDJsVMuw==')

WebUI.setText(findTestObject('Page_Login/input_Log in_email'), 'reevtest@gmail.com')

WebUI.click(findTestObject('Page_Login/button_Log in'))

WebUI.navigateToUrl('https://dev.reevio.com/editor/7824')

WebUI.waitForPageLoad(1)

'Go to scenes menu'
WebUI.click(findTestObject('Text Editor/div_Add Scene'))

WebUI.waitForPageLoad(1)

WebUI.delay(2)

WebUI.focus(findTestObject('Text Editor/div_Go to editor_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Text Editor/li_Go to editor_add-scene-btn'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('Text Editor/li_Go to editor_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Text Editor/div_Scene 1_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Text Editor/li_Scene 1_add-scene-btn'), 5)

WebUI.click(findTestObject('Text Editor/li_Scene 1_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Text Editor/div_Scene 2_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Text Editor/li_Scene 2_add-scene-btn'), 5)

WebUI.click(findTestObject('Text Editor/li_Scene 2_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Text Editor/div_Scene 3_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Text Editor/li_Scene 3_add-scene-btn'), 5)

WebUI.click(findTestObject('Text Editor/li_Scene 3_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Text Editor/div_Scene 4_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Text Editor/li_Scene 4_add-scene-btn'), 5)

WebUI.click(findTestObject('Text Editor/li_Scene 4_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Text Editor/div_Scene 5_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Text Editor/li_Scene 5_add-scene-btn'), 5)

WebUI.click(findTestObject('Text Editor/li_Scene 5_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Text Editor/div_Scene 6_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Text Editor/li_Scene 6_add-scene-btn'), 5)

WebUI.click(findTestObject('Text Editor/li_Scene 6_add-scene-btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Text Editor/img'))

WebUI.click(findTestObject('Text Editor/div_Close window_navbar-wrapper-scene clearfix'))

WebUI.click(findTestObject('Text Editor/a_Close window_back-right'))

WebUI.waitForPageLoad(5)

WebUI.doubleClick(findTestObject('Text Editor/img_Slide Preview_add_blue_border'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Text Editor/a_Text 1'))

WebUI.click(findTestObject('Text Editor/div_Enable text       Cancel Save  6  55'))

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Text Editor/span_Save'))

WebUI.doubleClick(findTestObject('null'))

WebUI.click(findTestObject('Text Editor/a_Text 1_2'))

WebUI.doubleClick(findTestObject('Text Editor/a_Text 1_3'))

WebUI.click(findTestObject('Text Editor/div_Enable text       Cancel Save  6  60'))

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Text Editor/span_Save'))

WebUI.click(findTestObject('Text Editor/a_The quick brown fox jumps over the lazy dog'))

WebUI.click(findTestObject('Text Editor/img_Remove_add_blue_border'))

WebUI.click(findTestObject('Text Editor/img_Slide Preview_add_blue_border_2'))

WebUI.click(findTestObject('Text Editor/img_Remove_add_blue_border'))

WebUI.click(findTestObject('Text Editor/a_Text 1_4'))

WebUI.click(findTestObject('Text Editor/a_Text 1_5'))

WebUI.doubleClick(findTestObject('Text Editor/a_Text 1_6'))

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Text Editor/span_Save'))

WebUI.click(findTestObject('Text Editor/img_Remove_add_blue_border_1'))

WebUI.click(findTestObject('Text Editor/a_Text 1_7'))

WebUI.doubleClick(findTestObject('Text Editor/a_Text 1_8'))

WebUI.click(findTestObject('Text Editor/div_Enable text       Cancel Save  6  45'))

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Text Editor/span_Save'))

WebUI.doubleClick(findTestObject('null'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Page_Reevio Video Maker/span_Save'))

WebUI.doubleClick(findTestObject('null'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Page_Reevio Video Maker/span_Save'))

WebUI.doubleClick(findTestObject('null'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Page_Reevio Video Maker/span_Save'))

WebUI.doubleClick(findTestObject('null'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1'))

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog')

WebUI.click(findTestObject('Page_Reevio Video Maker/span_Save'))

