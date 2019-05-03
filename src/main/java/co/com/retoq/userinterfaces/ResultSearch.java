package co.com.retoq.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultSearch {

	//public static final Target CAPTURE_NUM_NIGHTS = Target.the("Capture Number Nights").locatedBy("//p[@class='days-adults']");
	//public static final Target CAPTURE_NUM_HOTELS = Target.the("Capture Number Hotels").locatedBy("//p[@class='count']");
	//public static final Target CAPTURE_NAME_HOTEL = Target.the("Capture Name Hotel").locatedBy("//div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/span[1]");
	
	public static final Target CAPTURE_NUM_NIGHTS = Target.the("Capture Number Nights").locatedBy("//p[@class='days-adults']");
	public static final Target CAPTURE_NUM_HOTELS = Target.the("Capture Number Hotels").locatedBy("//p[@class='count']");
	public static final Target CAPTURE_NAME_HOTEL = Target.the("Capture Name Hotel").locatedBy("//div[@class='current-hotels']/div[{0}]//span[@class='name-hotel']");
	public static final Target CAPTURE_PRICE_HOTEL = Target.the("Capture the price Hotel").locatedBy("//div[@class='current-hotels']/div[{0}]//p[@class='rate-number']");
	public static final Target NEXT_BUTTON = Target.the("Next Button").locatedBy("//div[@class='switch switch-right']");
	
}
