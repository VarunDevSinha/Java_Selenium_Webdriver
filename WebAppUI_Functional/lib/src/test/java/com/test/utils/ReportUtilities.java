package com.test.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportUtilities {

	public static ExtentTest test;
	public static ExtentReports reports;

	public static void reports(String reportPath, String testName) {
		reports = new ExtentReports(reportPath + "extentReport_" + "testName" + System.currentTimeMillis() + ".html",
				false);
		test = reports.startTest(testName);
	}

	public static void logTest(String status) {

		switch (status) {
		case "PASS":
			test.log(LogStatus.PASS, "Test case passed");
			break;
		case "FAIL":
			test.log(LogStatus.FAIL, "Test case failed");
			break;
		case "ERROR":
			test.log(LogStatus.ERROR, "Error in test case execution");
			break;
		case "WARNING":
			test.log(LogStatus.WARNING, "Warning in test case execution");
			break;
		case "FATAL":
			test.log(LogStatus.FATAL, "Test case execution interupted");
			break;
		default:
			System.out.println("Give \"statuc\" as - PASS / FAIL / ERROR / WARNING / FATAL.");
		}

	}

	public static void endTest() {

		reports.endTest(test);
		reports.flush();
	}
}
