import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.apache.commons.lang3.time.StopWatch as StopWatch
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.TimeUnit as TimeUnit
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.waitForPageLoad(1)

'Go to scenes menu'
WebUI.click(findTestObject('Add video in placeholers/From recorder/img_add_scenes'))

WebUI.waitForPageLoad(5)

WebUI.delay(1)

for (int i = 1; i < 12; i++) {
    Thread.sleep(500)

    if (WebUI.verifyElementVisibleInViewport(findTestObject('Add video in placeholers/From recorder/Scenes_adding/div_Scene ' + 
            i), 1) == true) {
        WebUI.focus(findTestObject('Add video in placeholers/From recorder/Scenes_adding/div_Scene ' + i))

        WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/Scenes_adding/li__Scene_' + i), 
            5)

        WebUI.click(findTestObject('Add video in placeholers/From recorder/Scenes_adding/li__Scene_' + i))
		
		Thread.sleep(200)
    } else {
        break
    }
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Add video in placeholers/From recorder/2ndPageAddingScenes'),
	1) == false) {
	WebUI.scrollToElement(findTestObject('Add video in placeholers/From recorder/2ndPageAddingScenes'), 1)
	
	WebUI.delay(3)

	WebUI.click(findTestObject('Object Repository/Add video in placeholers/From recorder/2ndPageAddingScenes'))
	
	WebUI.delay(1)

	for (int i = 1; i < 16; i++) {
		WebUI.delay(1)

		if (WebUI.verifyElementVisibleInViewport(findTestObject('Add video in placeholers/From recorder/Scenes_adding/div_Scene ' +
				i), 1) == true) {
			WebUI.focus(findTestObject('Add video in placeholers/From recorder/Scenes_adding/div_Scene ' + i))

			WebUI.waitForElementVisible(findTestObject('Add video in placeholers/From recorder/Scenes_adding/li__Scene_' +
					i), 5)

			WebUI.click(findTestObject('Add video in placeholers/From recorder/Scenes_adding/li__Scene_' + i))
		} else {
			break
		}
	}
}

WebUI.delay(3)

WebUI.click(findTestObject('Add video in placeholers/From recorder/img_1_close_adding_scenes'))

WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'))

