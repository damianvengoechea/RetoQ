package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.log4j.Logger;

import co.com.retoq.models.ReservationModel;
import co.com.retoq.userinterfaces.ResultSearch;
import co.com.retoq.utils.UtilString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SaveResultSearch implements Task{
	
	final Logger log = Logger.getLogger(SaveResultSearch.class);
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		  
			int realPriceHotel = 0;
			int i = 1;
			ReservationModel reservation = new ReservationModel();
	        UtilString utilString = new UtilString();
	        
	        int daysHotel = utilString.splitNightSleep(ResultSearch.DAYS_IN_HOTEL.resolveFor(actor).getText()) + 1;

				while(!ResultSearch.NEXT_BUTTON_NO_CLICKABLE.resolveFor(actor).isVisible()){
					if(ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(i)).resolveFor(actor).isPresent()) {
						String nameHotel = ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(i)).resolveFor(actor).getText();
						String priceHotel = ResultSearch.CAPTURE_PRICE_HOTEL.of(String.valueOf(i)).resolveFor(actor).getText();
						realPriceHotel = (utilString.splitString(priceHotel) * daysHotel);
						reservation.lstHotels.add(nameHotel);
						reservation.lstPrices.add(realPriceHotel);
						i = i+1;
						log.info(nameHotel);
						log.info(realPriceHotel);
						
					}else{
						actor.wasAbleTo(Click.on(ResultSearch.NEXT_BUTTON));
						i = 1;
						String nameHotel = ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(i)).resolveFor(actor).getText();
						String priceHotel = ResultSearch.CAPTURE_PRICE_HOTEL.of(String.valueOf(i)).resolveFor(actor).getText();
	                    realPriceHotel = (utilString.splitString(priceHotel) * daysHotel);
	                    reservation.lstHotels.add(nameHotel);
	                    reservation.lstPrices.add(realPriceHotel);
	                    log.info(nameHotel +"  " +realPriceHotel );
	    				//log.info(realPriceHotel);
	                    
					}
				}
				reservation.getLstPrices();
				reservation.getLstHotels();
				
				String lessPrice = utilString.valueInList(reservation.getLstPrices());
	            String[] partOfString = lessPrice.split(" ");
	            String part1 = partOfString[0];
	            String part2 = partOfString[1];
	            actor.remember(ResultSearch.PRICE_HOTEL_CONSTANT, part1);
	            actor.remember(ResultSearch.NAME_HOTEL_CONSTANT,reservation.getLstHotels().get(Integer.parseInt(part2)));
	}
	
	
	public static SaveResultSearch resultList() {
		
		return instrumented(SaveResultSearch.class);
	}
	
	

}
