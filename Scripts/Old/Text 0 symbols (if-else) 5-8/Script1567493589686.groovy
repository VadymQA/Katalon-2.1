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
import org.apache.xmlbeans.impl.xb.xsdschema.impl.MaxLengthDocumentImpl
import org.openqa.selenium.Keys as Keys


WebUI.delay(0)

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'), 0) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.1'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.1'))

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.2'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.2'))

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.3'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.3'))

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.4'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.4'))

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'))

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.6'), 
                            1) == true) {
                            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.6'))

                            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

							WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

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
}
/*__________________________________________________________5_____________________________________________________________*/


if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_6'), 0) == true) {
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.1'), 1) == true) {
	
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.1'))
	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
		  
		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.2'), 1) == true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.2'))
			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.3'))

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.4'))

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.5'))

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6.6'))
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
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
}
/*__________________________________________________________6_____________________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'), 0) == true) {
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.1'), 1) == true) {
	
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.1'))
	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
		  
		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.2'), 1) == true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.2'))
			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.3'))

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.4'))

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.5'))

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 7.6'))
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
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
}
/*__________________________________________________________7_____________________________________________________________*/
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'), 0) == true) {
if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.1'), 1) == true) {
	
	WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.1'))
	WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
		  
		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.2'), 1) == true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.2'))
			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

		   WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

		if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.3'), 1) ==
		true) {
			WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.3'))

			WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

			if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.4'),
				1) == true) {
				WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.4'))

				WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

				if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'),
					1) == true) {
					WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.5'))

					WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

					WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

					if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.6'),
						1) == true) {
						WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 8.6'))
						WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

						WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
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
}
/*__________________________________________________________8_____________________________________________________________*/