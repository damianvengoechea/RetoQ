package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.retoq.userinterfaces.ResultSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class SaveResultSearch implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.wasAbleTo(Click.on(ResultSearch.CAPTURE_NAME_HOTEL));
				
	}

	public static SaveResultSearch resultList() {
		
		return instrumented(SaveResultSearch.class);
	}
	
	

}
