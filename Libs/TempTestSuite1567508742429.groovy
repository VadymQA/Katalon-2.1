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


suiteProperties.put('id', 'Test Suites/Reevio (reevtest_reevtest3)/Disable (Reevio) 2')

suiteProperties.put('name', 'Disable (Reevio) 2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\tester-3\\Katalon Studio\\Reevio_test_1\\Reports\\Reevio (reevtest_reevtest3)\\Disable (Reevio) 2\\20190903_140542\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Reevio (reevtest_reevtest3)/Disable (Reevio) 2', suiteProperties, [new TestCaseBinding('Test Cases/Login and template selection (Reevio) reev', 'Test Cases/Login and template selection (Reevio) reev',  null), new TestCaseBinding('Test Cases/Scenes adding (15 scenes) if-else', 'Test Cases/Scenes adding (15 scenes) if-else',  null), new TestCaseBinding('Test Cases/Project names/Project name writting (dis)', 'Test Cases/Project names/Project name writting (dis)',  null), new TestCaseBinding('Test Cases/Text disable (if else) 3.0 1-10', 'Test Cases/Text disable (if else) 3.0 1-10',  null), new TestCaseBinding('Test Cases/Text disable (if else) 3.0 11-15sc', 'Test Cases/Text disable (if else) 3.0 11-15sc',  null), new TestCaseBinding('Test Cases/Drops color (1-6 scenes) 2.0', 'Test Cases/Drops color (1-6 scenes) 2.0',  null), new TestCaseBinding('Test Cases/Drops color (7-15 scenes) 2.0', 'Test Cases/Drops color (7-15 scenes) 2.0',  null), new TestCaseBinding('Test Cases/Video adding in placeholders (if-else) (1-5scenes) 3.0', 'Test Cases/Video adding in placeholders (if-else) (1-5scenes) 3.0',  null), new TestCaseBinding('Test Cases/Video adding in placeholder (if-else) (6-9scenes) 3.0', 'Test Cases/Video adding in placeholder (if-else) (6-9scenes) 3.0',  null), new TestCaseBinding('Test Cases/Video adding in placeholder (if-else) (10-11scenes) 3.0', 'Test Cases/Video adding in placeholder (if-else) (10-11scenes) 3.0',  null), new TestCaseBinding('Test Cases/Video adding in placeholder (if-else) (12-15scenes) 3.0', 'Test Cases/Video adding in placeholder (if-else) (12-15scenes) 3.0',  null), new TestCaseBinding('Test Cases/Background adding (video 1-6 scenes)', 'Test Cases/Background adding (video 1-6 scenes)',  null), new TestCaseBinding('Test Cases/Backgraound adding (Video 7-15 scenes)', 'Test Cases/Backgraound adding (Video 7-15 scenes)',  null)])
