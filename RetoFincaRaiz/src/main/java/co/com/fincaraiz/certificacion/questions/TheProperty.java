package co.com.fincaraiz.certificacion.questions;

import co.com.fincaraiz.certificacion.userinterfaces.PropertyDetails;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheProperty implements Question<String>{

	
	//Cambiar la implementación a Booleano
	
	@Override
	public String answeredBy(Actor actor) {
		if(PropertyDetails.FAVORITE.resolveFor(actor).isPresent()) {
			System.out.println("Exitoso");
			return "Exitoso";
		}else {
			System.out.println("Error");
			return "Error";
		}
	}
	
	public static TheProperty isVisible() {
		return new TheProperty();
	}

}
