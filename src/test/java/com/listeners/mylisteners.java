package com.listeners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import FRAMEWORKS.extendreport;

public class mylisteners implements ITestListener {
	
	ExtentReports extendreports;
	ExtentTest extendTest;
	String testname;
	
	public void onTestStart(ITestResult result) {
				 testname =result.getName();
				 extendTest = extendreports.createTest(testname);
				extendTest.log(Status.INFO, testname + "start executing");
		//System.out.println(testname + "start executing");
	}

	public void onTestSuccess(ITestResult result) {
		//String testname =result.getName();
		extendTest.log(Status.PASS,testname + "got successfully executing");  //in the report we passing the test by using this method
		//System.out.println(testname + "got successfully executing");
	}

	public void onTestFailure(ITestResult result) {
		
		//String testname =result.getName();
		
		WebDriver driver = null;
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		File filescreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String denstinationscrnshot = System.getProperty("user.dir")+"\\screenshot\\"+testname+".png";
		extendTest.addScreenCaptureFromBase64String(denstinationscrnshot);
		extendTest.log(Status.INFO, testname + " failed executing");
		extendTest.log(Status.FAIL,result.getThrowable());
//	System.out.println(testname + " failed executing");
	//	System.out.println(result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		//String testname =result.getName();
		extendTest.log(Status.INFO, result.getThrowable());
		extendTest.log(Status.SKIP, testname + " got skipped executing");
	//	System.out.println(testname + " got skipped executing");
		//System.out.println(result.getThrowable());
	}

	public void onStart(ITestContext context) {
		 extendreports = extendreport.generateextendreports();
		
		//System.out.println("test starts executing");
	}

	public void onFinish(ITestContext context) {
		extendreports.flush();
		//System.out.println("finish executing");
	}

	
	 
}
