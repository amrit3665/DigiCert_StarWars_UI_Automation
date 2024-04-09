package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Features"},
        glue={"com.starwars"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/StarWars.html"}
)

public class testRunner {
}
