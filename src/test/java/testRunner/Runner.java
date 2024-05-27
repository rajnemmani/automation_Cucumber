package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true, glue = {"stepDefination"}, plugin = {"pretty", "html:target/cucumber-reports.html"})

public class Runner {

}
