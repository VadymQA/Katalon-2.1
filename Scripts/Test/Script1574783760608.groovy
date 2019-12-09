import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.apache.commons.lang3.time.StopWatch as StopWatch
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.TimeUnit as TimeUnit

String msg = "Video is rendering too long"
TestObject myNewObject = new TestObject('ObjectID')
TestObject myVideo_1 = new TestObject('1')
TestObject inputMyVideos = new TestObject('2')

myNewObject.addProperty('id', ConditionType.EQUALS, 'submit-video', true)

myVideo_1.addProperty('xpath', ConditionType.EQUALS, '//li[@data-count = "0"]', true)

inputMyVideos.addProperty('xpath', ConditionType.EQUALS, '//input[@id="inputWrapper"]', true)

WebUI.click(myNewObject)

// create a started stopwatch
StopWatch stopWatch = StopWatch.createStarted()

WebUI.delay(10)

WebUI.navigateToUrl('https://app3.reevio.com/users/my-videos')

String attMyVideos_1 = WebUI.getAttribute(myVideo_1, 'data-status')

/*while (WebUI.verifyMatch(attMyVideos_1, 'done', false) == false) {
    WebUI.delay(15)

    WebUI.refresh()

    attMyVideos_1 = WebUI.getAttribute(myVideo_1, 'data-status')
} */

WebUI.delay(0)
//cycle for 30 min 
for (int i = 1; i<91; i++) {
	
	attMyVideos_1 = WebUI.getAttribute(myVideo_1, 'data-status')
	
	if (WebUI.verifyMatch(attMyVideos_1, 'done', true) == true) {
		
		// stop the stopwatch
		stopWatch.stop()
		
		s = stopWatch.getTime(TimeUnit.SECONDS) / 60
		msg = "Render Time is " + s + " min"
		break
	}
	
	WebUI.delay(20)
	
	WebUI.refresh()
}




WebUI.setText(inputMyVideos, msg)

//WebUI.navigateToUrl("Render Time is " + renderTime)
