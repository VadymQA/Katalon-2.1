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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'), 1) == true) {
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

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))
    }
}

/*________________________________________________________13sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'), 1) == true) {
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

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))
    }
}

/*________________________________________________________14sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'), 1) == true) {
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
}

