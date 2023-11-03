package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features="src/test/resource/Features/Login.feature",glue="extentreport_demo")
public class OrangeRunner1 extends AbstractTestNGCucumberTests {

}
