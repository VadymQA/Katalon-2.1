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

WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_7'), 0) == true) {
    
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_7_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_7_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_7_2'), 1)) {
		
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_7_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_7_3'), 0)) {
		
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_7_3'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
  
}

/*________________________________________________7__________________________________________________________*/
WebUI.click(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_8'), 0) == true) {
    	
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_8_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_8_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_8_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_8_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_8_3'), 0)) {
		
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_8_3'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
}

/*________________________________________________8__________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_9'), 0) == true) {
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_9_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_9_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_9_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_9_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_9_3'), 0)) {
		
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_9_3'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
    
    
}

/*________________________________________________9__________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_10'), 0) == true) {
    
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_10_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_10_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_10_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_10_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_10_3'), 0)) {
		
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_10_3'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}

}

/*________________________________________________10__________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_11'), 0) == true) {
	
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_11_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_11_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_11_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_11_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_11_3'), 0)) {
		
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_11_3'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
}

/*________________________________________________11_________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_12'), 0) == true) {
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_12_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_12_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	
	 if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_12_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_12_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	 if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_12_3'), 0)) {
		 
		 WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_12_3'))
 
		 WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
 
		 WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
 
		 WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				 1))
 
		 WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	 }

}

/*________________________________________________12_________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_13'), 0) == true) {
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_13_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_13_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	
	 if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_13_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_13_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	 if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_13_3'), 0)) {
		 
		 WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_13_3'))
 
		 WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
 
		 WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
 
		 WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				 1))
 
		 WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	 }
    
    
}

/*________________________________________________13_________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_14'), 0) == true) {
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_14_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_14_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	 if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_14_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_14_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    } 
	 if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_14_3'), 0)) {
		 
		 WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_14_3'))
 
		 WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
 
		 WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))
 
		 WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				 1))
 
		 WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	 }
}

/*________________________________________________14_________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'))

if (WebUI.verifyElementPresent(findTestObject('Page_Reevio Video Maker/Editor_Scene_15'), 0) == true) {
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_15_1'), 1)) {
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_15_1'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(3,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_15_2'), 1)) {
        WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_15_2'))

        WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

        WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(4, 
                1))

        WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
    }
	if (WebUI.verifyElementInViewport(findTestObject('Drop/Drops_as_objects/div_Drop_15_3'), 0)) {
		
		WebUI.click(findTestObject('Drop/Drops_as_objects/div_Drop_15_3'))

		WebUI.click(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.clearText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'))

		WebUI.setText(findTestObject('Drop/input_RGB_drophex-color (Drop color)'), findTestData('vavowDate').getValue(5,
				1))

		WebUI.click(findTestObject('Drop/button_Apply(drop_color)'))
	}
}

/*________________________________________________15_________________________________________________________*/
WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor_Scene_1'))

