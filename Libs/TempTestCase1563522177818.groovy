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


RunConfiguration.setExecutionSettingFile('C:\\Users\\tester-3\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Scenes adding (15 scenes) if-else\\20190719_104257\\execution.properties')

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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://app3.reevio.com/editor/7822')

not_run: WebUI.acceptAlert()

not_run: WebUI.waitForPageLoad(1)

not_run: WebUI.click(findTestObject('Page_Reevio - Online Video Maker - Video Editor - Video Creator/a_Login'))

not_run: WebUI.click(findTestObject('Page_Login/form_Log in'))

not_run: WebUI.setEncryptedText(findTestObject('Page_Login/input_Log in_password'), 'QJRGRb5Kh1JVL6lDJsVMuw==')

not_run: WebUI.setText(findTestObject('Page_Login/input_Log in_email'), 'reevtest@gmail.com')

not_run: WebUI.click(findTestObject('Page_Login/button_Log in'))

not_run: WebUI.navigateToUrl('https://app3.reevio.com/editor/7822')

not_run: WebUI.waitForPageLoad(1)

'Go to scenes menu'
WebUI.click(findTestObject('Page_Reevio Video Maker/div_Add Scene'))

WebUI.waitForPageLoad(5)

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Go to editor_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Go to editor_add-scene-btn'), 4)

//WebUI.click(findTestObject('Page_Reevio Video Maker/li_Go to editor_add-scene-btn'))
WebUI.delay(2)

WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 1_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 1_add-scene-btn'), 4)

WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 1_add-scene-btn'))

WebUI.delay(1)

WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 2_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 2_add-scene-btn'), 4)

WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 2_add-scene-btn'))

WebUI.delay(1)

WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 3_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 3_add-scene-btn'), 4)

WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 3_add-scene-btn'))

WebUI.delay(1)

WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 4_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 4_add-scene-btn'), 4)

WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 4_add-scene-btn'))

WebUI.delay(1)

WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 5_overlay-AddScens'))

WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 5_add-scene-btn'), 4)

WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 5_add-scene-btn'))

WebUI.delay(1)

if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 6_overlay-AddScens'), 1) == true) {
    WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 6_overlay-AddScens'))

    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 6_add-scene-btn'), 5)

    WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 6_add-scene-btn'))

    WebUI.delay(1)

    if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 7_overlay-AddScens'), 1) == 
    true) {
        WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 7_overlay-AddScens'))

        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 7_add-scene-btn'), 5)

        WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 7_add-scene-btn'))

        WebUI.delay(1)

        if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 8_overlay-AddScens'), 
            1) == true) {
            WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 8_overlay-AddScens'))

            WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 8_add-scene-btn'), 5)

            WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 8_add-scene-btn'))

            WebUI.delay(1)

            if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 9_overlay-AddScens'), 
                1) == true) {
                WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 9_overlay-AddScens'))

                WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 9_add-scene-btn'), 5)

                WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 9_add-scene-btn'))

                WebUI.delay(1)

                if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 10_overlay-AddScens'), 
                    1) == true) {
                    WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 10_overlay-AddScens'))

                    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 10_add-scene-btn'), 5)

                    WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 10_add-scene-btn'))

                    WebUI.delay(1)

                    if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 11_overlay-AddScens'), 
                        1) == true) {
                        WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 11_overlay-AddScens'))

                        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 11_add-scene-btn'), 
                            5)

                        WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 11_add-scene-btn'))

                        WebUI.delay(1)

                        if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 12_overlay-AddScens'), 
                            1) == true) {
                            WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 12_overlay-AddScens'))

                            WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 12_add-scene-btn'), 
                                5)

                            WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 12_add-scene-btn'))

                            WebUI.delay(1)

                            if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 13_overlay-AddScens'), 
                                1) == true) {
                                WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 13_overlay-AddScens'))

                                WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 13_add-scene-btn'), 
                                    5)

                                WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 13_add-scene-btn'))

                                WebUI.delay(1)

                                if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 14_overlay-AddScens'), 
                                    1) == true) {
                                    WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 14_overlay-AddScens'))

                                    WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 14_add-scene-btn'), 
                                        5)

                                    WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 14_add-scene-btn'))

                                    WebUI.delay(1)

                                    if (WebUI.verifyElementVisibleInViewport(findTestObject('Page_Reevio Video Maker/div_Scene 15_overlay-AddScens'), 
                                        1) == true) {
                                        WebUI.focus(findTestObject('Page_Reevio Video Maker/div_Scene 15_overlay-AddScens'))

                                        WebUI.waitForElementVisible(findTestObject('Page_Reevio Video Maker/li_Scene 15_add-scene-btn'), 
                                            5)

                                        WebUI.click(findTestObject('Page_Reevio Video Maker/li_Scene 15_add-scene-btn'))

                                        WebUI.delay(1)

                                        WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
                                    } else {
                                        WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
                                    }
                                } else {
                                    WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
                                }
                            } else {
                                WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
                            }
                        } else {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
                        }
                    } else {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
                    }
                } else {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
                }
            } else {
                WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
            }
        } else {
            WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
        }
    } else {
        WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
    }
} else {
    WebUI.click(findTestObject('Page_Reevio Video Maker/a_Go to editor_back-right'))
}

''', 'Test Cases/Scenes adding (15 scenes) if-else', new TestCaseBinding('Test Cases/Scenes adding (15 scenes) if-else',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
