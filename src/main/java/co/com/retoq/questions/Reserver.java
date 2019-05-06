package co.com.retoq.questions;

import java.util.regex.Pattern;

import co.com.retoq.userinterfaces.ReservationSummary;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Reserver implements Question<String> {

	public String part2;
	
	public Reserver(String part2) {
		this.part2 = part2;
	}
	
	
	@Override
	public String answeredBy(Actor actor) {
		
		String totalPay = ReservationSummary.TOTAL_PAY_NOW.resolveFor(actor).getText();
		String[] partOfString = totalPay.split(Pattern.quote("."));
		String part1 = partOfString[0];
		String[] total= part1.split("\\$");
		part2 = total[1];	
		
		return part2;
	}

	public static Reserver totalPayNow (String part2) {
		
		return new Reserver(part2);
	}

}
