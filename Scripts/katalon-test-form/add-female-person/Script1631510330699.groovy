import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url1)

WebUI.setText(findTestObject('katalon-test-form/form-input/input_First name_firstName'), firstName)

WebUI.setText(findTestObject('katalon-test-form/form-input/input_Last name_lastName'), lastName)

WebUI.check(findTestObject('katalon-test-form/form-label/label_Female'))

WebUI.setText(findTestObject('katalon-test-form/form-input/input_Date of birth_dob'), birthday)

WebUI.setText(findTestObject('katalon-test-form/form-input/input_Address_address'), address)

WebUI.setText(findTestObject('katalon-test-form/form-input/input_Email_email'), email)

WebUI.setEncryptedText(findTestObject('katalon-test-form/form-input/input_Password_password'), password)

WebUI.setText(findTestObject('katalon-test-form/form-input/input_Company_company'), company)

WebUI.selectOptionByValue(findTestObject('katalon-test-form/form-select-option-by-value/select_DeveloperQAManagerTechnical Architec_7258a1'), 
    role, true)

WebUI.selectOptionByValue(findTestObject('katalon-test-form/form-select-option-by-value/select_High salaryNice managerleaderExcelle_8daca8'), 
    jobExpectation, true)

WebUI.check(findTestObject('katalon-test-form/form-label/label_Join tech cons'))

WebUI.check(findTestObject('katalon-test-form/form-label/label_Read tech blogs'))

WebUI.check(findTestObject('katalon-test-form/form-label/label_Take online courses'))

WebUI.setText(findTestObject('katalon-test-form/form-textarea/textarea_Comment_comment'), comment)

WebUI.click(findTestObject('katalon-test-form/form-button/button_Submit'))

WebUI.closeBrowser()

