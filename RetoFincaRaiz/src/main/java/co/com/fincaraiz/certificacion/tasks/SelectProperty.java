package co.com.fincaraiz.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.certificacion.exceptions.StartException;
import co.com.fincaraiz.certificacion.interactions.ClickElement;
import co.com.fincaraiz.certificacion.userinterfaces.PropertiesListPage;
import co.com.fincaraiz.certificacion.utils.WaitAMoment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SelectProperty implements Task{

	public SelectProperty(){
		
	}
	
	@Override
	@Step("{0} open the browser")
	public <T extends Actor> void performAs(T actor) {
		WaitAMoment.please();
		actor.attemptsTo(ClickElement.validatingA(PropertiesListPage.PROPERTY, StartException.PROPERTY_NOT_EXIST));
	}

	public static SelectProperty fromList() {
		return instrumented(SelectProperty.class);
	}
	
}
