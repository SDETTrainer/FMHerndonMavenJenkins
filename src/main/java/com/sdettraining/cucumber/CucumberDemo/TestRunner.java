package com.sdettraining.cucumber.CucumberDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features = "Feature", glue = "com.sdettraining.cucumber.CucumberDemo", dryRun = false, plugin = {"pretty", "html:target/cucumber-reports" }, monochrome = true, tags = { "@smoke, @sanity" })


@CucumberOptions(features = "Feature/ddtLoginInvalid.feature")
// removed , glue = "com.sdettraining.cucumber.CucumberDemo"


//@CucumberOptions(features = "Feature", glue = "com.sdettraining.cucumber.CucumberDemo")
//removed , dryRun = false

//@CucumberOptions(features = "Feature", glue = "com.sdettraining.cucumber.CucumberDemo", dryRun = false)
//removed , plugin = {"pretty", "html:target/cucumber-reports" }


//@CucumberOptions(features = "Feature", glue = "com.sdettraining.cucumber.CucumberDemo", dryRun = false, plugin = {"pretty", "html:target/cucumber-reports" })
//removed , monochrome = true, tags = { "@smoke, @sanity" }

//@CucumberOptions(features = "Feature", glue = "com.sdettraining.cucumber.CucumberDemo", dryRun = false, plugin = {"pretty", "html:target/cucumber-reports" }, monochrome = true, tags = { "@smoke, @sanity" })




public class TestRunner extends AbstractTestNGCucumberTests {

}
