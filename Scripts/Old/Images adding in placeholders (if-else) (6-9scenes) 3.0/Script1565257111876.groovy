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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'), 1) == true) {
if (WebUI.verifyElementVisible(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_1')) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_1'))

	WebUI.waitForPageLoad(5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

	WebUI.delay(1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

	WebUI.delay(1)

	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'),
		1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))
	
	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_7'),
		0)

	WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_7'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'),
		5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'))

	WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
		5)

	WebUI.delay(3)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

	WebUI.delay(2)

	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_2'),
		1) == true) {
		WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_2'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

		WebUI.delay(1)

		WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'),
			1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_8'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'),
			5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
			5)

		WebUI.delay(3)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

		WebUI.delay(2)

		if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_3'),
			1) == true) {
			WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_3'))

			WebUI.waitForPageLoad(5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

			WebUI.delay(1)

			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'),
				1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))
			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_9'),
				0)

			WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_9'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'),
				5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
				5)

			WebUI.delay(3)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

			WebUI.delay(2)

			if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_4'),
				1) == true) {
				WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_4'))

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

				WebUI.delay(1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

				WebUI.delay(1)

				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'),
					1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))
				
				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_11'),
					0)

				WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_11'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'),
					5)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
					5)

				WebUI.delay(3)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

				WebUI.delay(2)

				if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_5'),
					1) == true) {
					WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_5'))

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

					WebUI.delay(1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

					WebUI.delay(1)

					WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'),
						1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

					WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_12'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'),
						5)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
						5)

					WebUI.delay(3)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

					WebUI.delay(2)

					if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_6'),
						1) == true) {
						WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_6_6'))

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

						WebUI.delay(1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

						WebUI.delay(1)

						WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'),
							1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_3 (3 page photoLibrary)'))

						WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_10'))

						WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'),
							5)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'))

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
/*_____________________________________________________________________6sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'),
	0) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'))
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'), 1) == true) {
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_1'),
	1) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_1'))

	WebUI.waitForPageLoad(5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

	WebUI.delay(1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

	WebUI.delay(1)

	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
		1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

	WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_12'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'),
		5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
		5)

	WebUI.delay(3)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

	WebUI.delay(2)

	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_2'),
		1) == true) {
		WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_2'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

		WebUI.delay(1)

		WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
			1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_7'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'),
			5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
			5)

		WebUI.delay(3)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

		WebUI.delay(2)

		if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_3'),
			1) == true) {
			WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_3'))

			WebUI.waitForPageLoad(5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

			WebUI.delay(1)

			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
				1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

			WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_8'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'),
				5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
				5)

			WebUI.delay(3)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

			WebUI.delay(2)

			if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_4'),
				1) == true) {
				WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_4'))

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

				WebUI.delay(1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

				WebUI.delay(1)

				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
					1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

				WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_9'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'),
					5)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
					5)

				WebUI.delay(3)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

				WebUI.delay(2)

				if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_5'),
					1) == true) {
					WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_5'))

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

					WebUI.delay(1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

					WebUI.delay(1)

					WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
						1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

					WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_10'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'),
						5)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
						5)

					WebUI.delay(3)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

					WebUI.delay(2)

					if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_6'),
						1) == true) {
						WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_7_6'))

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

						WebUI.delay(1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

						WebUI.delay(1)

						WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
							1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

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
/*_____________________________________________________________________7sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'),
	0) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'))
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'), 1) == true) {
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_1'),
	1) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_1'))

	WebUI.waitForPageLoad(5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

	WebUI.delay(1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

	WebUI.delay(1)

	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
		1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'),
		0)

	WebUI.mouseOver(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'),
		5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
		5)

	WebUI.delay(3)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

	WebUI.delay(2)

	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_2'),
		1) == true) {
		WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_2'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

		WebUI.delay(1)

		WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
			1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

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

		if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_3'),
			1) == true) {
			WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_3'))

			WebUI.waitForPageLoad(5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

			WebUI.delay(1)

			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
				1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))
			
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

			if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_4'),
				1) == true) {
				WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_4'))

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

				WebUI.delay(1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

				WebUI.delay(1)

				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
					1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))
				
				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_1'),
					0)

				WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_4'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'),
					5)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v4'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
					5)

				WebUI.delay(3)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

				WebUI.delay(2)

				if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_5'),
					1) == true) {
					WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_5'))

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

					WebUI.delay(1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

					WebUI.delay(1)

					WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
						1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

					WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_5'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'),
						5)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v5'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
						5)

					WebUI.delay(3)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

					WebUI.delay(2)

					if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_6'),
						1) == true) {
						WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_8_6'))

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

						WebUI.delay(1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

						WebUI.delay(1)

						WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'),
							1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_4 (4 page photoLibrary)'))

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
/*_____________________________________________________________________8sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'),
	0) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'))
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'), 1) == true) {
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_1'),
	1) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_1'))

	WebUI.waitForPageLoad(5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

	WebUI.delay(1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

	WebUI.delay(1)

	WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
		1)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

	WebUI.delay(1)

	WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_7'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'),
		5)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v7'))

	WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
		5)

	WebUI.delay(3)

	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

	WebUI.delay(2)

	if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_2'),
		1) == true) {
		WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_2'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

		WebUI.delay(1)

		WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
			1)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_8'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'),
			5)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v8'))

		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
			5)

		WebUI.delay(3)

		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

		WebUI.delay(2)

		if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_3'),
			1) == true) {
			WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_3'))

			WebUI.waitForPageLoad(5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

			WebUI.delay(1)

			WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
				1)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

			WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_9'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'),
				5)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v9'))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
				5)

			WebUI.delay(3)

			WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

			WebUI.delay(2)

			if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_4'),
				1) == true) {
				WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_4'))

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

				WebUI.delay(1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

				WebUI.delay(1)

				WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
					1)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

				WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_10'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v1-'),
					5)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v10'))

				WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
					5)

				WebUI.delay(3)

				WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

				WebUI.delay(2)

				if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_5'),
					1) == true) {
					WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_5'))

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

					WebUI.delay(1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

					WebUI.delay(1)

					WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
						1)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

					WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_11'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'),
						5)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v11'))

					WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'),
						5)

					WebUI.delay(3)

					WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_Continue'))

					WebUI.delay(2)

					if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_6'),
						1) == true) {
						WebUI.click(findTestObject('Add video in placeholers/Placeholders/div_Add media here_uploded-pic frame_mixed ui-droppable remove_image_drop_9_6'))

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_resetAllCategorisInLibrary'))

						WebUI.delay(1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/label__for_img_architecture'))

						WebUI.delay(1)

						WebUI.scrollToElement(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'),
							1)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/a_5 (5 page photoLibrary)'))

						WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_photo-library/photo_library_12'))

						WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'),
							5)

						WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/photoButtons/photoButton_USE_v12'))

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
/*_____________________________________________________________________9sc______________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'),
	0) == true) {
	WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div__save_Cancel (photo-library)'))
}

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))


