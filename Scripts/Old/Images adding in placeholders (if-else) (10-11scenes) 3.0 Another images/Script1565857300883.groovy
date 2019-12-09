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


WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'), 1) == true) {
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_1'),
	1) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_1'))

	WebUI.waitForPageLoad(5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

	WebUI.delay(1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

	WebUI.delay(1)

	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
		1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

	WebUI.delay(1)
	
	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'),
		0)

	WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'),
		5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
		5)

	WebUI.delay(3)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

	WebUI.delay(2)

	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_2'),
		1) == true) {
		WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_2'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

		WebUI.delay(1)

		WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
			1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
		
		WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'),
			0)

		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_2'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'),
			5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v2'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
			5)

		WebUI.delay(3)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

		WebUI.delay(2)

		if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_3'),
			1) == true) {
			WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_3'))

			WebUI.waitForPageLoad(5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

			WebUI.delay(1)

			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
				1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
			
			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'),
				0)

			WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_3'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'),
				5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v3'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
				5)

			WebUI.delay(3)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

			WebUI.delay(2)

			if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_4'),
				1) == true) {
				WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_4'))

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

				WebUI.delay(1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

				WebUI.delay(1)

				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
					1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
				
				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'),
					0)

				WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'),
					5)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
					5)

				WebUI.delay(3)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

				WebUI.delay(2)

				if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_5'),
					1) == true) {
					WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_5'))

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

					if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_6'),
						1) == true) {
						WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_6'))

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

						WebUI.delay(1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

						WebUI.delay(1)

						WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
							1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

						WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_6'))

						WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v6'),
							5)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v6'))

						WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
							5)

						WebUI.delay(3)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

						WebUI.delay(2)
					}
				}
			}
		}
	}
}
}
/*_____________________________________________________________________10sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'),
	0) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'))
}


WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'), 1) == true) {
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_1'), 
    1) == true) {
    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_1'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
        1)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_next (next page videoLibrary)'))
	

    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_12'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'), 
        5)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'))

    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
        5)

    WebUI.delay(3)

    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

    WebUI.delay(2)

    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_2'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_2'))

        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

        WebUI.delay(1)

        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
            1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_next (next page videoLibrary)'))

        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_7'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
            5)

        WebUI.delay(3)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

        WebUI.delay(2)

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_3'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_3'))

            WebUI.waitForPageLoad(5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

            WebUI.delay(1)

            WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
                1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
			
			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_next (next page videoLibrary)'))

            WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_8'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'), 
                5)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'))

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                5)

            WebUI.delay(3)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

            WebUI.delay(2)

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_4'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_4'))

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                WebUI.delay(1)

                WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
                    1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_next (next page videoLibrary)'))


                WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_9'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'), 
                    5)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'))

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                    5)

                WebUI.delay(3)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                WebUI.delay(2)

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_5'))

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                    WebUI.delay(1)

                    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
                        1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_next (next page videoLibrary)'))


                    WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_10'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'), 
                        5)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'))

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                        5)

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                    WebUI.delay(2)

                    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_6'), 
                        1) == true) {
                        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_6'))

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

                        WebUI.delay(1)

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_place'))

                        WebUI.delay(1)

                        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'), 
                            1)

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))
						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_next (next page videoLibrary)'))

                        WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_11'))

                        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'), 
                            5)

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'))

                        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'), 
                            5)

                        WebUI.delay(3)

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

                        WebUI.delay(2)
                    }
                }
            }
        }
    }
}
}
/*_____________________________________________________________________11sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'),
	0) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'))
}
