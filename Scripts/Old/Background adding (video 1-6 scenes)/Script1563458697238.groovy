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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        10)

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
} else {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
}

/*________________________________________________________________1sc_____________________________________________________*/
WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        10)

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
} else {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
}

/*________________________________________________________________2sc_____________________________________________________*/
WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_3'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        10)

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
} else {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
}

/*________________________________________________________________3sc_____________________________________________________*/
WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_4'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        10)

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
} else {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
}

/*________________________________________________________________4sc_____________________________________________________*/
WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        10)

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
} else {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
}

/*________________________________________________________________5sc_____________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'), 1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

    WebUI.waitForPageLoad(5)

    if (WebUI.verifyTextPresent('Filters & Sorting', true)) {
        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_6'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v6'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v6'))

        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
            5)

        WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
            10)

        WebUI.delay(2)

        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
    }
} else {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
}

