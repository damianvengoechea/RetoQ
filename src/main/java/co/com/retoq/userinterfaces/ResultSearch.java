package co.com.retoq.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultSearch {

	public static final String NAME_HOTEL_CONSTANT = "NAME HOTEL CONSTANT";
	public static final String PRICE_HOTEL_CONSTANT = "PRICE HOTEL CONSTANT";
	public static final String TOTAL_PAY_CONSTANT = "TOTAL PAY CONSTANT";
	
	public static final Target CAPTURE_NUM_NIGHTS = Target.the("Capture Number Nights").locatedBy("//p[@class='days-adults']");
	public static final Target CAPTURE_NUM_HOTELS = Target.the("Capture Number Hotels").locatedBy("//p[@class='count']");
	public static final Target CAPTURE_NAME_HOTEL = Target.the("Capture Name Hotel").locatedBy("//div[@class='current-hotels']/div[{0}]//span[@class='name-hotel']");
	public static final Target CAPTURE_PRICE_HOTEL = Target.the("Capture the price Hotel").locatedBy("//div[@class='current-hotels']/div[{0}]//p[@class='rate-number']");
	public static final Target NEXT_BUTTON = Target.the("Next Button").locatedBy("//div[@class='switch switch-right']");
	public static final Target LEFT_BUTTON = Target.the("Left Button").locatedBy("//div[@class='switch switch-left']");
	public static final Target NEXT_BUTTON_NO_CLICKABLE = Target.the("Next Button no clickable").locatedBy("//div[@class='switch switch-right switch-right-disabled']");
	public static final Target BACK_BUTTON = Target.the("Next Button").locatedBy("//div[@class='switch switch-left']");	
	public static final Target DAYS_IN_HOTEL = Target.the("Information days Hotel").locatedBy("//p[@class='days-adults']");
	public static final Target PAG_ONE = Target.the("Page One").locatedBy("//p[contains(.,'1') and @data-bind ='text:number']");

}
