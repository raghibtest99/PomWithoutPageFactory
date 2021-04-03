package com.raghib.pomwithoutpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.raghib.pom.pages.GoogleSearchPageObjects;

/*CREATE CLASS FOR TEST CASE*/
public class GoogleSearchPageObjectsTest {

	private static WebDriver webDriverObj = null;
	
	@Test
	public static void executeTest() throws Exception {
		// Chrome Browser
		System.setProperty("webdriver.chrome.driver",
						"C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		webDriverObj = new ChromeDriver();
		
		/*CREATE OBJECT FOR PAGE CLASS*/
		GoogleSearchPageObjects googleSearchPageObjects = new GoogleSearchPageObjects(webDriverObj);
		webDriverObj.get("https://www.google.com/");
		
		/*REFER ACTION METHODS*/
		googleSearchPageObjects.setTextInSearchBox("A B C D");
		googleSearchPageObjects.setInSearchButton();
		
		Thread.sleep(3000);
		webDriverObj.quit();
	}
	
	/*
	 * public static void main(String[] args) { try { executeTest(); } catch
	 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); } }
	 */

}
