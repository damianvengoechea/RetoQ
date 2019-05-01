package co.com.retoq.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.retoq.tasks.DataReserver;
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
	
	@Given("^that valentina wants reserve a hotel in \"([^\"]*)\", she selects to the dates  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void thatValentinaWantsReserveAHotelInSheSelectsToTheDatesAnd(String location, String checkIn, String checkOut) {
		herBrowser.manage().window().maximize();
		valentina.wasAbleTo(OpenTheBrowser.on());
		valentina.wasAbleTo(DataReserver.locationList(location, checkIn, checkOut));
		
	}

	

	@When("^valentina search the hotel more economical$")
	public void valentinaSearchTheHotelMoreEconomical() {
	    
	}
	
	
	@Then("^she selects the most economical option \"([^\"]*)\"$")
	public void sheSelectsTheMostEconomicalOption(String arg1) {
	  
	}

}
