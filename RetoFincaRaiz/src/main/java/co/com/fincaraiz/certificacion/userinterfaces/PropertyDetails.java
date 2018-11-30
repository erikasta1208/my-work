package co.com.fincaraiz.certificacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PropertyDetails extends PageObject{
	public static Target FAVORITE = Target.the("My favorite").locatedBy("//div[@class='divHeart heart-view heart-favorito']");
}
