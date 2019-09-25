import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:build/test-results/test-report"},
    features = {"src/test/resources"},
    tags = {"@DrivingTest"}
)
public class TestRunner {}
