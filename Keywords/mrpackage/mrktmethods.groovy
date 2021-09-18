package mrpackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class mrktmethods {
	static boolean aMenuToggle
	static boolean aMenuLogin
	static boolean aMakeAppointment
	static boolean h2LoginTitle

	/*Method that allows navigation to the login page through the login menu */
	static boolean loginMenuLink() {
		aMenuToggle = WebUI.verifyElementVisible(findTestObject('katalone_cura_page/link-elements/a_menu_toggle_home'))
		if (aMenuToggle.TRUE) {
			WebUI.click(findTestObject('katalone_cura_page/link-elements/a_menu_toggle_home'))
			aMenuLogin = WebUI.verifyElementVisible(findTestObject('katalone_cura_page/link-elements/a_login_menu'))
			if (aMenuLogin.TRUE) {
				WebUI.click(findTestObject('katalone_cura_page/link-elements/a_login_menu'))
				return WebUI.waitForElementVisible(findTestObject('katalone_cura_page/text_elements/h2_title_login'), 2)
			}
		}
	}

	/*Method that allows navigation to the login page through the Make Appointment link */
	static boolean makeAppointmentLink() {
		aMakeAppointment = WebUI.verifyElementVisible(findTestObject('katalone_cura_page/link-elements/a_make_appointment_home'), FailureHandling.STOP_ON_FAILURE)
		if (aMakeAppointment.TRUE) {
			WebUI.click(findTestObject('katalone_cura_page/link-elements/a_make_appointment_home'))
			return WebUI.waitForElementVisible(findTestObject('katalone_cura_page/text_elements/h2_title_login'), 2)
		}
	}

	/*Method to verify if an element is displayed or visible */
	static boolean isDisplayed(String object) {
		return WebUI.verifyElementVisible(findTestObject(object), FailureHandling.STOP_ON_FAILURE)
	}
}