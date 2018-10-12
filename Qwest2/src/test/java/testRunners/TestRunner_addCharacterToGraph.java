package testRunners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;


@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features", glue="src/test/java/stepDefinitions")
public class TestRunner_addCharacterToGraph {

}
