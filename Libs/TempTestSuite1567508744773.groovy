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


suiteProperties.put('id', 'Test Suites/Reevio (reevtest_reevtest3)/Preview (Reevio) 2')

suiteProperties.put('name', 'Preview (Reevio) 2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\tester-3\\Katalon Studio\\Reevio_test_1\\Reports\\Reevio (reevtest_reevtest3)\\Preview (Reevio) 2\\20190903_140544\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Reevio (reevtest_reevtest3)/Preview (Reevio) 2', suiteProperties, [new TestCaseBinding('Test Cases/Login and template selection (Reevio) reev', 'Test Cases/Login and template selection (Reevio) reev',  null), new TestCaseBinding('Test Cases/Scenes adding (15 scenes) if-else', 'Test Cases/Scenes adding (15 scenes) if-else',  null), new TestCaseBinding('Test Cases/Project names/Project name writting (Preview)', 'Test Cases/Project names/Project name writting (Preview)',  null), new TestCaseBinding('Test Cases/Duplicate tab', 'Test Cases/Duplicate tab',  null), new TestCaseBinding('Test Cases/Text adding/Text 0 symbols (if-else) 1-4', 'Test Cases/Text adding/Text 0 symbols (if-else) 1-4',  null), new TestCaseBinding('Test Cases/Text adding/Text 0 symbols (if-else) 5-8', 'Test Cases/Text adding/Text 0 symbols (if-else) 5-8',  null), new TestCaseBinding('Test Cases/Text adding/Text 0 symbols (if-else) 9-12', 'Test Cases/Text adding/Text 0 symbols (if-else) 9-12',  null), new TestCaseBinding('Test Cases/Text adding/Text 0 symbols (if-else) 13-15', 'Test Cases/Text adding/Text 0 symbols (if-else) 13-15',  null)])
