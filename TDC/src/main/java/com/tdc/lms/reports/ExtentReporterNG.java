package com.tdc.lms.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("TDC-Automation");
		//Need to change Test Results in line no:14
		report.config().setDocumentTitle("TDC-Automation Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester","PRASHANT SINGH");
		return extent;
	}		
}
	