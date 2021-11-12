package details;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import util.BaseClass;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber","html:target/cucumber-html-reports","json:target/cucumber.json", "json:target/cucumber-html-reports/cucumber.json"
                },
        features="src/test/Resources/features",
        tags="@test")


public class SerenityRunner  {



}
