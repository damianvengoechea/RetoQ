package co.com.retoq.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reserva_hotelera.feature",
        glue = "co.com.retoq.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)


public class ReservationRunner {

}
