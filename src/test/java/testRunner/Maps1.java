package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Maps.feature",
        glue = {"stepDefinition"},
        plugin= {"pretty","html:target/htmlReport.html"} ,
        monochrome= true)


public class Maps1 {
}
//git successful