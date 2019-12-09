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
import com.kms.katalon.core.testobject.ConditionType


myNewObject = new TestObject("default Scene")

myNewObject.addProperty("xpath", ConditionType.EQUALS, '//*[@id="s-tools"]')

removeBtn = new TestObject("removeBtn")

removeBtn.addProperty("xpath", ConditionType.EQUALS, '//div[@class="popover-content"]//a[@class="delete_slide"]')

deleteBtn = new TestObject("deleteBtn")

deleteBtn.addProperty("xpath", ConditionType.EQUALS, '//a[@id="yes_delete"]')

for (int i = 1; i<20; i++) {

if (WebUI.verifyElementPresent(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'), 0) == true) {
	
	WebUI.doubleClick(findTestObject('Add video in placeholers/Video_img repository (videos, imgs and buttons)/Editor_Scene_1'))
	
	WebUI.click(myNewObject)
	
	Thread.sleep(200)
	
	WebUI.click(removeBtn)
	
	Thread.sleep(1200)
	
	WebUI.click(deleteBtn)
} else {
break
}

}

//*[@class='popover-content']//*[@class='delete_slide']