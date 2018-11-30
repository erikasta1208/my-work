package co.com.fincaraiz.certificacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PropertiesListPage extends PageObject{
	
	public static Target PROPERTY = Target.the("Property").locatedBy("//ul[@id='rowIndex_0']");
//	public static Target PROPERTY = Target.the("Property").locatedBy(GetQuantityProperties.getElementWithRandom());
	
}
