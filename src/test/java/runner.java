import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by mitchell on 30/10/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test"})
public class runner {
}
