package co.com.fincaraiz.certificacion.utils;

import net.serenitybdd.screenplay.targets.Target;

public class GetQuantityProperties {

	public static Target getQuantity(String place) {
		Target element = null;
		if (place != null) {
			element = Target.the("Place").locatedBy("//input[@locationname='" + place + "']//..//span");
		}
		return element;
	}
	
	public static String getElementWithRandom() {
		String element = "//ul[@id='rowIndex_0']";
		//Hacer el random con la cantidad de registros
		return element;
	}
	
}
