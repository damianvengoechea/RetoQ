package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.log4j.Logger;

import co.com.retoq.userinterfaces.HotelSearch;
import co.com.retoq.userinterfaces.ResultSearch;
import co.com.retoq.userinterfaces.SearchReserver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

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
		actor.attemptsTo(
                Check.whether(SearchReserver.MAIN_HOTEL_NAME.of(nameHotel).resolveFor(actor).isVisible()).andIfSo(
                        Click.on(SearchReserver.BUTTON_BOOK_IT.of(nameHotel))
                ).otherwise(
                        Click.on(ResultSearch.BACK_BUTTON)
                )
                
        );
				
		/*String totalpago = ReservationSummary.TOTAL_PAY_NOW.resolveFor(actor).getText();
		String[] partOfString = totalpago.split(Pattern.quote("."));
		String part1 = partOfString[0];
		String[] total= part1.split("\\$");
		String part2= total[1];	
        log.info("esto es " + part1);
		log.info(part2);*/
		
	}

	public static ChooseTheHotel moreEconomical() {	
		return instrumented(ChooseTheHotel.class);
	}

	
}
