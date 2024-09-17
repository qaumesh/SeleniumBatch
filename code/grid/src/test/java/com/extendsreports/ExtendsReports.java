package com.extendsreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReports {

	@Test
	public static void main() {
		ExtentReports ep=new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		ep.attachReporter(spark);
		ep.flush();
		
	}
}
