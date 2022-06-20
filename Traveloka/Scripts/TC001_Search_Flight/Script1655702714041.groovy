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

' GIVEN User is on Search Flight Page '
Mobile.startExistingApplication(GlobalVariable.App, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/txtFlights'), 15, FailureHandling.STOP_ON_FAILURE)

' WHEN User Choose One Way Trip '
Mobile.tap(findTestObject('Search Flight/txtOneWayTrip'), 0, FailureHandling.STOP_ON_FAILURE)

' AND User input From Field '
Mobile.tap(findTestObject('Search Flight/btnFrom'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/boxSearchCity'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Flight/boxSearchCity'), 0)

Mobile.sendKeys(findTestObject('Search Flight/boxSearchCity'), From, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/listCities'), 0)

Mobile.tap(findTestObject('Search Flight/listCities'), 0, FailureHandling.STOP_ON_FAILURE)

' AND User input To Field '
Mobile.tap(findTestObject('Search Flight/btnTo'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/boxSearchCity'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Flight/boxSearchCity'), 0)

Mobile.sendKeys(findTestObject('Search Flight/boxSearchCity'), To, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/listCities'), 15)

Mobile.tap(findTestObject('Search Flight/listCities'), 0, FailureHandling.STOP_ON_FAILURE)

' AND User choose Form Deparature Date '
Mobile.tap(findTestObject('Search Flight/btnDeparatureDate'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/listDay'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Flight/listDay'), 0, FailureHandling.STOP_ON_FAILURE)

' AND User choose Passengers '
Mobile.tap(findTestObject('Search Flight/btnPassengers'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/btnSelect'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Flight/btnSelect'), 0, FailureHandling.STOP_ON_FAILURE)

' AND User choose Seat Class '
Mobile.tap(findTestObject('Search Flight/btnSeatClass'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/btnDone'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Flight/txtBusiness'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Flight/btnDone'), 0, FailureHandling.STOP_ON_FAILURE)

' AND User Checlist Include Flexible Tickets  '
Mobile.tap(findTestObject('Search Flight/btnCheckBox'), 0, FailureHandling.STOP_ON_FAILURE)

' AND User Search Button '
Mobile.tap(findTestObject('Search Flight/btnSearch'), 0, FailureHandling.STOP_ON_FAILURE)

' THEN User direct to Search Result '
Thread.sleep(5)

Mobile.waitForElementPresent(findTestObject('Search Flight/validationCity'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Search Flight/validationDate'), 15, FailureHandling.STOP_ON_FAILURE)

