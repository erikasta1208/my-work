package co.com.fincaraiz.certificacion.utils;

import net.serenitybdd.screenplay.targets.Target;

public class GetFromDropdown {

	public static Target byLocationName(String place) {
		Target element = null;
		if (place != null) {
			element = Target.the("Place").locatedBy("//input[@locationname='" + place + "']");
		}
		return element;
	}
	
}
