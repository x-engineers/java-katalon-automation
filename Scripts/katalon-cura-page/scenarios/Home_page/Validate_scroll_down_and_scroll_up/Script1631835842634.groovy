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

String h1HomeTitle = 'katalone_cura_page/text_elements/h1_title_cura_healthcare_service'

String pHomeCopyright = 'katalone_cura_page/text_elements/p_text_copyright_home'

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url2)

WebUI.waitForPageLoad(2)

if (mrkt.isDisplayed(h1HomeTitle).FALSE) {
    throw new Exception('Menu Toggle is not displayed')
} else {
    WebUI.scrollToPosition(0, 350)

    if (mrkt.isDisplayed(pHomeCopyright).TRUE) {
        WebUI.scrollToPosition(350, 0)
    }
    
    if (mrkt.isDisplayed(h1HomeTitle).TRUE) {
        WebUI.scrollToPosition(0, 350)
    }
    
    Boolean aBackToTop = WebUI.waitForElementVisible(findTestObject('katalone_cura_page/link-elements/a_back_to_top_home'), 
        1)

    if (aBackToTop.TRUE) {
        WebUI.click(findTestObject('katalone_cura_page/link-elements/a_back_to_top_home'), FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.waitForElementVisible(findTestObject('katalone_cura_page/text_elements/h1_title_cura_healthcare_service'), 1)

    if (mrkt.isDisplayed(h1HomeTitle).FALSE) {
        throw new Exception('CURA Healthcare Service title is not displayed')
    }
}

WebUI.closeBrowser()

