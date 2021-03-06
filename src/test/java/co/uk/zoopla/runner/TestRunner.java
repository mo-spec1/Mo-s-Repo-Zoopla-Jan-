package co.uk.zoopla.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/zoopla/features"},
        plugin = {"pretty", "json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/Pretty-cucumber"},
        glue = {"co/uk/zoopla/stepdefinitions"}

)
public class TestRunner {
}
