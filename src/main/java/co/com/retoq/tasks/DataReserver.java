package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.log4j.Logger;

import co.com.retoq.userinterfaces.HotelSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DataReserver implements Task {
	
	final Logger log = Logger.getLogger(SaveResultSearch.class);
	
	public String location;
	public String checkIn;
	public String checkOut;
	
	public DataReserver (String location, String checkIn, String checkOut) {
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;		
	}
				
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Click.on(HotelSearch.LOCATION_LIST));
		actor.wasAbleTo(Click.on(HotelSearch.SELECT_OPTION.of(location)));
		actor.wasAbleTo(Enter.theValue(checkIn).into(HotelSearch.ENTER_CHECK_IN));
		actor.wasAbleTo(Click.on(HotelSearch.ENTER_CHECK_OUT));
		actor.wasAbleTo(Enter.theValue(checkOut).into(HotelSearch.ENTER_CHECK_OUT));
		actor.wasAbleTo(Click.on(HotelSearch.BUTTON_SEARCH));
		log.info(location);
	}
	
	public static DataReserver locationList(String location, String checkIn, String checkOut) {		
		return instrumented(DataReserver.class,location, checkIn, checkOut);
	}

}
