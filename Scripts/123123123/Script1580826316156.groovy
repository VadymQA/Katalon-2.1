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

int p = 1

TestObject rightPart = new TestObject('data-target')

rightPart.addProperty('xpath', ConditionType.EQUALS, '//*[@class = "ui-slider-handle ui-corner-all ui-state-default slider-for-flex-trim handle_1"]/img[@class="toggle-time-tooltip"]', 
    true)


WebUI.dragAndDropByOffset(rightPart, 0, 250)
WebUI.delay(2)
WebUI.click(rightPart)
