package co.com.retoq.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HotelSearch{
	
	public static final Target LOCATION_LIST = Target.the("Location List").locatedBy("//div[@class='dx-first-row dx-first-col dx-last-col dx-field-item dx-col-0 dx-field-item-required dx-flex-layout dx-label-v-align']");
	public static final Target SELECT_OPTION = Target.the("Select Option Location").locatedBy("//div[@class='dx-item-content dx-list-item-content' and contains(.,'{0}')]");
	public static final Target ENTER_CHECK_IN = Target.the("Enter Check In").locatedBy("//input[contains(@id,'checkIn')]");
	public static final Target ENTER_CHECK_OUT = Target.the("Enter Check Out").locatedBy("//input[contains(@id,'checkOut')]");
	public static final Target BUTTON_SEARCH = Target.the("Perform Search").locatedBy("//div[@class='search main-color white-text dx-button dx-button-normal dx-button-mode-contained dx-widget dx-button-has-text']");

}	
	