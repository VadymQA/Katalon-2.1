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
WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Add Scene'))

WebUI.waitForPageLoad(1)

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Go to editor_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Go to editor_add-scene-btn'), 
    5)

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 1_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('null'), 5)

WebUI.click(findTestObject('null'))

WebUI.delay(1)

WebUI.focus(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 5)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 3_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 3_add-scene-btn'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 3_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 4_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 4_add-scene-btn'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 4_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 5_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 5_add-scene-btn'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 5_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 6_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 6_add-scene-btn'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 6_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 7_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 7_add-scene-btn'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 7_add-scene-btn'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('null'), 5)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 8_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 8_add-scene-btn'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 8_add-scene-btn'))

WebUI.delay(2)

WebUI.focus(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/div_Scene 9_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 9_add-scene-btn'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/li_Scene 9_add-scene-btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img'))

WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/a_Close window_back-right'))

WebUI.waitForPageLoad(3)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_First'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_1 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_2'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_2 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_3'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_3 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_4'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_4 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_5'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_5 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_Last'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Video adding/img_Slide Preview_add_blue_border_6 (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/input_Sport_cb5v'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_1'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/div_PREVIEW USE (video checking)'))

WebUI.mouseOver(findTestObject('Video adding/div_PREVIEW USE (video checking)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/button_USE (video adding)'))

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('null'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/Div_video_background'))

WebUI.waitForPageLoad(3)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/input_Sport_cb5v'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_1'))

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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/input_Sport_cb5v'))

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/a_1'))

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

WebUI.doubleClick(findTestObject('null'))

