import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\tester-3\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Text disable (if else)\\20190717_133200\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))

if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 0) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_2'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 0) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_2'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 0) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_2'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_2'))
}

/* _________________________________________________1_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 0) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_3'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 0) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_3'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 0) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_3'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_3'))
}

/* _________________________________________________2_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_4'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_4'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_4'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_4'))
}

/* _________________________________________________3_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_5'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_5'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_5'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_5'))
}

/* _________________________________________________4_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_6'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_6'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_6'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_6'))
}

/* _________________________________________________5_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_7'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_7'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_7'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_7'))
}

/* _________________________________________________6_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_8'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_8'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_8'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_8'))
}

/* _________________________________________________7_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_9'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_9'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_9'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_9'))
}

/* _________________________________________________8_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
}

/* _________________________________________________9_____________________________________________________________*/
if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 5'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 6'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 3'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 4'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
} else if (WebUI.verifyElementInViewport(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 1'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/a_Text 2'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Enable switcher'))

    WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/span_Save - Copy'))

    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
}

''', 'Test Cases/Text disable (if else)', new TestCaseBinding('Test Cases/Text disable (if else)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
