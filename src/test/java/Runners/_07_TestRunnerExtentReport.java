package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _07_TestRunnerExtentReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public  static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("",""); // username : İsmet Temur

    }

}