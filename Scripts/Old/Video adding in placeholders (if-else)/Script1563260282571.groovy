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

	WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'))

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_4'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.waitForElementPresent(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.waitForElementPresent(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'), 
        5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'))

    WebUI.waitForPageLoad(5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_3'))

    WebUI.waitForPageLoad(5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_4'))

    WebUI.waitForPageLoad(5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_3'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'))

    WebUI.waitForPageLoad(5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_3'))

    WebUI.waitForPageLoad(5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_1'))

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        10)

    WebUI.delay(2)

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'))

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        5)

    WebUI.delay(2)

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________1_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_4'), 
    1) == true) {
    WebUI.click(findTestObject('Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'))

    WebUI.click(findTestObject('Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'))

    WebUI.click(findTestObject('Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_3'))

    WebUI.click(findTestObject('Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_4'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_3'))
} else if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_3'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_3'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'))

    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________2_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_4'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________3_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_5'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________4_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_6'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________5_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_7'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________6_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_8'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________7_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_9'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________8_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_10'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/* _________________________________________________9_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Editor/a_Text 1'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 2'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 3'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 4'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 5'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Editor/a_Text 6'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Enable switcher'))

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else if (WebUI.verifyElementInViewport(findTestObject('null'), 1) == true) {
    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('null'))

    WebUI.doubleClick(findTestObject('null'))
} else {
    WebUI.doubleClick(findTestObject('null'))
}

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app3.reevio.com/editor/7829#')

WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/img'))

WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop'))

WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

