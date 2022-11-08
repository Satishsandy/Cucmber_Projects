package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/AddStocks.feature",glue="stepDefination",monochrome=true,
dryRun=true,format= {"pretty", "html:target/cucumber-reports"})


public class Runner {

}
