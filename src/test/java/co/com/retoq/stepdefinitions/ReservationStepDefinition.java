package co.com.retoq.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.retoq.tasks.GoTo;
import co.com.retoq.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReservationStepDefinition {

	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor valentina = Actor.named("Valentina");
	
	@Before 
	public void setUp() {
		valentina.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that valentina wants reserve a hotel in \"([^\"]*)\" but the more economic$")
	public void thatValentinaWantsReserveAHotelInButTheMoreEconomic(String location) {
		herBrowser.manage().window().maximize();
		valentina.wasAbleTo(OpenTheBrowser.on());
		valentina.wasAbleTo(GoTo.locationList(location));
	}

	
	@When("^she select to the dates  (\\d+)/(\\d+)/(\\d+) and (\\d+)/(\\d+)/(\\d+)$")
	public void sheSelectToTheDatesAnd(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
	   
	}

	@Then("^she selects the most economical option (\\d+)$")
	public void sheSelectsTheMostEconomicalOption(int arg1) {
	    
	}
	
}
