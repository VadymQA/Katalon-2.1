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

WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'))

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_1'))

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
        5)

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'), 
        5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
    }
    
    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'))

        WebUI.waitForPageLoad(5)

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
            5)

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

        WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'), 
            5)

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'))

        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
            5)

        WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
        }
        
        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_3'))

            WebUI.waitForPageLoad(5)

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                5)

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

            WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_3'), 
                5)

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'))

            WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                5)

            WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
            }
            
            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_4'))

                WebUI.waitForPageLoad(5)

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                    5)

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

                WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'), 
                    5)

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_4'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'))

                WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                    5)

                WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                }
                
                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_5'))

                    WebUI.waitForPageLoad(5)

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                        5)

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

                    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'), 
                        5)

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'))

                    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                        5)

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                        1) == true) {
                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                    }
                    
                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))
                }
            }
        }
    }
}

/*______________________________________________1_____________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'), 
    0) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'))

    WebUI.delay(0)
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'))

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
        5)

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_11'), 
        5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_11'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v11'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v11'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
    }
    
    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'))

        WebUI.waitForPageLoad(5)

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
            5)

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

        WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_12'), 
            5)

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_12'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v12'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v12'))

        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
            5)

        WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
        }
        
        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_3'))

            WebUI.waitForPageLoad(5)

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                5)

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

            WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_4'), 
                5)

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_4'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'))

            WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                5)

            WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
            }
            
            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_4'))

                WebUI.waitForPageLoad(5)

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                    5)

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

                WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'), 
                    5)

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'))

                WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                    5)

                WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                }
                
                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_5'))

                    WebUI.waitForPageLoad(5)

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                        5)

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

                    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_10'), 
                        5)

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_10'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v10'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v10'))

                    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                        5)

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                        1) == true) {
                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                    }
                    
                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))
                }
            }
        }
    }
}

/*______________________________________________2_____________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'), 
    0) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'))

    WebUI.delay(0)
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_1'))

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
        5)

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_6'), 
        5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_6'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v6'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v6'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
    }
    
    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_2'))

        WebUI.waitForPageLoad(5)

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
            5)

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

        WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_7'), 
            5)

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_7'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v7'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v7'))

        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
            5)

        WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
        }
        
        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_3'))

            WebUI.waitForPageLoad(5)

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                5)

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

            WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_8'), 
                5)

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_8'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v8'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v8'))

            WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                5)

            WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
            }
            
            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_4'))

                WebUI.waitForPageLoad(5)

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                    5)

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

                WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_9'), 
                    5)

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_9'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v9'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v9'))

                WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                    5)

                WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                }
                
                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
                    5)

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_5'))

                    WebUI.waitForPageLoad(5)

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                        5)

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_favorites'))

                    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_10'), 
                        5)

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_10'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v10'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v10'))

                    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                        5)

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                        1) == true) {
                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                    }
                    
                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))
                }
            }
        }
    }
}

/*______________________________________________3_____________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'), 
    0) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'))

    WebUI.delay(0)
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_1'))

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
        5)

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'), 
        5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
    }
    
    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
        5)

    WebUI.delay(2)

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_2'))

        WebUI.waitForPageLoad(5)

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
            5)

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

        WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'), 
            5)

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v2'))

        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
            5)

        WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
        }
        
        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_3'))

            WebUI.waitForPageLoad(5)

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                5)

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

            WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_3'), 
                5)

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v3'))

            WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                5)

            WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
            }
            
            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_4'))

                WebUI.waitForPageLoad(5)

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                    5)

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

                WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_4'), 
                    5)

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_4'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v4'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'))

                WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                    5)

                WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                }
                
                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_5'))

                    WebUI.waitForPageLoad(5)

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                        5)

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

                    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'), 
                        5)

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'))

                    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                        5)

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                        1) == true) {
                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                    }
                    
                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))
                }
            }
        }
    }
}

/*______________________________________________4_____________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'), 
    0) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'))

    WebUI.delay(0)
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_1'))

    WebUI.waitForPageLoad(5)

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
        5)

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_6'), 
        5)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_6'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v6'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v6'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
        5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
    }
    
    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_2'))

        WebUI.waitForPageLoad(5)

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
            5)

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

        WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_7'), 
            5)

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_7'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v7'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v7'))

        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
            5)

        WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
        }
        
        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_3'))

            WebUI.waitForPageLoad(5)

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                5)

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

            WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_8'), 
                5)

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_8'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v8'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v8'))

            WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                5)

            WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
            }
            
            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_4'))

                WebUI.waitForPageLoad(5)

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                    5)

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

                WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_9'), 
                    5)

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_9'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v9'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v9'))

                WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                    5)

                WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                }
                
                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'), 
                    5)

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_5'))

                    WebUI.waitForPageLoad(5)

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                        5)

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

                    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'), 
                        5)

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v5'))

                    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'), 
                        5)

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

                    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'), 
                        1) == true) {
                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_closeVideoAdding'))
                    }
                    
                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

					WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))
                }
            }
        }
    }
}

/*______________________________________________5_____________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'), 
    0) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'))

    WebUI.delay(0)
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))

