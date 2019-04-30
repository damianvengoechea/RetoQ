package co.com.retoq.userinterfaces;



import net.serenitybdd.screenplay.targets.Target;

public class HotelSearch {
	
	public static final Target LOCATION_LIST = Target.the("Location List").locatedBy("//div[@class='dx-first-row dx-first-col dx-last-col dx-field-item dx-col-0 dx-field-item-required dx-flex-layout dx-label-v-align']");
	public static final Target SELECT_ITEM_LIST = Target.the("Select Items List").locatedBy("//div[@class='dx-item-content dx-list-item-content' and contains(.,'" + "Paris" + "')]");
	public static final Target ENTER_CHECK_IN = Target.the("Enter Check In").locatedBy("//div[@class='dx-dropdowneditor-input-wrapper']/input[@name='checkIn']");



}	
	