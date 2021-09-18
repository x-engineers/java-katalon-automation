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
import mrpackage.mrktmethods as mrkt

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url2)

WebUI.waitForPageLoad(2)

if (mrkt.loginMenuLink().TRUE) {
    Boolean inputUser = WebUI.verifyElementVisible(findTestObject('katalone_cura_page/input-elements/input_username_login'), 
        FailureHandling.STOP_ON_FAILURE)

    Boolean inputPass = WebUI.verifyElementVisible(findTestObject('katalone_cura_page/input-elements/input_password_login'), 
        FailureHandling.STOP_ON_FAILURE)

    Boolean btnLogin = WebUI.verifyElementVisible(findTestObject('katalone_cura_page/button-elements/btn_login'))

    if (inputUser.TRUE && inputPass.TRUE) {
        WebUI.setText(findTestObject('katalone_cura_page/input-elements/input_username_login'), username)

        WebUI.setText(findTestObject('katalone_cura_page/input-elements/input_password_login'), password)

        WebUI.click(findTestObject('katalone_cura_page/button-elements/btn_login'))

        if ((username == 'John Doe') && (password == 'ThisIsNotAPassword')) {
            WebUI.verifyElementPresent(findTestObject('katalone_cura_page/header_elements/h2_make_appointment_appointment'), 
                1)

            Boolean h2AppointmentTitle = WebUI.waitForElementVisible(findTestObject('katalone_cura_page/link-elements/a_menu_toggle_home'), 
                1)

            Boolean aLogout = WebUI.waitForElementPresent(findTestObject('katalone_cura_page/link-elements/a_logout_home'), 
                1)

            if (h2AppointmentTitle.TRUE && aLogout.TRUE) {
                WebUI.click(findTestObject('katalone_cura_page/link-elements/a_menu_toggle_home'))

                WebUI.click(findTestObject('katalone_cura_page/link-elements/a_logout_home'))
            }
            
            WebUI.waitForElementVisible(findTestObject('katalone_cura_page/text_elements/h1_title_cura_healthcare_service'), 
                2)
        } else {
            WebUI.verifyElementVisible(findTestObject('katalone_cura_page/paragraph-elements/p_error_message_login'))
        }
    }
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

