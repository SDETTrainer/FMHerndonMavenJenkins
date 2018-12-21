package com.sdettraining.cucumber.CucumberDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_stepdef {

	WebDriver driver;

	@Given("^A User is on the website$")
	public void A_User_is_on_the_website() throws Throwable {
		System.out.println("INSIDE A_User_is_on_the_website");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		System.out.println("Page title is: " + driver.getTitle());
	}

	@When("^User types UserName$")
	public void user_types_UserName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.findElement(By.id("email")).sendKeys("irfan@sdettraining.com");
	}

	@When("^Usertypes Password$")
	public void usertypes_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passw0rd!@#");
	}

	@When("^User clicks on the submit button$")
	public void user_clicks_on_the_submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.findElement(By.id("u_0_2")).click();
	}

	@Then("^User must log in successfully$")
	public void user_must_log_in_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String expectedValue = "The email you’ve entered doesn’t match any account. Sign up for an account.";
		String actualValue;
		// Thread.sleep(3000);
		actualValue = "";
		actualValue = driver
				.findElement(By.cssSelector(
						"#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"))
				.getText();

		System.out.println("actual Value is: " + actualValue);

		if (expectedValue.equals(actualValue)) {
			System.out.println("TEST PASSED");
		}

		else
			System.out.println("TEST FAILED");
		driver.quit();
	}
}
