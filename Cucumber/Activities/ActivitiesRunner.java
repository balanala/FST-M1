package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\Users\002QRV744\FST_Cucumber\src\test\java\features",
        glue = {"stepDefinitions"},
        tags = "@activity1"
)
public class ActivitiesRunner {

}
