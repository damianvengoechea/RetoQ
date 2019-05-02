package co.com.retoq.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultSearch {

	public static final Target CAPTURE_NUM_NIGHTS = Target.the("Capture Number Nights").locatedBy("//p[@class='days-adults']");
	public static final Target CAPTURE_NUM_HOTELS = Target.the("Capture Number Hotels").locatedBy("//p[@class='count']");
	public static final Target CAPTURE_NAME_HOTEL = Target.the("Capture Name Hotel").locatedBy("//div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/span[1]");
	
}
