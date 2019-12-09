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

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'),
	1)==true) {

		WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))
		
		WebUI.waitForPageLoad(5)
		
		if (WebUI.verifyTextPresent("Filters & Sorting", true)) {
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
		
		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_7'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v7'),
			5)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v7'))
		
		WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
			5)
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
			10)
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
		} else {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
		}

	} else {
	WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
	}
/*_________________________________________________________7sc________________________________________________*/
	
	if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'),
		1)==true) {
	
WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyTextPresent("Filters & Sorting", true)) {

WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_8'))

WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v8'),
	5)

WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v8'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
	5)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
	10)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
}

		} else {
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
		}
/*_________________________________________________________8sc________________________________________________*/

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'),
	1)==true) {

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

if (WebUI.verifyTextPresent("Filters & Sorting", true)) {

WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))

WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_9'))

WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v9'),
	5)

WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v9'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
	5)

WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))

WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
	10)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
}
	} else {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
	}
	/*_________________________________________________________9sc________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'),
	1)==true) {

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

		if (WebUI.verifyTextPresent("Filters & Sorting", true)) {
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
		
		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_10'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v10'),
			5)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v10'))
		
		WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
			5)
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
			10)
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
		
	} else {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
	}
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
}
/*_________________________________________________________10sc________________________________________________*/

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'),
	1)==true) {

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

		if (WebUI.verifyTextPresent("Filters & Sorting", true)) {
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
		
		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_11'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v11'),
			5)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v11'))
		
		WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
			5)
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
			10)
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
		
	} else {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
	}
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
}
/*_________________________________________________________11sc________________________________________________*/

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'),
	1)==true) {

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

		if (WebUI.verifyTextPresent("Filters & Sorting", true)) {
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
		
		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_12'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v12'),
			5)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v12'))
		
		WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
			5)
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
			10)
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
		
	} else {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
	}
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
}
/*_________________________________________________________12sc________________________________________________*/

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'),
	1)==true) {

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

		if (WebUI.verifyTextPresent("Filters & Sorting", true)) {
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
		
		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_13'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v13'),
			5)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v13'))
		
		WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
			5)
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
			10)
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
		
	} else {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
	}
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
}
/*_________________________________________________________13sc________________________________________________*/

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'),
	1)==true) {

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

		if (WebUI.verifyTextPresent("Filters & Sorting", true)) {
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
		
		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_14'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v14'),
			5)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v14'))
		
		WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
			5)
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
			10)
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
		
	} else {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
	}
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
}
/*_________________________________________________________14sc________________________________________________*/

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'),
	1)==true) {

WebUI.click(findTestObject('Add video in placeholers/Video_img backgrounds/div_Background_video'))

WebUI.waitForPageLoad(5)

		if (WebUI.verifyTextPresent("Filters & Sorting", true)) {
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Label_My_uploads'))
		
		WebUI.focus(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/div_PREVIEW USE/div_PREVIEW USE_video_15'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v15'),
			5)
		
		WebUI.click(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Buttons/button_USE_v15'))
		
		WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'),
			5)
		
		WebUI.click(findTestObject('Page_Reevio Video Maker/Video adding/div__save-trim round-box continue'))
		
		WebUI.waitForElementVisible(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Video added_h4'),
			10)
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
		
	} else {
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
	}
} else {
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))
}
/*_________________________________________________________15sc________________________________________________*/