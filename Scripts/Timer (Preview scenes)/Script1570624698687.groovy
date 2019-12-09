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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


String sceneCore = "Page_Reevio Video Maker/Editor_Scene_"

Generate = new TestObject('Generate')

Generate.addProperty('xpath', ConditionType.EQUALS, "//*[@class='send_preview_to_render']", true)

inProcessing = new TestObject('inProcessing')

inProcessing.addProperty('xpath', ConditionType.EQUALS, "//*[@class='btn btn-confirm']", true)

error = new TestObject('error')

error.addProperty('xpath', ConditionType.EQUALS, "//*[@class='send_preview_to_render']", true)

for (int i = 1; i < 31; i++) {
	 
	 if (WebUI.verifyElementPresent((findTestObject(sceneCore+i)), 1) == true) {
	
		WebUI.doubleClick(findTestObject(sceneCore + i))
		
		WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/GeneratePreview'))
		
		WebUI.delay(1)
		
		WebUI.click(inProcessing)
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/ViewPreview'), 60)
		
	 } else {
	 break
	 }
}
