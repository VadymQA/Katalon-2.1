import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.RenderingHints.Key as Key
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
import org.apache.xmlbeans.impl.xb.xsdschema.impl.MaxLengthDocumentImpl as MaxLengthDocumentImpl
import org.openqa.selenium.Keys as Keys

WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.1'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.2'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.3'))

           WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.4'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.6'))

                       WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
					   
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

/*__________________________________________________________1_____________________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.1'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.2'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.3'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
		   
            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.4'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.6'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

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

/*__________________________________________________________2_____________________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.1'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.2'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.3'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.4'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.6'))

                       WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

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

/*__________________________________________________________3_____________________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.1'))

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.2'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.3'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.4'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)
	
			   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'))

                   WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.6'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

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

