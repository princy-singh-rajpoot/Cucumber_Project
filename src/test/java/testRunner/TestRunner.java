package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Login.feature", glue = "stepDefinitions", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:test-output" })

public class TestRunner {

}

/*
 * 
 * TestRunner is used to execute Cucumber tests in a BDD framework using JUnit.
 * 
 * @RunWith(Cucumber.class) - This tells JUnit to run the class as a Cucumber
 * test instead of a normal JUnit test.
 * 
 * dryRun = true → Cucumber will only check if all step definitions are
 * implemented, without actually running them. dryRun = false → Cucumber will
 * execute the test cases normally.
 * 
 * @CucumberOptions(...) - This annotation configures various Cucumber options.
 * 
 * @CucumberOptions Parameters --> 1. features = ".//Features/Login.feature" -
 * Specifies the path to the feature file (Login.feature) containing test
 * scenarios written in Gherkin syntax.
 * 
 * 2. glue = "stepDefinitions" - Defines the package name where step definition
 * files are located.
 * 
 * 3. monochrome = true - Ensures the console output is more readable by
 * removing unnecessary characters.
 * 
 * 4. plugin = {"pretty", "html:test-output"} - Specifies the reporting format:
 * "pretty" → Prints detailed test execution results in the console.
 * "html:test-output" → Generates an HTML report in the test-output folder.
 * 
 */