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

WebUI.navigateToUrl('http://localhost:5000/tjs/admin/register')

WebUI.setText(findTestObject('Object Repository/Register/input_NIP_nip'), '12345678')

WebUI.setText(findTestObject('Object Repository/Register/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Password_password'), 
    'QIaGzQLQqqLay5EbJRYZAw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Confirm Password_confirmPassword'), 
    'QIaGzQLQqqLay5EbJRYZAw==')

WebUI.click(findTestObject('Object Repository/Register/button_Register'))

WebUI.verifyElementPresent(findTestObject('Register/small_NIP harus berjumlah 18 digit'), 
    0)

WebUI.closeBrowser()

