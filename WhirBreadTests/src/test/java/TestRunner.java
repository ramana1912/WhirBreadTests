


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(strict = false, features = "Features", tags={"@Test1,@Test2"},
format = { "pretty",
"json:target/cucumber.json"}, glue = { "com.whitBread.Steps" })

public class TestRunner {

}
