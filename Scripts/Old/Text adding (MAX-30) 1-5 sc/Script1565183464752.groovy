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

    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.1'), 'data-maxlength')

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
            1, 1))

    int maxL = ((maxlength) as Integer)

    int max30 = maxL * 0.3

    for (int i = 0; i < max30; ++i) {
        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                Keys.BACK_SPACE))
    }
    
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    maxlength = 0

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.2'))

        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.2'), 'data-maxlength')

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                'vavowDate').getValue(1, 1))

        maxL = ((maxlength) as Integer)

        max30 = (maxL * 0.3)

        for (int i = 0; i < max30; ++i) {
            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                    Keys.BACK_SPACE))
        }
        
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        maxlength = 0

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.3'))

            maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.3'), 
                'data-maxlength')

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                    'vavowDate').getValue(1, 1))

            maxL = ((maxlength) as Integer)

            max30 = (maxL * 0.3)

            for (int i = 0; i < max30; ++i) {
                WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                        Keys.BACK_SPACE))
            }
            
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.4'))

                maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.4'), 
                    'data-maxlength')

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                        'vavowDate').getValue(1, 1))

                maxL = ((maxlength) as Integer)

                for (int i = 0; i < max30; ++i) {
                    WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        Keys.chord(Keys.BACK_SPACE))
                }
                
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'))

                    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'), 
                        'data-maxlength')

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        FailureHandling.CONTINUE_ON_FAILURE)

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        findTestData('vavowDate').getValue(1, 1))

                    maxL = ((maxlength) as Integer)

                    for (int i = 0; i < max30; ++i) {
                        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            Keys.chord(Keys.BACK_SPACE))
                    }
                    
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.6'))

                        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1.5'), 
                            'data-maxlength')

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            FailureHandling.CONTINUE_ON_FAILURE)

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            findTestData('vavowDate').getValue(1, 1))

                        maxL = ((maxlength) as Integer)

                        for (int i = 0; i < max30; ++i) {
                            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                                Keys.chord(Keys.BACK_SPACE))
                        }
                        
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0
                    }
                }
            }
        }
    }
}

