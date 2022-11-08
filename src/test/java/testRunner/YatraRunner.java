package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Yatra.feature",glue="stepDefination",dryRun=false,format={"pretty","html:Satish/cucumber-reports"})

public class YatraRunner {

}
//"html:target/cucumber-reports