package com.sdettraining.cucumber.CucumberDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class verifyTitle_stepdef {
	WebDriver driver;
	String actualTitle;

	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	}

	@When("^User checks the title$")
	public void user_checks_the_title() throws Throwable {
		actualTitle = driver.getTitle();
	}

	@Then("^It must say \"([^\"]*)\"$")
	public void it_must_say(String expectedTitle) throws Throwable {
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
	
	
	

}
