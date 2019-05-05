package co.com.retoq.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FinalReserver {
	 public static final Target BUTTON_BOOK_IT = Target.the("Button Book it").locatedBy("//span[contains(.,'{0}')]/../../following-sibling::div/div/div/span[@class='dx-button-text']");
	 public static final Target MAIN_HOTEL_NAME = Target.the("Name Hotel").locatedBy("//span[contains(.,'{0}')]");
}
