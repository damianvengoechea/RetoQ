package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.retoq.userinterfaces.DxHotelHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new DxHotelHome()));
		
	}

	public static OpenTheBrowser on() {
		
		return instrumented(OpenTheBrowser.class);
	}

}
