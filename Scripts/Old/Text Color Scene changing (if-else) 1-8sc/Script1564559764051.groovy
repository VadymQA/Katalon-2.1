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


WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.1'), 1) == true) {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.1'))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))
	


    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.2'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.2'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.3'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.3'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.4'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.4'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.6'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.6'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))
}

/*____________________________________________________________1sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.1'), 1) == true) {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.1'))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.2'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.2'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.3'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.3'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.4'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.4'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.6'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.6'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))
}

/*____________________________________________________________2sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.1'), 1) == true) {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.1'))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.2'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.2'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.3'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.3'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.4'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.4'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.6'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.6'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))
}

/*____________________________________________________________3sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.1'), 1) == true) {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.1'))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.2'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.2'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.3'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.3'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.4'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.4'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.6'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.6'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))
}

/*____________________________________________________________4sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.1'), 1) == true) {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.1'))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.2'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.2'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.3'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.3'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.4'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.4'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.6'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.6'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))
}

/*____________________________________________________________5sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'), 1) == true) {
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.1'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))
}

/*____________________________________________________________6sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'), 1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.1'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))
}

/*____________________________________________________________7sc___________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'), 1) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.1'), 1) == true) {
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.1'))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.2'), 1) == 
        true) {
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.2'))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.3'), 
                1) == true) {
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.3'))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.4'), 
                    1) == true) {
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.4'))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), findTestData('vavowDate').getValue(2, 1))

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'), 
                        1) == true) {
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                            findTestData('vavowDate').getValue(2, 1))

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.6'), 
                            1) == true) {
                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.6'))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/span_Shadows Into Light_minicolors-swatch-color'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'))

                            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Color/input_RGB_texthex-color'), 
                                findTestData('vavowDate').getValue(2, 1))

                            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Color/button_Apply'))

                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
                        } else {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
                        }
                    } else {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
                    }
                } else {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
                }
            } else {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
            }
        } else {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
        }
    } else {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
    }
} else {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))
}

