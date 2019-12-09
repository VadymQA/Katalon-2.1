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

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
        1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'))

    WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
        5)

    WebUI.delay(3)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

    WebUI.delay(2)

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_2'))

        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
            1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
            5)

        WebUI.delay(3)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

        WebUI.delay(2)

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_3'))

            WebUI.waitForPageLoad(5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

            WebUI.delay(1)

            WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                5)

            WebUI.delay(3)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

            WebUI.delay(2)

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_4'))

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                WebUI.delay(1)

                WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                    1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_4'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                    5)

                WebUI.delay(3)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_1_5'))

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                    WebUI.delay(1)

                    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                        1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                        5)

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                    WebUI.delay(2)
                } else {
                    WebUI.doubleClick(findTestObject('null'))
                }
            } else {
                WebUI.doubleClick(findTestObject('null'))
            }
        } else {
            WebUI.doubleClick(findTestObject('null'))
        }
    } else {
        WebUI.doubleClick(findTestObject('null'))
    }
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/*_____________________________________________________________________1sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
        1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_6'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v6'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v6'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
        5)

    WebUI.delay(3)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

    WebUI.delay(2)

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_2'))

        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
            1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_7'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
            5)

        WebUI.delay(3)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

        WebUI.delay(2)

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_3'))

            WebUI.waitForPageLoad(5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

            WebUI.delay(1)

            WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_8'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                5)

            WebUI.delay(3)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

            WebUI.delay(2)

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_4'))

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                WebUI.delay(1)

                WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                    1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_9'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                    5)

                WebUI.delay(3)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_2_5'))

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                    WebUI.delay(1)

                    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                        1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_10'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                        5)

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                    WebUI.delay(2)

                    WebUI.doubleClick(findTestObject('null'))
                } else {
                    WebUI.doubleClick(findTestObject('null'))
                }
            } else {
                WebUI.doubleClick(findTestObject('null'))
            }
        } else {
            WebUI.doubleClick(findTestObject('null'))
        }
    } else {
        WebUI.doubleClick(findTestObject('null'))
    }
} else {
    WebUI.doubleClick(findTestObject('null'))
}

WebUI.delay(0)

/*_____________________________________________________________________2sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
        1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_11'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
        5)

    WebUI.delay(3)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

    WebUI.delay(2)

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_2'))

        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
            1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_12'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
            5)

        WebUI.delay(3)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

        WebUI.delay(2)

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_3'))

            WebUI.waitForPageLoad(5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

            WebUI.delay(1)

            WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                5)

            WebUI.delay(3)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

            WebUI.delay(2)

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_4'))

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                WebUI.delay(1)

                WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                    1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_10'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                    5)

                WebUI.delay(3)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_3_5'))

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                    WebUI.delay(1)

                    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'), 
                        1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_2 (2 page photoLibrary)'))

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_4'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                        5)

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                    WebUI.delay(2)
                } else {
                    WebUI.doubleClick(findTestObject('null'))
                }
            } else {
                WebUI.doubleClick(findTestObject('null'))
            }
        } else {
            WebUI.doubleClick(findTestObject('null'))
        }
    } else {
        WebUI.doubleClick(findTestObject('null'))
    }
} else {
    WebUI.doubleClick(findTestObject('null'))
}

WebUI.delay(0)

/*_____________________________________________________________________3sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
        1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

    WebUI.delay(1)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
        5)

    WebUI.delay(3)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

    WebUI.delay(2)

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_2'))

        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
            1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
            5)

        WebUI.delay(3)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

        WebUI.delay(2)

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_3'))

            WebUI.waitForPageLoad(5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

            WebUI.delay(1)

            WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
                1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                5)

            WebUI.delay(3)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

            WebUI.delay(2)

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_4'))

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                WebUI.delay(1)

                WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
                    1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                    5)

                WebUI.delay(3)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_4_5'))

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                    WebUI.delay(1)

                    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
                        1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                        5)

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                    WebUI.delay(2)

                    WebUI.doubleClick(findTestObject('null'))
                } else {
                    WebUI.doubleClick(findTestObject('null'))
                }
            } else {
                WebUI.doubleClick(findTestObject('null'))
            }
        } else {
            WebUI.doubleClick(findTestObject('null'))
        }
    } else {
        WebUI.doubleClick(findTestObject('null'))
    }
} else {
    WebUI.doubleClick(findTestObject('null'))
}

/*_____________________________________________________________________4sc______________________________________________________*/
WebUI.delay(0)

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'), 
        1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

    WebUI.delay(1)

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
        5)

    WebUI.delay(3)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

    WebUI.delay(2)

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_2'))

        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'), 
            1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
            5)

        WebUI.delay(3)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

        WebUI.delay(2)

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_3'))

            WebUI.waitForPageLoad(5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

            WebUI.delay(1)

            WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'), 
                1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                5)

            WebUI.delay(3)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

            WebUI.delay(2)

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_4'))

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                WebUI.delay(1)

                WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'), 
                    1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                    5)

                WebUI.delay(3)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_5_5'))

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                    WebUI.delay(1)

                    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'), 
                        1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                        5)

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                    WebUI.delay(2)

                    WebUI.doubleClick(findTestObject('null'))
                } else {
                    WebUI.doubleClick(findTestObject('null'))
                }
            } else {
                WebUI.doubleClick(findTestObject('null'))
            }
        } else {
            WebUI.doubleClick(findTestObject('null'))
        }
    } else {
        WebUI.doubleClick(findTestObject('null'))
    }
} else {
    WebUI.doubleClick(findTestObject('null'))
}

