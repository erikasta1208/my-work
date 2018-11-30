package co.com.fincaraiz.certificacion.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.certificacion.exceptions.StartException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickElement implements Interaction{

	private Target element;
	private String messageError;
	
	public ClickElement(Target element, String messageError) {
		this.element = element;
		this.messageError = messageError;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		if(element.resolveFor(actor).isPresent()) {
			actor.attemptsTo(Click.on(element));
		}else {
			throw new StartException(messageError);
		}
	}
	
	public static ClickElement validatingA(Target element, String messageError) {
		return instrumented(ClickElement.class, element, messageError);
	}
	
}
