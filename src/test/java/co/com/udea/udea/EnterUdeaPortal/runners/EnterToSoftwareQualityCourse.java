package co.com.udea.udea.EnterUdeaPortal.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/entertosoftwarequalitycourse.feature",
        glue = "co.com.udea.udea.EnterUdeaPortal.stepdefinitions",
        snippets = SnippetType.CAMELCASE
        //tags = "@EnterHome"
)
public class EnterToSoftwareQualityCourse {
}
