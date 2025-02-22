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

WebUI.navigateToUrl('http://localhost:3000/tjs/admin/login')

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_NIP_nip'), '123456789012345678')

WebUI.setEncryptedText(findTestObject('Object Repository/Tambah Data/input_Password_password'), 'QIaGzQLQqqLay5EbJRYZAw==')

WebUI.click(findTestObject('Object Repository/Tambah Data/input_Password_togglePassword'))

WebUI.click(findTestObject('Object Repository/Tambah Data/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Tambah Data/button_Tambah Data'))

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_Nama UMKM_umkm_name'), 'ASDFGHJKLZXCVBNMQWERTYUIOP')

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_Pemilik UMKM_umkm_owner'), 'Bakery shop aman jayaaaaaaaaaaaaaaaa')

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_Link Instagram_instagram_url'), '')

WebUI.click(findTestObject('Object Repository/Tambah Data/input_Link Instagram_instagram_url'))

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_Link Instagram_instagram_url'), 'https://www.instagram.com/ervin_landito213/')

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_Whatsapp_whatsapp_number'), '')

WebUI.click(findTestObject('Object Repository/Tambah Data/input_Whatsapp_whatsapp_number'))

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_Whatsapp_whatsapp_number'), '0819123456789')

WebUI.setText(findTestObject('Object Repository/Tambah Data/input_Link Google Maps_gmaps_url'), ' https://maps.google.com/?q=location&key=AIzaSyABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghi')

WebUI.click(findTestObject('Object Repository/Tambah Data/button_Simpan'))

WebUI.verifyElementText(findTestObject('Tambah Data/span_Nama UMKM harus terdiri dari 2-25 karakter'), 'Nama UMKM harus terdiri dari 2-25 karakter.')

WebUI.verifyElementText(findTestObject('Tambah Data/span_Nama Pemilik harus terdiri dari 2-35 karakter'), 'Nama Pemilik harus terdiri dari 2-35 karakter.')

WebUI.verifyElementText(findTestObject('Tambah Data/span_Nomor WhatsApp harus terdiri dari 12 angka'), 'Nomor WhatsApp harus terdiri dari 12 angka.')

WebUI.closeBrowser()

