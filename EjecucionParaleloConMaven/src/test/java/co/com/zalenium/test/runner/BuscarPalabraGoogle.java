package co.com.zalenium.test.runner;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscar_palabra_google.feature",
        glue = "co.com.zalenium.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)

public class BuscarPalabraGoogle {


}
