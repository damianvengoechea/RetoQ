package co.com.retoq.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.junit.rules.Timeout;

import co.com.retoq.models.ReservationModel;
import co.com.retoq.userinterfaces.ResultSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class SaveResultSearch implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		int i = 1;
		ReservationModel reservation = new ReservationModel();
		
		if(ResultSearch.NEXT_BUTTON.resolveFor(actor).isEnabled()){
			
			while(ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(i)).resolveFor(actor).isPresent()){
				String nameHotel = ResultSearch.CAPTURE_NAME_HOTEL.of(String.valueOf(i)).resolveFor(actor).getText();
				String priceHotel = ResultSearch.CAPTURE_PRICE_HOTEL.of(String.valueOf(i)).resolveFor(actor).getText();
				reservation.lstHotels.add(nameHotel);
				reservation.lstPrices.add(priceHotel);
				actor.wasAbleTo(Click.on(ResultSearch.NEXT_BUTTON));
				System.out.println(reservation.getLstHotels().get(i-1)+ "--"+ i +"--" + reservation.getLstPrices().get(i-1));
				i++;
			}
					
			}else {
				i = 1;
				
			}
				
	}

	public static SaveResultSearch resultList() {
		
		return instrumented(SaveResultSearch.class);
	}
	
	

}
