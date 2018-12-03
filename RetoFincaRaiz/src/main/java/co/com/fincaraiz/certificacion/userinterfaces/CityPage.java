package co.com.fincaraiz.certificacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CityPage extends PageObject{

	public static Target MAPA = Target.the("Mapa").locatedBy("//div[@class='mapa']");
	public static Target DROPDOWN = Target.the("Dropdown").locatedBy("//*[@id=\"olBCFilters\"]/div[2]//div[@onclick='OpenItemOptionsLocations(this);'] ");

}
