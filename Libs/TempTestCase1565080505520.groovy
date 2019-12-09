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


RunConfiguration.setExecutionSettingFile('C:\\Users\\tester-3\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Text Color Scene changing (if-else) 9-12sc\\20190806_113505\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_9'), 
    1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.1'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            '#00FFE1')

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                '#00FFE1')

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
                        } else {
                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'))
        }
    }
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
}

/*____________________________________________________________9sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_10'), 
    1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            '#00FFE1')

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                '#00FFE1')

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'))
                        } else {
                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'))
    }
}

/*________________________________________________________10sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_11'), 
    1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            '#00FFE1')

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                '#00FFE1')

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_12'))
                        } else {
                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_12'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_12'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_12'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_12'))
    }
}

/*________________________________________________________11sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_12'), 
    1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), '#00FFE1')

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            '#00FFE1')

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                '#00FFE1')

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_13'))
                        } else {
                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_13'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_13'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_13'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_13'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_13'))
    }
}

/*________________________________________________________12sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_13'), 
    1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                'vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                    'vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                        'vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                            'vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 13.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_14'))
                        } else {
                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_14'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_14'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_14'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_14'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_14'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
    }
}

/*________________________________________________________13sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_14'), 
    1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                'vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                    'vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                        'vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                            'vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 14.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_15'))
                        } else {
                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_15'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_15'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_15'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_15'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_15'))
    }
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
}

/*________________________________________________________14sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_15'), 
    1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                'vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                    'vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                        'vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData(
                            'vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 15.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
                        } else {
                            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
        }
    }
} else {
    WebUI.doubleClick(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))
}

/*________________________________________________________15sc___________________________________________________*/
WebUI.click(findTestObject('Object Repository/Page_Reevio Video Maker/Editor/TextFields/Editor_Scene_1'))

''', 'Test Cases/Text Color Scene changing (if-else) 9-12sc', new TestCaseBinding('Test Cases/Text Color Scene changing (if-else) 9-12sc',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
