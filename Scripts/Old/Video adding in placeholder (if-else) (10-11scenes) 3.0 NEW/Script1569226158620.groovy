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


	
WebUI.delay(0)

if (WebUI.verifyElementInViewport(findTestObject(findTestObject('Page_Reevio Video Maker/Editor_Scene_10')),
	1) == true) {

if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_1'),
	1) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_1'))

	WebUI.waitForPageLoad(5)

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'),
		5)

	WebUI.delay(1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

	WebUI.delay(1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'),
		0)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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

	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_2'),
		1) == true) {
		WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_2'))

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'),
			5)

		WebUI.delay(1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

		WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'),
			0)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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

		if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_3'),
			1) == true) {
			WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_3'))

			WebUI.waitForPageLoad(5)

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'),
				5)

			WebUI.delay(1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'),
				0)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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

			if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_4'),
				1) == true) {
				WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_4'))

				WebUI.waitForPageLoad(5)

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'),
					5)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

				WebUI.delay(1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'),
					0)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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

				if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_5'),
					1) == true) {
					WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_10_5'))

					WebUI.waitForPageLoad(5)

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'),
						5)

					WebUI.delay(1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

					WebUI.delay(1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

					WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'),
						0)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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
}

/*______________________________________________10_____________________________________________*/
	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'),
		0) ==true) {
WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'))
WebUI.delay(0)
}
	
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))

if (WebUI.verifyElementInViewport(findTestObject(findTestObject('Page_Reevio Video Maker/Editor_Scene_11')),
	1) == true) {
    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_1'), 
        1) == true) {
        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_1'))

        WebUI.waitForPageLoad(5)

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
            5)

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'), 
            0)

        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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

        if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_2'), 
            1) == true) {
            WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_2'))

            WebUI.waitForPageLoad(5)

            WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                5)

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

            WebUI.delay(1)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

            WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'), 
                0)

            WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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

            if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_3'), 
                1) == true) {
                WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_3'))

                WebUI.waitForPageLoad(5)

                WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                    5)

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                WebUI.delay(1)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

                WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'), 
                    0)

                WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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

                if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_4'))

                    WebUI.waitForPageLoad(5)

                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                        5)

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

                    WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'), 
                        0)

                    WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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
                    
                    WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'), 30)

    WebUI.click(findTestObject('Add video in placeholers/From recorder/OK_btn_successfully uploaded'))

                    if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_11_5'))

                        WebUI.waitForPageLoad(5)

                        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'), 
                            5)

                        WebUI.delay(1)

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label_Video'))

                        WebUI.delay(1)

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

                        WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'), 
                            0)

                        WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page videoLibrary)'))

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
}

/*______________________________________________7_____________________________________________*/
	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'),
		0) ==true) {
WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/pop-up_videoError'))
WebUI.delay(0)
}
	
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))

