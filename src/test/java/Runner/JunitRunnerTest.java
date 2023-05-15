package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
          plugin = {"pretty", "html:target/cucumber.html", "summary"},
          snippets = CucumberOptions.SnippetType.CAMELCASE,
          dryRun = false,
          monochrome = false,
          //tags = "@Smoke or @Functional",
          glue = {"StepDefination","Hooks","ParameterTypes"},
          features = "src/test/resources/Sample"

)
class JunitRunnerTest {
}
