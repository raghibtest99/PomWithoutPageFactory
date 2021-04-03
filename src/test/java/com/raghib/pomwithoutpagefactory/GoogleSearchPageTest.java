package com.raghib.pomwithoutpagefactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.raghib.pom.pages.GoogleSearchPage;

public class GoogleSearchPageTest {
	private static WebDriver webDriverObj = null;
	
	@Test
	public static void executeTest() throws Exception {
		// Chrome Browser
		//System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"browserdrivers"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe");
		webDriverObj = new ChromeDriver();
		webDriverObj.manage().window().maximize();
		
		webDriverObj.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		webDriverObj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		webDriverObj.get("https://www.google.com/");
		GoogleSearchPage.textBoxSearch(webDriverObj).sendKeys("pom in selenium");
		//googleSearchPage.buttonSearch(webDriverObj).click();
		/*If you not maximize the browser window then use below code, 
		 * with the help of below code it will handle the overlap which is happened due to search
		*/
		GoogleSearchPage.buttonSearch(webDriverObj).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		webDriverObj.quit();
	}
	
	/*
	 * public static void main(String[] args) { try { executeTest(); } catch
	 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); } }
	 */	
}