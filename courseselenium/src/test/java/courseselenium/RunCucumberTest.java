package courseselenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.RunBase;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json:target/reports/cucumber.json")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/reports/report.html")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@cadastro-sucesso")
public class RunCucumberTest extends RunBase {
    
    @Before
    public static void before_all() {
        driver = new ChromeDriver();
    }

    @After
    public static void after_step(){
//        driver.quit();
    }

}
