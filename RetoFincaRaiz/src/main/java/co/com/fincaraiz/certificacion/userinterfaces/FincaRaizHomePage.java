package co.com.fincaraiz.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FincaRaizHomePage extends PageObject{

	public static Target MESSAGE_INITIAL_PAGE = Target.the("Message initial").located(By.id("TitleBusquedaPrincipal"));
	
}
