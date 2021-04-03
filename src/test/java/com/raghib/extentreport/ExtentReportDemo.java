package com.raghib.extentreport;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	@Test
	public void landingPage() {
		System.out.println("Open the Google Page");
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+File.separator+"extentreports"+File.separator+"Report.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		ExtentTest logger = extentReports.createTest("PageLoadingTest");
		logger.log(Status.INFO, "Open The Google Web Page");
		logger.log(Status.PASS, "Page Loaded Verified");
		extentReports.flush();
	}

}
