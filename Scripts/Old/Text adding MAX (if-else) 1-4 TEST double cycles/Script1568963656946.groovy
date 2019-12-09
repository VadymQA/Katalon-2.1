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

//String a_Text = "Page_Reevio Video Maker/Editor/Test Text fields/a_Text 1" 
//WebUI.doubleClick(findTestObject('Page_Reevio Video Maker/Editor/Test Text fields/a_Text 6'))
String a = 'Page_Reevio Video Maker/Editor/Test Text fields/a_Text '

String scene

String sceneN
int i, j

scene = 'Page_Reevio Video Maker/Editor_Scene_'


for (i=0; i<5 ; i++) { 
	WebUI.doubleClick(findTestObject(scene+i))
	println i
	for (j = 1; j<4; j++) 
	{
		String textField = a+j
		
		WebUI.doubleClick(findTestObject(textField))
		WebUI.click(findTestObject('Page_Reevio Video Maker/Editor/Text Editor/span_Save'))
	}
				
}