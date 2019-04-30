package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.retoq.userinterfaces.HotelSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class GoTo implements Task {
	//public String location;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HotelSearch.LOCATION_LIST));
		actor.attemptsTo(Click.on(HotelSearch.SELECT_ITEM_LIST));
		actor.attemptsTo(Click.on(HotelSearch.ENTER_CHECK_IN));
		actor.attemptsTo(Enter.theValue("5/05/2019").into(HotelSearch.ENTER_CHECK_IN));
	}

	public static GoTo locationList(String location) {
		
		return instrumented(GoTo.class, location);
	}

}
