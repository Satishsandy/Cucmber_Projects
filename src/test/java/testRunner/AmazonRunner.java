package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Amazon.feature",glue="stepDefination",dryRun=false,format= {"pretty", "html:target/cucumber-reports"})

public class AmazonRunner {

}
