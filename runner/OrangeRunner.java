package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src/test/resource/Features/Login.feature",glue="extentreport_demo")
public class OrangeRunner {


}
