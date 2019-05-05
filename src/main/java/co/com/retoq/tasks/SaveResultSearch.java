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
			int j = 1;
			ReservationModel reservation = new ReservationModel();
	        UtilString utilString = new UtilString();
	        
	        int daysHotel = utilString.splitNightSleep(ResultSearch.DAYS_IN_HOTEL.resolveFor(actor).getText()) + 1;
	        int numHotels = utilString.splitnumHotels(ResultSearch.CAPTURE_NUM_HOTELS.resolveFor(actor).getText()) + 3;
	       
	        if(ResultSearch.NEXT_BUTTON.resolveFor(actor).isVisible()) {
	        	
	        	  while(i <= numHotels) {		
		        	    if(ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(j)).resolveFor(actor).isPresent()) {		        		
							String nameHotel = ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(j)).resolveFor(actor).getText();
							String priceHotel = ResultSearch.CAPTURE_PRICE_HOTEL.of(String.valueOf(j)).resolveFor(actor).getText();
							realPriceHotel = (utilString.splitString(priceHotel) * daysHotel);
							reservation.lstHotels.add(nameHotel);
							reservation.lstPrices.add(realPriceHotel);
							log.info("......................");
							log.info("Hotel: "+ nameHotel);
							log.info("Price Total: " + realPriceHotel);
							j++;						
						}else if(ResultSearch.NEXT_BUTTON.resolveFor(actor).isVisible()){						
									actor.wasAbleTo(Click.on(ResultSearch.NEXT_BUTTON));	
									j = 1;
								}else {
									break;
								}
	        	  		}						
						i++;
						}else {
							while(i <= numHotels) {
								if(ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(j)).resolveFor(actor).isPresent()) {
									String nameHotel = ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(j)).resolveFor(actor).getText();
									String priceHotel = ResultSearch.CAPTURE_PRICE_HOTEL.of(String.valueOf(j)).resolveFor(actor).getText();
									realPriceHotel = (utilString.splitString(priceHotel) * daysHotel);
									reservation.lstHotels.add(nameHotel);
									reservation.lstPrices.add(realPriceHotel);							
									log.info("....................");
									log.info("Hotel: "+ nameHotel);
									log.info("Price Total: " + realPriceHotel);
									j++;						
								}						
						i++;
						}	        
	        }
	        	reservation.getLstPrices();
				reservation.getLstHotels();
				log.info("");
				String lessPrice = utilString.valueInList(reservation.getLstPrices());
				String[] partOfString = lessPrice.split(" ");
	            String part1 = partOfString[0];
	            String part2 = partOfString[1];
	            String nameHotelMoreEconomical = reservation.getLstHotels().get(Integer.parseInt(part2));        
	            actor.remember(ResultSearch.PRICE_HOTEL_CONSTANT, part1);
	            actor.remember(ResultSearch.NAME_HOTEL_CONSTANT,nameHotelMoreEconomical);	           
	}
		
	public static SaveResultSearch resultList() {		
		return instrumented(SaveResultSearch.class);
	}
	
	

}
