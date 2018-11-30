package co.com.fincaraiz.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.certificacion.exceptions.StartException;
import co.com.fincaraiz.certificacion.interactions.ClickElement;
import co.com.fincaraiz.certificacion.userinterfaces.CityPage;
import co.com.fincaraiz.certificacion.utils.GetFromDropdown;
import co.com.fincaraiz.certificacion.utils.GetFromMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectCity implements Task{

	private String city;
	
	public SelectCity(String city) {
		this.city = city; 
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		if(CityPage.MAPA.resolveFor(actor).isPresent()) {
			Target element = GetFromMap.byName(city);
			actor.attemptsTo(ClickElement.validatingA(element, StartException.MESSAGE_CITY_NOT_EXIST));
		}else {
			actor.attemptsTo(Click.on(CityPage.DROPDOWN));
			actor.attemptsTo(Click.on(GetFromDropdown.byLocationName(city)));
		}

	}
	
	public static SelectCity from(String city){
		return instrumented(SelectCity.class, city);
	}

}
