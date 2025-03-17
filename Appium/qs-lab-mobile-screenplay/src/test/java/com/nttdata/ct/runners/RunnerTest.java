package com.nttdata.ct.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json", "html:target/build/cucumber-report.html"},
        features = {"src/test/resources/features"},
        glue = {"com.nttdata.ct.stepdefinitions", "com.nttdata.ct.hooks"},
        tags = "@login"
)
public class RunnerTest {
}