/*__________________________________________________________1_____________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_2'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.1'))

    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.1'), 'data-maxlength')

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
            1, 1))

    int maxL = ((maxlength) as Integer)

    int max30 = maxL * 0.3

    for (int i = 0; i < max30; ++i) {
        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                Keys.BACK_SPACE))
    }
    
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    maxlength = 0

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.2'))

        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.2'), 'data-maxlength')

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                'vavowDate').getValue(1, 1))

        maxL = ((maxlength) as Integer)

        max30 = (maxL * 0.3)

        for (int i = 0; i < max30; ++i) {
            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                    Keys.BACK_SPACE))
        }
        
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        maxlength = 0

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.3'))

            maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.3'), 
                'data-maxlength')

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                    'vavowDate').getValue(1, 1))

            maxL = ((maxlength) as Integer)

            max30 = (maxL * 0.3)

            for (int i = 0; i < max30; ++i) {
                WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                        Keys.BACK_SPACE))
            }
            
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.4'))

                maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.4'), 
                    'data-maxlength')

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                        'vavowDate').getValue(1, 1))

                maxL = ((maxlength) as Integer)

                for (int i = 0; i < max30; ++i) {
                    WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        Keys.chord(Keys.BACK_SPACE))
                }
                
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'))

                    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'), 
                        'data-maxlength')

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        FailureHandling.CONTINUE_ON_FAILURE)

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        findTestData('vavowDate').getValue(1, 1))

                    maxL = ((maxlength) as Integer)

                    for (int i = 0; i < max30; ++i) {
                        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            Keys.chord(Keys.BACK_SPACE))
                    }
                    
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.6'))

                        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 2.5'), 
                            'data-maxlength')

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            FailureHandling.CONTINUE_ON_FAILURE)

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            findTestData('vavowDate').getValue(1, 1))

                        maxL = ((maxlength) as Integer)

                        for (int i = 0; i < max30; ++i) {
                            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                                Keys.chord(Keys.BACK_SPACE))
                        }
                        
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0
                    }
                }
            }
        }
    }
}

/*__________________________________________________________2_____________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_3'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.1'))

    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.1'), 'data-maxlength')

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
            1, 1))

    int maxL = ((maxlength) as Integer)

    int max30 = maxL * 0.3

    for (int i = 0; i < max30; ++i) {
        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                Keys.BACK_SPACE))
    }
    
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    maxlength = 0

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.2'))

        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.2'), 'data-maxlength')

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                'vavowDate').getValue(1, 1))

        maxL = ((maxlength) as Integer)

        max30 = (maxL * 0.3)

        for (int i = 0; i < max30; ++i) {
            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                    Keys.BACK_SPACE))
        }
        
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        maxlength = 0

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.3'))

            maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.3'), 
                'data-maxlength')

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                    'vavowDate').getValue(1, 1))

            maxL = ((maxlength) as Integer)

            max30 = (maxL * 0.3)

            for (int i = 0; i < max30; ++i) {
                WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                        Keys.BACK_SPACE))
            }
            
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.4'))

                maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.4'), 
                    'data-maxlength')

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                        'vavowDate').getValue(1, 1))

                maxL = ((maxlength) as Integer)

                for (int i = 0; i < max30; ++i) {
                    WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        Keys.chord(Keys.BACK_SPACE))
                }
                
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'))

                    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'), 
                        'data-maxlength')

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        FailureHandling.CONTINUE_ON_FAILURE)

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        findTestData('vavowDate').getValue(1, 1))

                    maxL = ((maxlength) as Integer)

                    for (int i = 0; i < max30; ++i) {
                        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            Keys.chord(Keys.BACK_SPACE))
                    }
                    
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.6'))

                        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 3.5'), 
                            'data-maxlength')

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            FailureHandling.CONTINUE_ON_FAILURE)

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            findTestData('vavowDate').getValue(1, 1))

                        maxL = ((maxlength) as Integer)

                        for (int i = 0; i < max30; ++i) {
                            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                                Keys.chord(Keys.BACK_SPACE))
                        }
                        
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0
                    }
                }
            }
        }
    }
}

/*__________________________________________________________3_____________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_4'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.1'))

    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.1'), 'data-maxlength')

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
            1, 1))

    int maxL = ((maxlength) as Integer)

    int max30 = maxL * 0.3

    for (int i = 0; i < max30; ++i) {
        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                Keys.BACK_SPACE))
    }
    
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    maxlength = 0

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.2'))

        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.2'), 'data-maxlength')

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                'vavowDate').getValue(1, 1))

        maxL = ((maxlength) as Integer)

        max30 = (maxL * 0.3)

        for (int i = 0; i < max30; ++i) {
            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                    Keys.BACK_SPACE))
        }
        
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        maxlength = 0

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.3'))

            maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.3'), 
                'data-maxlength')

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                    'vavowDate').getValue(1, 1))

            maxL = ((maxlength) as Integer)

            max30 = (maxL * 0.3)

            for (int i = 0; i < max30; ++i) {
                WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                        Keys.BACK_SPACE))
            }
            
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.4'))

                maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.4'), 
                    'data-maxlength')

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                        'vavowDate').getValue(1, 1))

                maxL = ((maxlength) as Integer)

                for (int i = 0; i < max30; ++i) {
                    WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        Keys.chord(Keys.BACK_SPACE))
                }
                
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'))

                    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'), 
                        'data-maxlength')

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        FailureHandling.CONTINUE_ON_FAILURE)

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        findTestData('vavowDate').getValue(1, 1))

                    maxL = ((maxlength) as Integer)

                    for (int i = 0; i < max30; ++i) {
                        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            Keys.chord(Keys.BACK_SPACE))
                    }
                    
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.6'))

                        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 4.5'), 
                            'data-maxlength')

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            FailureHandling.CONTINUE_ON_FAILURE)

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            findTestData('vavowDate').getValue(1, 1))

                        maxL = ((maxlength) as Integer)

                        for (int i = 0; i < max30; ++i) {
                            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                                Keys.chord(Keys.BACK_SPACE))
                        }
                        
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0
                    }
                }
            }
        }
    }
}

/*__________________________________________________________4_____________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_5'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.1'), 1) == true) {
    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.1'))

    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.1'), 'data-maxlength')

    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData('vavowDate').getValue(
            1, 1))

    int maxL = ((maxlength) as Integer)

    int max30 = maxL * 0.3

    for (int i = 0; i < max30; ++i) {
        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                Keys.BACK_SPACE))
    }
    
    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

    maxlength = 0

    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.2'), 1) == true) {
        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.2'))

        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.2'), 'data-maxlength')

        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                'vavowDate').getValue(1, 1))

        maxL = ((maxlength) as Integer)

        max30 = (maxL * 0.3)

        for (int i = 0; i < max30; ++i) {
            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                    Keys.BACK_SPACE))
        }
        
        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

        maxlength = 0

        if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.3'), 1) == 
        true) {
            WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.3'))

            maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.3'), 
                'data-maxlength')

            WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                    'vavowDate').getValue(1, 1))

            maxL = ((maxlength) as Integer)

            max30 = (maxL * 0.3)

            for (int i = 0; i < max30; ++i) {
                WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), Keys.chord(
                        Keys.BACK_SPACE))
            }
            
            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

            maxlength = 0

            if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.4'), 
                1) == true) {
                WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.4'))

                maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.4'), 
                    'data-maxlength')

                WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), FailureHandling.CONTINUE_ON_FAILURE)

                WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), findTestData(
                        'vavowDate').getValue(1, 1))

                maxL = ((maxlength) as Integer)

                for (int i = 0; i < max30; ++i) {
                    WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        Keys.chord(Keys.BACK_SPACE))
                }
                
                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                maxlength = 0

                if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'), 
                    1) == true) {
                    WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'))

                    maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'), 
                        'data-maxlength')

                    WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        FailureHandling.CONTINUE_ON_FAILURE)

                    WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                        findTestData('vavowDate').getValue(1, 1))

                    maxL = ((maxlength) as Integer)

                    for (int i = 0; i < max30; ++i) {
                        WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            Keys.chord(Keys.BACK_SPACE))
                    }
                    
                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                    maxlength = 0

                    if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.6'), 
                        1) == true) {
                        WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.6'))

                        maxlength = WebUI.getAttribute(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 5.5'), 
                            'data-maxlength')

                        WebUI.clearText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            FailureHandling.CONTINUE_ON_FAILURE)

                        WebUI.setText(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                            findTestData('vavowDate').getValue(1, 1))

                        maxL = ((maxlength) as Integer)

                        for (int i = 0; i < max30; ++i) {
                            WebUI.sendKeys(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/input_Enable text_cinput'), 
                                Keys.chord(Keys.BACK_SPACE))
                        }
                        
                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0

                        WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))

                        maxlength = 0
                    }
                }
            }
        }
    }
}

