import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Reevio (reevtest_reevtest3)/Max (Reevio) 2')

suiteProperties.put('name', 'Max (Reevio) 2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\tester-3\\Katalon Studio\\Reevio_test_2.0\\Reports\\Reevio (reevtest_reevtest3)\\Max (Reevio) 2\\20191101_154059\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Reevio (reevtest_reevtest3)/Max (Reevio) 2', suiteProperties, [new TestCaseBinding('Test Cases/Login and template selection (Reevio) reev', 'Test Cases/Login and template selection (Reevio) reev',  null), new TestCaseBinding('Test Cases/Deleting 1st scene', 'Test Cases/Deleting 1st scene',  null), new TestCaseBinding('Test Cases/Scenes adding (30 scenes) cycles', 'Test Cases/Scenes adding (30 scenes) cycles',  null), new TestCaseBinding('Test Cases/Project names/Project name writting (max)', 'Test Cases/Project names/Project name writting (max)',  null), new TestCaseBinding('Test Cases/Text adding/Text adding (MAX and COLOR) 30sc cycle', 'Test Cases/Text adding/Text adding (MAX and COLOR) 30sc cycle',  null), new TestCaseBinding('Test Cases/Drops color (1-30 scenes)', 'Test Cases/Drops color (1-30 scenes)',  null), new TestCaseBinding('Test Cases/Images adding/Background adding (Color 1-30cs) cycle', 'Test Cases/Images adding/Background adding (Color 1-30cs) cycle',  null), new TestCaseBinding('Test Cases/Images adding/Adding photo in placeholders (double cycle) Architecture', 'Test Cases/Images adding/Adding photo in placeholders (double cycle) Architecture',  null)])
