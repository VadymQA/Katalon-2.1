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
import org.apache.commons.lang3.time.StopWatch
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.TimeUnit
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType as ConditionType

TestObject myNewObject = new TestObject('ObjectID')
TestObject myVideo_1 = new TestObject('1')
TestObject inputMyVideos = new TestObject('2')

myNewObject.addProperty('id', ConditionType.EQUALS, 'submit-video', true)

myVideo_1.addProperty('xpath', ConditionType.EQUALS, '//li[@data-count = "0"]', true)

inputMyVideos.addProperty('xpath', ConditionType.EQUALS, '//input[@id="inputWrapper"]', true)
// create a started stopwatch
StopWatch stopWatch = StopWatch.createStarted()

WebUI.delay(3)
// stop the stopwatch
stopWatch.stop()

println((stopWatch.getTime(TimeUnit.SECONDS)))

String time = stopWatch.getTime(TimeUnit.SECONDS)

WebUI.setText(inputMyVideos, time)

renderTimeMin = (stopWatch.getTime(TimeUnit.SECONDS)+117) / 60
renderTimeSec = (stopWatch.getTime(TimeUnit.SECONDS)+117) % 60

println renderTimeMin
println renderTimeSec