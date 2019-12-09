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

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'), 1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.1'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 9.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))
        }
    }
}

/*____________________________________________________________9sc___________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'), 1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 10.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))
    }
}

/*________________________________________________________10sc___________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'), 1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 11.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))
    }
}

/*________________________________________________________11sc___________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'), 1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.1'), 1) == 
    true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 12.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))
    }
}

