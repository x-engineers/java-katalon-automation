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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url2)

WebUI.waitForPageLoad(2)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/text_elements/h1_title_cura_healthcare_service'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/header_elements/h3_we_care_about_your_health_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/link-elements/a_make_appointment_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/link-elements/a_menu_toggle_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 275)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/text_elements/h4_title_cura_healthcare_service'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/paragraph-elements/p_address_atlanta_550_pharr_road_ne_suite_525_home'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/list_elements/li_cellphone_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/list_elements/li_email_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/list_elements/ul_social_networks_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/paragraph-elements/p_copyright_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('katalone_cura_page/link-elements/a_back_to_top_home'))

WebUI.closeBrowser()

