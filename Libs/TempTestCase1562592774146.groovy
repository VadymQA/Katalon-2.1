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


RunConfiguration.setExecutionSettingFile('C:\\Users\\tester-3\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Video adding (10 scenes)\\20190708_163254\\execution.properties')

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

not_run: WebUI.openBrowser('https://dev.reevio.com/auth/login')

not_run: WebUI.maximizeWindow()

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('Page_Login/form_Log in'))

not_run: WebUI.setEncryptedText(findTestObject('Page_Login/input_Log in_password'), 'QJRGRb5Kh1JVL6lDJsVMuw==')

not_run: WebUI.setText(findTestObject('Page_Login/input_Log in_email'), 'reevtest@gmail.com')

not_run: WebUI.click(findTestObject('Page_Login/button_Log in'))

not_run: WebUI.navigateToUrl('https://dev.reevio.com/editor/7824')

not_run: WebUI.waitForPageLoad(1)

'Go to scenes menu'
not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Add Scene'))

not_run: WebUI.waitForPageLoad(1)

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Go to editor_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Go to editor_add-scene-btn'), 
    5)

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 1_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Reevio general/li_Scene 1_add-scene-btn'), 5)

not_run: WebUI.click(findTestObject('Reevio general/li_Scene 1_add-scene-btn'))

not_run: WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Reevio general/div_Scene 2_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Reevio general/li_Scene 2_add-scene-btn'), 5)

not_run: WebUI.click(findTestObject('Reevio general/li_Scene 2_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 3_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 3_add-scene-btn'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 3_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 4_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 4_add-scene-btn'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 4_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 5_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 5_add-scene-btn'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 5_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 6_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 6_add-scene-btn'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 6_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 7_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 7_add-scene-btn'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 7_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementClickable(findTestObject('Reevio general/div_Scene 8_overlay-AddScens'), 5)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 8_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 8_add-scene-btn'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 8_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 9_overlay-AddScens'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 9_add-scene-btn'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 9_add-scene-btn'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/a_Close window_back-right'))

not_run: WebUI.waitForPageLoad(3)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

not_run: WebUI.waitForPageLoad(3)

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_First'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

not_run: WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

not_run: WebUI.delay(5)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_1 (1)'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

not_run: WebUI.waitForPageLoad(3)

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_2'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

not_run: WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

not_run: WebUI.delay(5)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_2 (1)'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

not_run: WebUI.waitForPageLoad(3)

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_3'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

not_run: WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

not_run: WebUI.delay(5)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_3 (1)'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

not_run: WebUI.waitForPageLoad(3)

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_4'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

not_run: WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

not_run: WebUI.delay(5)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_4 (1)'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

not_run: WebUI.waitForPageLoad(3)

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_5'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

not_run: WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

not_run: WebUI.delay(5)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_5 (1)'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

not_run: WebUI.waitForPageLoad(3)

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_Last'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

not_run: WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

not_run: WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

not_run: WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_6 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/input_Sport_cb5v'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Reevio general/img_Slide Preview_add_blue_border_7'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/img_2'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Remove_add_blue_border_8'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/img_2'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Remove_add_blue_border_9'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/img_2'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Reevio general/img_Slide Preview_add_blue_border'))

''', 'Test Cases/Video adding (10 scenes)', new TestCaseBinding('Test Cases/Video adding (10 scenes)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
