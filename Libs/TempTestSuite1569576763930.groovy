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


suiteProperties.put('id', 'Test Suites/Reevio (reevtest_reevtest3)/Max-30 (Reevio) 2')

suiteProperties.put('name', 'Max-30 (Reevio) 2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\tester-3\\Katalon Studio\\Reevio_test_1\\Reports\\Reevio (reevtest_reevtest3)\\Max-30 (Reevio) 2\\20190927_123243\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Reevio (reevtest_reevtest3)/Max-30 (Reevio) 2', suiteProperties, [new TestCaseBinding('Test Cases/Login and template selection (Reevio) reev', 'Test Cases/Login and template selection (Reevio) reev',  null), new TestCaseBinding('Test Cases/Scenes adding (30 scenes) cycles', 'Test Cases/Scenes adding (30 scenes) cycles',  null), new TestCaseBinding('Test Cases/Project names/Project name writting (max-30)', 'Test Cases/Project names/Project name writting (max-30)',  null), new TestCaseBinding('Test Cases/Adding_Music', 'Test Cases/Adding_Music',  null), new TestCaseBinding('Test Cases/Test', 'Test Cases/Test',  null), new TestCaseBinding('Test Cases/Text adding/Text adding (MAX-30) 1-5 sc', 'Test Cases/Text adding/Text adding (MAX-30) 1-5 sc',  null), new TestCaseBinding('Test Cases/Text adding/Text adding (MAX-30) 6-10sc', 'Test Cases/Text adding/Text adding (MAX-30) 6-10sc',  null), new TestCaseBinding('Test Cases/Drops color (1-6 scenes) 2.0', 'Test Cases/Drops color (1-6 scenes) 2.0',  null), new TestCaseBinding('Test Cases/Drops color (7-15 scenes) 2.0', 'Test Cases/Drops color (7-15 scenes) 2.0',  null), new TestCaseBinding('Test Cases/Text adding/Text adding (MAX-30) 11-15sc', 'Test Cases/Text adding/Text adding (MAX-30) 11-15sc',  null), new TestCaseBinding('Test Cases/Images adding in placeholders/Images adding in placeholders (1-5scenes) 3.0 Another images', 'Test Cases/Images adding in placeholders/Images adding in placeholders (1-5scenes) 3.0 Another images',  null), new TestCaseBinding('Test Cases/Images adding in placeholders/Images adding in placeholders (if-else) (6-9scenes) 3.0 Another Images', 'Test Cases/Images adding in placeholders/Images adding in placeholders (if-else) (6-9scenes) 3.0 Another Images',  null), new TestCaseBinding('Test Cases/Images adding in placeholders/Images adding in placeholders (if-else) (10-11scenes) 3.0 Another images', 'Test Cases/Images adding in placeholders/Images adding in placeholders (if-else) (10-11scenes) 3.0 Another images',  null), new TestCaseBinding('Test Cases/Images adding in placeholders/Images adding in placeholders (if-else) (12-15scenes) 3.0 Another Images', 'Test Cases/Images adding in placeholders/Images adding in placeholders (if-else) (12-15scenes) 3.0 Another Images',  null), new TestCaseBinding('Test Cases/Background adding (images 1-20 sc) cycle', 'Test Cases/Background adding (images 1-20 sc) cycle',  null)])
