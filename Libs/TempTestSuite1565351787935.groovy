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


suiteProperties.put('id', 'Test Suites/Vavow/Max-30 (vavow)')

suiteProperties.put('name', 'Max-30 (vavow)')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\tester-3\\Katalon Studio\\Reevio_test_1\\Reports\\Vavow\\Max-30 (vavow)\\20190809_145627\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Vavow/Max-30 (vavow)', suiteProperties, [new TestCaseBinding('Test Cases/Login and template selection (vavow)', 'Test Cases/Login and template selection (vavow)',  null), new TestCaseBinding('Test Cases/Scenes adding (15 scenes) if-else', 'Test Cases/Scenes adding (15 scenes) if-else',  null), new TestCaseBinding('Test Cases/Adding_Music', 'Test Cases/Adding_Music',  null), new TestCaseBinding('Test Cases/Project name writting (max-30)', 'Test Cases/Project name writting (max-30)',  null), new TestCaseBinding('Test Cases/Text Color Scene changing (if-else) 1-8sc', 'Test Cases/Text Color Scene changing (if-else) 1-8sc',  null), new TestCaseBinding('Test Cases/Text Color Scene changing (if-else) 9-12 sc', 'Test Cases/Text Color Scene changing (if-else) 9-12 sc',  null), new TestCaseBinding('Test Cases/Text Color Scene changing (if-else) 13-15 sc', 'Test Cases/Text Color Scene changing (if-else) 13-15 sc',  null), new TestCaseBinding('Test Cases/Drops color (1-6 scenes) 2.0', 'Test Cases/Drops color (1-6 scenes) 2.0',  null), new TestCaseBinding('Test Cases/Drops color (7-15 scenes) 2.0', 'Test Cases/Drops color (7-15 scenes) 2.0',  null), new TestCaseBinding('Test Cases/Text adding (MAX-30) 1-5 sc', 'Test Cases/Text adding (MAX-30) 1-5 sc',  null), new TestCaseBinding('Test Cases/Text adding (MAX-30) 6-10sc', 'Test Cases/Text adding (MAX-30) 6-10sc',  null), new TestCaseBinding('Test Cases/Text adding (MAX-30) 11-15sc', 'Test Cases/Text adding (MAX-30) 11-15sc',  null), new TestCaseBinding('Test Cases/Images adding in placeholders (if-else) (1-5scenes) 3.0', 'Test Cases/Images adding in placeholders (if-else) (1-5scenes) 3.0',  null), new TestCaseBinding('Test Cases/Images adding in placeholders (if-else) (6-9scenes) 3.0', 'Test Cases/Images adding in placeholders (if-else) (6-9scenes) 3.0',  null), new TestCaseBinding('Test Cases/Images adding in placeholders (if-else) (10-11scenes) 3.0', 'Test Cases/Images adding in placeholders (if-else) (10-11scenes) 3.0',  null), new TestCaseBinding('Test Cases/Images adding in placeholders (if-else) (12-15scenes) 3.0', 'Test Cases/Images adding in placeholders (if-else) (12-15scenes) 3.0',  null), new TestCaseBinding('Test Cases/Background adding (images 1-15 scenes)', 'Test Cases/Background adding (images 1-15 scenes)',  null)])
