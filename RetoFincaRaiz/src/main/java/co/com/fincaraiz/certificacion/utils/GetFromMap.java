package co.com.fincaraiz.certificacion.utils;

import net.serenitybdd.screenplay.targets.Target;

public class GetFromMap {

	public static Target byName(String place) {
		Target element = null;
		if (place != null) {
			element = Target.the("Place").locatedBy("//map[@id='Map']//area[@name='" + place + "']");
		}
		return element;
	}
	
}
