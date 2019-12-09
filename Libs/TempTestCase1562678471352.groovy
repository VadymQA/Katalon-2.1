import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\tester-3\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Filling placeholders\\20190709_162111\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_1 (1)'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_2 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_3 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_4 (1)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_5 (1)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_6 (1)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_7 (1)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_8 (1)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border_9 (1)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/img_Slide Preview_add_blue_border'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_1_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/Enable switcher'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Span Textfield 1_2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Span TextField 1_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_2_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_2_2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_2_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_3_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_3_2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_3_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_4_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_4_2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_4_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_5_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_5_2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_5_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_6_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_6_2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_6_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_7_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_7_2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/TextFields/Div TextField Scene_7_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 'The quick brown fox jumps over the lazy dog.')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save - Copy'))

''', 'Test Cases/Filling placeholders', new TestCaseBinding('Test Cases/Filling placeholders',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
