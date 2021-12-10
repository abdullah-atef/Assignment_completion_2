package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
        features = "src/test/resources/io/cucumber/skeleton/sampletesting.feature",
        glue = {"SampleTestingStepDefs"},
        plugin = {"pretty"}
)
public class RunCucumberTest {
}
