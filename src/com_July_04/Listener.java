package com_July_04;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener 
{
	
	   @Override
	   public void onTestStart(ITestResult result) {
	      System.out.println("On Test Start" +result.getTestName());
	   }
	   @Override
	   public void onTestSuccess(ITestResult result) {
		   System.out.println("On Test Start" +result.getTestName());
	   }
	   @Override
	   public void onTestFailure(ITestResult result) {
		  
	      System.out.println("Failed test case name" + result.getName());
	   }
	   @Override
	   public void onTestSkipped(ITestResult result) {
		   System.out.println("On Test Start" +result.getTestName());
	   }
	   @Override
	   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		   System.out.println("On Test Start" +result.getTestName());
	   }
	   @Override
	   public void onStart(ITestContext context) {
	      // TODO Auto-generated method stub
	   }
	   @Override
	   public void onFinish(ITestContext context) {
	      // TODO Auto-generated method stub
	   }
	}
