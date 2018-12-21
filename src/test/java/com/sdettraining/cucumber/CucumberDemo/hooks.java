package com.sdettraining.cucumber.CucumberDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;
 
public class hooks {
 
 @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    } 
 
 @AfterMethod(alwaysRun = true)
	public void tearDownr(ITestResult result) throws IOException {
	
	 System.out.println("This will run after the method");
	 
	 /* if (result.isSuccess()) {
			File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String failureImageFileName = result.getMethod().getMethodName()
					+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
			File failureImageFile = new File(System.getProperty("user.dir") + "//screenshots//" + failureImageFileName);
			FileUtils.copyFile(imageFile, failureImageFile);
		} */
	 
	}
 
 @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
