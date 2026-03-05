package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class)
@CucumberOptions(  
    features = "src/test/resources/Features/DDUsingList.feature",
    glue = "stepdefinations", 
    plugin = {"pretty", "html:target/cucumber-report-DDUsingList.html"},
    monochrome = true
)
public class RunDDusingList {
    
}