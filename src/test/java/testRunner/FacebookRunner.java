package testRunner;

import org.junit.runner.RunWith;
import org.testng.TestNG;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Facebook.feature",glue="stepDefination",dryRun=false
,monochrome=true,format= {"html:Satish/cucumber.reports"})

public class FacebookRunner extends TestNG{

}
