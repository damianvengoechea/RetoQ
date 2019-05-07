package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.log4j.Logger;

import co.com.retoq.userinterfaces.HotelSearch;
import co.com.retoq.userinterfaces.ResultSearch;
import co.com.retoq.userinterfaces.SearchReserver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChooseTheHotel implements Task{
	
	final Logger log = Logger.getLogger(ChooseTheHotel.class);

	@Override
	public <T extends Actor> void performAs(T actor) {
						
		String nameHotel = actor.recall(ResultSearch.NAME_HOTEL_CONSTANT);
		String priceMoreEconomical = actor.recall(ResultSearch.PRICE_HOTEL_CONSTANT);
		String nameCity = actor.recall(HotelSearch.NAME_CITY_CONSTANT);		
		
		log.info("In " + nameCity);
		log.info("The Hotel more economical is " + nameHotel);
		log.info("this price is " + priceMoreEconomical);
		log.info("......................");
							
		if(SearchReserver.MAIN_HOTEL_NAME.of(String.valueOf(nameHotel)).resolveFor(actor).isPresent()) {
			actor.attemptsTo(Click.on(SearchReserver.BUTTON_BOOK_IT.of(nameHotel)));			
		}else {
				actor.attemptsTo(Click.on(ResultSearch.PAG_ONE));
			if(SearchReserver.MAIN_HOTEL_NAME.of(String.valueOf(nameHotel)).resolveFor(actor).isPresent()) {
				actor.attemptsTo(Click.on(SearchReserver.BUTTON_BOOK_IT.of(nameHotel)));
			}else {
				while(!SearchReserver.MAIN_HOTEL_NAME.of(String.valueOf(nameHotel)).resolveFor(actor).isPresent()) {
					actor.wasAbleTo(Click.on(ResultSearch.NEXT_BUTTON));
				}				
				actor.attemptsTo(Click.on(SearchReserver.BUTTON_BOOK_IT.of(nameHotel)));				
			}
		}
	}						

	public static ChooseTheHotel moreEconomical() {	
		return instrumented(ChooseTheHotel.class);
	}

	
}
